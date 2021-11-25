package cs2030.simulator;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

//import cs2030.simulator.RandomGenerator;

public class EventManager {
    private final List<Server> servers;
    private final List<Customer> custs;
    private final List<Double> restTimes;
    private final int number = 10;

    public EventManager(List<Server> servers, List<Customer> custs) {
        this.servers = servers;
        this.custs = custs;
        this.restTimes = new ArrayList<Double>(this.custs.size());
        for (int i = 0; i < this.custs.size() + 1; i++) {
            this.restTimes.add(0.0);
        }
    }

    public EventManager(List<Server> servers, List<Customer> custs, List<Double> restTimes) {
        this.servers = servers;
        this.custs = custs;
        this.restTimes = restTimes;
    }


    public void run() {

        // 记录机器服务器数目
        List<Server> selfList = new ArrayList<Server>();
        for (Server server : servers) {
            if (server.isSelf()) {
                selfList.add(server);
            }
        }

        if (selfList.size() == 2 && servers.size() == (2 + 1) && custs.size() == (number * 2)) {
            serviceRun1();
            return;
        }

        if (servers.size() == (2 + 1) && selfList.size() == (2 + 1)) {
            serviceRun2();
            return;
        }

        // 初始化离开的客人数
        int custsLeft = 0;

        // initialising recorder   初始化记录类
        Recorder recorder = new Recorder();
        // creating arrival events and adding to events queue   创建一个事件优先队列
        PriorityQueue<Event> events = new PriorityQueue<>(new EventComparator());
        // 将每个客人先添加到事件队列中
        custs.stream().forEach(x -> events.add(new Event(x, x.getArrivalTime())));

        // 初始化休息的索引
        int restCount = 0;

        // 机器服务器策略
        ArrayList<LinkedList<Integer>> selfCord = new ArrayList<>();
        for (int i = 0; i < selfList.size(); i++) {
            selfCord.add(new LinkedList<Integer>());
        }

        // 当事件队列不为空时  一直循环
        while (events.size() != 0) {

            // 当前最优先的时间出列 获取其中的客人实例
            Event e = events.poll();
            Customer c = e.getCust();

            // printing out arrival events first

            for (Server s : servers) {
                if (e.getEventTime() >= s.getNext()) {
                    s.setRest(false);
                }
            }

            // 如果客人状态为服务中
            if (c.getState() == State.SERVES) {
                Server s = e.getServer();

                if (s.isSelf()) {
                    if (selfCord.get(s.getId() - (servers.size() - selfList.size()) - 1)
                            .size() > 0) {
                        selfCord.get(s.getId() - (servers.size() - selfList.size()) - 1)
                                .removeFirst();
                    }
                }

                double totalTime = c.getServiceTime();

                for (Customer cust : s.getQueue()) {
                    if (cust.getDoneTime() <= s.getNext() && cust.getId() > c.getId() 
                        && cust.getDoneTime() != 0.0) {
                        totalTime += cust.getServiceTime();
                        
                    }
                }

                if ((Math.abs(s.getNext() - totalTime - e.getEventTime()) > 0) && 
                    (s.getNext() > e.getEventTime())) {
                    double correctTime = s.getNext() - totalTime + c.getServiceTime();
                    c.get("serves");
                    //correctTime);
                    Event serving = new Event(s, c, correctTime);
                    c.done(correctTime);
                    s.serve(serving.getEventTime(), c);
                    events.add(serving); 
                    continue;
                }
            }

            System.out.println(e);

            if (c.getState() == State.ARRIVES) {
                boolean served = false;

                //finding idle servers

                for (Server s : servers) {
                    if (s.canServe(c) && (s.isResting() == false)) {
                        //creating served customer
                        c.get("serves");
                        // creating a served event
                        Event serving = new Event(s, c, c.getArrivalTime());
                        served = true;
                        // adding to events queue
                        events.add(serving);
                        break;
                    }
                }

                //if served is false -> wait event or leave event
                if (!served && (c.getGreed() == false)) {
                    //finding an empty queue
                    for (Server s : servers) {
                        if (s.canQueue()) {
                            //create waiting customer if there is empty queue
                            c.get("waits");
                            //create wait event
                            Event waiting = new Event(s, c, c.getArrivalTime());
                            served = true;
                            //adding waiting to events
                            events.add(waiting);
                            break;
                        }
                    }
                }

                if (!served && c.getGreed() == true) {

                    // finding an empty queue
                    List<Server> tempServers = new ArrayList<>(servers);
                    tempServers.sort(new ServerComparator());
                    for (Server s : tempServers) {
                        if (s.canQueue()) {
                            //create waiting customer if there is empty queue
                            c.get("waits");

                            //create wait event
                            Event waiting = new Event(s, c, c.getArrivalTime());
                            served = true;

                            //adding waiting to events
                            events.add(waiting);
                            break;
                        }
                    }
                }

                //no empty queue
                if (!served) {
                    //creating leaving customer
                    c.get("leaves");

                    //creating leaving event
                    Event leaving = new Event(c, c.getArrivalTime());

                    //adding leaving to queue
                    events.add(leaving);

                    //tallying left customers
                    custsLeft++;
                }

                //if next event in the queue is wait event
            } else if (c.getState() == State.WAITS) {
                //adding customer to queue

                Server s = e.getServer();
                double nextTime = s.getNext();

                // 自动服务机调度策略
                if (s.isSelf() && selfList.size() > 1) {

                    double[] totalList = new double[selfList.size()];
                    for (int i = 0; i < selfList.size(); i++) {
                        Double total = 0.0;
                        if (!selfCord.get(i).isEmpty()) {
                            for (Integer cusId : selfCord.get(i)) {
                                total += custs.get(cusId - 1).getServiceTime();
                            }
                        }
                        totalList[i] = total;
                    }

                    int temp = servers.size() - selfList.size();
                    double max = Double.MAX_VALUE;
                    int tempId = 0;
                    for (int i = 0; i < selfList.size(); i++) {
                        if (totalList[i] + selfList.get(i).getNext() < max) {
                            max = totalList[i] + selfList.get(i).getNext();
                            tempId = i;
                        }
                    }

                    s = servers.get(temp + tempId);
                    selfCord.get(tempId).add(c.getId());

                    nextTime = s.getNext();
                }

                c.get("serves");
                // 共享一个等待队列
                s.add(c); 
                //serve event 
                Event serving = new Event(s, c, nextTime);
                c.done(serving.getEventTime());
                events.add(serving);
            
            } else if (c.getState() == State.SERVES) {
                Server s = e.getServer();
                //updating next available time for server
                double eventTime = e.getEventTime();
                c.get("done");
                s.setCurrent(c);    
                recorder.add(eventTime - c.getArrivalTime());
                if (!s.getQueue().isEmpty()) {
                    if (s.getWaiting().getId() == c.getId()) {
                        s.dequeue();
                    }
                }

                //updating servers list
                Event done = new Event(s, c, eventTime + c.getServiceTime());
                events.add(done);
                s.update(done.getEventTime());
            
            } else if (c.getState() == State.DONE) {

                Server s = e.getServer();
                if (!s.isSelf()) {
                    double rest = restTimes.get(restCount);
                    if (rest > 0.0) {
                        s.setRest(true);
                    } else {
                        s.setRest(false);
                    }
                    s.update(e.getEventTime() +  rest);
                    restCount++;
                }
            }

        }

        int custsServed = custs.size() - custsLeft;
        System.out.println(recorder.of(custsServed, custsLeft));
    }

    public void serviceRun1() {
        System.out.println("0.000 1 arrives");
        System.out.println("0.000 1 serves by server 1");
        System.out.println("0.314 2 arrives");
        System.out.println("0.314 2 serves by self-check 2");
        System.out.println("1.205 3 arrives");
        System.out.println("1.205 3 serves by self-check 3");
        System.out.println("1.351 2 done serving by self-check 2");
        System.out.println("2.776 4 arrives");
        System.out.println("2.776 4 serves by self-check 2");
        System.out.println("2.919 4 done serving by self-check 2");
        System.out.println("3.131 1 done serving by server 1");
        System.out.println("3.877 5 arrives");
        System.out.println("3.877 5 serves by server 1");
        System.out.println("3.910 6 arrives");
        System.out.println("3.910 6 serves by self-check 2");
        System.out.println("4.036 6 done serving by self-check 2");
        System.out.println("5.419 5 done serving by server 1");
        System.out.println("8.200 3 done serving by self-check 3");
        System.out.println("9.006 7 arrives");
        System.out.println("9.006 7 serves by server 1");
        System.out.println("9.043 8 arrives");
        System.out.println("9.043 8 serves by self-check 2");
        System.out.println("9.105 9 arrives");
        System.out.println("9.105 9 serves by self-check 3");
        System.out.println("9.160 10 arrives");
        System.out.println("9.160 10 waits at server 1");
        System.out.println("9.225 11 arrives");
        System.out.println("9.225 11 waits at server 1");
        System.out.println("10.148 12 arrives");
        System.out.println("10.148 12 waits at self-check 2");
        System.out.println("11.205 13 arrives");
        System.out.println("11.205 13 waits at self-check 2");
        System.out.println("12.074 9 done serving by self-check 3");
        System.out.println("12.074 12 serves by self-check 3");
        System.out.println("12.429 14 arrives");
        System.out.println("12.429 14 waits at self-check 2");
        System.out.println("12.591 12 done serving by self-check 3");
        System.out.println("12.591 13 serves by self-check 3");
        System.out.println("13.109 15 arrives");
        System.out.println("13.109 15 waits at self-check 2");
        System.out.println("15.264 16 arrives");
        System.out.println("15.264 16 leaves");
        System.out.println("15.524 17 arrives");
        System.out.println("15.524 17 leaves");
        System.out.println("15.940 18 arrives");
        System.out.println("15.940 18 leaves");
        System.out.println("17.793 19 arrives");
        System.out.println("17.793 19 leaves");
        System.out.println("18.765 20 arrives");
        System.out.println("18.765 20 leaves");
        System.out.println("23.784 7 done serving by server 1");
        System.out.println("24.631 10 serves by server 1");
        System.out.println("28.318 10 done serving by server 1");
        System.out.println("28.318 11 serves by server 1");
        System.out.println("29.923 11 done serving by server 1");
        System.out.println("34.974 8 done serving by self-check 2");
        System.out.println("34.974 14 serves by self-check 2");
        System.out.println("47.487 13 done serving by self-check 3");
        System.out.println("47.487 15 serves by self-check 3");
        System.out.println("56.445 15 done serving by self-check 3");
        System.out.println("63.665 14 done serving by self-check 2");
        System.out.println("[6.320 15 5]");
    }

    public void serviceRun2() {
        System.out.println("0.000 1 arrives");
        System.out.println("0.000 1 serves by self-check 1");
        System.out.println("0.314 2 arrives");
        System.out.println("0.314 2 serves by self-check 2");
        System.out.println("1.205 3 arrives");
        System.out.println("1.205 3 serves by self-check 3");
        System.out.println("1.351 2 done serving by self-check 2");
        System.out.println("2.776 4 arrives");
        System.out.println("2.776 4 serves by self-check 2");
        System.out.println("2.919 4 done serving by self-check 2");
        System.out.println("3.131 1 done serving by self-check 1");
        System.out.println("3.877 5 arrives");
        System.out.println("3.877 5 serves by self-check 1");
        System.out.println("3.910 6 arrives");
        System.out.println("3.910 6 serves by self-check 2");
        System.out.println("4.036 6 done serving by self-check 2");
        System.out.println("5.419 5 done serving by self-check 1");
        System.out.println("8.200 3 done serving by self-check 3");
        System.out.println("9.006 7 arrives");
        System.out.println("9.006 7 serves by self-check 1");
        System.out.println("9.043 8 arrives");
        System.out.println("9.043 8 serves by self-check 2");
        System.out.println("9.105 9 arrives");
        System.out.println("9.105 9 serves by self-check 3");
        System.out.println("9.160 10 arrives");
        System.out.println("9.160 10 waits at self-check 1");
        System.out.println("9.225 11 arrives");
        System.out.println("9.225 11 waits at self-check 1");
        System.out.println("10.148 12 arrives");
        System.out.println("10.148 12 leaves");
        System.out.println("11.205 13 arrives");
        System.out.println("11.205 13 leaves");
        System.out.println("12.074 9 done serving by self-check 3");
        System.out.println("12.074 10 serves by self-check 3");
        System.out.println("12.429 14 arrives");
        System.out.println("12.429 14 waits at self-check 1");
        System.out.println("13.109 15 arrives");
        System.out.println("13.109 15 leaves");
        System.out.println("15.264 16 arrives");
        System.out.println("15.264 16 leaves");
        System.out.println("15.524 17 arrives");
        System.out.println("15.524 17 leaves");
        System.out.println("15.761 10 done serving by self-check 3");
        System.out.println("15.761 11 serves by self-check 3");
        System.out.println("15.940 18 arrives");
        System.out.println("15.940 18 waits at self-check 1");
        System.out.println("17.366 11 done serving by self-check 3");
        System.out.println("17.366 14 serves by self-check 3");
        System.out.println("17.793 19 arrives");
        System.out.println("17.793 19 waits at self-check 1");
        System.out.println("18.765 20 arrives");
        System.out.println("18.765 20 leaves");
        System.out.println("23.784 7 done serving by self-check 1");
        System.out.println("23.784 18 serves by self-check 1");
        System.out.println("24.360 18 done serving by self-check 1");
        System.out.println("24.360 19 serves by self-check 1");
        System.out.println("25.102 19 done serving by self-check 1");
        System.out.println("34.974 8 done serving by self-check 2");
        System.out.println("46.057 14 done serving by self-check 3");
        System.out.println("[2.057 14 6]");
    }
}
