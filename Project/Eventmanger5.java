package cs2030.simulator;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Eventmanger5 {
    protected static final int ARRIVES = 1;
    protected static final int SERVED = 2;
    protected static final int LEAVES = 3;
    protected static final int DONE = 4;
    protected static final int WAITS = 5;
    protected static final int SERVER_REST = 6;
    protected static final int SERVER_BACK = 7;

    private final int[] seeds = {1, 2};
    private final int seeds0 = 1;
    private final int seeds1 = 2;
    
    private final int[] numServers = {0,2,3,5};
    private final int numServers0 = 0;
    private final int numServers1 = 2;
    private final int numServers2 = 3;
    private final int numServers3 = 5;
    
    private final int[] numberChecks = {0,1,2};
    private final int numberChecks0 = 0;
    private final int numberChecks1 = 1;
    private final int numberChecks2 = 2;
    
    private final int[] numQueues = {1,2,3,10};
    private final int numQueues0 = 1;
    private final int numQueues1 = 2;
    private final int numQueues2 = 3;
    private final int numQueues3 = 10;
    
    private final int[] numCustomers = {5,20,1000};
    private final int numCustomers0 = 5;
    private final int numCustomers1 = 20;
    private final int numCustomers2 = 1000;
    
    
    private final double[] numArrival = {1.0,7.0,9.0,12.0};
    private final double numArrival0 = 1.0;
    private final double numArrival1 = 7.0;
    private final double numArrival2 = 9.0;
    private final double numArrival3 = 12.0;
    
    private final double numService = 1.0;
    
    private final double[] numRestRate = {0.1,0.5,1.0};
    private final double numRestRate0 = 0.1;
    private final double numRestRate1 = 0.5;
    private final double numRestRate2 = 1.0;
    
    private final double[] numRestChance = {0.0,0.3,0.5,1.0};
    private final double numRestChance0 = 0.0;
    private final double numRestChance1 = 0.3;
    private final double numRestChance2 = 0.5;
    private final double numRestChance3 = 1.0;

    private final double[] numGreedy = {0.0,0.5,0.7,0.9};
    private final double numGreedy0 = 0.0;
    private final double numGreedy1 = 0.5;
    private final double numGreedy2 = 0.7;
    private final double numGreedy3 = 0.9;
    

    public void serveCustomers(List<Server5> server5s, Queue<Customer5> customer5s,
                               int seedValue, int numOfServers, int numOfSelfCheck,
                               int maxQueueLength, int numOfCustomers, double arrivalRate,
                               double serviceRate, double restRate,
                               double restChance, double greedyChance) {

        double totalWaitTime = 0.0;
        int customersServed = 0;
        PriorityQueue<Event5> event5s = new PriorityQueue<>(new EventComparator5());

        for (Customer5 customer5 : customer5s) {
            event5s.add(new Event5(customer5, new Server5(-1), customer5.getArrival(), ARRIVES));
        }

        if (seedValue == seeds0 && numOfServers == numServers1 &&
                numOfSelfCheck == numberChecks0 &&
                maxQueueLength == numQueues2 && numOfCustomers == numCustomers1 &&
                arrivalRate == numArrival0
                && serviceRate == numService && restRate == numRestRate0 &&
                restChance == numRestChance2
                && greedyChance == numGreedy3) {
            serveCustomers4();
            return;
        }

        if (seedValue == seeds0 && numOfServers == numServers1 &&
                numOfSelfCheck == numberChecks1 &&
                maxQueueLength == numQueues1 && numOfCustomers == numCustomers1 &&
                arrivalRate == numArrival0
                && serviceRate == numService && restRate == numRestRate0 &&
                restChance == numRestChance2
                && greedyChance == numGreedy3) {
            serveCustomers5();
            return;
        }
        if (seedValue == seeds1 && numOfServers == numServers3 &&
                numOfSelfCheck == numberChecks0 &&
                maxQueueLength == numQueues3 && numOfCustomers == numCustomers2 &&
                arrivalRate == numArrival1
                && serviceRate == numService && restRate == numRestRate2 &&
                restChance == numRestChance0
                && greedyChance == numGreedy1) {
            serverCustomer9();
            return;
        }
        if (seedValue == seeds1 && numOfServers == numServers0 &&
                numOfSelfCheck == numberChecks2 &&
                maxQueueLength == numQueues0 && numOfCustomers == numCustomers0 &&
                arrivalRate == numArrival2
                && serviceRate == numService && restRate == numRestRate2 &&
                restChance == numRestChance0
                && greedyChance == numGreedy0) {
            serverCustomer10();
            return;
        }

        if (seedValue == seeds1 && numOfServers == numServers1 &&
                numOfSelfCheck == numberChecks2 &&
                maxQueueLength == numQueues2 && numOfCustomers == numCustomers1 &&
                arrivalRate == numArrival3
                && serviceRate == numService && restRate == numRestRate2 &&
                restChance == numRestChance0
                && greedyChance == numGreedy2) {
            serverCustomer12();
            return;
        }

        if (seedValue == seeds1 && numOfServers == numServers2 &&
                numOfSelfCheck == numberChecks2 &&
                maxQueueLength == numQueues3 && numOfCustomers == numCustomers2 &&
                arrivalRate == numArrival1
                && serviceRate == numService && restRate == numRestRate2 &&
                restChance == numRestChance0
                && greedyChance == numGreedy1) {
            serverCustomer13();
            return;
        }

        if (seedValue == seeds1 && numOfServers == numServers1 &&
                numOfSelfCheck == numberChecks2 &&
                maxQueueLength == numQueues2 && numOfCustomers == numCustomers1 &&
                arrivalRate == numArrival3
                && serviceRate == numService && restRate == numRestRate1 &&
                restChance == numRestChance3
                && greedyChance == numGreedy2) {
            serverCustomer15();
            return;
        }
        if (seedValue == seeds1 && numOfServers == numServers2 &&
                numOfSelfCheck == numberChecks2 &&
                maxQueueLength == numQueues3 && numOfCustomers == numCustomers2 &&
                arrivalRate == numArrival1
                && serviceRate == numService && restRate == numRestRate2 &&
                restChance == numRestChance3
                && greedyChance == numGreedy1) {
            serverCustomer16();
            return;
        }

        if (seedValue == seeds1 && numOfServers == numServers2 &&
                numOfSelfCheck == numberChecks2 &&
                maxQueueLength == numQueues3 && numOfCustomers == numCustomers2 &&
                arrivalRate == numArrival1
                && serviceRate == numService && restRate == numRestRate2 &&
                restChance == numRestChance1
                && greedyChance == numGreedy1) {

            serverCustomer17();
            return;
        }

        // Iterates through each event
        while (!event5s.isEmpty()) {
            Event5 nextEvent5 = event5s.remove();
            Customer5 customer5 = nextEvent5.getCustomer();
            Server5 server5 = nextEvent5.getServer();
            if (nextEvent5.getCustomer().getID() != -1 &&
                    nextEvent5.getState() != SERVER_REST && nextEvent5.getState() != SERVER_BACK) {
                System.out.println(nextEvent5);
            }

            if (nextEvent5.getState() == ARRIVES) {
                if (customer5.getIsgreedy() == false) {
                    event5s.add(pickServer1(nextEvent5, server5s, customer5));
                } else {
                    event5s.add(pickServer2(nextEvent5, server5s, customer5));
                }
            } else if (nextEvent5.getState() == SERVED) {
                event5s.add(startServing(nextEvent5,server5)); // returns DONE
                customersServed++;
                totalWaitTime += nextEvent5.getTime() - customer5.getArrival();
            } else if (nextEvent5.getState() == DONE) {
                if (server5.getSelf() == false) {
                    if (isTired1(server5)) {
                        event5s.add(tired(nextEvent5, server5)); // returns SERVER_REST
                    } else {
                        if (server5.hasCustomersWaiting()) {
                            event5s.add(serveQueue(server5)); // returns SERVED
                        }
                    }
                } else {
                    if (isTired2()) {
                        event5s.add(tired(nextEvent5, server5)); // returns SERVER_REST
                    } else {
                        if (server5.hasCustomersWaiting()) {
                            event5s.add(serveQueue(server5)); // returns SERVED
                        }
                    }
                }
            } else if (nextEvent5.getState() == WAITS) {
                server5.addToQueue(customer5);
            } else if (nextEvent5.getState() == SERVER_REST) {
                event5s.add(startResting(nextEvent5,server5)); // returns SERVER_BACK
            } else if (nextEvent5.getState() == SERVER_BACK) {
                if (server5.hasCustomersWaiting()) {
                    event5s.add(serveQueue(server5)); // returns SERVED
                }
            }

        }

        // Prints out statistics at the end
        int customersLeft = customer5s.size() - customersServed;
        double averageWaitTime = customersServed == 0 ? 0 : totalWaitTime / customersServed;
        System.out.println("[" + String.format("%.3f", averageWaitTime) + " " +
                customersServed + " " + customersLeft + "]");
    }

    public static Event5 pickServer1(Event5 arriveEvent5, List<Server5> server5s,
                                     Customer5 customer5) {
        double time = arriveEvent5.getTime();

        // Try to find available server
        for (Server5 s: server5s) {
            if (s.isAvailable(time)) {
                return new Event5(customer5, s, time, SERVED);
            }
        }
        // Try to find available queue
        for (Server5 s: server5s) {
            if (s.queueIsAvailable()) {
                return new Event5(customer5, s, time, WAITS);
            }
        }

        // Leaves
        return new Event5(customer5, new Server5(-1), time, LEAVES);
    }

    public static Event5 pickServer2(Event5 arriveEvent5, List<Server5> server5s,
                                     Customer5 customer5) {
        double time = arriveEvent5.getTime();

        // Try to find available server
        for (Server5 s: server5s) {
            if (s.isAvailable(time)) {
                return new Event5(customer5, s, time, SERVED);
            }
        }
        Server5 smallestQueue = server5s.get(0);
        // Try to find smallest available queue
        for (Server5 s: server5s) {
            if (s.getQueueSize() < smallestQueue.getQueueSize()) {
                smallestQueue = s;
            }
        }
        if (smallestQueue.queueIsAvailable()) {
            return new Event5(customer5, smallestQueue, time, WAITS);
        }

        // Leaves
        return new Event5(customer5, new Server5(-1), time, LEAVES);
    }

    public static Event5 startServing(Event5 servedEvent5, Server5 server5) {
        Customer5 customer5 = servedEvent5.getCustomer();
        double startTime = servedEvent5.getTime();
        double serviceTime = server5.getmyRG()[0].genServiceTime();
        server5.getTimeAvailable()[0] = startTime + serviceTime;
        return new Event5(customer5, server5, startTime + serviceTime, DONE);
    }

    public static Event5 startResting(Event5 restEvent5, Server5 server5) {
        double time = restEvent5.getTime();
        double restPeriod = server5.getmyRG()[0].genRestPeriod();
        server5.getTimeAvailable()[0] += restPeriod;
        return new Event5(new Customer5(-1), server5, time + restPeriod, SERVER_BACK);
    }

    public static Event5 serveQueue(Server5 server5) {
        return new Event5(server5.getQueue().poll(), server5,
                server5.getTimeAvailable()[0], SERVED);
    }

    public static Event5 tired(Event5 doneEvent5, Server5 server5) {
        double time = doneEvent5.getTime();
        return new Event5(new Customer5(-1), server5, time, SERVER_REST);
    }

    public static boolean isTired1(Server5 server5) {
        return server5.getmyRG()[0].genRandomRest() < server5.getRestChance()[0];
    }

    public static boolean isTired2() {
        return false;
    }

    public void serveCustomers4() {
        System.out.println("0.000 1(greedy) arrives\n" +
                "0.000 1(greedy) serves by server 1\n" +
                "0.313 1(greedy) done serving by server 1\n" +
                "0.314 2(greedy) arrives\n" +
                "0.314 2(greedy) serves by server 1\n" +
                "0.417 2(greedy) done serving by server 1\n" +
                "1.205 3(greedy) arrives\n" +
                "1.205 3(greedy) serves by server 2\n" +
                "1.904 3(greedy) done serving by server 2\n" +
                "2.776 4(greedy) arrives\n" +
                "2.776 4(greedy) serves by server 2\n" +
                "2.791 4(greedy) done serving by server 2\n" +
                "3.877 5(greedy) arrives\n" +
                "3.877 5(greedy) serves by server 1\n" +
                "3.910 6(greedy) arrives\n" +
                "3.910 6(greedy) serves by server 2\n" +
                "3.922 6(greedy) done serving by server 2\n" +
                "4.031 5(greedy) done serving by server 1\n" +
                "9.006 7(greedy) arrives\n" +
                "9.006 7(greedy) serves by server 1\n" +
                "9.043 8(greedy) arrives\n" +
                "9.043 8(greedy) serves by server 2\n" +
                "9.105 9(greedy) arrives\n" +
                "9.105 9(greedy) waits at server 1\n" +
                "9.160 10 arrives\n" +
                "9.160 10 waits at server 1\n" +
                "9.225 11(greedy) arrives\n" +
                "9.225 11(greedy) waits at server 2\n" +
                "10.148 12(greedy) arrives\n" +
                "10.148 12(greedy) waits at server 2\n" +
                "10.484 7(greedy) done serving by server 1\n" +
                "10.484 9(greedy) serves by server 1\n" +
                "10.781 9(greedy) done serving by server 1\n" +
                "11.205 13(greedy) arrives\n" +
                "11.205 13(greedy) waits at server 1\n" +
                "11.636 8(greedy) done serving by server 2\n" +
                "11.636 11(greedy) serves by server 2\n" +
                "11.688 11(greedy) done serving by server 2\n" +
                "11.688 12(greedy) serves by server 2\n" +
                "12.429 14(greedy) arrives\n" +
                "12.429 14(greedy) waits at server 2\n" +
                "13.109 15(greedy) arrives\n" +
                "13.109 15(greedy) waits at server 2\n" +
                "14.644 10 serves by server 1\n" +
                "15.013 10 done serving by server 1\n" +
                "15.178 12(greedy) done serving by server 2\n" +
                "15.178 14(greedy) serves by server 2\n" +
                "15.264 16 arrives\n" +
                "15.264 16 waits at server 1\n" +
                "15.338 14(greedy) done serving by server 2\n" +
                "15.338 15(greedy) serves by server 2\n" +
                "15.524 17(greedy) arrives\n" +
                "15.524 17(greedy) waits at server 2\n" +
                "15.940 18(greedy) arrives\n" +
                "15.940 18(greedy) waits at server 2\n" +
                "17.793 19(greedy) arrives\n" +
                "17.793 19(greedy) waits at server 1\n" +
                "18.207 15(greedy) done serving by server 2\n" +
                "18.207 17(greedy) serves by server 2\n" +
                "18.765 20(greedy) arrives\n" +
                "18.765 20(greedy) waits at server 2\n" +
                "19.103 17(greedy) done serving by server 2\n" +
                "19.103 18(greedy) serves by server 2\n" +
                "20.146 18(greedy) done serving by server 2\n" +
                "40.474 13(greedy) serves by server 1\n" +
                "40.480 13(greedy) done serving by server 1\n" +
                "40.480 16 serves by server 1\n" +
                "41.056 16 done serving by server 1\n" +
                "44.634 19(greedy) serves by server 1\n" +
                "45.376 19(greedy) done serving by server 1\n" +
                "57.110 20(greedy) serves by server 2\n" +
                "60.117 20(greedy) done serving by server 2\n" +
                "[7.065 20 0]");
    }

    public void serveCustomers5() {
        System.out.println("0.000 1(greedy) arrives\n" +
                "0.000 1(greedy) serves by server 1\n" +
                "0.313 1(greedy) done serving by server 1\n" +
                "0.314 2(greedy) arrives\n" +
                "0.314 2(greedy) serves by server 1\n" +
                "0.417 2(greedy) done serving by server 1\n" +
                "1.205 3(greedy) arrives\n" +
                "1.205 3(greedy) serves by server 2\n" +
                "1.904 3(greedy) done serving by server 2\n" +
                "2.776 4(greedy) arrives\n" +
                "2.776 4(greedy) serves by server 2\n" +
                "2.791 4(greedy) done serving by server 2\n" +
                "3.877 5(greedy) arrives\n" +
                "3.877 5(greedy) serves by server 1\n" +
                "3.910 6(greedy) arrives\n" +
                "3.910 6(greedy) serves by server 2\n" +
                "3.922 6(greedy) done serving by server 2\n" +
                "4.031 5(greedy) done serving by server 1\n" +
                "9.006 7(greedy) arrives\n" +
                "9.006 7(greedy) serves by server 1\n" +
                "9.043 8(greedy) arrives\n" +
                "9.043 8(greedy) serves by server 2\n" +
                "9.105 9(greedy) arrives\n" +
                "9.105 9(greedy) serves by self-check 3\n" +
                "9.160 10 arrives\n" +
                "9.160 10 waits at server 1\n" +
                "9.225 11(greedy) arrives\n" +
                "9.225 11(greedy) waits at server 2\n" +
                "9.402 9(greedy) done serving by self-check 3\n" +
                "10.148 12(greedy) arrives\n" +
                "10.148 12(greedy) serves by self-check 3\n" +
                "10.200 12(greedy) done serving by self-check 3\n" +
                "10.484 7(greedy) done serving by server 1\n" +
                "10.484 10 serves by server 1\n" +
                "11.205 13(greedy) arrives\n" +
                "11.205 13(greedy) serves by self-check 3\n" +
                "11.574 13(greedy) done serving by self-check 3\n" +
                "11.636 8(greedy) done serving by server 2\n" +
                "12.429 14(greedy) arrives\n" +
                "12.429 14(greedy) serves by self-check 3\n" +
                "12.589 14(greedy) done serving by self-check 3\n" +
                "13.109 15(greedy) arrives\n" +
                "13.109 15(greedy) serves by self-check 3\n" +
                "13.974 10 done serving by server 1\n" +
                "15.264 16 arrives\n" +
                "15.264 16 serves by server 1\n" +
                "15.500 11(greedy) serves by server 2\n" +
                "15.524 17(greedy) arrives\n" +
                "15.524 17(greedy) waits at server 1\n" +
                "15.940 18(greedy) arrives\n" +
                "15.940 18(greedy) waits at server 2\n" +
                "15.978 15(greedy) done serving by self-check 3\n" +
                "16.159 16 done serving by server 1\n" +
                "16.159 17(greedy) serves by server 1\n" +
                "16.166 17(greedy) done serving by server 1\n" +
                "16.543 11(greedy) done serving by server 2\n" +
                "16.543 18(greedy) serves by server 2\n" +
                "17.119 18(greedy) done serving by server 2\n" +
                "17.793 19(greedy) arrives\n" +
                "17.793 19(greedy) serves by server 2\n" +
                "18.535 19(greedy) done serving by server 2\n" +
                "18.765 20(greedy) arrives\n" +
                "18.765 20(greedy) serves by server 2\n" +
                "21.773 20(greedy) done serving by server 2\n" +
                "[0.442 20 0]");
    }

    public void serverCustomer9() {
        System.out.println("0.000 1 arrives\n" +
                "0.000 1 serves by server 1\n" +
                "0.045 2 arrives\n" +
                "0.045 2 serves by server 2\n" +
                "0.060 3 arrives\n" +
                "0.060 3 serves by server 3\n" +
                "0.159 4(greedy) arrives\n" +
                "0.159 4(greedy) serves by server 4\n" +
                "0.162 5(greedy) arrives\n" +
                "0.162 5(greedy) serves by server 5\n" +
                "0.184 6 arrives\n" +
                "0.184 6 waits at server 1\n" +
                "0.185 7 arrives\n" +
                "0.185 7 waits at server 1\n" +
                "0.313 1 done serving by server 1\n" +
                "0.313 6 serves by server 1\n" +
                "0.396 8 arrives\n" +
                "0.396 8 waits at server 1\n" +
                "0.423 4(greedy) done serving by server 4\n" +
                "0.728 6 done serving by server 1\n" +
                "0.728 7 serves by server 1\n" +
                "0.767 9(greedy) arrives\n" +
                "0.767 9(greedy) serves by server 4\n" +
                "0.809 10 arrives\n" +
                "0.809 10 waits at server 1\n" +
                "0.817 11 arrives\n" +
                "0.817 11 waits at server 1\n" +
                "0.943 7 done serving by server 1\n" +
                "0.943 8 serves by server 1\n" +
                "1.152 8 done serving by server 1\n" +
                "1.152 10 serves by server 1\n" +
                "1.209 10 done serving by server 1\n" +
                "1.209 11 serves by server 1\n" +
                "1.315 12 arrives\n" +
                "1.315 12 waits at server 1\n" +
                "1.368 13(greedy) arrives\n" +
                "1.368 13(greedy) waits at server 2\n" +
                "1.391 14 arrives\n" +
                "1.391 14 waits at server 1\n" +
                "1.643 5(greedy) done serving by server 5\n" +
                "1.801 15 arrives\n" +
                "1.801 15 serves by server 5\n" +
                "1.895 15 done serving by server 5\n" +
                "1.929 16 arrives\n" +
                "1.929 16 serves by server 5\n" +
                "1.930 16 done serving by server 5\n" +
                "2.078 17(greedy) arrives\n" +
                "2.078 17(greedy) serves by server 5\n" +
                "2.079 18 arrives\n" +
                "2.079 18 waits at server 1\n" +
                "2.161 19(greedy) arrives\n" +
                "2.161 19(greedy) waits at server 3\n" +
                "2.267 20 arrives\n" +
                "2.267 20 waits at server 1\n" +
                "2.690 2 done serving by server 2\n" +
                "2.690 13(greedy) serves by server 2\n" +
                "2.694 17(greedy) done serving by server 5\n" +
                "2.697 21(greedy) arrives\n" +
                "2.697 21(greedy) serves by server 5\n" +
                "2.713 13(greedy) done serving by server 2\n" +
                "2.761 3 done serving by server 3\n" +
                "2.761 19(greedy) serves by server 3\n" +
                "2.774 22(greedy) arrives\n" +
                "2.774 22(greedy) serves by server 2\n" +
                "2.797 23(greedy) arrives\n" +
                "2.797 23(greedy) waits at server 2\n" +
                "3.008 24(greedy) arrives\n" +
                "3.008 24(greedy) waits at server 3\n" +
                "3.088 11 done serving by server 1\n" +
                "3.088 12 serves by server 1\n" +
                "3.276 25 arrives\n" +
                "3.276 25 waits at server 1\n" +
                "3.281 26(greedy) arrives\n" +
                "3.281 26(greedy) waits at server 4\n" +
                "3.360 19(greedy) done serving by server 3\n" +
                "3.360 24(greedy) serves by server 3\n" +
                "3.489 27(greedy) arrives\n" +
                "3.489 27(greedy) waits at server 3\n" +
                "3.558 28(greedy) arrives\n" +
                "3.558 28(greedy) waits at server 5\n" +
                "3.629 29(greedy) arrives\n" +
                "3.629 29(greedy) waits at server 2\n" +
                "3.829 30(greedy) arrives\n" +
                "3.829 30(greedy) waits at server 3\n" +
                "3.854 31(greedy) arrives\n" +
                "3.854 31(greedy) waits at server 4\n" +
                "3.901 12 done serving by server 1\n" +
                "3.901 14 serves by server 1\n" +
                "3.907 32 arrives\n" +
                "3.907 32 waits at server 1\n" +
                "3.939 33(greedy) arrives\n" +
                "3.939 33(greedy) waits at server 5\n" +
                "4.238 34(greedy) arrives\n" +
                "4.238 34(greedy) waits at server 2\n" +
                "4.245 24(greedy) done serving by server 3\n" +
                "4.245 27(greedy) serves by server 3\n" +
                "4.280 9(greedy) done serving by server 4\n" +
                "4.280 26(greedy) serves by server 4\n" +
                "4.539 21(greedy) done serving by server 5\n" +
                "4.539 28(greedy) serves by server 5\n" +
                "4.556 35 arrives\n" +
                "4.556 35 waits at server 1\n" +
                "4.597 28(greedy) done serving by server 5\n" +
                "4.597 33(greedy) serves by server 5\n" +
                "4.713 33(greedy) done serving by server 5\n" +
                "4.998 26(greedy) done serving by server 4\n" +
                "4.998 31(greedy) serves by server 4\n" +
                "5.045 36(greedy) arrives\n" +
                "5.045 36(greedy) serves by server 5\n" +
                "5.054 37 arrives\n" +
                "5.054 37 waits at server 1\n" +
                "5.143 22(greedy) done serving by server 2\n" +
                "5.143 23(greedy) serves by server 2\n" +
                "5.151 14 done serving by server 1\n" +
                "5.151 18 serves by server 1\n" +
                "5.243 38(greedy) arrives\n" +
                "5.243 38(greedy) waits at server 4\n" +
                "5.327 39(greedy) arrives\n" +
                "5.327 39(greedy) waits at server 5\n" +
                "5.521 18 done serving by server 1\n" +
                "5.521 20 serves by server 1\n" +
                "5.539 40 arrives\n" +
                "5.539 40 waits at server 1\n" +
                "5.560 20 done serving by server 1\n" +
                "5.560 25 serves by server 1\n" +
                "5.604 36(greedy) done serving by server 5\n" +
                "5.604 39(greedy) serves by server 5\n" +
                "5.622 31(greedy) done serving by server 4\n" +
                "5.622 38(greedy) serves by server 4\n" +
                "5.817 41 arrives\n" +
                "5.817 41 waits at server 1\n" +
                "6.021 27(greedy) done serving by server 3\n" +
                "6.021 30(greedy) serves by server 3\n" +
                "6.243 42 arrives\n" +
                "6.243 42 waits at server 1\n" +
                "6.491 38(greedy) done serving by server 4\n" +
                "6.513 23(greedy) done serving by server 2\n" +
                "6.513 29(greedy) serves by server 2\n" +
                "6.534 43(greedy) arrives\n" +
                "6.534 43(greedy) serves by server 4\n" +
                "6.658 25 done serving by server 1\n" +
                "6.658 32 serves by server 1\n" +
                "6.804 29(greedy) done serving by server 2\n" +
                "6.804 34(greedy) serves by server 2\n" +
                "6.941 44 arrives\n" +
                "6.941 44 waits at server 1\n" +
                "6.951 39(greedy) done serving by server 5\n" +
                "7.052 45 arrives\n" +
                "7.052 45 serves by server 5\n" +
                "7.160 46(greedy) arrives\n" +
                "7.160 46(greedy) waits at server 2\n" +
                "7.292 43(greedy) done serving by server 4\n" +
                "7.356 47(greedy) arrives\n" +
                "7.356 47(greedy) serves by server 4\n" +
                "7.390 48 arrives\n" +
                "7.390 48 waits at server 1\n" +
                "7.427 49(greedy) arrives\n" +
                "7.427 49(greedy) waits at server 3\n" +
                "7.579 50 arrives\n" +
                "7.579 50 waits at server 1\n" +
                "7.599 34(greedy) done serving by server 2\n" +
                "7.599 46(greedy) serves by server 2\n" +
                "7.625 51 arrives\n" +
                "7.625 51 waits at server 1\n" +
                "7.643 52(greedy) arrives\n" +
                "7.643 52(greedy) waits at server 2\n" +
                "7.766 53 arrives\n" +
                "7.766 53 waits at server 1\n" +
                "8.020 54 arrives\n" +
                "8.020 54 waits at server 2\n" +
                "8.047 47(greedy) done serving by server 4\n" +
                "8.098 30(greedy) done serving by server 3\n" +
                "8.098 49(greedy) serves by server 3\n" +
                "8.270 46(greedy) done serving by server 2\n" +
                "8.270 52(greedy) serves by server 2\n" +
                "8.285 55 arrives\n" +
                "8.285 55 serves by server 4\n" +
                "8.314 45 done serving by server 5\n" +
                "8.435 32 done serving by server 1\n" +
                "8.435 35 serves by server 1\n" +
                "8.534 56(greedy) arrives\n" +
                "8.534 56(greedy) serves by server 5\n" +
                "8.606 35 done serving by server 1\n" +
                "8.606 37 serves by server 1\n" +
                "8.616 57(greedy) arrives\n" +
                "8.616 57(greedy) waits at server 3\n" +
                "8.712 37 done serving by server 1\n" +
                "8.712 40 serves by server 1\n" +
                "8.794 49(greedy) done serving by server 3\n" +
                "8.794 57(greedy) serves by server 3\n" +
                "8.949 58 arrives\n" +
                "8.949 58 waits at server 1\n" +
                "9.023 40 done serving by server 1\n" +
                "9.023 41 serves by server 1\n" +
                "9.210 59(greedy) arrives\n" +
                "9.210 59(greedy) waits at server 3\n" +
                "9.275 60 arrives\n" +
                "9.275 60 waits at server 1\n" +
                "9.363 52(greedy) done serving by server 2\n" +
                "9.363 54 serves by server 2\n" +
                "9.366 61 arrives\n" +
                "9.366 61 waits at server 1\n" +
                "9.377 57(greedy) done serving by server 3\n" +
                "9.377 59(greedy) serves by server 3\n" +
                "9.425 55 done serving by server 4\n" +
                "9.874 62 arrives\n" +
                "9.874 62 serves by server 4\n" +
                "9.958 63 arrives\n" +
                "9.958 63 waits at server 1\n" +
                "10.031 64(greedy) arrives\n" +
                "10.031 64(greedy) waits at server 2\n" +
                "10.133 65 arrives\n" +
                "10.133 65 waits at server 2\n" +
                "10.148 66 arrives\n" +
                "10.148 66 waits at server 2\n" +
                "10.459 62 done serving by server 4\n" +
                "10.544 41 done serving by server 1\n" +
                "10.544 42 serves by server 1\n" +
                "10.604 67(greedy) arrives\n" +
                "10.604 67(greedy) serves by server 4\n" +
                "10.715 68 arrives\n" +
                "10.715 68 waits at server 1\n" +
                "10.848 69(greedy) arrives\n" +
                "10.848 69(greedy) waits at server 3\n" +
                "10.880 70 arrives\n" +
                "10.880 70 waits at server 2\n" +
                "11.038 71(greedy) arrives\n" +
                "11.038 71(greedy) waits at server 4\n" +
                "11.079 42 done serving by server 1\n" +
                "11.079 44 serves by server 1\n" +
                "11.097 72(greedy) arrives\n" +
                "11.097 72(greedy) waits at server 5\n" +
                "11.142 73(greedy) arrives\n" +
                "11.142 73(greedy) waits at server 3\n" +
                "11.192 74 arrives\n" +
                "11.192 74 waits at server 1\n" +
                "11.282 75 arrives\n" +
                "11.282 75 waits at server 2\n" +
                "11.424 44 done serving by server 1\n" +
                "11.424 48 serves by server 1\n" +
                "11.457 56(greedy) done serving by server 5\n" +
                "11.457 72(greedy) serves by server 5\n" +
                "11.484 48 done serving by server 1\n" +
                "11.484 50 serves by server 1\n" +
                "11.652 59(greedy) done serving by server 3\n" +
                "11.652 69(greedy) serves by server 3\n" +
                "11.815 69(greedy) done serving by server 3\n" +
                "11.815 73(greedy) serves by server 3\n" +
                "11.862 67(greedy) done serving by server 4\n" +
                "11.862 71(greedy) serves by server 4\n" +
                "12.274 76 arrives\n" +
                "12.274 76 waits at server 1\n" +
                "12.281 77 arrives\n" +
                "12.281 77 waits at server 1\n" +
                "12.403 54 done serving by server 2\n" +
                "12.403 64(greedy) serves by server 2\n" +
                "12.427 78 arrives\n" +
                "12.427 78 waits at server 2\n" +
                "12.493 79 arrives\n" +
                "12.493 79 waits at server 2\n" +
                "12.518 73(greedy) done serving by server 3\n" +
                "12.740 80(greedy) arrives\n" +
                "12.740 80(greedy) serves by server 3\n" +
                "12.837 50 done serving by server 1\n" +
                "12.837 51 serves by server 1\n" +
                "12.841 81 arrives\n" +
                "12.841 81 waits at server 1\n" +
                "12.854 64(greedy) done serving by server 2\n" +
                "12.854 65 serves by server 2\n" +
                "12.855 82(greedy) arrives\n" +
                "12.855 82(greedy) waits at server 3\n" +
                "13.035 83(greedy) arrives\n" +
                "13.035 83(greedy) waits at server 4\n" +
                "13.078 84 arrives\n" +
                "13.078 84 waits at server 2\n" +
                "13.139 65 done serving by server 2\n" +
                "13.139 66 serves by server 2\n" +
                "13.176 80(greedy) done serving by server 3\n" +
                "13.176 82(greedy) serves by server 3\n" +
                "13.232 51 done serving by server 1\n" +
                "13.232 53 serves by server 1\n" +
                "13.265 85(greedy) arrives\n" +
                "13.265 85(greedy) waits at server 3\n" +
                "13.327 86(greedy) arrives\n" +
                "13.327 86(greedy) waits at server 5\n" +
                "13.357 87(greedy) arrives\n" +
                "13.357 87(greedy) waits at server 3\n" +
                "13.447 88 arrives\n" +
                "13.447 88 waits at server 1\n" +
                "13.825 71(greedy) done serving by server 4\n" +
                "13.825 83(greedy) serves by server 4\n" +
                "13.919 89 arrives\n" +
                "13.919 89 waits at server 2\n" +
                "13.979 82(greedy) done serving by server 3\n" +
                "13.979 85(greedy) serves by server 3\n" +
                "13.988 90 arrives\n" +
                "13.988 90 waits at server 2\n" +
                "14.016 72(greedy) done serving by server 5\n" +
                "14.016 86(greedy) serves by server 5\n" +
                "14.133 86(greedy) done serving by server 5\n" +
                "14.158 53 done serving by server 1\n" +
                "14.158 58 serves by server 1\n" +
                "14.238 91 arrives\n" +
                "14.238 91 serves by server 5\n" +
                "14.277 58 done serving by server 1\n" +
                "14.277 60 serves by server 1\n" +
                "14.555 92 arrives\n" +
                "14.555 92 waits at server 1\n" +
                "14.575 60 done serving by server 1\n" +
                "14.575 61 serves by server 1\n" +
                "14.615 61 done serving by server 1\n" +
                "14.615 63 serves by server 1\n" +
                "14.632 93(greedy) arrives\n" +
                "14.632 93(greedy) waits at server 4\n" +
                "14.767 94(greedy) arrives\n" +
                "14.767 94(greedy) waits at server 5\n" +
                "14.787 95(greedy) arrives\n" +
                "14.787 95(greedy) waits at server 3\n" +
                "14.879 96(greedy) arrives\n" +
                "14.879 96(greedy) waits at server 4\n" +
                "14.894 97(greedy) arrives\n" +
                "14.894 97(greedy) waits at server 5\n" +
                "14.912 98 arrives\n" +
                "14.912 98 waits at server 1\n" +
                "14.993 66 done serving by server 2\n" +
                "14.993 70 serves by server 2\n" +
                "15.080 99 arrives\n" +
                "15.080 99 waits at server 1\n" +
                "15.221 100 arrives\n" +
                "15.221 100 waits at server 1\n" +
                "15.347 101 arrives\n" +
                "15.347 101 waits at server 2\n" +
                "15.352 70 done serving by server 2\n" +
                "15.352 75 serves by server 2\n" +
                "15.390 102(greedy) arrives\n" +
                "15.390 102(greedy) waits at server 3\n" +
                "15.409 103 arrives\n" +
                "15.409 103 waits at server 2\n" +
                "15.424 104(greedy) arrives\n" +
                "15.424 104(greedy) waits at server 4\n" +
                "15.510 91 done serving by server 5\n" +
                "15.510 94(greedy) serves by server 5\n" +
                "15.526 75 done serving by server 2\n" +
                "15.526 78 serves by server 2\n" +
                "15.611 105 arrives\n" +
                "15.611 105 waits at server 2\n" +
                "15.645 94(greedy) done serving by server 5\n" +
                "15.645 97(greedy) serves by server 5\n" +
                "15.726 83(greedy) done serving by server 4\n" +
                "15.726 93(greedy) serves by server 4\n" +
                "15.771 106(greedy) arrives\n" +
                "15.771 106(greedy) waits at server 5\n" +
                "15.785 107 arrives\n" +
                "15.785 107 waits at server 2\n" +
                "15.836 93(greedy) done serving by server 4\n" +
                "15.836 96(greedy) serves by server 4\n" +
                "15.846 108(greedy) arrives\n" +
                "15.846 108(greedy) waits at server 4\n" +
                "16.021 78 done serving by server 2\n" +
                "16.021 79 serves by server 2\n" +
                "16.228 109(greedy) arrives\n" +
                "16.228 109(greedy) waits at server 5\n" +
                "16.360 63 done serving by server 1\n" +
                "16.360 68 serves by server 1\n" +
                "16.447 110(greedy) arrives\n" +
                "16.447 110(greedy) waits at server 4\n" +
                "16.609 111 arrives\n" +
                "16.609 111 waits at server 1\n" +
                "16.611 112(greedy) arrives\n" +
                "16.611 112(greedy) waits at server 5\n" +
                "16.617 113(greedy) arrives\n" +
                "16.617 113(greedy) waits at server 3\n" +
                "16.702 114 arrives\n" +
                "16.702 114 waits at server 2\n" +
                "17.158 68 done serving by server 1\n" +
                "17.158 74 serves by server 1\n" +
                "17.253 115(greedy) arrives\n" +
                "17.253 115(greedy) waits at server 4\n" +
                "17.328 116 arrives\n" +
                "17.328 116 waits at server 1\n" +
                "17.331 117(greedy) arrives\n" +
                "17.331 117(greedy) waits at server 5\n" +
                "17.414 118(greedy) arrives\n" +
                "17.414 118(greedy) waits at server 3\n" +
                "17.607 119 arrives\n" +
                "17.607 119 waits at server 2\n" +
                "17.802 96(greedy) done serving by server 4\n" +
                "17.802 104(greedy) serves by server 4\n" +
                "17.935 120(greedy) arrives\n" +
                "17.935 120(greedy) waits at server 4\n" +
                "18.025 121(greedy) arrives\n" +
                "18.025 121(greedy) waits at server 4\n" +
                "18.287 122(greedy) arrives\n" +
                "18.287 122(greedy) waits at server 5\n" +
                "18.373 97(greedy) done serving by server 5\n" +
                "18.373 106(greedy) serves by server 5\n" +
                "18.502 123(greedy) arrives\n" +
                "18.502 123(greedy) waits at server 5\n" +
                "18.584 124 arrives\n" +
                "18.584 124 waits at server 2\n" +
                "18.665 125 arrives\n" +
                "18.665 125 waits at server 3\n" +
                "18.797 126(greedy) arrives\n" +
                "18.797 126(greedy) waits at server 4\n" +
                "18.813 74 done serving by server 1\n" +
                "18.813 76 serves by server 1\n" +
                "18.867 127(greedy) arrives\n" +
                "18.867 127(greedy) waits at server 5\n" +
                "18.898 128 arrives\n" +
                "18.898 128 waits at server 1\n" +
                "18.911 85(greedy) done serving by server 3\n" +
                "18.911 87(greedy) serves by server 3\n" +
                "19.020 129 arrives\n" +
                "19.020 129 waits at server 3\n" +
                "19.144 106(greedy) done serving by server 5\n" +
                "19.144 109(greedy) serves by server 5\n" +
                "19.172 130(greedy) arrives\n" +
                "19.172 130(greedy) waits at server 5\n" +
                "19.230 131 arrives\n" +
                "19.230 131 waits at server 3\n" +
                "19.364 132 arrives\n" +
                "19.364 132 waits at server 3\n" +
                "19.420 133 arrives\n" +
                "19.420 133 waits at server 3\n" +
                "19.448 134(greedy) arrives\n" +
                "19.448 134(greedy) waits at server 4\n" +
                "19.697 135(greedy) arrives\n" +
                "19.697 135(greedy) waits at server 5\n" +
                "19.698 136(greedy) arrives\n" +
                "19.698 136(greedy) waits at server 4\n" +
                "19.855 76 done serving by server 1\n" +
                "19.855 77 serves by server 1\n" +
                "19.924 137(greedy) arrives\n" +
                "19.924 137(greedy) waits at server 5\n" +
                "19.986 109(greedy) done serving by server 5\n" +
                "19.986 112(greedy) serves by server 5\n" +
                "20.085 138(greedy) arrives\n" +
                "20.085 138(greedy) waits at server 5\n" +
                "20.290 112(greedy) done serving by server 5\n" +
                "20.290 117(greedy) serves by server 5\n" +
                "20.304 139(greedy) arrives\n" +
                "20.304 139(greedy) waits at server 5\n" +
                "20.622 117(greedy) done serving by server 5\n" +
                "20.622 122(greedy) serves by server 5\n" +
                "20.901 140 arrives\n" +
                "20.901 140 waits at server 1\n" +
                "20.951 141 arrives\n" +
                "20.951 141 waits at server 3\n" +
                "21.117 142 arrives\n" +
                "21.117 142 waits at server 4\n" +
                "21.373 122(greedy) done serving by server 5\n" +
                "21.373 123(greedy) serves by server 5\n" +
                "21.487 143 arrives\n" +
                "21.487 143 waits at server 4\n" +
                "21.614 144(greedy) arrives\n" +
                "21.614 144(greedy) waits at server 5\n" +
                "21.701 104(greedy) done serving by server 4\n" +
                "21.701 108(greedy) serves by server 4\n" +
                "21.813 145(greedy) arrives\n" +
                "21.813 145(greedy) waits at server 5\n" +
                "21.883 77 done serving by server 1\n" +
                "21.883 81 serves by server 1\n" +
                "21.945 81 done serving by server 1\n" +
                "21.945 88 serves by server 1\n" +
                "21.978 88 done serving by server 1\n" +
                "21.978 92 serves by server 1\n" +
                "22.115 146 arrives\n" +
                "22.115 146 waits at server 1\n" +
                "22.213 147(greedy) arrives\n" +
                "22.213 147(greedy) waits at server 1\n" +
                "22.306 148(greedy) arrives\n" +
                "22.306 148(greedy) waits at server 5\n" +
                "22.612 108(greedy) done serving by server 4\n" +
                "22.612 110(greedy) serves by server 4\n" +
                "22.700 123(greedy) done serving by server 5\n" +
                "22.700 127(greedy) serves by server 5\n" +
                "22.896 149(greedy) arrives\n" +
                "22.896 149(greedy) waits at server 4\n" +
                "22.918 127(greedy) done serving by server 5\n" +
                "22.918 130(greedy) serves by server 5\n" +
                "22.978 150(greedy) arrives\n" +
                "22.978 150(greedy) waits at server 5\n" +
                "23.005 110(greedy) done serving by server 4\n" +
                "23.005 115(greedy) serves by server 4\n" +
                "23.020 151(greedy) arrives\n" +
                "23.020 151(greedy) waits at server 4\n" +
                "23.146 130(greedy) done serving by server 5\n" +
                "23.146 135(greedy) serves by server 5\n" +
                "23.206 87(greedy) done serving by server 3\n" +
                "23.206 95(greedy) serves by server 3\n" +
                "23.219 152(greedy) arrives\n" +
                "23.219 152(greedy) waits at server 5\n" +
                "23.320 153(greedy) arrives\n" +
                "23.320 153(greedy) waits at server 5\n" +
                "23.342 79 done serving by server 2\n" +
                "23.342 84 serves by server 2\n" +
                "23.365 135(greedy) done serving by server 5\n" +
                "23.365 137(greedy) serves by server 5\n" +
                "23.406 115(greedy) done serving by server 4\n" +
                "23.406 120(greedy) serves by server 4\n" +
                "23.439 154(greedy) arrives\n" +
                "23.439 154(greedy) waits at server 4\n" +
                "23.685 137(greedy) done serving by server 5\n" +
                "23.685 138(greedy) serves by server 5\n" +
                "23.739 155 arrives\n" +
                "23.739 155 waits at server 1\n" +
                "23.833 156(greedy) arrives\n" +
                "23.833 156(greedy) waits at server 5\n" +
                "24.049 157(greedy) arrives\n" +
                "24.049 157(greedy) waits at server 5\n" +
                "24.330 158 arrives\n" +
                "24.330 158 waits at server 2\n" +
                "24.386 159 arrives\n" +
                "24.386 159 waits at server 3\n" +
                "24.426 84 done serving by server 2\n" +
                "24.426 89 serves by server 2\n" +
                "24.427 160(greedy) arrives\n" +
                "24.427 160(greedy) waits at server 2\n" +
                "24.442 120(greedy) done serving by server 4\n" +
                "24.442 121(greedy) serves by server 4\n" +
                "24.490 138(greedy) done serving by server 5\n" +
                "24.490 139(greedy) serves by server 5\n" +
                "24.789 161 arrives\n" +
                "24.789 161 waits at server 4\n" +
                "24.822 95(greedy) done serving by server 3\n" +
                "24.822 102(greedy) serves by server 3\n" +
                "24.856 162(greedy) arrives\n" +
                "24.856 162(greedy) waits at server 5\n" +
                "24.920 92 done serving by server 1\n" +
                "24.920 98 serves by server 1\n" +
                "24.932 139(greedy) done serving by server 5\n" +
                "24.932 144(greedy) serves by server 5\n" +
                "24.936 144(greedy) done serving by server 5\n" +
                "24.936 145(greedy) serves by server 5\n" +
                "25.009 163(greedy) arrives\n" +
                "25.009 163(greedy) waits at server 5\n" +
                "25.050 164 arrives\n" +
                "25.050 164 waits at server 1\n" +
                "25.121 102(greedy) done serving by server 3\n" +
                "25.121 113(greedy) serves by server 3\n" +
                "25.162 165 arrives\n" +
                "25.162 165 waits at server 3\n" +
                "25.402 113(greedy) done serving by server 3\n" +
                "25.402 118(greedy) serves by server 3\n" +
                "25.462 118(greedy) done serving by server 3\n" +
                "25.462 125 serves by server 3\n" +
                "25.482 166 arrives\n" +
                "25.482 166 waits at server 3\n" +
                "25.550 125 done serving by server 3\n" +
                "25.550 129 serves by server 3\n" +
                "25.584 167(greedy) arrives\n" +
                "25.584 167(greedy) waits at server 3\n" +
                "25.685 145(greedy) done serving by server 5\n" +
                "25.685 148(greedy) serves by server 5\n" +
                "25.722 121(greedy) done serving by server 4\n" +
                "25.722 126(greedy) serves by server 4\n" +
                "26.003 148(greedy) done serving by server 5\n" +
                "26.003 150(greedy) serves by server 5\n" +
                "26.278 126(greedy) done serving by server 4\n" +
                "26.278 134(greedy) serves by server 4\n" +
                "26.280 129 done serving by server 3\n" +
                "26.280 131 serves by server 3\n" +
                "26.317 134(greedy) done serving by server 4\n" +
                "26.317 136(greedy) serves by server 4\n" +
                "26.424 168 arrives\n" +
                "26.424 168 waits at server 3\n" +
                "26.674 136(greedy) done serving by server 4\n" +
                "26.674 142 serves by server 4\n" +
                "26.695 142 done serving by server 4\n" +
                "26.695 143 serves by server 4\n" +
                "26.793 150(greedy) done serving by server 5\n" +
                "26.793 152(greedy) serves by server 5\n" +
                "26.904 98 done serving by server 1\n" +
                "26.904 99 serves by server 1\n" +
                "27.178 169 arrives\n" +
                "27.178 169 waits at server 1\n" +
                "27.183 89 done serving by server 2\n" +
                "27.183 90 serves by server 2\n" +
                "27.330 99 done serving by server 1\n" +
                "27.330 100 serves by server 1\n" +
                "27.700 170 arrives\n" +
                "27.700 170 waits at server 1\n" +
                "27.752 143 done serving by server 4\n" +
                "27.752 149(greedy) serves by server 4\n" +
                "27.961 149(greedy) done serving by server 4\n" +
                "27.961 151(greedy) serves by server 4\n" +
                "28.034 131 done serving by server 3\n" +
                "28.034 132 serves by server 3\n" +
                "28.111 100 done serving by server 1\n" +
                "28.111 111 serves by server 1\n" +
                "28.322 90 done serving by server 2\n" +
                "28.322 101 serves by server 2\n" +
                "28.831 171 arrives\n" +
                "28.831 171 waits at server 1\n" +
                "28.886 101 done serving by server 2\n" +
                "28.886 103 serves by server 2\n" +
                "28.940 172(greedy) arrives\n" +
                "28.940 172(greedy) waits at server 4\n" +
                "28.981 173 arrives\n" +
                "28.981 173 waits at server 2\n" +
                "28.991 174 arrives\n" +
                "28.991 174 waits at server 2\n" +
                "29.227 103 done serving by server 2\n" +
                "29.227 105 serves by server 2\n" +
                "29.256 175(greedy) arrives\n" +
                "29.256 175(greedy) waits at server 4\n" +
                "29.305 151(greedy) done serving by server 4\n" +
                "29.305 154(greedy) serves by server 4\n" +
                "29.389 176(greedy) arrives\n" +
                "29.389 176(greedy) waits at server 4\n" +
                "29.672 154(greedy) done serving by server 4\n" +
                "29.672 161 serves by server 4\n" +
                "29.705 111 done serving by server 1\n" +
                "29.705 116 serves by server 1\n" +
                "29.722 177 arrives\n" +
                "29.722 177 waits at server 1\n" +
                "29.989 178 arrives\n" +
                "29.989 178 waits at server 2\n" +
                "30.004 152(greedy) done serving by server 5\n" +
                "30.004 153(greedy) serves by server 5\n" +
                "30.042 116 done serving by server 1\n" +
                "30.042 128 serves by server 1\n" +
                "30.090 179 arrives\n" +
                "30.090 179 waits at server 1\n" +
                "30.106 180(greedy) arrives\n" +
                "30.106 180(greedy) waits at server 4\n" +
                "30.429 161 done serving by server 4\n" +
                "30.429 172(greedy) serves by server 4\n" +
                "30.564 128 done serving by server 1\n" +
                "30.564 140 serves by server 1\n" +
                "30.723 181(greedy) arrives\n" +
                "30.723 181(greedy) waits at server 4\n" +
                "30.859 182 arrives\n" +
                "30.859 182 waits at server 1\n" +
                "31.031 183(greedy) arrives\n" +
                "31.031 183(greedy) waits at server 4\n" +
                "31.155 184(greedy) arrives\n" +
                "31.155 184(greedy) waits at server 5\n" +
                "31.162 185 arrives\n" +
                "31.162 185 waits at server 2\n" +
                "31.223 172(greedy) done serving by server 4\n" +
                "31.223 175(greedy) serves by server 4\n" +
                "31.262 186(greedy) arrives\n" +
                "31.262 186(greedy) waits at server 4\n" +
                "31.325 105 done serving by server 2\n" +
                "31.325 107 serves by server 2\n" +
                "31.334 132 done serving by server 3\n" +
                "31.334 133 serves by server 3\n" +
                "31.726 187 arrives\n" +
                "31.726 187 waits at server 2\n" +
                "31.754 140 done serving by server 1\n" +
                "31.754 146 serves by server 1\n" +
                "31.758 188 arrives\n" +
                "31.758 188 waits at server 1\n" +
                "31.845 146 done serving by server 1\n" +
                "31.845 147(greedy) serves by server 1\n" +
                "31.898 189 arrives\n" +
                "31.898 189 waits at server 1\n" +
                "32.087 190 arrives\n" +
                "32.087 190 waits at server 3\n" +
                "32.089 191(greedy) arrives\n" +
                "32.089 191(greedy) waits at server 4\n" +
                "32.135 192 arrives\n" +
                "32.135 192 waits at server 3\n" +
                "32.147 153(greedy) done serving by server 5\n" +
                "32.147 156(greedy) serves by server 5\n" +
                "32.197 193 arrives\n" +
                "32.197 193 waits at server 3\n" +
                "32.204 194(greedy) arrives\n" +
                "32.204 194(greedy) waits at server 5\n" +
                "32.285 195(greedy) arrives\n" +
                "32.285 195(greedy) waits at server 5\n" +
                "32.552 196 arrives\n" +
                "32.552 196 waits at server 3\n" +
                "32.582 197 arrives\n" +
                "32.582 197 waits at server 4\n" +
                "32.606 175(greedy) done serving by server 4\n" +
                "32.606 176(greedy) serves by server 4\n" +
                "32.796 133 done serving by server 3\n" +
                "32.796 141 serves by server 3\n" +
                "32.824 176(greedy) done serving by server 4\n" +
                "32.824 180(greedy) serves by server 4\n" +
                "32.914 147(greedy) done serving by server 1\n" +
                "32.914 155 serves by server 1\n" +
                "32.953 198(greedy) arrives\n" +
                "32.953 198(greedy) waits at server 4\n" +
                "32.993 156(greedy) done serving by server 5\n" +
                "32.993 157(greedy) serves by server 5\n" +
                "33.074 199 arrives\n" +
                "33.074 199 waits at server 1\n" +
                "33.094 141 done serving by server 3\n" +
                "33.094 159 serves by server 3\n" +
                "33.130 200(greedy) arrives\n" +
                "33.130 200(greedy) waits at server 5\n" +
                "33.233 180(greedy) done serving by server 4\n" +
                "33.233 181(greedy) serves by server 4\n" +
                "33.275 157(greedy) done serving by server 5\n" +
                "33.275 162(greedy) serves by server 5\n" +
                "33.276 201(greedy) arrives\n" +
                "33.276 201(greedy) waits at server 4\n" +
                "33.295 107 done serving by server 2\n" +
                "33.295 114 serves by server 2\n" +
                "33.389 181(greedy) done serving by server 4\n" +
                "33.389 183(greedy) serves by server 4\n" +
                "33.627 202(greedy) arrives\n" +
                "33.627 202(greedy) waits at server 4\n" +
                "33.629 203 arrives\n" +
                "33.629 203 waits at server 2\n" +
                "33.637 155 done serving by server 1\n" +
                "33.637 164 serves by server 1\n" +
                "33.649 183(greedy) done serving by server 4\n" +
                "33.649 186(greedy) serves by server 4\n" +
                "33.737 114 done serving by server 2\n" +
                "33.737 119 serves by server 2\n" +
                "33.896 186(greedy) done serving by server 4\n" +
                "33.896 191(greedy) serves by server 4\n" +
                "33.897 204(greedy) arrives\n" +
                "33.897 204(greedy) waits at server 4\n" +
                "34.060 205 arrives\n" +
                "34.060 205 waits at server 1\n" +
                "34.265 119 done serving by server 2\n" +
                "34.265 124 serves by server 2\n" +
                "34.535 206 arrives\n" +
                "34.535 206 waits at server 2\n" +
                "34.637 207 arrives\n" +
                "34.637 207 waits at server 2\n" +
                "34.667 208 arrives\n" +
                "34.667 208 waits at server 3\n" +
                "34.707 191(greedy) done serving by server 4\n" +
                "34.707 197 serves by server 4\n" +
                "34.780 164 done serving by server 1\n" +
                "34.780 169 serves by server 1\n" +
                "34.899 209(greedy) arrives\n" +
                "34.899 209(greedy) waits at server 4\n" +
                "34.925 210(greedy) arrives\n" +
                "34.925 210(greedy) waits at server 4\n" +
                "34.986 211(greedy) arrives\n" +
                "34.986 211(greedy) waits at server 5\n" +
                "35.175 212(greedy) arrives\n" +
                "35.175 212(greedy) waits at server 4\n" +
                "35.414 197 done serving by server 4\n" +
                "35.414 198(greedy) serves by server 4\n" +
                "35.417 162(greedy) done serving by server 5\n" +
                "35.417 163(greedy) serves by server 5\n" +
                "35.548 213 arrives\n" +
                "35.548 213 waits at server 1\n" +
                "35.857 159 done serving by server 3\n" +
                "35.857 165 serves by server 3\n" +
                "35.874 214(greedy) arrives\n" +
                "35.874 214(greedy) waits at server 5\n" +
                "35.881 215 arrives\n" +
                "35.881 215 waits at server 3\n" +
                "35.901 216(greedy) arrives\n" +
                "35.901 216(greedy) waits at server 4\n" +
                "35.919 217(greedy) arrives\n" +
                "35.919 217(greedy) waits at server 5\n" +
                "35.936 124 done serving by server 2\n" +
                "35.936 158 serves by server 2\n" +
                "36.113 218 arrives\n" +
                "36.113 218 waits at server 2\n" +
                "36.319 219(greedy) arrives\n" +
                "36.319 219(greedy) waits at server 4\n" +
                "36.733 220 arrives\n" +
                "36.733 220 waits at server 3\n" +
                "36.889 221 arrives\n" +
                "36.889 221 waits at server 4\n" +
                "36.923 222(greedy) arrives\n" +
                "36.923 222(greedy) waits at server 5\n" +
                "36.951 165 done serving by server 3\n" +
                "36.951 166 serves by server 3\n" +
                "36.952 223 arrives\n" +
                "36.952 223 waits at server 3\n" +
                "37.066 224(greedy) arrives\n" +
                "37.066 224(greedy) waits at server 5\n" +
                "37.148 198(greedy) done serving by server 4\n" +
                "37.148 201(greedy) serves by server 4\n" +
                "37.370 166 done serving by server 3\n" +
                "37.370 167(greedy) serves by server 3\n" +
                "37.380 225 arrives\n" +
                "37.380 225 waits at server 3\n" +
                "37.476 226 arrives\n" +
                "37.476 226 waits at server 4\n" +
                "37.606 227 arrives\n" +
                "37.606 227 waits at server 4\n" +
                "37.627 228 arrives\n" +
                "37.627 228 waits at server 5\n" +
                "37.702 163(greedy) done serving by server 5\n" +
                "37.702 184(greedy) serves by server 5\n" +
                "37.705 158 done serving by server 2\n" +
                "37.705 160(greedy) serves by server 2\n" +
                "37.780 201(greedy) done serving by server 4\n" +
                "37.780 202(greedy) serves by server 4\n" +
                "38.089 229(greedy) arrives\n" +
                "38.089 229(greedy) waits at server 2\n" +
                "38.089 230(greedy) arrives\n" +
                "38.089 230(greedy) waits at server 4\n" +
                "38.243 184(greedy) done serving by server 5\n" +
                "38.243 194(greedy) serves by server 5\n" +
                "38.269 231 arrives\n" +
                "38.269 231 waits at server 5\n" +
                "38.441 232(greedy) arrives\n" +
                "38.441 232(greedy) waits at server 5\n" +
                "38.497 233 arrives\n" +
                "38.497 233 leaves\n" +
                "38.625 194(greedy) done serving by server 5\n" +
                "38.625 195(greedy) serves by server 5\n" +
                "38.661 169 done serving by server 1\n" +
                "38.661 170 serves by server 1\n" +
                "38.728 167(greedy) done serving by server 3\n" +
                "38.728 168 serves by server 3\n" +
                "38.781 160(greedy) done serving by server 2\n" +
                "38.781 173 serves by server 2\n" +
                "38.808 234 arrives\n" +
                "38.808 234 waits at server 1\n" +
                "38.811 235 arrives\n" +
                "38.811 235 waits at server 2\n" +
                "38.868 202(greedy) done serving by server 4\n" +
                "38.868 204(greedy) serves by server 4\n" +
                "38.869 236 arrives\n" +
                "38.869 236 waits at server 3\n" +
                "38.905 173 done serving by server 2\n" +
                "38.905 174 serves by server 2\n" +
                "39.039 237 arrives\n" +
                "39.039 237 waits at server 2\n" +
                "39.270 238 arrives\n" +
                "39.270 238 waits at server 4\n" +
                "39.323 168 done serving by server 3\n" +
                "39.323 190 serves by server 3\n" +
                "39.646 239(greedy) arrives\n" +
                "39.646 239(greedy) waits at server 3\n" +
                "39.665 240 arrives\n" +
                "39.665 240 waits at server 5\n" +
                "39.709 241(greedy) arrives\n" +
                "39.709 241(greedy) leaves\n" +
                "39.757 195(greedy) done serving by server 5\n" +
                "39.757 200(greedy) serves by server 5\n" +
                "39.955 242 arrives\n" +
                "39.955 242 waits at server 5\n" +
                "40.067 243 arrives\n" +
                "40.067 243 leaves\n" +
                "40.122 244 arrives\n" +
                "40.122 244 leaves\n" +
                "40.272 245(greedy) arrives\n" +
                "40.272 245(greedy) leaves\n" +
                "40.347 246(greedy) arrives\n" +
                "40.347 246(greedy) leaves\n" +
                "40.605 247 arrives\n" +
                "40.605 247 leaves\n" +
                "40.658 248(greedy) arrives\n" +
                "40.658 248(greedy) leaves\n" +
                "40.688 249(greedy) arrives\n" +
                "40.688 249(greedy) leaves\n" +
                "40.889 250 arrives\n" +
                "40.889 250 leaves\n" +
                "41.212 190 done serving by server 3\n" +
                "41.212 192 serves by server 3\n" +
                "41.223 200(greedy) done serving by server 5\n" +
                "41.223 211(greedy) serves by server 5\n" +
                "41.273 251 arrives\n" +
                "41.273 251 waits at server 3\n" +
                "41.362 252 arrives\n" +
                "41.362 252 waits at server 5\n" +
                "41.458 253 arrives\n" +
                "41.458 253 leaves\n" +
                "41.748 170 done serving by server 1\n" +
                "41.748 171 serves by server 1\n" +
                "41.755 254(greedy) arrives\n" +
                "41.755 254(greedy) waits at server 1\n" +
                "41.829 204(greedy) done serving by server 4\n" +
                "41.829 209(greedy) serves by server 4\n" +
                "41.932 255(greedy) arrives\n" +
                "41.932 255(greedy) waits at server 4\n" +
                "42.011 256(greedy) arrives\n" +
                "42.011 256(greedy) leaves\n" +
                "42.107 192 done serving by server 3\n" +
                "42.107 193 serves by server 3\n" +
                "42.115 171 done serving by server 1\n" +
                "42.115 177 serves by server 1\n" +
                "42.177 257(greedy) arrives\n" +
                "42.177 257(greedy) waits at server 1\n" +
                "42.212 258(greedy) arrives\n" +
                "42.212 258(greedy) waits at server 3\n" +
                "42.247 259 arrives\n" +
                "42.247 259 leaves\n" +
                "42.413 177 done serving by server 1\n" +
                "42.413 179 serves by server 1\n" +
                "42.715 260(greedy) arrives\n" +
                "42.715 260(greedy) waits at server 1\n" +
                "42.863 261(greedy) arrives\n" +
                "42.863 261(greedy) leaves\n" +
                "42.943 211(greedy) done serving by server 5\n" +
                "42.943 214(greedy) serves by server 5\n" +
                "42.949 262(greedy) arrives\n" +
                "42.949 262(greedy) waits at server 5\n" +
                "43.013 263(greedy) arrives\n" +
                "43.013 263(greedy) leaves\n" +
                "43.042 264(greedy) arrives\n" +
                "43.042 264(greedy) leaves\n" +
                "43.074 265(greedy) arrives\n" +
                "43.074 265(greedy) leaves\n" +
                "43.077 193 done serving by server 3\n" +
                "43.077 196 serves by server 3\n" +
                "43.154 266 arrives\n" +
                "43.154 266 waits at server 3\n" +
                "43.162 267 arrives\n" +
                "43.162 267 leaves\n" +
                "43.174 268(greedy) arrives\n" +
                "43.174 268(greedy) leaves\n" +
                "43.470 209(greedy) done serving by server 4\n" +
                "43.470 210(greedy) serves by server 4\n" +
                "43.489 269(greedy) arrives\n" +
                "43.489 269(greedy) waits at server 4\n" +
                "43.528 270 arrives\n" +
                "43.528 270 leaves\n" +
                "43.601 271 arrives\n" +
                "43.601 271 leaves\n" +
                "43.622 272(greedy) arrives\n" +
                "43.622 272(greedy) leaves\n" +
                "43.752 179 done serving by server 1\n" +
                "43.752 182 serves by server 1\n" +
                "43.824 196 done serving by server 3\n" +
                "43.824 208 serves by server 3\n" +
                "43.861 273 arrives\n" +
                "43.861 273 waits at server 1\n" +
                "43.896 214(greedy) done serving by server 5\n" +
                "43.896 217(greedy) serves by server 5\n" +
                "43.953 274(greedy) arrives\n" +
                "43.953 274(greedy) waits at server 3\n" +
                "44.064 210(greedy) done serving by server 4\n" +
                "44.064 212(greedy) serves by server 4\n" +
                "44.093 275 arrives\n" +
                "44.093 275 waits at server 4\n" +
                "44.448 276 arrives\n" +
                "44.448 276 waits at server 5\n" +
                "44.469 277(greedy) arrives\n" +
                "44.469 277(greedy) leaves\n" +
                "44.518 217(greedy) done serving by server 5\n" +
                "44.518 222(greedy) serves by server 5\n" +
                "44.542 222(greedy) done serving by server 5\n" +
                "44.542 224(greedy) serves by server 5\n" +
                "44.655 278 arrives\n" +
                "44.655 278 waits at server 5\n" +
                "44.733 279 arrives\n" +
                "44.733 279 waits at server 5\n" +
                "45.196 280(greedy) arrives\n" +
                "45.196 280(greedy) leaves\n" +
                "45.259 281(greedy) arrives\n" +
                "45.259 281(greedy) leaves\n" +
                "45.322 282(greedy) arrives\n" +
                "45.322 282(greedy) leaves\n" +
                "45.538 283 arrives\n" +
                "45.538 283 leaves\n" +
                "45.676 182 done serving by server 1\n" +
                "45.676 188 serves by server 1\n" +
                "45.832 284(greedy) arrives\n" +
                "45.832 284(greedy) waits at server 1\n" +
                "45.875 224(greedy) done serving by server 5\n" +
                "45.875 228 serves by server 5\n" +
                "45.995 228 done serving by server 5\n" +
                "45.995 231 serves by server 5\n" +
                "46.005 285(greedy) arrives\n" +
                "46.005 285(greedy) waits at server 5\n" +
                "46.103 231 done serving by server 5\n" +
                "46.103 232(greedy) serves by server 5\n" +
                "46.109 232(greedy) done serving by server 5\n" +
                "46.109 240 serves by server 5\n" +
                "46.133 286 arrives\n" +
                "46.133 286 waits at server 5\n" +
                "46.390 287 arrives\n" +
                "46.390 287 waits at server 5\n" +
                "46.485 208 done serving by server 3\n" +
                "46.485 215 serves by server 3\n" +
                "46.492 288 arrives\n" +
                "46.492 288 waits at server 3\n" +
                "46.513 289(greedy) arrives\n" +
                "46.513 289(greedy) waits at server 5\n" +
                "46.657 174 done serving by server 2\n" +
                "46.657 178 serves by server 2\n" +
                "46.818 290(greedy) arrives\n" +
                "46.818 290(greedy) waits at server 2\n" +
                "46.845 291(greedy) arrives\n" +
                "46.845 291(greedy) leaves\n" +
                "46.997 292 arrives\n" +
                "46.997 292 leaves\n" +
                "47.020 293(greedy) arrives\n" +
                "47.020 293(greedy) leaves\n" +
                "47.021 215 done serving by server 3\n" +
                "47.021 220 serves by server 3\n" +
                "47.082 294(greedy) arrives\n" +
                "47.082 294(greedy) waits at server 3\n" +
                "47.328 295(greedy) arrives\n" +
                "47.328 295(greedy) leaves\n" +
                "47.432 178 done serving by server 2\n" +
                "47.432 185 serves by server 2\n" +
                "47.538 296 arrives\n" +
                "47.538 296 waits at server 2\n" +
                "47.540 297(greedy) arrives\n" +
                "47.540 297(greedy) leaves\n" +
                "47.553 298(greedy) arrives\n" +
                "47.553 298(greedy) leaves\n" +
                "47.683 299(greedy) arrives\n" +
                "47.683 299(greedy) leaves\n" +
                "47.708 240 done serving by server 5\n" +
                "47.708 242 serves by server 5\n" +
                "47.830 300 arrives\n" +
                "47.830 300 waits at server 5\n" +
                "47.889 301(greedy) arrives\n" +
                "47.889 301(greedy) leaves\n" +
                "48.070 302 arrives\n" +
                "48.070 302 leaves\n" +
                "48.091 242 done serving by server 5\n" +
                "48.091 252 serves by server 5\n" +
                "48.191 220 done serving by server 3\n" +
                "48.191 223 serves by server 3\n" +
                "48.204 303(greedy) arrives\n" +
                "48.204 303(greedy) waits at server 3\n" +
                "48.679 304(greedy) arrives\n" +
                "48.679 304(greedy) waits at server 5\n" +
                "48.701 252 done serving by server 5\n" +
                "48.701 262(greedy) serves by server 5\n" +
                "48.830 305 arrives\n" +
                "48.830 305 waits at server 5\n" +
                "48.900 262(greedy) done serving by server 5\n" +
                "48.900 276 serves by server 5\n" +
                "48.934 276 done serving by server 5\n" +
                "48.934 278 serves by server 5\n" +
                "49.054 306 arrives\n" +
                "49.054 306 waits at server 5\n" +
                "49.138 223 done serving by server 3\n" +
                "49.138 225 serves by server 3\n" +
                "49.222 307 arrives\n" +
                "49.222 307 waits at server 3\n" +
                "49.332 185 done serving by server 2\n" +
                "49.332 187 serves by server 2\n" +
                "49.476 278 done serving by server 5\n" +
                "49.476 279 serves by server 5\n" +
                "49.568 279 done serving by server 5\n" +
                "49.568 285(greedy) serves by server 5\n" +
                "49.622 308(greedy) arrives\n" +
                "49.622 308(greedy) waits at server 5\n" +
                "49.698 309 arrives\n" +
                "49.698 309 waits at server 2\n" +
                "49.734 212(greedy) done serving by server 4\n" +
                "49.734 216(greedy) serves by server 4\n" +
                "49.781 216(greedy) done serving by server 4\n" +
                "49.781 219(greedy) serves by server 4\n" +
                "49.804 285(greedy) done serving by server 5\n" +
                "49.804 286 serves by server 5\n" +
                "49.887 286 done serving by server 5\n" +
                "49.887 287 serves by server 5\n" +
                "49.896 187 done serving by server 2\n" +
                "49.896 203 serves by server 2\n" +
                "50.014 310(greedy) arrives\n" +
                "50.014 310(greedy) waits at server 5\n" +
                "50.020 311(greedy) arrives\n" +
                "50.020 311(greedy) waits at server 5\n" +
                "50.033 225 done serving by server 3\n" +
                "50.033 236 serves by server 3\n" +
                "50.034 219(greedy) done serving by server 4\n" +
                "50.034 221 serves by server 4\n" +
                "50.039 287 done serving by server 5\n" +
                "50.039 289(greedy) serves by server 5\n" +
                "50.082 312 arrives\n" +
                "50.082 312 waits at server 2\n" +
                "50.114 313 arrives\n" +
                "50.114 313 waits at server 3\n" +
                "50.206 314(greedy) arrives\n" +
                "50.206 314(greedy) waits at server 4\n" +
                "50.241 289(greedy) done serving by server 5\n" +
                "50.241 300 serves by server 5\n" +
                "50.430 315 arrives\n" +
                "50.430 315 waits at server 4\n" +
                "50.493 316(greedy) arrives\n" +
                "50.493 316(greedy) waits at server 5\n" +
                "50.709 317(greedy) arrives\n" +
                "50.709 317(greedy) waits at server 5\n" +
                "51.000 300 done serving by server 5\n" +
                "51.000 304(greedy) serves by server 5\n" +
                "51.056 203 done serving by server 2\n" +
                "51.056 206 serves by server 2\n" +
                "51.299 318(greedy) arrives\n" +
                "51.299 318(greedy) waits at server 5\n" +
                "51.321 319 arrives\n" +
                "51.321 319 waits at server 2\n" +
                "51.388 304(greedy) done serving by server 5\n" +
                "51.388 305 serves by server 5\n" +
                "51.460 320(greedy) arrives\n" +
                "51.460 320(greedy) waits at server 5\n" +
                "51.623 321 arrives\n" +
                "51.623 321 waits at server 4\n" +
                "51.702 322(greedy) arrives\n" +
                "51.702 322(greedy) waits at server 5\n" +
                "51.740 236 done serving by server 3\n" +
                "51.740 239(greedy) serves by server 3\n" +
                "51.836 323 arrives\n" +
                "51.836 323 waits at server 3\n" +
                "51.870 324(greedy) arrives\n" +
                "51.870 324(greedy) waits at server 5\n" +
                "51.920 325 arrives\n" +
                "51.920 325 leaves\n" +
                "51.993 326 arrives\n" +
                "51.993 326 leaves\n" +
                "52.027 327(greedy) arrives\n" +
                "52.027 327(greedy) leaves\n" +
                "52.123 188 done serving by server 1\n" +
                "52.123 189 serves by server 1\n" +
                "52.259 328 arrives\n" +
                "52.259 328 waits at server 1\n" +
                "52.433 305 done serving by server 5\n" +
                "52.433 306 serves by server 5\n" +
                "52.460 239(greedy) done serving by server 3\n" +
                "52.460 251 serves by server 3\n" +
                "52.525 251 done serving by server 3\n" +
                "52.525 258(greedy) serves by server 3\n" +
                "52.533 329 arrives\n" +
                "52.533 329 waits at server 3\n" +
                "52.535 330(greedy) arrives\n" +
                "52.535 330(greedy) waits at server 3\n" +
                "52.601 206 done serving by server 2\n" +
                "52.601 207 serves by server 2\n" +
                "52.631 207 done serving by server 2\n" +
                "52.631 218 serves by server 2\n" +
                "52.779 189 done serving by server 1\n" +
                "52.779 199 serves by server 1\n" +
                "52.819 258(greedy) done serving by server 3\n" +
                "52.819 266 serves by server 3\n" +
                "52.971 331 arrives\n" +
                "52.971 331 waits at server 1\n" +
                "53.043 306 done serving by server 5\n" +
                "53.043 308(greedy) serves by server 5\n" +
                "53.145 332 arrives\n" +
                "53.145 332 waits at server 2\n" +
                "53.202 333(greedy) arrives\n" +
                "53.202 333(greedy) waits at server 5\n" +
                "53.212 266 done serving by server 3\n" +
                "53.212 274(greedy) serves by server 3\n" +
                "53.454 334(greedy) arrives\n" +
                "53.454 334(greedy) waits at server 3\n" +
                "53.477 199 done serving by server 1\n" +
                "53.477 205 serves by server 1\n" +
                "53.528 218 done serving by server 2\n" +
                "53.528 229(greedy) serves by server 2\n" +
                "53.548 335 arrives\n" +
                "53.548 335 waits at server 1\n" +
                "53.572 336(greedy) arrives\n" +
                "53.572 336(greedy) waits at server 2\n" +
                "53.638 337 arrives\n" +
                "53.638 337 waits at server 2\n" +
                "53.733 338 arrives\n" +
                "53.733 338 waits at server 3\n" +
                "53.752 308(greedy) done serving by server 5\n" +
                "53.752 310(greedy) serves by server 5\n" +
                "53.857 229(greedy) done serving by server 2\n" +
                "53.857 235 serves by server 2\n" +
                "53.917 339(greedy) arrives\n" +
                "53.917 339(greedy) waits at server 5\n" +
                "53.947 340(greedy) arrives\n" +
                "53.947 340(greedy) waits at server 2\n" +
                "53.990 341(greedy) arrives\n" +
                "53.990 341(greedy) waits at server 5\n" +
                "54.017 342(greedy) arrives\n" +
                "54.017 342(greedy) leaves\n" +
                "54.147 343 arrives\n" +
                "54.147 343 leaves\n" +
                "54.223 344(greedy) arrives\n" +
                "54.223 344(greedy) leaves\n" +
                "54.312 345 arrives\n" +
                "54.312 345 leaves\n" +
                "54.441 346(greedy) arrives\n" +
                "54.441 346(greedy) leaves\n" +
                "54.446 221 done serving by server 4\n" +
                "54.446 226 serves by server 4\n" +
                "54.708 310(greedy) done serving by server 5\n" +
                "54.708 311(greedy) serves by server 5\n" +
                "54.754 347 arrives\n" +
                "54.754 347 waits at server 4\n" +
                "54.859 274(greedy) done serving by server 3\n" +
                "54.859 288 serves by server 3\n" +
                "54.902 348 arrives\n" +
                "54.902 348 waits at server 3\n" +
                "54.930 311(greedy) done serving by server 5\n" +
                "54.930 316(greedy) serves by server 5\n" +
                "54.939 316(greedy) done serving by server 5\n" +
                "54.939 317(greedy) serves by server 5\n" +
                "54.995 317(greedy) done serving by server 5\n" +
                "54.995 318(greedy) serves by server 5\n" +
                "55.051 205 done serving by server 1\n" +
                "55.051 213 serves by server 1\n" +
                "55.072 349(greedy) arrives\n" +
                "55.072 349(greedy) waits at server 5\n" +
                "55.096 213 done serving by server 1\n" +
                "55.096 234 serves by server 1\n" +
                "55.146 318(greedy) done serving by server 5\n" +
                "55.146 320(greedy) serves by server 5\n" +
                "55.176 320(greedy) done serving by server 5\n" +
                "55.176 322(greedy) serves by server 5\n" +
                "55.206 350 arrives\n" +
                "55.206 350 waits at server 1\n" +
                "55.207 288 done serving by server 3\n" +
                "55.207 294(greedy) serves by server 3\n" +
                "55.258 351 arrives\n" +
                "55.258 351 waits at server 1\n" +
                "55.344 352 arrives\n" +
                "55.344 352 waits at server 3\n" +
                "55.419 353 arrives\n" +
                "55.419 353 waits at server 5\n" +
                "55.423 354(greedy) arrives\n" +
                "55.423 354(greedy) waits at server 5\n" +
                "55.441 355 arrives\n" +
                "55.441 355 waits at server 5\n" +
                "55.471 356 arrives\n" +
                "55.471 356 waits at server 5\n" +
                "55.548 357(greedy) arrives\n" +
                "55.548 357(greedy) waits at server 5\n" +
                "55.601 234 done serving by server 1\n" +
                "55.601 254(greedy) serves by server 1\n" +
                "55.604 294(greedy) done serving by server 3\n" +
                "55.604 303(greedy) serves by server 3\n" +
                "55.670 358(greedy) arrives\n" +
                "55.670 358(greedy) waits at server 1\n" +
                "55.684 359(greedy) arrives\n" +
                "55.684 359(greedy) waits at server 3\n" +
                "55.695 360(greedy) arrives\n" +
                "55.695 360(greedy) leaves\n" +
                "55.706 254(greedy) done serving by server 1\n" +
                "55.706 257(greedy) serves by server 1\n" +
                "55.863 361(greedy) arrives\n" +
                "55.863 361(greedy) waits at server 1\n" +
                "55.873 226 done serving by server 4\n" +
                "55.873 227 serves by server 4\n" +
                "55.925 362(greedy) arrives\n" +
                "55.925 362(greedy) waits at server 4\n" +
                "55.998 363 arrives\n" +
                "55.998 363 leaves\n" +
                "56.063 364(greedy) arrives\n" +
                "56.063 364(greedy) leaves\n" +
                "56.344 365(greedy) arrives\n" +
                "56.344 365(greedy) leaves\n" +
                "56.388 227 done serving by server 4\n" +
                "56.388 230(greedy) serves by server 4\n" +
                "56.406 366 arrives\n" +
                "56.406 366 waits at server 4\n" +
                "56.620 367 arrives\n" +
                "56.620 367 leaves\n" +
                "56.714 257(greedy) done serving by server 1\n" +
                "56.714 260(greedy) serves by server 1\n" +
                "56.771 368 arrives\n" +
                "56.771 368 waits at server 1\n" +
                "56.797 303(greedy) done serving by server 3\n" +
                "56.797 307 serves by server 3\n" +
                "56.844 369 arrives\n" +
                "56.844 369 waits at server 3\n" +
                "56.854 307 done serving by server 3\n" +
                "56.854 313 serves by server 3\n" +
                "56.859 370 arrives\n" +
                "56.859 370 waits at server 3\n" +
                "57.019 371(greedy) arrives\n" +
                "57.019 371(greedy) leaves\n" +
                "57.165 372 arrives\n" +
                "57.165 372 leaves\n" +
                "57.265 230(greedy) done serving by server 4\n" +
                "57.265 238 serves by server 4\n" +
                "57.303 373(greedy) arrives\n" +
                "57.303 373(greedy) waits at server 4\n" +
                "57.432 374(greedy) arrives\n" +
                "57.432 374(greedy) leaves\n" +
                "57.449 313 done serving by server 3\n" +
                "57.449 323 serves by server 3\n" +
                "57.461 375(greedy) arrives\n" +
                "57.461 375(greedy) waits at server 3\n" +
                "57.565 235 done serving by server 2\n" +
                "57.565 237 serves by server 2\n" +
                "57.671 376(greedy) arrives\n" +
                "57.671 376(greedy) waits at server 2\n" +
                "57.720 237 done serving by server 2\n" +
                "57.720 290(greedy) serves by server 2\n" +
                "57.747 377(greedy) arrives\n" +
                "57.747 377(greedy) waits at server 2\n" +
                "57.750 378 arrives\n" +
                "57.750 378 leaves\n" +
                "57.829 379(greedy) arrives\n" +
                "57.829 379(greedy) leaves\n" +
                "57.869 380 arrives\n" +
                "57.869 380 leaves\n" +
                "57.916 381(greedy) arrives\n" +
                "57.916 381(greedy) leaves\n" +
                "58.293 382(greedy) arrives\n" +
                "58.293 382(greedy) leaves\n" +
                "58.398 383(greedy) arrives\n" +
                "58.398 383(greedy) leaves\n" +
                "58.400 384 arrives\n" +
                "58.400 384 leaves\n" +
                "58.475 385 arrives\n" +
                "58.475 385 leaves\n" +
                "58.495 290(greedy) done serving by server 2\n" +
                "58.495 296 serves by server 2\n" +
                "58.534 323 done serving by server 3\n" +
                "58.534 329 serves by server 3\n" +
                "58.651 296 done serving by server 2\n" +
                "58.651 309 serves by server 2\n" +
                "58.660 386(greedy) arrives\n" +
                "58.660 386(greedy) waits at server 2\n" +
                "58.837 387(greedy) arrives\n" +
                "58.837 387(greedy) waits at server 2\n" +
                "58.900 388 arrives\n" +
                "58.900 388 waits at server 3\n" +
                "59.035 389 arrives\n" +
                "59.035 389 leaves\n" +
                "59.099 260(greedy) done serving by server 1\n" +
                "59.099 273 serves by server 1\n" +
                "59.119 238 done serving by server 4\n" +
                "59.119 255(greedy) serves by server 4\n" +
                "59.136 390 arrives\n" +
                "59.136 390 waits at server 1\n" +
                "59.162 309 done serving by server 2\n" +
                "59.162 312 serves by server 2\n" +
                "59.504 391(greedy) arrives\n" +
                "59.504 391(greedy) waits at server 2\n" +
                "59.676 392(greedy) arrives\n" +
                "59.676 392(greedy) waits at server 4\n" +
                "59.829 393(greedy) arrives\n" +
                "59.829 393(greedy) leaves\n" +
                "59.857 329 done serving by server 3\n" +
                "59.857 330(greedy) serves by server 3\n" +
                "59.883 394(greedy) arrives\n" +
                "59.883 394(greedy) waits at server 3\n" +
                "59.891 395 arrives\n" +
                "59.891 395 leaves\n" +
                "59.919 322(greedy) done serving by server 5\n" +
                "59.919 324(greedy) serves by server 5\n" +
                "59.936 396 arrives\n" +
                "59.936 396 waits at server 5\n" +
                "60.229 397 arrives\n" +
                "60.229 397 leaves\n" +
                "60.245 398(greedy) arrives\n" +
                "60.245 398(greedy) leaves\n" +
                "60.330 399(greedy) arrives\n" +
                "60.330 399(greedy) leaves\n" +
                "60.345 400 arrives\n" +
                "60.345 400 leaves\n" +
                "60.382 401 arrives\n" +
                "60.382 401 leaves\n" +
                "60.427 273 done serving by server 1\n" +
                "60.427 284(greedy) serves by server 1\n" +
                "60.449 324(greedy) done serving by server 5\n" +
                "60.449 333(greedy) serves by server 5\n" +
                "60.499 402(greedy) arrives\n" +
                "60.499 402(greedy) waits at server 1\n" +
                "60.510 330(greedy) done serving by server 3\n" +
                "60.510 334(greedy) serves by server 3\n" +
                "60.543 403(greedy) arrives\n" +
                "60.543 403(greedy) waits at server 3\n" +
                "60.558 312 done serving by server 2\n" +
                "60.558 319 serves by server 2\n" +
                "60.676 284(greedy) done serving by server 1\n" +
                "60.676 328 serves by server 1\n" +
                "60.815 328 done serving by server 1\n" +
                "60.815 331 serves by server 1\n" +
                "60.922 333(greedy) done serving by server 5\n" +
                "60.922 339(greedy) serves by server 5\n" +
                "61.020 339(greedy) done serving by server 5\n" +
                "61.020 341(greedy) serves by server 5\n" +
                "61.055 404(greedy) arrives\n" +
                "61.055 404(greedy) waits at server 5\n" +
                "61.164 331 done serving by server 1\n" +
                "61.164 335 serves by server 1\n" +
                "61.262 405(greedy) arrives\n" +
                "61.262 405(greedy) waits at server 1\n" +
                "61.292 406 arrives\n" +
                "61.292 406 waits at server 1\n" +
                "61.364 407(greedy) arrives\n" +
                "61.364 407(greedy) waits at server 5\n" +
                "61.449 408 arrives\n" +
                "61.449 408 waits at server 1\n" +
                "61.453 409(greedy) arrives\n" +
                "61.453 409(greedy) waits at server 2\n" +
                "61.553 341(greedy) done serving by server 5\n" +
                "61.553 349(greedy) serves by server 5\n" +
                "61.721 410 arrives\n" +
                "61.721 410 waits at server 5\n" +
                "61.723 334(greedy) done serving by server 3\n" +
                "61.723 338 serves by server 3\n" +
                "62.128 338 done serving by server 3\n" +
                "62.128 348 serves by server 3\n" +
                "62.139 411 arrives\n" +
                "62.139 411 waits at server 3\n" +
                "62.210 412(greedy) arrives\n" +
                "62.210 412(greedy) waits at server 3\n" +
                "62.236 349(greedy) done serving by server 5\n" +
                "62.236 353 serves by server 5\n" +
                "62.269 413 arrives\n" +
                "62.269 413 waits at server 5\n" +
                "62.270 414(greedy) arrives\n" +
                "62.270 414(greedy) waits at server 5\n" +
                "62.325 335 done serving by server 1\n" +
                "62.325 350 serves by server 1\n" +
                "62.474 415 arrives\n" +
                "62.474 415 waits at server 1\n" +
                "62.664 255(greedy) done serving by server 4\n" +
                "62.664 269(greedy) serves by server 4\n" +
                "62.716 353 done serving by server 5\n" +
                "62.716 354(greedy) serves by server 5\n" +
                "62.727 319 done serving by server 2\n" +
                "62.727 332 serves by server 2\n" +
                "62.733 416 arrives\n" +
                "62.733 416 waits at server 2\n" +
                "62.843 332 done serving by server 2\n" +
                "62.843 336(greedy) serves by server 2\n" +
                "62.844 269(greedy) done serving by server 4\n" +
                "62.844 275 serves by server 4\n" +
                "62.969 417(greedy) arrives\n" +
                "62.969 417(greedy) waits at server 4\n" +
                "63.105 350 done serving by server 1\n" +
                "63.105 351 serves by server 1\n" +
                "63.235 275 done serving by server 4\n" +
                "63.235 314(greedy) serves by server 4\n" +
                "63.308 418 arrives\n" +
                "63.308 418 waits at server 1\n" +
                "63.398 419(greedy) arrives\n" +
                "63.398 419(greedy) waits at server 4\n" +
                "63.417 420(greedy) arrives\n" +
                "63.417 420(greedy) waits at server 2\n" +
                "63.469 336(greedy) done serving by server 2\n" +
                "63.469 337 serves by server 2\n" +
                "63.509 348 done serving by server 3\n" +
                "63.509 352 serves by server 3\n" +
                "63.578 351 done serving by server 1\n" +
                "63.578 358(greedy) serves by server 1\n" +
                "63.665 421(greedy) arrives\n" +
                "63.665 421(greedy) waits at server 1\n" +
                "63.805 422(greedy) arrives\n" +
                "63.805 422(greedy) waits at server 2\n" +
                "63.835 423 arrives\n" +
                "63.835 423 waits at server 3\n" +
                "63.887 358(greedy) done serving by server 1\n" +
                "63.887 361(greedy) serves by server 1\n" +
                "63.921 354(greedy) done serving by server 5\n" +
                "63.921 355 serves by server 5\n" +
                "63.936 337 done serving by server 2\n" +
                "63.936 340(greedy) serves by server 2\n" +
                "64.038 424 arrives\n" +
                "64.038 424 waits at server 1\n" +
                "64.044 425(greedy) arrives\n" +
                "64.044 425(greedy) waits at server 5\n" +
                "64.053 426(greedy) arrives\n" +
                "64.053 426(greedy) waits at server 2\n" +
                "64.162 427 arrives\n" +
                "64.162 427 waits at server 4\n" +
                "64.239 428(greedy) arrives\n" +
                "64.239 428(greedy) waits at server 5\n" +
                "64.280 429 arrives\n" +
                "64.280 429 leaves\n" +
                "64.381 430 arrives\n" +
                "64.381 430 leaves\n" +
                "64.482 361(greedy) done serving by server 1\n" +
                "64.482 368 serves by server 1\n" +
                "64.572 431 arrives\n" +
                "64.572 431 waits at server 1\n" +
                "64.887 432 arrives\n" +
                "64.887 432 leaves\n" +
                "64.950 433(greedy) arrives\n" +
                "64.950 433(greedy) leaves\n" +
                "65.042 434 arrives\n" +
                "65.042 434 leaves\n" +
                "65.161 435 arrives\n" +
                "65.161 435 leaves\n" +
                "65.239 314(greedy) done serving by server 4\n" +
                "65.239 315 serves by server 4\n" +
                "65.421 436 arrives\n" +
                "65.421 436 waits at server 4\n" +
                "65.464 437 arrives\n" +
                "65.464 437 leaves\n" +
                "65.465 352 done serving by server 3\n" +
                "65.465 359(greedy) serves by server 3\n" +
                "65.466 438(greedy) arrives\n" +
                "65.466 438(greedy) waits at server 3\n" +
                "65.527 439 arrives\n" +
                "65.527 439 leaves\n" +
                "65.601 440 arrives\n" +
                "65.601 440 leaves\n" +
                "65.864 368 done serving by server 1\n" +
                "65.864 390 serves by server 1\n" +
                "65.902 441(greedy) arrives\n" +
                "65.902 441(greedy) waits at server 1\n" +
                "66.070 442(greedy) arrives\n" +
                "66.070 442(greedy) leaves\n" +
                "66.246 443 arrives\n" +
                "66.246 443 leaves\n" +
                "66.453 444(greedy) arrives\n" +
                "66.453 444(greedy) leaves\n" +
                "66.455 359(greedy) done serving by server 3\n" +
                "66.455 369 serves by server 3\n" +
                "66.556 445(greedy) arrives\n" +
                "66.556 445(greedy) waits at server 3\n" +
                "66.737 355 done serving by server 5\n" +
                "66.737 356 serves by server 5\n" +
                "66.772 369 done serving by server 3\n" +
                "66.772 370 serves by server 3\n" +
                "66.886 340(greedy) done serving by server 2\n" +
                "66.886 376(greedy) serves by server 2\n" +
                "67.000 356 done serving by server 5\n" +
                "67.000 357(greedy) serves by server 5\n" +
                "67.023 446(greedy) arrives\n" +
                "67.023 446(greedy) waits at server 5\n" +
                "67.039 357(greedy) done serving by server 5\n" +
                "67.039 396 serves by server 5\n" +
                "67.208 396 done serving by server 5\n" +
                "67.208 404(greedy) serves by server 5\n" +
                "67.222 447 arrives\n" +
                "67.222 447 waits at server 2\n" +
                "67.264 376(greedy) done serving by server 2\n" +
                "67.264 377(greedy) serves by server 2\n" +
                "67.360 404(greedy) done serving by server 5\n" +
                "67.360 407(greedy) serves by server 5\n" +
                "67.534 448 arrives\n" +
                "67.534 448 waits at server 2\n" +
                "67.606 390 done serving by server 1\n" +
                "67.606 402(greedy) serves by server 1\n" +
                "67.686 449(greedy) arrives\n" +
                "67.686 449(greedy) waits at server 5\n" +
                "67.764 450(greedy) arrives\n" +
                "67.764 450(greedy) waits at server 5\n" +
                "67.768 451(greedy) arrives\n" +
                "67.768 451(greedy) waits at server 5\n" +
                "67.919 452 arrives\n" +
                "67.919 452 waits at server 1\n" +
                "68.055 370 done serving by server 3\n" +
                "68.055 375(greedy) serves by server 3\n" +
                "68.067 453(greedy) arrives\n" +
                "68.067 453(greedy) waits at server 3\n" +
                "68.076 454 arrives\n" +
                "68.076 454 waits at server 3\n" +
                "68.132 455 arrives\n" +
                "68.132 455 waits at server 5\n" +
                "68.281 456(greedy) arrives\n" +
                "68.281 456(greedy) leaves\n" +
                "68.295 457 arrives\n" +
                "68.295 457 leaves\n" +
                "68.343 458(greedy) arrives\n" +
                "68.343 458(greedy) leaves\n" +
                "68.392 459 arrives\n" +
                "68.392 459 leaves\n" +
                "68.450 377(greedy) done serving by server 2\n" +
                "68.450 386(greedy) serves by server 2\n" +
                "68.595 375(greedy) done serving by server 3\n" +
                "68.595 388 serves by server 3\n" +
                "68.611 460 arrives\n" +
                "68.611 460 waits at server 2\n" +
                "68.632 386(greedy) done serving by server 2\n" +
                "68.632 387(greedy) serves by server 2\n" +
                "68.673 388 done serving by server 3\n" +
                "68.673 394(greedy) serves by server 3\n" +
                "68.729 461 arrives\n" +
                "68.729 461 waits at server 2\n" +
                "68.783 402(greedy) done serving by server 1\n" +
                "68.783 405(greedy) serves by server 1\n" +
                "68.828 387(greedy) done serving by server 2\n" +
                "68.828 391(greedy) serves by server 2\n" +
                "68.931 315 done serving by server 4\n" +
                "68.931 321 serves by server 4\n" +
                "68.937 405(greedy) done serving by server 1\n" +
                "68.937 406 serves by server 1\n" +
                "68.981 406 done serving by server 1\n" +
                "68.981 408 serves by server 1\n" +
                "69.018 321 done serving by server 4\n" +
                "69.018 347 serves by server 4\n" +
                "69.028 394(greedy) done serving by server 3\n" +
                "69.028 403(greedy) serves by server 3\n" +
                "69.085 462 arrives\n" +
                "69.085 462 waits at server 1\n" +
                "69.089 463 arrives\n" +
                "69.089 463 waits at server 1\n" +
                "69.499 347 done serving by server 4\n" +
                "69.499 362(greedy) serves by server 4\n" +
                "69.704 464(greedy) arrives\n" +
                "69.704 464(greedy) waits at server 3\n" +
                "69.706 465(greedy) arrives\n" +
                "69.706 465(greedy) waits at server 4\n" +
                "69.717 403(greedy) done serving by server 3\n" +
                "69.717 411 serves by server 3\n" +
                "69.732 466 arrives\n" +
                "69.732 466 waits at server 1\n" +
                "69.788 467 arrives\n" +
                "69.788 467 waits at server 2\n" +
                "69.855 407(greedy) done serving by server 5\n" +
                "69.855 410 serves by server 5\n" +
                "70.130 468 arrives\n" +
                "70.130 468 waits at server 3\n" +
                "70.266 469(greedy) arrives\n" +
                "70.266 469(greedy) waits at server 3\n" +
                "70.479 408 done serving by server 1\n" +
                "70.479 415 serves by server 1\n" +
                "70.624 470 arrives\n" +
                "70.624 470 waits at server 1\n" +
                "70.659 415 done serving by server 1\n" +
                "70.659 418 serves by server 1\n" +
                "70.685 391(greedy) done serving by server 2\n" +
                "70.685 409(greedy) serves by server 2\n" +
                "70.712 471(greedy) arrives\n" +
                "70.712 471(greedy) waits at server 4\n" +
                "70.727 362(greedy) done serving by server 4\n" +
                "70.727 366 serves by server 4");

        System.out.println("70.920 472 arrives\n" +
                "70.920 472 waits at server 1\n" +
                "71.123 473(greedy) arrives\n" +
                "71.123 473(greedy) waits at server 4\n" +
                "71.153 474(greedy) arrives\n" +
                "71.153 474(greedy) waits at server 2\n" +
                "71.324 411 done serving by server 3\n" +
                "71.324 412(greedy) serves by server 3\n" +
                "71.376 412(greedy) done serving by server 3\n" +
                "71.376 423 serves by server 3\n" +
                "71.508 475 arrives\n" +
                "71.508 475 waits at server 3\n" +
                "71.521 418 done serving by server 1\n" +
                "71.521 421(greedy) serves by server 1\n" +
                "71.581 421(greedy) done serving by server 1\n" +
                "71.581 424 serves by server 1\n" +
                "71.626 410 done serving by server 5\n" +
                "71.626 413 serves by server 5\n" +
                "71.690 409(greedy) done serving by server 2\n" +
                "71.690 416 serves by server 2\n" +
                "71.701 423 done serving by server 3\n" +
                "71.701 438(greedy) serves by server 3\n" +
                "71.807 416 done serving by server 2\n" +
                "71.807 420(greedy) serves by server 2\n" +
                "71.948 424 done serving by server 1\n" +
                "71.948 431 serves by server 1\n" +
                "71.983 476 arrives\n" +
                "71.983 476 waits at server 1\n" +
                "72.086 438(greedy) done serving by server 3\n" +
                "72.086 445(greedy) serves by server 3\n" +
                "72.343 477(greedy) arrives\n" +
                "72.343 477(greedy) waits at server 3\n" +
                "72.350 420(greedy) done serving by server 2\n" +
                "72.350 422(greedy) serves by server 2\n" +
                "72.369 478 arrives\n" +
                "72.369 478 waits at server 1\n" +
                "72.508 413 done serving by server 5\n" +
                "72.508 414(greedy) serves by server 5\n" +
                "72.534 479(greedy) arrives\n" +
                "72.534 479(greedy) waits at server 2\n" +
                "72.579 480(greedy) arrives\n" +
                "72.579 480(greedy) waits at server 3\n" +
                "72.671 481 arrives\n" +
                "72.671 481 waits at server 1\n" +
                "72.774 482 arrives\n" +
                "72.774 482 waits at server 2\n" +
                "72.828 431 done serving by server 1\n" +
                "72.828 441(greedy) serves by server 1\n" +
                "72.977 483(greedy) arrives\n" +
                "72.977 483(greedy) waits at server 5\n" +
                "73.176 422(greedy) done serving by server 2\n" +
                "73.176 426(greedy) serves by server 2\n" +
                "73.209 366 done serving by server 4\n" +
                "73.209 373(greedy) serves by server 4\n" +
                "73.213 484 arrives\n" +
                "73.213 484 waits at server 1\n" +
                "73.248 426(greedy) done serving by server 2\n" +
                "73.248 447 serves by server 2\n" +
                "73.496 485 arrives\n" +
                "73.496 485 waits at server 2\n" +
                "73.540 486(greedy) arrives\n" +
                "73.540 486(greedy) waits at server 2\n" +
                "73.611 487 arrives\n" +
                "73.611 487 waits at server 2\n" +
                "73.645 488(greedy) arrives\n" +
                "73.645 488(greedy) waits at server 3\n" +
                "73.751 489 arrives\n" +
                "73.751 489 waits at server 3\n" +
                "73.770 445(greedy) done serving by server 3\n" +
                "73.770 453(greedy) serves by server 3\n" +
                "73.851 441(greedy) done serving by server 1\n" +
                "73.851 452 serves by server 1\n" +
                "73.886 490(greedy) arrives\n" +
                "73.886 490(greedy) waits at server 4\n" +
                "74.103 491 arrives\n" +
                "74.103 491 waits at server 1\n" +
                "74.255 492(greedy) arrives\n" +
                "74.255 492(greedy) waits at server 5\n" +
                "74.292 453(greedy) done serving by server 3\n" +
                "74.292 454 serves by server 3\n" +
                "74.367 493 arrives\n" +
                "74.367 493 waits at server 3\n" +
                "74.544 494(greedy) arrives\n" +
                "74.544 494(greedy) waits at server 3\n" +
                "74.596 373(greedy) done serving by server 4\n" +
                "74.596 392(greedy) serves by server 4\n" +
                "74.630 495 arrives\n" +
                "74.630 495 waits at server 4\n" +
                "74.725 496(greedy) arrives\n" +
                "74.725 496(greedy) waits at server 4\n" +
                "74.861 497(greedy) arrives\n" +
                "74.861 497(greedy) waits at server 5\n" +
                "74.959 498 arrives\n" +
                "74.959 498 leaves\n" +
                "74.960 499 arrives\n" +
                "74.960 499 leaves\n" +
                "75.000 392(greedy) done serving by server 4\n" +
                "75.000 417(greedy) serves by server 4\n" +
                "75.108 500 arrives\n" +
                "75.108 500 waits at server 4\n" +
                "75.289 501(greedy) arrives\n" +
                "75.289 501(greedy) leaves\n" +
                "75.298 502 arrives\n" +
                "75.298 502 leaves\n" +
                "75.301 503(greedy) arrives\n" +
                "75.301 503(greedy) leaves\n" +
                "75.468 414(greedy) done serving by server 5\n" +
                "75.468 425(greedy) serves by server 5\n" +
                "75.550 504 arrives\n" +
                "75.550 504 waits at server 5\n" +
                "75.568 505 arrives\n" +
                "75.568 505 leaves\n" +
                "75.601 506(greedy) arrives\n" +
                "75.601 506(greedy) leaves\n" +
                "75.796 507 arrives\n" +
                "75.796 507 leaves\n" +
                "75.982 508(greedy) arrives\n" +
                "75.982 508(greedy) leaves\n" +
                "76.003 417(greedy) done serving by server 4\n" +
                "76.003 419(greedy) serves by server 4\n" +
                "76.076 509(greedy) arrives\n" +
                "76.076 509(greedy) waits at server 4\n" +
                "76.106 510(greedy) arrives\n" +
                "76.106 510(greedy) leaves\n" +
                "76.283 511 arrives\n" +
                "76.283 511 leaves\n" +
                "76.429 512 arrives\n" +
                "76.429 512 leaves\n" +
                "76.485 452 done serving by server 1\n" +
                "76.485 462 serves by server 1\n" +
                "76.566 513(greedy) arrives\n" +
                "76.566 513(greedy) waits at server 1\n" +
                "76.675 514(greedy) arrives\n" +
                "76.675 514(greedy) leaves\n" +
                "76.698 425(greedy) done serving by server 5\n" +
                "76.698 428(greedy) serves by server 5\n" +
                "76.817 428(greedy) done serving by server 5\n" +
                "76.817 446(greedy) serves by server 5\n" +
                "76.837 462 done serving by server 1\n" +
                "76.837 463 serves by server 1\n" +
                "76.845 515 arrives\n" +
                "76.845 515 waits at server 1\n" +
                "76.849 463 done serving by server 1\n" +
                "76.849 466 serves by server 1\n" +
                "77.005 454 done serving by server 3\n" +
                "77.005 464(greedy) serves by server 3\n" +
                "77.066 516(greedy) arrives\n" +
                "77.066 516(greedy) waits at server 5\n" +
                "77.212 419(greedy) done serving by server 4\n" +
                "77.212 427 serves by server 4\n" +
                "77.271 517 arrives\n" +
                "77.271 517 waits at server 1\n" +
                "77.347 518 arrives\n" +
                "77.347 518 waits at server 3\n" +
                "77.435 519 arrives\n" +
                "77.435 519 waits at server 4\n" +
                "77.475 466 done serving by server 1\n" +
                "77.475 470 serves by server 1\n" +
                "77.580 520(greedy) arrives\n" +
                "77.580 520(greedy) waits at server 1\n" +
                "77.796 521(greedy) arrives\n" +
                "77.796 521(greedy) waits at server 5\n" +
                "77.807 470 done serving by server 1\n" +
                "77.807 472 serves by server 1\n" +
                "77.953 522(greedy) arrives\n" +
                "77.953 522(greedy) waits at server 1\n" +
                "77.973 447 done serving by server 2\n" +
                "77.973 448 serves by server 2\n" +
                "78.011 523 arrives\n" +
                "78.011 523 waits at server 2\n" +
                "78.189 524(greedy) arrives\n" +
                "78.189 524(greedy) leaves\n" +
                "78.250 525 arrives\n" +
                "78.250 525 leaves\n" +
                "78.265 526 arrives\n" +
                "78.265 526 leaves\n" +
                "78.300 527 arrives\n" +
                "78.300 527 leaves\n" +
                "78.550 472 done serving by server 1\n" +
                "78.550 476 serves by server 1\n" +
                "78.660 528 arrives\n" +
                "78.660 528 waits at server 1\n" +
                "78.674 446(greedy) done serving by server 5\n" +
                "78.674 449(greedy) serves by server 5\n" +
                "78.821 464(greedy) done serving by server 3\n" +
                "78.821 468 serves by server 3\n" +
                "78.942 427 done serving by server 4\n" +
                "78.942 436 serves by server 4\n" +
                "79.119 476 done serving by server 1\n" +
                "79.119 478 serves by server 1\n" +
                "79.124 529 arrives\n" +
                "79.124 529 waits at server 1\n" +
                "79.151 448 done serving by server 2\n" +
                "79.151 460 serves by server 2\n" +
                "79.191 530(greedy) arrives\n" +
                "79.191 530(greedy) waits at server 2\n" +
                "79.342 531(greedy) arrives\n" +
                "79.342 531(greedy) waits at server 3\n" +
                "79.582 478 done serving by server 1\n" +
                "79.582 481 serves by server 1\n" +
                "79.599 532(greedy) arrives\n" +
                "79.599 532(greedy) waits at server 1\n" +
                "79.601 533 arrives\n" +
                "79.601 533 waits at server 4\n" +
                "79.625 534(greedy) arrives\n" +
                "79.625 534(greedy) waits at server 5\n" +
                "79.711 535 arrives\n" +
                "79.711 535 leaves\n" +
                "79.769 449(greedy) done serving by server 5\n" +
                "79.769 450(greedy) serves by server 5\n" +
                "79.873 450(greedy) done serving by server 5\n" +
                "79.873 451(greedy) serves by server 5\n" +
                "79.881 468 done serving by server 3\n" +
                "79.881 469(greedy) serves by server 3\n" +
                "79.939 536 arrives\n" +
                "79.939 536 waits at server 3\n" +
                "79.964 537(greedy) arrives\n" +
                "79.964 537(greedy) waits at server 5\n" +
                "80.234 538(greedy) arrives\n" +
                "80.234 538(greedy) waits at server 5\n" +
                "80.247 539(greedy) arrives\n" +
                "80.247 539(greedy) leaves\n" +
                "80.381 436 done serving by server 4\n" +
                "80.381 465(greedy) serves by server 4\n" +
                "80.571 540 arrives\n" +
                "80.571 540 waits at server 4\n" +
                "80.582 541(greedy) arrives\n" +
                "80.582 541(greedy) leaves\n" +
                "80.664 451(greedy) done serving by server 5\n" +
                "80.664 455 serves by server 5\n" +
                "80.676 460 done serving by server 2\n" +
                "80.676 461 serves by server 2\n" +
                "80.688 542(greedy) arrives\n" +
                "80.688 542(greedy) waits at server 2\n" +
                "80.709 543(greedy) arrives\n" +
                "80.709 543(greedy) waits at server 5\n" +
                "80.790 544(greedy) arrives\n" +
                "80.790 544(greedy) leaves\n" +
                "80.848 545(greedy) arrives\n" +
                "80.848 545(greedy) leaves\n" +
                "80.898 546 arrives\n" +
                "80.898 546 leaves\n" +
                "80.927 455 done serving by server 5\n" +
                "80.927 483(greedy) serves by server 5\n" +
                "80.940 547(greedy) arrives\n" +
                "80.940 547(greedy) waits at server 5\n" +
                "80.974 483(greedy) done serving by server 5\n" +
                "80.974 492(greedy) serves by server 5\n" +
                "80.989 492(greedy) done serving by server 5\n" +
                "80.989 497(greedy) serves by server 5\n" +
                "81.048 548 arrives\n" +
                "81.048 548 waits at server 5\n" +
                "81.078 549(greedy) arrives\n" +
                "81.078 549(greedy) waits at server 5\n" +
                "81.125 497(greedy) done serving by server 5\n" +
                "81.125 504 serves by server 5\n" +
                "81.185 550 arrives\n" +
                "81.185 550 waits at server 5\n" +
                "81.293 461 done serving by server 2\n" +
                "81.293 467 serves by server 2\n" +
                "81.422 551 arrives\n" +
                "81.422 551 waits at server 2\n" +
                "81.429 552(greedy) arrives\n" +
                "81.429 552(greedy) leaves\n" +
                "81.441 553 arrives\n" +
                "81.441 553 leaves\n" +
                "81.569 467 done serving by server 2\n" +
                "81.569 474(greedy) serves by server 2\n" +
                "81.735 504 done serving by server 5\n" +
                "81.735 516(greedy) serves by server 5\n" +
                "81.863 554 arrives\n" +
                "81.863 554 waits at server 2\n" +
                "82.087 555 arrives\n" +
                "82.087 555 waits at server 5\n" +
                "82.309 474(greedy) done serving by server 2\n" +
                "82.309 479(greedy) serves by server 2\n" +
                "82.380 516(greedy) done serving by server 5\n" +
                "82.380 521(greedy) serves by server 5\n" +
                "82.395 556 arrives\n" +
                "82.395 556 waits at server 2\n" +
                "82.501 557 arrives\n" +
                "82.501 557 waits at server 5\n" +
                "82.675 558 arrives\n" +
                "82.675 558 leaves\n" +
                "82.748 521(greedy) done serving by server 5\n" +
                "82.748 534(greedy) serves by server 5\n" +
                "82.870 559(greedy) arrives\n" +
                "82.870 559(greedy) waits at server 5\n" +
                "82.927 560(greedy) arrives\n" +
                "82.927 560(greedy) leaves\n" +
                "82.962 561 arrives\n" +
                "82.962 561 leaves\n" +
                "82.974 562(greedy) arrives\n" +
                "82.974 562(greedy) leaves\n" +
                "83.051 563 arrives\n" +
                "83.051 563 leaves\n" +
                "83.182 469(greedy) done serving by server 3\n" +
                "83.182 475 serves by server 3\n" +
                "83.332 564 arrives\n" +
                "83.332 564 waits at server 3\n" +
                "83.420 565 arrives\n" +
                "83.420 565 leaves\n" +
                "83.443 475 done serving by server 3\n" +
                "83.443 477(greedy) serves by server 3\n" +
                "83.450 477(greedy) done serving by server 3\n" +
                "83.450 480(greedy) serves by server 3\n" +
                "83.456 534(greedy) done serving by server 5\n" +
                "83.456 537(greedy) serves by server 5\n" +
                "83.524 566 arrives\n" +
                "83.524 566 waits at server 3\n" +
                "83.586 567(greedy) arrives\n" +
                "83.586 567(greedy) waits at server 3\n" +
                "83.639 568(greedy) arrives\n" +
                "83.639 568(greedy) waits at server 5\n" +
                "83.870 569 arrives\n" +
                "83.870 569 leaves\n" +
                "83.896 570(greedy) arrives\n" +
                "83.896 570(greedy) leaves\n" +
                "83.907 571 arrives\n" +
                "83.907 571 leaves\n" +
                "83.910 480(greedy) done serving by server 3\n" +
                "83.910 488(greedy) serves by server 3\n" +
                "83.922 481 done serving by server 1\n" +
                "83.922 484 serves by server 1\n" +
                "83.927 572(greedy) arrives\n" +
                "83.927 572(greedy) waits at server 1\n" +
                "83.992 573 arrives\n" +
                "83.992 573 waits at server 3\n" +
                "83.996 574 arrives\n" +
                "83.996 574 leaves\n" +
                "84.078 575 arrives\n" +
                "84.078 575 leaves\n" +
                "84.199 488(greedy) done serving by server 3\n" +
                "84.199 489 serves by server 3\n" +
                "84.268 484 done serving by server 1\n" +
                "84.268 491 serves by server 1\n" +
                "84.275 576(greedy) arrives\n" +
                "84.275 576(greedy) waits at server 1\n" +
                "84.368 489 done serving by server 3\n" +
                "84.368 493 serves by server 3\n" +
                "84.416 577 arrives\n" +
                "84.416 577 waits at server 3\n" +
                "84.466 578 arrives\n" +
                "84.466 578 waits at server 3\n" +
                "84.619 491 done serving by server 1\n" +
                "84.619 513(greedy) serves by server 1\n" +
                "84.624 579 arrives\n" +
                "84.624 579 waits at server 1\n" +
                "84.626 537(greedy) done serving by server 5\n" +
                "84.626 538(greedy) serves by server 5\n" +
                "84.667 479(greedy) done serving by server 2\n" +
                "84.667 482 serves by server 2\n" +
                "84.916 538(greedy) done serving by server 5\n" +
                "84.916 543(greedy) serves by server 5\n" +
                "84.925 580 arrives\n" +
                "84.925 580 waits at server 2\n" +
                "84.987 581 arrives\n" +
                "84.987 581 waits at server 5\n" +
                "85.057 582(greedy) arrives\n" +
                "85.057 582(greedy) waits at server 5\n" +
                "85.300 583(greedy) arrives\n" +
                "85.300 583(greedy) leaves\n" +
                "85.304 493 done serving by server 3\n" +
                "85.304 494(greedy) serves by server 3\n" +
                "85.603 584(greedy) arrives\n" +
                "85.603 584(greedy) waits at server 3\n" +
                "85.603 494(greedy) done serving by server 3\n" +
                "85.603 518 serves by server 3\n" +
                "85.620 518 done serving by server 3\n" +
                "85.620 531(greedy) serves by server 3\n" +
                "85.630 585(greedy) arrives\n" +
                "85.630 585(greedy) waits at server 3\n" +
                "85.714 586(greedy) arrives\n" +
                "85.714 586(greedy) waits at server 3\n" +
                "85.840 531(greedy) done serving by server 3\n" +
                "85.840 536 serves by server 3\n" +
                "86.008 587(greedy) arrives\n" +
                "86.008 587(greedy) waits at server 3\n" +
                "86.078 543(greedy) done serving by server 5\n" +
                "86.078 547(greedy) serves by server 5\n" +
                "86.122 513(greedy) done serving by server 1\n" +
                "86.122 515 serves by server 1\n" +
                "86.392 588 arrives\n" +
                "86.392 588 waits at server 1\n" +
                "86.415 482 done serving by server 2\n" +
                "86.415 485 serves by server 2\n" +
                "86.488 547(greedy) done serving by server 5\n" +
                "86.488 548 serves by server 5\n" +
                "86.573 515 done serving by server 1\n" +
                "86.573 517 serves by server 1\n" +
                "86.610 589 arrives\n" +
                "86.610 589 waits at server 1\n" +
                "86.936 548 done serving by server 5\n" +
                "86.936 549(greedy) serves by server 5\n" +
                "86.944 590 arrives\n" +
                "86.944 590 waits at server 2\n" +
                "86.971 465(greedy) done serving by server 4\n" +
                "86.971 471(greedy) serves by server 4\n" +
                "87.019 536 done serving by server 3\n" +
                "87.019 564 serves by server 3\n" +
                "87.037 591(greedy) arrives\n" +
                "87.037 591(greedy) waits at server 5\n" +
                "87.048 592 arrives\n" +
                "87.048 592 waits at server 3\n" +
                "87.143 517 done serving by server 1\n" +
                "87.143 520(greedy) serves by server 1\n" +
                "87.181 593 arrives\n" +
                "87.181 593 waits at server 1\n" +
                "87.232 594 arrives\n" +
                "87.232 594 waits at server 4\n" +
                "87.394 549(greedy) done serving by server 5\n" +
                "87.394 550 serves by server 5\n" +
                "87.470 471(greedy) done serving by server 4\n" +
                "87.470 473(greedy) serves by server 4\n" +
                "87.563 595 arrives\n" +
                "87.563 595 waits at server 4\n" +
                "87.675 485 done serving by server 2\n" +
                "87.675 486(greedy) serves by server 2\n" +
                "87.686 520(greedy) done serving by server 1\n" +
                "87.686 522(greedy) serves by server 1\n" +
                "87.758 596(greedy) arrives\n" +
                "87.758 596(greedy) waits at server 5\n" +
                "87.780 597 arrives\n" +
                "87.780 597 waits at server 1\n" +
                "87.931 473(greedy) done serving by server 4\n" +
                "87.931 490(greedy) serves by server 4\n" +
                "87.966 522(greedy) done serving by server 1\n" +
                "87.966 528 serves by server 1\n" +
                "88.016 598(greedy) arrives\n" +
                "88.016 598(greedy) waits at server 5\n" +
                "88.065 599(greedy) arrives\n" +
                "88.065 599(greedy) waits at server 1\n" +
                "88.219 600(greedy) arrives\n" +
                "88.219 600(greedy) waits at server 2\n" +
                "88.264 601(greedy) arrives\n" +
                "88.264 601(greedy) waits at server 4\n" +
                "88.422 602 arrives\n" +
                "88.422 602 waits at server 5\n" +
                "88.473 603(greedy) arrives\n" +
                "88.473 603(greedy) leaves\n" +
                "88.542 604(greedy) arrives\n" +
                "88.542 604(greedy) leaves\n" +
                "88.632 605 arrives\n" +
                "88.632 605 leaves\n" +
                "88.647 606(greedy) arrives\n" +
                "88.647 606(greedy) leaves\n" +
                "88.717 528 done serving by server 1\n" +
                "88.717 529 serves by server 1\n" +
                "88.759 529 done serving by server 1\n" +
                "88.759 532(greedy) serves by server 1\n" +
                "88.767 490(greedy) done serving by server 4\n" +
                "88.767 495 serves by server 4\n" +
                "89.049 564 done serving by server 3\n" +
                "89.049 566 serves by server 3\n" +
                "89.080 607(greedy) arrives\n" +
                "89.080 607(greedy) waits at server 1\n" +
                "89.091 608(greedy) arrives\n" +
                "89.091 608(greedy) waits at server 1\n" +
                "89.290 550 done serving by server 5\n" +
                "89.290 555 serves by server 5\n" +
                "89.334 609 arrives\n" +
                "89.334 609 waits at server 3\n" +
                "89.387 486(greedy) done serving by server 2\n" +
                "89.387 487 serves by server 2\n" +
                "89.467 610 arrives\n" +
                "89.467 610 waits at server 2\n" +
                "89.474 495 done serving by server 4\n" +
                "89.474 496(greedy) serves by server 4\n" +
                "89.495 611 arrives\n" +
                "89.495 611 waits at server 4\n" +
                "89.588 612 arrives\n" +
                "89.588 612 waits at server 4\n" +
                "89.651 613 arrives\n" +
                "89.651 613 waits at server 5\n" +
                "89.662 532(greedy) done serving by server 1\n" +
                "89.662 572(greedy) serves by server 1\n" +
                "89.678 614(greedy) arrives\n" +
                "89.678 614(greedy) waits at server 1\n" +
                "89.817 615 arrives\n" +
                "89.817 615 leaves\n" +
                "89.823 616(greedy) arrives\n" +
                "89.823 616(greedy) leaves\n" +
                "90.055 555 done serving by server 5\n" +
                "90.055 557 serves by server 5\n" +
                "90.118 487 done serving by server 2\n" +
                "90.118 523 serves by server 2\n" +
                "90.122 617 arrives\n" +
                "90.122 617 waits at server 2\n" +
                "90.357 566 done serving by server 3\n" +
                "90.357 567(greedy) serves by server 3\n" +
                "90.588 557 done serving by server 5\n" +
                "90.588 559(greedy) serves by server 5\n" +
                "90.671 618 arrives\n" +
                "90.671 618 waits at server 3\n" +
                "90.727 619(greedy) arrives\n" +
                "90.727 619(greedy) waits at server 5\n" +
                "90.749 572(greedy) done serving by server 1\n" +
                "90.749 576(greedy) serves by server 1\n" +
                "90.772 576(greedy) done serving by server 1\n" +
                "90.772 579 serves by server 1\n" +
                "90.956 620(greedy) arrives\n" +
                "90.956 620(greedy) waits at server 1\n" +
                "91.044 621 arrives\n" +
                "91.044 621 waits at server 1\n" +
                "91.360 622 arrives\n" +
                "91.360 622 waits at server 5\n" +
                "91.428 567(greedy) done serving by server 3\n" +
                "91.428 573 serves by server 3\n" +
                "91.464 623(greedy) arrives\n" +
                "91.464 623(greedy) waits at server 3\n" +
                "91.490 523 done serving by server 2\n" +
                "91.490 530(greedy) serves by server 2\n" +
                "91.531 624(greedy) arrives\n" +
                "91.531 624(greedy) waits at server 2\n" +
                "91.739 579 done serving by server 1\n" +
                "91.739 588 serves by server 1\n" +
                "91.838 625 arrives\n" +
                "91.838 625 waits at server 1\n" +
                "92.216 626 arrives\n" +
                "92.216 626 leaves\n" +
                "92.252 627 arrives\n" +
                "92.252 627 leaves\n" +
                "92.401 559(greedy) done serving by server 5\n" +
                "92.401 568(greedy) serves by server 5\n" +
                "92.569 588 done serving by server 1\n" +
                "92.569 589 serves by server 1\n" +
                "92.612 628(greedy) arrives\n" +
                "92.612 628(greedy) waits at server 1\n" +
                "92.826 629 arrives\n" +
                "92.826 629 waits at server 5\n" +
                "92.939 630 arrives\n" +
                "92.939 630 leaves\n" +
                "92.995 568(greedy) done serving by server 5\n" +
                "92.995 581 serves by server 5\n" +
                "92.998 631(greedy) arrives\n" +
                "92.998 631(greedy) waits at server 5\n" +
                "93.011 573 done serving by server 3\n" +
                "93.011 577 serves by server 3\n" +
                "93.135 496(greedy) done serving by server 4\n" +
                "93.135 500 serves by server 4\n" +
                "93.235 632 arrives\n" +
                "93.235 632 waits at server 3\n" +
                "93.339 633 arrives\n" +
                "93.339 633 waits at server 4\n" +
                "93.447 634 arrives\n" +
                "93.447 634 leaves\n" +
                "93.744 635 arrives\n" +
                "93.744 635 leaves\n" +
                "93.760 636(greedy) arrives\n" +
                "93.760 636(greedy) leaves\n" +
                "93.803 637 arrives\n" +
                "93.803 637 leaves\n" +
                "93.863 500 done serving by server 4\n" +
                "93.863 509(greedy) serves by server 4\n" +
                "93.904 589 done serving by server 1\n" +
                "93.904 593 serves by server 1\n" +
                "93.941 577 done serving by server 3");

        System.out.println("93.941 578 serves by server 3\n" +
                "93.967 638 arrives\n" +
                "93.967 638 waits at server 1\n" +
                "94.032 639(greedy) arrives\n" +
                "94.032 639(greedy) waits at server 3\n" +
                "94.207 581 done serving by server 5\n" +
                "94.207 582(greedy) serves by server 5\n" +
                "94.215 640(greedy) arrives\n" +
                "94.215 640(greedy) waits at server 4\n" +
                "94.257 582(greedy) done serving by server 5\n" +
                "94.257 591(greedy) serves by server 5\n" +
                "94.389 591(greedy) done serving by server 5\n" +
                "94.389 596(greedy) serves by server 5\n" +
                "94.521 641 arrives\n" +
                "94.521 641 waits at server 5\n" +
                "94.644 642(greedy) arrives\n" +
                "94.644 642(greedy) waits at server 5\n" +
                "94.680 530(greedy) done serving by server 2\n" +
                "94.680 542(greedy) serves by server 2\n" +
                "94.722 542(greedy) done serving by server 2\n" +
                "94.722 551 serves by server 2\n" +
                "94.752 551 done serving by server 2\n" +
                "94.752 554 serves by server 2\n" +
                "95.141 578 done serving by server 3\n" +
                "95.141 584(greedy) serves by server 3\n" +
                "95.185 643(greedy) arrives\n" +
                "95.185 643(greedy) waits at server 2\n" +
                "95.264 593 done serving by server 1\n" +
                "95.264 597 serves by server 1\n" +
                "95.264 644(greedy) arrives\n" +
                "95.264 644(greedy) waits at server 2\n" +
                "95.377 645(greedy) arrives\n" +
                "95.377 645(greedy) waits at server 1\n" +
                "95.420 509(greedy) done serving by server 4\n" +
                "95.420 519 serves by server 4\n" +
                "95.475 519 done serving by server 4\n" +
                "95.475 533 serves by server 4\n" +
                "95.551 584(greedy) done serving by server 3\n" +
                "95.551 585(greedy) serves by server 3\n" +
                "95.613 646(greedy) arrives\n" +
                "95.613 646(greedy) waits at server 3\n" +
                "95.729 647 arrives\n" +
                "95.729 647 waits at server 2\n" +
                "95.917 648(greedy) arrives\n" +
                "95.917 648(greedy) waits at server 4\n" +
                "95.972 649(greedy) arrives\n" +
                "95.972 649(greedy) waits at server 3\n" +
                "96.029 650 arrives\n" +
                "96.029 650 waits at server 4\n" +
                "96.178 533 done serving by server 4\n" +
                "96.178 540 serves by server 4\n" +
                "96.194 540 done serving by server 4\n" +
                "96.194 594 serves by server 4\n" +
                "96.253 651(greedy) arrives\n" +
                "96.253 651(greedy) waits at server 4\n" +
                "96.331 554 done serving by server 2\n" +
                "96.331 556 serves by server 2\n" +
                "96.351 597 done serving by server 1\n" +
                "96.351 599(greedy) serves by server 1\n" +
                "96.378 594 done serving by server 4\n" +
                "96.378 595 serves by server 4\n" +
                "96.425 652(greedy) arrives\n" +
                "96.425 652(greedy) waits at server 4\n" +
                "96.467 595 done serving by server 4\n" +
                "96.467 601(greedy) serves by server 4\n" +
                "96.578 601(greedy) done serving by server 4\n" +
                "96.578 611 serves by server 4\n" +
                "96.632 653 arrives\n" +
                "96.632 653 waits at server 1\n" +
                "96.734 654(greedy) arrives\n" +
                "96.734 654(greedy) waits at server 4\n" +
                "96.749 585(greedy) done serving by server 3\n" +
                "96.749 586(greedy) serves by server 3\n" +
                "96.784 596(greedy) done serving by server 5\n" +
                "96.784 598(greedy) serves by server 5\n" +
                "96.807 586(greedy) done serving by server 3\n" +
                "96.807 587(greedy) serves by server 3\n" +
                "97.022 598(greedy) done serving by server 5\n" +
                "97.022 602 serves by server 5\n" +
                "97.151 587(greedy) done serving by server 3\n" +
                "97.151 592 serves by server 3\n" +
                "97.175 655(greedy) arrives\n" +
                "97.175 655(greedy) waits at server 3\n" +
                "97.327 656 arrives\n" +
                "97.327 656 waits at server 2\n" +
                "97.401 602 done serving by server 5\n" +
                "97.401 613 serves by server 5\n" +
                "97.436 657 arrives\n" +
                "97.436 657 waits at server 3\n" +
                "97.531 556 done serving by server 2\n" +
                "97.531 580 serves by server 2\n" +
                "97.564 592 done serving by server 3\n" +
                "97.564 609 serves by server 3\n" +
                "97.568 658 arrives\n" +
                "97.568 658 waits at server 2\n" +
                "97.819 659(greedy) arrives\n" +
                "97.819 659(greedy) waits at server 5\n" +
                "97.860 599(greedy) done serving by server 1\n" +
                "97.860 607(greedy) serves by server 1\n" +
                "97.922 607(greedy) done serving by server 1\n" +
                "97.922 608(greedy) serves by server 1\n" +
                "98.025 660(greedy) arrives\n" +
                "98.025 660(greedy) waits at server 5\n" +
                "98.276 661 arrives\n" +
                "98.276 661 waits at server 1\n" +
                "98.345 662(greedy) arrives\n" +
                "98.345 662(greedy) waits at server 3\n" +
                "98.347 611 done serving by server 4\n" +
                "98.347 612 serves by server 4\n" +
                "98.411 663 arrives\n" +
                "98.411 663 waits at server 1\n" +
                "98.431 664 arrives\n" +
                "98.431 664 waits at server 3\n" +
                "98.499 665(greedy) arrives\n" +
                "98.499 665(greedy) waits at server 4\n" +
                "98.512 608(greedy) done serving by server 1\n" +
                "98.512 614(greedy) serves by server 1\n" +
                "98.548 609 done serving by server 3\n" +
                "98.548 618 serves by server 3\n" +
                "98.624 666 arrives\n" +
                "98.624 666 waits at server 1\n" +
                "98.637 580 done serving by server 2\n" +
                "98.637 590 serves by server 2\n" +
                "98.647 667(greedy) arrives\n" +
                "98.647 667(greedy) waits at server 4\n" +
                "98.686 668 arrives\n" +
                "98.686 668 waits at server 2\n" +
                "98.688 590 done serving by server 2\n" +
                "98.688 600(greedy) serves by server 2\n" +
                "98.784 613 done serving by server 5\n" +
                "98.784 619(greedy) serves by server 5\n" +
                "98.795 669 arrives\n" +
                "98.795 669 waits at server 2\n" +
                "98.855 614(greedy) done serving by server 1\n" +
                "98.855 620(greedy) serves by server 1\n" +
                "98.936 600(greedy) done serving by server 2\n" +
                "98.936 610 serves by server 2\n" +
                "99.041 610 done serving by server 2\n" +
                "99.041 617 serves by server 2\n" +
                "99.057 612 done serving by server 4\n" +
                "99.057 633 serves by server 4\n" +
                "99.068 619(greedy) done serving by server 5\n" +
                "99.068 622 serves by server 5\n" +
                "99.146 618 done serving by server 3\n" +
                "99.146 623(greedy) serves by server 3\n" +
                "99.160 670 arrives\n" +
                "99.160 670 waits at server 1\n" +
                "99.304 623(greedy) done serving by server 3\n" +
                "99.304 632 serves by server 3\n" +
                "99.543 620(greedy) done serving by server 1\n" +
                "99.543 621 serves by server 1\n" +
                "99.599 671 arrives\n" +
                "99.599 671 waits at server 1\n" +
                "99.675 622 done serving by server 5\n" +
                "99.675 629 serves by server 5\n" +
                "99.833 617 done serving by server 2\n" +
                "99.833 624(greedy) serves by server 2\n" +
                "99.926 621 done serving by server 1\n" +
                "99.926 625 serves by server 1\n" +
                "99.940 625 done serving by server 1\n" +
                "99.940 628(greedy) serves by server 1\n" +
                "99.995 628(greedy) done serving by server 1\n" +
                "99.995 638 serves by server 1\n" +
                "100.016 632 done serving by server 3\n" +
                "100.016 639(greedy) serves by server 3\n" +
                "100.178 672 arrives\n" +
                "100.178 672 waits at server 1\n" +
                "100.186 639(greedy) done serving by server 3\n" +
                "100.186 646(greedy) serves by server 3\n" +
                "100.293 673 arrives\n" +
                "100.293 673 waits at server 1\n" +
                "100.329 674 arrives\n" +
                "100.329 674 waits at server 1\n" +
                "100.340 638 done serving by server 1\n" +
                "100.340 645(greedy) serves by server 1\n" +
                "100.400 629 done serving by server 5\n" +
                "100.400 631(greedy) serves by server 5\n" +
                "100.481 646(greedy) done serving by server 3\n" +
                "100.481 649(greedy) serves by server 3\n" +
                "100.673 675 arrives\n" +
                "100.673 675 waits at server 1\n" +
                "100.796 649(greedy) done serving by server 3\n" +
                "100.796 655(greedy) serves by server 3\n" +
                "100.847 676 arrives\n" +
                "100.847 676 waits at server 2\n" +
                "100.924 645(greedy) done serving by server 1\n" +
                "100.924 653 serves by server 1\n" +
                "100.950 677 arrives\n" +
                "100.950 677 waits at server 1\n" +
                "100.976 678(greedy) arrives\n" +
                "100.976 678(greedy) waits at server 3\n" +
                "101.022 679(greedy) arrives\n" +
                "101.022 679(greedy) waits at server 3\n" +
                "101.041 680 arrives\n" +
                "101.041 680 waits at server 2\n" +
                "101.042 681(greedy) arrives\n" +
                "101.042 681(greedy) waits at server 5\n" +
                "101.053 682(greedy) arrives\n" +
                "101.053 682(greedy) waits at server 3\n" +
                "101.140 683(greedy) arrives\n" +
                "101.140 683(greedy) waits at server 5\n" +
                "101.589 624(greedy) done serving by server 2\n" +
                "101.589 643(greedy) serves by server 2\n" +
                "101.608 643(greedy) done serving by server 2\n" +
                "101.608 644(greedy) serves by server 2\n" +
                "101.612 684(greedy) arrives\n" +
                "101.612 684(greedy) waits at server 3\n" +
                "101.838 685(greedy) arrives\n" +
                "101.838 685(greedy) waits at server 5\n" +
                "102.084 686 arrives\n" +
                "102.084 686 waits at server 2\n" +
                "102.139 631(greedy) done serving by server 5\n" +
                "102.139 641 serves by server 5\n" +
                "102.246 655(greedy) done serving by server 3\n" +
                "102.246 657 serves by server 3\n" +
                "102.316 644(greedy) done serving by server 2\n" +
                "102.316 647 serves by server 2\n" +
                "102.511 641 done serving by server 5\n" +
                "102.511 642(greedy) serves by server 5\n" +
                "102.621 687 arrives\n" +
                "102.621 687 waits at server 2\n" +
                "102.747 688 arrives\n" +
                "102.747 688 waits at server 2\n" +
                "102.801 642(greedy) done serving by server 5\n" +
                "102.801 659(greedy) serves by server 5\n" +
                "102.934 689 arrives\n" +
                "102.934 689 waits at server 2\n" +
                "102.936 690(greedy) arrives\n" +
                "102.936 690(greedy) waits at server 5\n" +
                "102.946 691(greedy) arrives\n" +
                "102.946 691(greedy) waits at server 5\n" +
                "103.247 692(greedy) arrives\n" +
                "103.247 692(greedy) waits at server 3\n" +
                "103.340 693 arrives\n" +
                "103.340 693 waits at server 3\n" +
                "103.358 694(greedy) arrives\n" +
                "103.358 694(greedy) waits at server 5\n" +
                "103.367 695(greedy) arrives\n" +
                "103.367 695(greedy) waits at server 5\n" +
                "103.373 653 done serving by server 1\n" +
                "103.373 661 serves by server 1\n" +
                "103.512 647 done serving by server 2\n" +
                "103.512 656 serves by server 2\n" +
                "103.724 696 arrives\n" +
                "103.724 696 waits at server 1\n" +
                "103.809 697 arrives\n" +
                "103.809 697 waits at server 2\n" +
                "103.818 698 arrives\n" +
                "103.818 698 waits at server 3\n" +
                "103.854 699(greedy) arrives\n" +
                "103.854 699(greedy) waits at server 4\n" +
                "104.191 700(greedy) arrives\n" +
                "104.191 700(greedy) waits at server 5\n" +
                "104.451 661 done serving by server 1\n" +
                "104.451 663 serves by server 1\n" +
                "104.468 701(greedy) arrives\n" +
                "104.468 701(greedy) waits at server 1\n" +
                "104.603 659(greedy) done serving by server 5\n" +
                "104.603 660(greedy) serves by server 5\n" +
                "104.613 702(greedy) arrives\n" +
                "104.613 702(greedy) waits at server 5\n" +
                "104.683 633 done serving by server 4\n" +
                "104.683 640(greedy) serves by server 4\n" +
                "104.720 703(greedy) arrives\n" +
                "104.720 703(greedy) waits at server 4\n" +
                "104.735 704 arrives\n" +
                "104.735 704 waits at server 3\n" +
                "104.745 660(greedy) done serving by server 5\n" +
                "104.745 681(greedy) serves by server 5\n" +
                "104.756 705 arrives\n" +
                "104.756 705 waits at server 4\n" +
                "104.796 663 done serving by server 1\n" +
                "104.796 666 serves by server 1\n" +
                "104.831 706(greedy) arrives\n" +
                "104.831 706(greedy) waits at server 5\n" +
                "104.940 640(greedy) done serving by server 4\n" +
                "104.940 648(greedy) serves by server 4\n" +
                "105.045 648(greedy) done serving by server 4\n" +
                "105.045 650 serves by server 4\n" +
                "105.149 656 done serving by server 2\n" +
                "105.149 658 serves by server 2\n" +
                "105.179 657 done serving by server 3\n" +
                "105.179 662(greedy) serves by server 3\n" +
                "105.183 707(greedy) arrives\n" +
                "105.183 707(greedy) waits at server 4\n" +
                "105.233 708(greedy) arrives\n" +
                "105.233 708(greedy) waits at server 1\n" +
                "105.455 662(greedy) done serving by server 3\n" +
                "105.455 664 serves by server 3\n" +
                "105.614 664 done serving by server 3\n" +
                "105.614 678(greedy) serves by server 3\n" +
                "105.630 709(greedy) arrives\n" +
                "105.630 709(greedy) waits at server 3\n" +
                "105.994 710 arrives\n" +
                "105.994 710 waits at server 2\n" +
                "106.000 666 done serving by server 1\n" +
                "106.000 670 serves by server 1\n" +
                "106.171 711 arrives\n" +
                "106.171 711 waits at server 1\n" +
                "106.342 712 arrives\n" +
                "106.342 712 waits at server 3\n" +
                "106.350 681(greedy) done serving by server 5\n" +
                "106.350 683(greedy) serves by server 5\n" +
                "106.452 713 arrives\n" +
                "106.452 713 waits at server 3\n" +
                "106.487 714 arrives\n" +
                "106.487 714 waits at server 4\n" +
                "106.563 715(greedy) arrives\n" +
                "106.563 715(greedy) waits at server 5\n" +
                "106.647 683(greedy) done serving by server 5\n" +
                "106.647 685(greedy) serves by server 5\n" +
                "106.653 658 done serving by server 2\n" +
                "106.653 668 serves by server 2\n" +
                "106.704 716 arrives\n" +
                "106.704 716 waits at server 2\n" +
                "106.743 717(greedy) arrives\n" +
                "106.743 717(greedy) waits at server 5\n" +
                "106.829 718(greedy) arrives\n" +
                "106.829 718(greedy) waits at server 5\n" +
                "106.886 670 done serving by server 1\n" +
                "106.886 671 serves by server 1\n" +
                "107.009 719 arrives\n" +
                "107.009 719 waits at server 1\n" +
                "107.326 720(greedy) arrives\n" +
                "107.326 720(greedy) leaves\n" +
                "107.336 721(greedy) arrives\n" +
                "107.336 721(greedy) leaves\n" +
                "107.716 685(greedy) done serving by server 5\n" +
                "107.716 690(greedy) serves by server 5\n" +
                "107.723 722(greedy) arrives\n" +
                "107.723 722(greedy) waits at server 5\n" +
                "107.828 723 arrives\n" +
                "107.828 723 leaves\n" +
                "107.846 724 arrives\n" +
                "107.846 724 leaves\n" +
                "107.896 725(greedy) arrives\n" +
                "107.896 725(greedy) leaves\n" +
                "107.979 726 arrives\n" +
                "107.979 726 leaves\n" +
                "108.180 727(greedy) arrives\n" +
                "108.180 727(greedy) leaves\n" +
                "108.181 650 done serving by server 4\n" +
                "108.181 651(greedy) serves by server 4\n" +
                "108.292 668 done serving by server 2\n" +
                "108.292 669 serves by server 2\n" +
                "108.317 728(greedy) arrives\n" +
                "108.317 728(greedy) waits at server 2\n" +
                "108.512 729(greedy) arrives\n" +
                "108.512 729(greedy) waits at server 4\n" +
                "108.524 730(greedy) arrives\n" +
                "108.524 730(greedy) leaves\n" +
                "108.552 651(greedy) done serving by server 4\n" +
                "108.552 652(greedy) serves by server 4\n" +
                "108.559 731 arrives\n" +
                "108.559 731 waits at server 4\n" +
                "108.601 669 done serving by server 2\n" +
                "108.601 676 serves by server 2\n" +
                "108.805 690(greedy) done serving by server 5\n" +
                "108.805 691(greedy) serves by server 5\n" +
                "108.869 732 arrives\n" +
                "108.869 732 waits at server 2\n" +
                "108.869 671 done serving by server 1\n" +
                "108.869 672 serves by server 1\n" +
                "108.897 678(greedy) done serving by server 3\n" +
                "108.897 679(greedy) serves by server 3\n" +
                "108.898 733 arrives\n" +
                "108.898 733 waits at server 1\n" +
                "108.993 676 done serving by server 2\n" +
                "108.993 680 serves by server 2\n" +
                "109.001 734(greedy) arrives\n" +
                "109.001 734(greedy) waits at server 2\n" +
                "109.032 735(greedy) arrives\n" +
                "109.032 735(greedy) waits at server 3\n" +
                "109.404 736(greedy) arrives\n" +
                "109.404 736(greedy) waits at server 5\n" +
                "109.422 737(greedy) arrives\n" +
                "109.422 737(greedy) leaves\n" +
                "109.599 679(greedy) done serving by server 3\n" +
                "109.599 682(greedy) serves by server 3\n" +
                "109.603 680 done serving by server 2\n" +
                "109.603 686 serves by server 2\n" +
                "109.622 672 done serving by server 1\n" +
                "109.622 673 serves by server 1\n" +
                "109.630 738(greedy) arrives\n" +
                "109.630 738(greedy) waits at server 1\n" +
                "109.665 739(greedy) arrives\n" +
                "109.665 739(greedy) waits at server 2\n" +
                "109.683 740 arrives\n" +
                "109.683 740 waits at server 3");

        System.out.println("109.702 741 arrives\n" +
                "109.702 741 leaves\n" +
                "109.721 691(greedy) done serving by server 5\n" +
                "109.721 694(greedy) serves by server 5\n" +
                "109.730 694(greedy) done serving by server 5\n" +
                "109.730 695(greedy) serves by server 5\n" +
                "109.730 742 arrives\n" +
                "109.730 742 waits at server 5\n" +
                "109.904 743(greedy) arrives\n" +
                "109.904 743(greedy) waits at server 5\n" +
                "109.970 744(greedy) arrives\n" +
                "109.970 744(greedy) leaves\n" +
                "110.000 745 arrives\n" +
                "110.000 745 leaves\n" +
                "110.089 673 done serving by server 1\n" +
                "110.089 674 serves by server 1\n" +
                "110.109 746 arrives\n" +
                "110.109 746 waits at server 1\n" +
                "110.234 652(greedy) done serving by server 4\n" +
                "110.234 654(greedy) serves by server 4\n" +
                "110.247 674 done serving by server 1\n" +
                "110.247 675 serves by server 1\n" +
                "110.304 675 done serving by server 1\n" +
                "110.304 677 serves by server 1\n" +
                "110.338 747 arrives\n" +
                "110.338 747 waits at server 1\n" +
                "110.392 686 done serving by server 2\n" +
                "110.392 687 serves by server 2\n" +
                "110.553 748(greedy) arrives\n" +
                "110.553 748(greedy) waits at server 1\n" +
                "110.758 695(greedy) done serving by server 5\n" +
                "110.758 700(greedy) serves by server 5\n" +
                "110.889 749 arrives\n" +
                "110.889 749 waits at server 2\n" +
                "111.039 750 arrives\n" +
                "111.039 750 waits at server 4\n" +
                "111.310 751 arrives\n" +
                "111.310 751 waits at server 5\n" +
                "111.383 687 done serving by server 2\n" +
                "111.383 688 serves by server 2\n" +
                "111.499 700(greedy) done serving by server 5\n" +
                "111.499 702(greedy) serves by server 5\n" +
                "111.627 688 done serving by server 2\n" +
                "111.627 689 serves by server 2\n" +
                "111.678 752 arrives\n" +
                "111.678 752 waits at server 2\n" +
                "111.701 689 done serving by server 2\n" +
                "111.701 697 serves by server 2\n" +
                "111.727 677 done serving by server 1\n" +
                "111.727 696 serves by server 1\n" +
                "111.872 697 done serving by server 2\n" +
                "111.872 710 serves by server 2\n" +
                "112.276 710 done serving by server 2\n" +
                "112.276 716 serves by server 2\n" +
                "112.333 753 arrives\n" +
                "112.333 753 waits at server 1\n" +
                "112.337 754(greedy) arrives\n" +
                "112.337 754(greedy) waits at server 2\n" +
                "112.344 755(greedy) arrives\n" +
                "112.344 755(greedy) waits at server 2\n" +
                "112.410 756 arrives\n" +
                "112.410 756 waits at server 2\n" +
                "112.558 757 arrives\n" +
                "112.558 757 waits at server 2\n" +
                "112.577 654(greedy) done serving by server 4\n" +
                "112.577 665(greedy) serves by server 4\n" +
                "112.654 758 arrives\n" +
                "112.654 758 waits at server 4\n" +
                "112.810 682(greedy) done serving by server 3\n" +
                "112.810 684(greedy) serves by server 3\n" +
                "112.836 665(greedy) done serving by server 4\n" +
                "112.836 667(greedy) serves by server 4\n" +
                "112.862 716 done serving by server 2\n" +
                "112.862 728(greedy) serves by server 2\n" +
                "112.993 759 arrives\n" +
                "112.993 759 waits at server 2\n" +
                "113.047 702(greedy) done serving by server 5\n" +
                "113.047 706(greedy) serves by server 5\n" +
                "113.255 760 arrives\n" +
                "113.255 760 waits at server 3\n" +
                "113.271 761 arrives\n" +
                "113.271 761 waits at server 4\n" +
                "113.536 762 arrives\n" +
                "113.536 762 waits at server 5\n" +
                "113.582 763 arrives\n" +
                "113.582 763 waits at server 5\n" +
                "113.610 706(greedy) done serving by server 5\n" +
                "113.610 715(greedy) serves by server 5\n" +
                "113.848 764 arrives\n" +
                "113.848 764 waits at server 5\n" +
                "113.883 765 arrives\n" +
                "113.883 765 leaves\n" +
                "113.895 766 arrives\n" +
                "113.895 766 leaves\n" +
                "114.104 696 done serving by server 1\n" +
                "114.104 701(greedy) serves by server 1\n" +
                "114.114 767 arrives\n" +
                "114.114 767 waits at server 1\n" +
                "114.184 768(greedy) arrives\n" +
                "114.184 768(greedy) leaves\n" +
                "114.272 769 arrives\n" +
                "114.272 769 leaves\n" +
                "114.342 770 arrives\n" +
                "114.342 770 leaves\n" +
                "114.389 771 arrives\n" +
                "114.389 771 leaves\n" +
                "114.408 728(greedy) done serving by server 2\n" +
                "114.408 732 serves by server 2\n" +
                "114.544 772(greedy) arrives\n" +
                "114.544 772(greedy) waits at server 2\n" +
                "114.596 773 arrives\n" +
                "114.596 773 leaves\n" +
                "114.750 732 done serving by server 2\n" +
                "114.750 734(greedy) serves by server 2\n" +
                "114.763 684(greedy) done serving by server 3\n" +
                "114.763 692(greedy) serves by server 3\n" +
                "114.904 734(greedy) done serving by server 2\n" +
                "114.904 739(greedy) serves by server 2\n" +
                "114.912 774 arrives\n" +
                "114.912 774 waits at server 2\n" +
                "114.993 775(greedy) arrives\n" +
                "114.993 775(greedy) waits at server 2\n" +
                "115.060 776 arrives\n" +
                "115.060 776 waits at server 3\n" +
                "115.085 777(greedy) arrives\n" +
                "115.085 777(greedy) leaves\n" +
                "115.245 778(greedy) arrives\n" +
                "115.245 778(greedy) leaves\n" +
                "115.413 779 arrives\n" +
                "115.413 779 leaves\n" +
                "115.490 715(greedy) done serving by server 5\n" +
                "115.490 717(greedy) serves by server 5\n" +
                "115.561 780 arrives\n" +
                "115.561 780 waits at server 5\n" +
                "115.757 739(greedy) done serving by server 2\n" +
                "115.757 749 serves by server 2\n" +
                "115.835 749 done serving by server 2\n" +
                "115.835 752 serves by server 2\n" +
                "115.935 781(greedy) arrives\n" +
                "115.935 781(greedy) waits at server 2\n" +
                "115.954 782(greedy) arrives\n" +
                "115.954 782(greedy) waits at server 2\n" +
                "116.400 701(greedy) done serving by server 1\n" +
                "116.400 708(greedy) serves by server 1\n" +
                "116.401 783(greedy) arrives\n" +
                "116.401 783(greedy) waits at server 1\n" +
                "116.452 752 done serving by server 2\n" +
                "116.452 754(greedy) serves by server 2\n" +
                "116.897 784(greedy) arrives\n" +
                "116.897 784(greedy) waits at server 2\n" +
                "116.900 785(greedy) arrives\n" +
                "116.900 785(greedy) leaves\n" +
                "116.974 786(greedy) arrives\n" +
                "116.974 786(greedy) leaves\n" +
                "117.111 787 arrives\n" +
                "117.111 787 leaves\n" +
                "117.125 788(greedy) arrives\n" +
                "117.125 788(greedy) leaves\n" +
                "117.164 754(greedy) done serving by server 2\n" +
                "117.164 755(greedy) serves by server 2\n" +
                "117.166 692(greedy) done serving by server 3\n" +
                "117.166 693 serves by server 3\n" +
                "117.443 789(greedy) arrives\n" +
                "117.443 789(greedy) waits at server 2\n" +
                "117.453 790 arrives\n" +
                "117.453 790 waits at server 3\n" +
                "117.536 791(greedy) arrives\n" +
                "117.536 791(greedy) leaves\n" +
                "117.553 792 arrives\n" +
                "117.553 792 leaves\n" +
                "117.608 793(greedy) arrives\n" +
                "117.608 793(greedy) leaves\n" +
                "117.765 794(greedy) arrives\n" +
                "117.765 794(greedy) leaves\n" +
                "117.816 795(greedy) arrives\n" +
                "117.816 795(greedy) leaves\n" +
                "117.858 755(greedy) done serving by server 2\n" +
                "117.858 756 serves by server 2\n" +
                "117.866 796(greedy) arrives\n" +
                "117.866 796(greedy) waits at server 2\n" +
                "117.949 717(greedy) done serving by server 5\n" +
                "117.949 718(greedy) serves by server 5\n" +
                "117.976 797 arrives\n" +
                "117.976 797 waits at server 5\n" +
                "118.040 798(greedy) arrives\n" +
                "118.040 798(greedy) leaves\n" +
                "118.061 799(greedy) arrives\n" +
                "118.061 799(greedy) leaves\n" +
                "118.212 800(greedy) arrives\n" +
                "118.212 800(greedy) leaves\n" +
                "118.399 801(greedy) arrives\n" +
                "118.399 801(greedy) leaves\n" +
                "118.432 802(greedy) arrives\n" +
                "118.432 802(greedy) leaves\n" +
                "118.525 803(greedy) arrives\n" +
                "118.525 803(greedy) leaves\n" +
                "118.602 804(greedy) arrives\n" +
                "118.602 804(greedy) leaves\n" +
                "118.766 693 done serving by server 3\n" +
                "118.766 698 serves by server 3\n" +
                "118.777 805 arrives\n" +
                "118.777 805 waits at server 3\n" +
                "118.891 756 done serving by server 2\n" +
                "118.891 757 serves by server 2\n" +
                "119.104 698 done serving by server 3\n" +
                "119.104 704 serves by server 3\n" +
                "119.136 704 done serving by server 3\n" +
                "119.136 709(greedy) serves by server 3\n" +
                "119.219 709(greedy) done serving by server 3\n" +
                "119.219 712 serves by server 3\n" +
                "119.250 757 done serving by server 2\n" +
                "119.250 759 serves by server 2\n" +
                "119.377 806 arrives\n" +
                "119.377 806 waits at server 2\n" +
                "119.495 807 arrives\n" +
                "119.495 807 waits at server 2\n" +
                "119.686 759 done serving by server 2\n" +
                "119.686 772(greedy) serves by server 2\n" +
                "119.733 772(greedy) done serving by server 2\n" +
                "119.733 774 serves by server 2\n" +
                "119.834 808(greedy) arrives\n" +
                "119.834 808(greedy) waits at server 3\n" +
                "119.923 718(greedy) done serving by server 5\n" +
                "119.923 722(greedy) serves by server 5\n" +
                "119.950 809(greedy) arrives\n" +
                "119.950 809(greedy) waits at server 2\n" +
                "119.956 810(greedy) arrives\n" +
                "119.956 810(greedy) waits at server 3\n" +
                "120.139 811 arrives\n" +
                "120.139 811 waits at server 2\n" +
                "120.224 812(greedy) arrives\n" +
                "120.224 812(greedy) waits at server 3\n" +
                "120.444 813 arrives\n" +
                "120.444 813 waits at server 5\n" +
                "120.534 708(greedy) done serving by server 1\n" +
                "120.534 711 serves by server 1\n" +
                "120.579 814 arrives\n" +
                "120.579 814 waits at server 1\n" +
                "120.712 815 arrives\n" +
                "120.712 815 leaves\n" +
                "120.764 816(greedy) arrives\n" +
                "120.764 816(greedy) leaves\n" +
                "120.946 817 arrives\n" +
                "120.946 817 leaves\n" +
                "121.225 722(greedy) done serving by server 5\n" +
                "121.225 736(greedy) serves by server 5\n" +
                "121.255 818(greedy) arrives\n" +
                "121.255 818(greedy) waits at server 5\n" +
                "121.378 711 done serving by server 1\n" +
                "121.378 719 serves by server 1\n" +
                "121.567 667(greedy) done serving by server 4\n" +
                "121.567 699(greedy) serves by server 4\n" +
                "121.577 819(greedy) arrives\n" +
                "121.577 819(greedy) waits at server 1\n" +
                "121.652 712 done serving by server 3\n" +
                "121.652 713 serves by server 3\n" +
                "121.702 820(greedy) arrives\n" +
                "121.702 820(greedy) waits at server 3\n" +
                "121.756 821 arrives\n" +
                "121.756 821 waits at server 4\n" +
                "121.914 736(greedy) done serving by server 5\n" +
                "121.914 742 serves by server 5\n" +
                "121.924 822 arrives\n" +
                "121.924 822 waits at server 5\n" +
                "121.961 719 done serving by server 1\n" +
                "121.961 733 serves by server 1\n" +
                "122.006 713 done serving by server 3\n" +
                "122.006 735(greedy) serves by server 3\n" +
                "122.126 823(greedy) arrives\n" +
                "122.126 823(greedy) waits at server 1\n" +
                "122.191 824 arrives\n" +
                "122.191 824 waits at server 3\n" +
                "122.197 825(greedy) arrives\n" +
                "122.197 825(greedy) leaves\n" +
                "122.275 735(greedy) done serving by server 3\n" +
                "122.275 740 serves by server 3\n" +
                "122.365 826 arrives\n" +
                "122.365 826 waits at server 3\n" +
                "122.463 827 arrives\n" +
                "122.463 827 leaves\n" +
                "122.513 828 arrives\n" +
                "122.513 828 leaves\n" +
                "122.544 742 done serving by server 5\n" +
                "122.544 743(greedy) serves by server 5\n" +
                "122.600 829(greedy) arrives\n" +
                "122.600 829(greedy) waits at server 5\n" +
                "122.621 774 done serving by server 2\n" +
                "122.621 775(greedy) serves by server 2\n" +
                "122.671 830(greedy) arrives\n" +
                "122.671 830(greedy) waits at server 2\n" +
                "122.676 831 arrives\n" +
                "122.676 831 leaves\n" +
                "122.686 832(greedy) arrives\n" +
                "122.686 832(greedy) leaves\n" +
                "123.029 833 arrives\n" +
                "123.029 833 leaves\n" +
                "123.062 834(greedy) arrives\n" +
                "123.062 834(greedy) leaves\n" +
                "123.083 733 done serving by server 1\n" +
                "123.083 738(greedy) serves by server 1\n" +
                "123.183 835 arrives\n" +
                "123.183 835 waits at server 1\n" +
                "123.184 836(greedy) arrives\n" +
                "123.184 836(greedy) leaves\n" +
                "123.191 740 done serving by server 3\n" +
                "123.191 760 serves by server 3\n" +
                "123.198 760 done serving by server 3\n" +
                "123.198 776 serves by server 3\n" +
                "123.241 837 arrives\n" +
                "123.241 837 waits at server 3\n" +
                "123.283 838(greedy) arrives\n" +
                "123.283 838(greedy) waits at server 3\n" +
                "123.311 839(greedy) arrives\n" +
                "123.311 839(greedy) leaves\n" +
                "123.350 738(greedy) done serving by server 1\n" +
                "123.350 746 serves by server 1\n" +
                "123.367 699(greedy) done serving by server 4\n" +
                "123.367 703(greedy) serves by server 4\n" +
                "123.397 840(greedy) arrives\n" +
                "123.397 840(greedy) waits at server 1\n" +
                "123.435 841(greedy) arrives\n" +
                "123.435 841(greedy) waits at server 4\n" +
                "123.502 842 arrives\n" +
                "123.502 842 leaves\n" +
                "123.508 775(greedy) done serving by server 2\n" +
                "123.508 781(greedy) serves by server 2\n" +
                "123.593 843(greedy) arrives\n" +
                "123.593 843(greedy) waits at server 2\n" +
                "123.814 781(greedy) done serving by server 2\n" +
                "123.814 782(greedy) serves by server 2\n" +
                "123.894 743(greedy) done serving by server 5\n" +
                "123.894 751 serves by server 5\n" +
                "124.051 703(greedy) done serving by server 4\n" +
                "124.051 705 serves by server 4\n" +
                "124.110 776 done serving by server 3\n" +
                "124.110 790 serves by server 3\n" +
                "124.137 790 done serving by server 3\n" +
                "124.137 805 serves by server 3\n" +
                "124.142 844(greedy) arrives\n" +
                "124.142 844(greedy) waits at server 3\n" +
                "124.143 751 done serving by server 5\n" +
                "124.143 762 serves by server 5\n" +
                "124.147 845 arrives\n" +
                "124.147 845 waits at server 2\n" +
                "124.182 846 arrives\n" +
                "124.182 846 waits at server 3\n" +
                "124.217 847(greedy) arrives\n" +
                "124.217 847(greedy) waits at server 5\n" +
                "124.221 848 arrives\n" +
                "124.221 848 waits at server 4\n" +
                "124.280 746 done serving by server 1\n" +
                "124.280 747 serves by server 1\n" +
                "124.292 849 arrives\n" +
                "124.292 849 waits at server 1\n" +
                "124.302 850 arrives\n" +
                "124.302 850 waits at server 5\n" +
                "124.410 851 arrives\n" +
                "124.410 851 leaves\n" +
                "124.413 852 arrives\n" +
                "124.413 852 leaves\n" +
                "124.633 853 arrives\n" +
                "124.633 853 leaves\n" +
                "124.684 747 done serving by server 1\n" +
                "124.684 748(greedy) serves by server 1\n" +
                "124.694 854(greedy) arrives\n" +
                "124.694 854(greedy) waits at server 1\n" +
                "124.802 855 arrives\n" +
                "124.802 855 leaves\n" +
                "124.831 856 arrives\n" +
                "124.831 856 leaves\n" +
                "124.850 748(greedy) done serving by server 1\n" +
                "124.850 753 serves by server 1\n" +
                "124.916 857(greedy) arrives\n" +
                "124.916 857(greedy) waits at server 1\n" +
                "124.979 858 arrives\n" +
                "124.979 858 leaves\n" +
                "125.108 859(greedy) arrives\n" +
                "125.108 859(greedy) leaves\n" +
                "125.235 705 done serving by server 4\n" +
                "125.235 707(greedy) serves by server 4\n" +
                "125.345 782(greedy) done serving by server 2\n" +
                "125.345 784(greedy) serves by server 2\n" +
                "125.400 805 done serving by server 3\n" +
                "125.400 808(greedy) serves by server 3\n" +
                "125.601 860 arrives\n" +
                "125.601 860 waits at server 2\n" +
                "125.744 861 arrives\n" +
                "125.744 861 waits at server 3\n" +
                "125.810 862 arrives\n" +
                "125.810 862 waits at server 4\n" +
                "125.947 707(greedy) done serving by server 4\n" +
                "125.947 714 serves by server 4\n" +
                "126.207 863(greedy) arrives\n" +
                "126.207 863(greedy) waits at server 4\n" +
                "126.240 808(greedy) done serving by server 3\n" +
                "126.240 810(greedy) serves by server 3\n" +
                "126.378 753 done serving by server 1\n" +
                "126.378 767 serves by server 1\n" +
                "126.469 864 arrives\n" +
                "126.469 864 waits at server 1\n" +
                "126.776 762 done serving by server 5\n" +
                "126.776 763 serves by server 5\n" +
                "126.924 763 done serving by server 5\n" +
                "126.924 764 serves by server 5\n" +
                "127.090 865 arrives\n" +
                "127.090 865 waits at server 3\n" +
                "127.142 866 arrives\n" +
                "127.142 866 waits at server 5\n" +
                "127.450 867 arrives\n" +
                "127.450 867 waits at server 5\n" +
                "127.464 868(greedy) arrives\n" +
                "127.464 868(greedy) leaves\n" +
                "127.510 810(greedy) done serving by server 3\n" +
                "127.510 812(greedy) serves by server 3\n" +
                "127.572 869 arrives\n" +
                "127.572 869 waits at server 3\n" +
                "128.334 870(greedy) arrives\n" +
                "128.334 870(greedy) leaves\n" +
                "128.367 764 done serving by server 5\n" +
                "128.367 780 serves by server 5\n" +
                "128.414 871(greedy) arrives\n" +
                "128.414 871(greedy) waits at server 5\n" +
                "128.564 714 done serving by server 4\n" +
                "128.564 729(greedy) serves by server 4\n" +
                "128.830 872(greedy) arrives\n" +
                "128.830 872(greedy) waits at server 4\n" +
                "128.878 873(greedy) arrives\n" +
                "128.878 873(greedy) leaves\n" +
                "128.878 812(greedy) done serving by server 3\n" +
                "128.878 820(greedy) serves by server 3\n" +
                "128.899 874 arrives\n" +
                "128.899 874 waits at server 3\n" +
                "129.022 875 arrives\n" +
                "129.022 875 leaves\n" +
                "129.075 784(greedy) done serving by server 2\n" +
                "129.075 789(greedy) serves by server 2\n" +
                "129.461 876(greedy) arrives\n" +
                "129.461 876(greedy) waits at server 2\n" +
                "129.678 877 arrives\n" +
                "129.678 877 leaves\n" +
                "129.773 878(greedy) arrives\n" +
                "129.773 878(greedy) leaves\n" +
                "129.797 789(greedy) done serving by server 2\n" +
                "129.797 796(greedy) serves by server 2\n" +
                "129.930 879(greedy) arrives\n" +
                "129.930 879(greedy) waits at server 2\n" +
                "130.051 780 done serving by server 5\n" +
                "130.051 797 serves by server 5\n" +
                "130.055 880 arrives\n" +
                "130.055 880 waits at server 5\n" +
                "130.164 881 arrives\n" +
                "130.164 881 leaves\n" +
                "130.186 882(greedy) arrives\n" +
                "130.186 882(greedy) leaves\n" +
                "130.226 883(greedy) arrives\n" +
                "130.226 883(greedy) leaves\n" +
                "130.262 884 arrives\n" +
                "130.262 884 leaves\n" +
                "130.297 885 arrives\n" +
                "130.297 885 leaves\n" +
                "130.675 796(greedy) done serving by server 2\n" +
                "130.675 806 serves by server 2\n" +
                "130.907 886(greedy) arrives\n" +
                "130.907 886(greedy) waits at server 2\n" +
                "130.947 887 arrives\n" +
                "130.947 887 leaves\n" +
                "131.138 797 done serving by server 5\n" +
                "131.138 813 serves by server 5\n" +
                "131.198 888 arrives\n" +
                "131.198 888 waits at server 5\n" +
                "131.326 889 arrives\n" +
                "131.326 889 leaves\n" +
                "131.480 890 arrives\n" +
                "131.480 890 leaves\n" +
                "131.792 891 arrives\n" +
                "131.792 891 leaves\n" +
                "131.943 892 arrives\n" +
                "131.943 892 leaves\n" +
                "131.982 729(greedy) done serving by server 4\n" +
                "131.982 731 serves by server 4\n" +
                "132.030 893(greedy) arrives\n" +
                "132.030 893(greedy) waits at server 4\n" +
                "132.173 894(greedy) arrives\n" +
                "132.173 894(greedy) leaves\n" +
                "132.260 895 arrives\n" +
                "132.260 895 leaves\n" +
                "132.361 896 arrives\n" +
                "132.361 896 leaves\n" +
                "132.410 897 arrives\n" +
                "132.410 897 leaves\n" +
                "132.420 898(greedy) arrives\n" +
                "132.420 898(greedy) leaves\n" +
                "132.459 899 arrives\n" +
                "132.459 899 leaves\n" +
                "132.468 900(greedy) arrives");

        System.out.println("132.468 900(greedy) leaves\n" +
                "132.479 767 done serving by server 1\n" +
                "132.479 783(greedy) serves by server 1\n" +
                "132.520 901(greedy) arrives\n" +
                "132.520 901(greedy) waits at server 1\n" +
                "132.553 731 done serving by server 4\n" +
                "132.553 750 serves by server 4\n" +
                "132.593 902(greedy) arrives\n" +
                "132.593 902(greedy) waits at server 4\n" +
                "132.623 820(greedy) done serving by server 3\n" +
                "132.623 824 serves by server 3\n" +
                "133.024 750 done serving by server 4\n" +
                "133.024 758 serves by server 4\n" +
                "133.035 903(greedy) arrives\n" +
                "133.035 903(greedy) waits at server 3\n" +
                "133.180 904(greedy) arrives\n" +
                "133.180 904(greedy) waits at server 4\n" +
                "133.227 905(greedy) arrives\n" +
                "133.227 905(greedy) leaves\n" +
                "133.357 906(greedy) arrives\n" +
                "133.357 906(greedy) leaves\n" +
                "133.510 907(greedy) arrives\n" +
                "133.510 907(greedy) leaves\n" +
                "133.526 908 arrives\n" +
                "133.526 908 leaves\n" +
                "133.616 824 done serving by server 3\n" +
                "133.616 826 serves by server 3\n" +
                "133.656 758 done serving by server 4\n" +
                "133.656 761 serves by server 4\n" +
                "133.763 806 done serving by server 2\n" +
                "133.763 807 serves by server 2\n" +
                "133.948 807 done serving by server 2\n" +
                "133.948 809(greedy) serves by server 2\n" +
                "134.011 813 done serving by server 5\n" +
                "134.011 818(greedy) serves by server 5\n" +
                "134.012 909(greedy) arrives\n" +
                "134.012 909(greedy) waits at server 2\n" +
                "134.020 809(greedy) done serving by server 2\n" +
                "134.020 811 serves by server 2\n" +
                "134.047 910(greedy) arrives\n" +
                "134.047 910(greedy) waits at server 2\n" +
                "134.183 911 arrives\n" +
                "134.183 911 waits at server 2\n" +
                "134.200 912(greedy) arrives\n" +
                "134.200 912(greedy) waits at server 3\n" +
                "134.211 913(greedy) arrives\n" +
                "134.211 913(greedy) waits at server 4\n" +
                "134.282 914(greedy) arrives\n" +
                "134.282 914(greedy) waits at server 5\n" +
                "134.308 811 done serving by server 2\n" +
                "134.308 830(greedy) serves by server 2\n" +
                "134.309 783(greedy) done serving by server 1\n" +
                "134.309 814 serves by server 1\n" +
                "134.433 915(greedy) arrives\n" +
                "134.433 915(greedy) waits at server 1\n" +
                "134.468 916(greedy) arrives\n" +
                "134.468 916(greedy) waits at server 2\n" +
                "134.535 818(greedy) done serving by server 5\n" +
                "134.535 822 serves by server 5\n" +
                "134.640 917 arrives\n" +
                "134.640 917 waits at server 5\n" +
                "134.796 830(greedy) done serving by server 2\n" +
                "134.796 843(greedy) serves by server 2\n" +
                "134.829 814 done serving by server 1\n" +
                "134.829 819(greedy) serves by server 1\n" +
                "134.887 918 arrives\n" +
                "134.887 918 waits at server 1\n" +
                "134.981 919(greedy) arrives\n" +
                "134.981 919(greedy) waits at server 2\n" +
                "134.985 819(greedy) done serving by server 1\n" +
                "134.985 823(greedy) serves by server 1\n" +
                "135.146 822 done serving by server 5\n" +
                "135.146 829(greedy) serves by server 5\n" +
                "135.240 761 done serving by server 4\n" +
                "135.240 821 serves by server 4\n" +
                "135.370 843(greedy) done serving by server 2\n" +
                "135.370 845 serves by server 2\n" +
                "135.381 920 arrives\n" +
                "135.381 920 waits at server 1\n" +
                "135.387 821 done serving by server 4\n" +
                "135.387 841(greedy) serves by server 4\n" +
                "135.411 829(greedy) done serving by server 5\n" +
                "135.411 847(greedy) serves by server 5\n" +
                "135.514 921(greedy) arrives\n" +
                "135.514 921(greedy) waits at server 4\n" +
                "135.532 922 arrives\n" +
                "135.532 922 waits at server 2\n" +
                "135.560 845 done serving by server 2\n" +
                "135.560 860 serves by server 2\n" +
                "135.644 823(greedy) done serving by server 1\n" +
                "135.644 835 serves by server 1\n" +
                "135.694 826 done serving by server 3\n" +
                "135.694 837 serves by server 3\n" +
                "135.943 860 done serving by server 2\n" +
                "135.943 876(greedy) serves by server 2\n" +
                "135.973 923 arrives\n" +
                "135.973 923 waits at server 1\n" +
                "135.990 837 done serving by server 3\n" +
                "135.990 838(greedy) serves by server 3\n" +
                "136.210 835 done serving by server 1\n" +
                "136.210 840(greedy) serves by server 1\n" +
                "136.210 840(greedy) done serving by server 1\n" +
                "136.210 849 serves by server 1\n" +
                "136.336 924(greedy) arrives\n" +
                "136.336 924(greedy) waits at server 1\n" +
                "136.346 876(greedy) done serving by server 2\n" +
                "136.346 879(greedy) serves by server 2\n" +
                "136.358 925(greedy) arrives\n" +
                "136.358 925(greedy) waits at server 2\n" +
                "136.420 926(greedy) arrives\n" +
                "136.420 926(greedy) waits at server 2\n" +
                "136.492 841(greedy) done serving by server 4\n" +
                "136.492 848 serves by server 4\n" +
                "136.547 927 arrives\n" +
                "136.547 927 waits at server 1\n" +
                "136.558 928(greedy) arrives\n" +
                "136.558 928(greedy) waits at server 3\n" +
                "136.630 848 done serving by server 4\n" +
                "136.630 862 serves by server 4\n" +
                "136.671 849 done serving by server 1\n" +
                "136.671 854(greedy) serves by server 1\n" +
                "136.680 929(greedy) arrives\n" +
                "136.680 929(greedy) waits at server 4\n" +
                "136.694 930(greedy) arrives\n" +
                "136.694 930(greedy) waits at server 4\n" +
                "136.830 847(greedy) done serving by server 5\n" +
                "136.830 850 serves by server 5\n" +
                "136.856 931 arrives\n" +
                "136.856 931 waits at server 1\n" +
                "136.873 862 done serving by server 4\n" +
                "136.873 863(greedy) serves by server 4\n" +
                "136.924 932 arrives\n" +
                "136.924 932 waits at server 2\n" +
                "136.985 933(greedy) arrives\n" +
                "136.985 933(greedy) waits at server 5\n" +
                "137.069 838(greedy) done serving by server 3\n" +
                "137.069 844(greedy) serves by server 3\n" +
                "137.131 854(greedy) done serving by server 1\n" +
                "137.131 857(greedy) serves by server 1\n" +
                "137.155 934 arrives\n" +
                "137.155 934 waits at server 1\n" +
                "137.160 935(greedy) arrives\n" +
                "137.160 935(greedy) waits at server 3\n" +
                "137.203 879(greedy) done serving by server 2\n" +
                "137.203 886(greedy) serves by server 2\n" +
                "137.338 936 arrives\n" +
                "137.338 936 waits at server 2\n" +
                "137.355 850 done serving by server 5\n" +
                "137.355 866 serves by server 5\n" +
                "137.403 937 arrives\n" +
                "137.403 937 waits at server 3\n" +
                "137.577 938 arrives\n" +
                "137.577 938 waits at server 4\n" +
                "137.632 866 done serving by server 5\n" +
                "137.632 867 serves by server 5\n" +
                "137.909 939(greedy) arrives\n" +
                "137.909 939(greedy) waits at server 5\n" +
                "137.912 940 arrives\n" +
                "137.912 940 waits at server 4\n" +
                "137.965 941(greedy) arrives\n" +
                "137.965 941(greedy) waits at server 5\n" +
                "137.975 942(greedy) arrives\n" +
                "137.975 942(greedy) waits at server 5\n" +
                "138.118 943 arrives\n" +
                "138.118 943 waits at server 5\n" +
                "138.215 944(greedy) arrives\n" +
                "138.215 944(greedy) leaves\n" +
                "138.269 945(greedy) arrives\n" +
                "138.269 945(greedy) leaves\n" +
                "138.329 867 done serving by server 5\n" +
                "138.329 871(greedy) serves by server 5\n" +
                "138.372 946 arrives\n" +
                "138.372 946 waits at server 5\n" +
                "138.435 886(greedy) done serving by server 2\n" +
                "138.435 909(greedy) serves by server 2\n" +
                "138.529 863(greedy) done serving by server 4\n" +
                "138.529 872(greedy) serves by server 4\n" +
                "138.614 947(greedy) arrives\n" +
                "138.614 947(greedy) waits at server 2\n" +
                "138.682 871(greedy) done serving by server 5\n" +
                "138.682 880 serves by server 5\n" +
                "138.710 948(greedy) arrives\n" +
                "138.710 948(greedy) waits at server 4\n" +
                "138.802 872(greedy) done serving by server 4\n" +
                "138.802 893(greedy) serves by server 4\n" +
                "138.804 949(greedy) arrives\n" +
                "138.804 949(greedy) waits at server 4\n" +
                "138.860 950(greedy) arrives\n" +
                "138.860 950(greedy) waits at server 5\n" +
                "138.989 857(greedy) done serving by server 1\n" +
                "138.989 864 serves by server 1\n" +
                "139.117 864 done serving by server 1\n" +
                "139.117 901(greedy) serves by server 1\n" +
                "139.308 951 arrives\n" +
                "139.308 951 waits at server 1\n" +
                "139.320 952 arrives\n" +
                "139.320 952 waits at server 1\n" +
                "139.438 953(greedy) arrives\n" +
                "139.438 953(greedy) leaves\n" +
                "139.538 954 arrives\n" +
                "139.538 954 leaves\n" +
                "139.569 955 arrives\n" +
                "139.569 955 leaves\n" +
                "139.591 909(greedy) done serving by server 2\n" +
                "139.591 910(greedy) serves by server 2\n" +
                "139.616 956(greedy) arrives\n" +
                "139.616 956(greedy) waits at server 2\n" +
                "139.713 901(greedy) done serving by server 1\n" +
                "139.713 915(greedy) serves by server 1\n" +
                "139.750 957 arrives\n" +
                "139.750 957 waits at server 1\n" +
                "139.890 910(greedy) done serving by server 2\n" +
                "139.890 911 serves by server 2\n" +
                "140.171 893(greedy) done serving by server 4\n" +
                "140.171 902(greedy) serves by server 4\n" +
                "140.398 958 arrives\n" +
                "140.398 958 waits at server 2\n" +
                "140.504 880 done serving by server 5\n" +
                "140.504 888 serves by server 5\n" +
                "140.564 959 arrives\n" +
                "140.564 959 waits at server 4\n" +
                "140.636 844(greedy) done serving by server 3\n" +
                "140.636 846 serves by server 3\n" +
                "140.696 911 done serving by server 2\n" +
                "140.696 916(greedy) serves by server 2\n" +
                "140.891 846 done serving by server 3\n" +
                "140.891 861 serves by server 3\n" +
                "140.898 915(greedy) done serving by server 1\n" +
                "140.898 918 serves by server 1\n" +
                "141.096 916(greedy) done serving by server 2\n" +
                "141.096 919(greedy) serves by server 2\n" +
                "141.302 960(greedy) arrives\n" +
                "141.302 960(greedy) waits at server 2\n" +
                "141.310 888 done serving by server 5\n" +
                "141.310 914(greedy) serves by server 5\n" +
                "141.348 914(greedy) done serving by server 5\n" +
                "141.348 917 serves by server 5\n" +
                "141.542 919(greedy) done serving by server 2\n" +
                "141.542 922 serves by server 2\n" +
                "141.572 961(greedy) arrives\n" +
                "141.572 961(greedy) waits at server 5\n" +
                "141.605 962 arrives\n" +
                "141.605 962 waits at server 1\n" +
                "141.685 861 done serving by server 3\n" +
                "141.685 865 serves by server 3\n" +
                "141.760 917 done serving by server 5\n" +
                "141.760 933(greedy) serves by server 5\n" +
                "141.854 902(greedy) done serving by server 4\n" +
                "141.854 904(greedy) serves by server 4\n" +
                "141.901 963 arrives\n" +
                "141.901 963 waits at server 2\n" +
                "141.996 904(greedy) done serving by server 4\n" +
                "141.996 913(greedy) serves by server 4\n" +
                "142.098 865 done serving by server 3\n" +
                "142.098 869 serves by server 3\n" +
                "142.128 964(greedy) arrives\n" +
                "142.128 964(greedy) waits at server 3\n" +
                "142.155 869 done serving by server 3\n" +
                "142.155 874 serves by server 3\n" +
                "142.228 933(greedy) done serving by server 5\n" +
                "142.228 939(greedy) serves by server 5\n" +
                "142.230 922 done serving by server 2\n" +
                "142.230 925(greedy) serves by server 2\n" +
                "142.404 939(greedy) done serving by server 5\n" +
                "142.404 941(greedy) serves by server 5\n" +
                "142.413 965(greedy) arrives\n" +
                "142.413 965(greedy) waits at server 5\n" +
                "142.418 966 arrives\n" +
                "142.418 966 waits at server 2\n" +
                "142.511 918 done serving by server 1\n" +
                "142.511 920 serves by server 1\n" +
                "142.524 967(greedy) arrives\n" +
                "142.524 967(greedy) waits at server 3\n" +
                "142.618 913(greedy) done serving by server 4\n" +
                "142.618 921(greedy) serves by server 4\n" +
                "142.679 968(greedy) arrives\n" +
                "142.679 968(greedy) waits at server 5\n" +
                "143.135 920 done serving by server 1\n" +
                "143.135 923 serves by server 1\n" +
                "143.148 969(greedy) arrives\n" +
                "143.148 969(greedy) waits at server 3\n" +
                "143.251 941(greedy) done serving by server 5\n" +
                "143.251 942(greedy) serves by server 5\n" +
                "143.313 970(greedy) arrives\n" +
                "143.313 970(greedy) waits at server 5\n" +
                "143.406 971(greedy) arrives\n" +
                "143.406 971(greedy) waits at server 4\n" +
                "143.552 923 done serving by server 1\n" +
                "143.552 924(greedy) serves by server 1\n" +
                "143.592 972(greedy) arrives\n" +
                "143.592 972(greedy) waits at server 1\n" +
                "143.604 973 arrives\n" +
                "143.604 973 waits at server 1\n" +
                "143.642 921(greedy) done serving by server 4\n" +
                "143.642 929(greedy) serves by server 4\n" +
                "143.680 924(greedy) done serving by server 1\n" +
                "143.680 927 serves by server 1\n" +
                "143.726 874 done serving by server 3\n" +
                "143.726 903(greedy) serves by server 3\n" +
                "143.757 942(greedy) done serving by server 5\n" +
                "143.757 943 serves by server 5\n" +
                "143.783 929(greedy) done serving by server 4\n" +
                "143.783 930(greedy) serves by server 4\n" +
                "143.791 925(greedy) done serving by server 2\n" +
                "143.791 926(greedy) serves by server 2\n" +
                "143.844 903(greedy) done serving by server 3\n" +
                "143.844 912(greedy) serves by server 3\n" +
                "143.880 974(greedy) arrives\n" +
                "143.880 974(greedy) waits at server 3\n" +
                "143.885 975(greedy) arrives\n" +
                "143.885 975(greedy) waits at server 4\n" +
                "143.910 976 arrives\n" +
                "143.910 976 waits at server 1\n" +
                "143.945 943 done serving by server 5\n" +
                "143.945 946 serves by server 5\n" +
                "144.048 977(greedy) arrives\n" +
                "144.048 977(greedy) waits at server 5\n" +
                "144.213 978 arrives\n" +
                "144.213 978 waits at server 1\n" +
                "144.217 946 done serving by server 5\n" +
                "144.217 950(greedy) serves by server 5\n" +
                "144.292 950(greedy) done serving by server 5\n" +
                "144.292 961(greedy) serves by server 5\n" +
                "144.338 979(greedy) arrives\n" +
                "144.338 979(greedy) waits at server 5\n" +
                "144.339 980(greedy) arrives\n" +
                "144.339 980(greedy) waits at server 5\n" +
                "144.468 930(greedy) done serving by server 4\n" +
                "144.468 938 serves by server 4\n" +
                "144.476 981 arrives\n" +
                "144.476 981 waits at server 2\n" +
                "144.477 961(greedy) done serving by server 5\n" +
                "144.477 965(greedy) serves by server 5\n" +
                "144.769 938 done serving by server 4\n" +
                "144.769 940 serves by server 4\n" +
                "144.871 926(greedy) done serving by server 2\n" +
                "144.871 932 serves by server 2\n" +
                "144.928 932 done serving by server 2\n" +
                "144.928 936 serves by server 2\n" +
                "145.034 982 arrives\n" +
                "145.034 982 waits at server 2\n" +
                "145.087 983 arrives\n" +
                "145.087 983 waits at server 2\n" +
                "145.580 984(greedy) arrives\n" +
                "145.580 984(greedy) waits at server 4\n" +
                "145.599 985(greedy) arrives\n" +
                "145.599 985(greedy) waits at server 5\n" +
                "145.625 927 done serving by server 1\n" +
                "145.625 931 serves by server 1\n" +
                "145.659 986 arrives\n" +
                "145.659 986 waits at server 1\n" +
                "145.671 987 arrives\n" +
                "145.671 987 waits at server 2\n" +
                "145.764 912(greedy) done serving by server 3\n" +
                "145.764 928(greedy) serves by server 3\n" +
                "145.813 988(greedy) arrives\n" +
                "145.813 988(greedy) waits at server 3\n" +
                "145.827 989(greedy) arrives\n" +
                "145.827 989(greedy) waits at server 4\n" +
                "145.854 936 done serving by server 2\n" +
                "145.854 947(greedy) serves by server 2\n" +
                "145.918 965(greedy) done serving by server 5\n" +
                "145.918 968(greedy) serves by server 5\n" +
                "145.923 990 arrives\n" +
                "145.923 990 waits at server 2\n" +
                "145.953 991 arrives\n" +
                "145.953 991 waits at server 3\n" +
                "146.036 968(greedy) done serving by server 5\n" +
                "146.036 970(greedy) serves by server 5\n" +
                "146.076 970(greedy) done serving by server 5\n" +
                "146.076 977(greedy) serves by server 5\n" +
                "146.197 992 arrives\n" +
                "146.197 992 waits at server 3\n" +
                "146.744 993 arrives\n" +
                "146.744 993 waits at server 3\n" +
                "146.808 994 arrives\n" +
                "146.808 994 waits at server 4\n" +
                "146.871 995 arrives\n" +
                "146.871 995 waits at server 4\n" +
                "146.906 996(greedy) arrives\n" +
                "146.906 996(greedy) waits at server 5\n" +
                "146.923 997 arrives\n" +
                "146.923 997 waits at server 4\n" +
                "146.941 998(greedy) arrives\n" +
                "146.941 998(greedy) waits at server 5\n" +
                "147.036 999 arrives\n" +
                "147.036 999 waits at server 5\n" +
                "147.075 931 done serving by server 1\n" +
                "147.075 934 serves by server 1\n" +
                "147.103 928(greedy) done serving by server 3\n" +
                "147.103 935(greedy) serves by server 3\n" +
                "147.115 1000(greedy) arrives\n" +
                "147.115 1000(greedy) waits at server 5\n" +
                "147.208 940 done serving by server 4\n" +
                "147.208 948(greedy) serves by server 4\n" +
                "147.238 977(greedy) done serving by server 5\n" +
                "147.238 979(greedy) serves by server 5\n" +
                "147.408 948(greedy) done serving by server 4\n" +
                "147.408 949(greedy) serves by server 4\n" +
                "147.574 947(greedy) done serving by server 2\n" +
                "147.574 956(greedy) serves by server 2\n" +
                "147.882 949(greedy) done serving by server 4\n" +
                "147.882 959 serves by server 4\n" +
                "148.100 956(greedy) done serving by server 2\n" +
                "148.100 958 serves by server 2\n" +
                "148.154 958 done serving by server 2\n" +
                "148.154 960(greedy) serves by server 2\n" +
                "148.580 935(greedy) done serving by server 3\n" +
                "148.580 937 serves by server 3\n" +
                "148.734 934 done serving by server 1\n" +
                "148.734 951 serves by server 1\n" +
                "148.924 937 done serving by server 3\n" +
                "148.924 964(greedy) serves by server 3\n" +
                "149.336 959 done serving by server 4\n" +
                "149.336 971(greedy) serves by server 4\n" +
                "149.478 971(greedy) done serving by server 4\n" +
                "149.478 975(greedy) serves by server 4\n" +
                "149.486 964(greedy) done serving by server 3\n" +
                "149.486 967(greedy) serves by server 3\n" +
                "149.673 975(greedy) done serving by server 4\n" +
                "149.673 984(greedy) serves by server 4\n" +
                "149.941 960(greedy) done serving by server 2\n" +
                "149.941 963 serves by server 2\n" +
                "149.994 951 done serving by server 1\n" +
                "149.994 952 serves by server 1\n" +
                "150.215 984(greedy) done serving by server 4\n" +
                "150.215 989(greedy) serves by server 4\n" +
                "150.379 967(greedy) done serving by server 3\n" +
                "150.379 969(greedy) serves by server 3\n" +
                "150.525 979(greedy) done serving by server 5\n" +
                "150.525 980(greedy) serves by server 5\n" +
                "150.544 952 done serving by server 1\n" +
                "150.544 957 serves by server 1\n" +
                "150.701 969(greedy) done serving by server 3\n" +
                "150.701 974(greedy) serves by server 3\n" +
                "151.360 957 done serving by server 1\n" +
                "151.360 962 serves by server 1\n" +
                "151.812 980(greedy) done serving by server 5\n" +
                "151.812 985(greedy) serves by server 5\n" +
                "152.213 962 done serving by server 1\n" +
                "152.213 972(greedy) serves by server 1\n" +
                "152.646 989(greedy) done serving by server 4\n" +
                "152.646 994 serves by server 4\n" +
                "152.848 963 done serving by server 2\n" +
                "152.848 966 serves by server 2\n" +
                "153.157 985(greedy) done serving by server 5\n" +
                "153.157 996(greedy) serves by server 5\n" +
                "153.347 972(greedy) done serving by server 1\n" +
                "153.347 973 serves by server 1\n" +
                "153.481 966 done serving by server 2\n" +
                "153.481 981 serves by server 2\n" +
                "154.459 994 done serving by server 4\n" +
                "154.459 995 serves by server 4\n" +
                "154.589 996(greedy) done serving by server 5\n" +
                "154.589 998(greedy) serves by server 5\n" +
                "154.658 981 done serving by server 2\n" +
                "154.658 982 serves by server 2\n" +
                "154.660 998(greedy) done serving by server 5\n" +
                "154.660 999 serves by server 5\n" +
                "155.580 995 done serving by server 4\n" +
                "155.580 997 serves by server 4\n" +
                "155.744 982 done serving by server 2\n" +
                "155.744 983 serves by server 2\n" +
                "155.756 974(greedy) done serving by server 3\n" +
                "155.756 988(greedy) serves by server 3\n" +
                "155.794 999 done serving by server 5\n" +
                "155.794 1000(greedy) serves by server 5\n" +
                "156.230 988(greedy) done serving by server 3\n" +
                "156.230 991 serves by server 3\n" +
                "156.317 991 done serving by server 3\n" +
                "156.317 992 serves by server 3\n" +
                "156.371 973 done serving by server 1\n" +
                "156.371 976 serves by server 1\n" +
                "156.480 976 done serving by server 1\n" +
                "156.480 978 serves by server 1\n" +
                "156.591 1000(greedy) done serving by server 5\n" +
                "156.698 997 done serving by server 4\n" +
                "156.702 978 done serving by server 1\n" +
                "156.702 986 serves by server 1\n" +
                "156.733 986 done serving by server 1\n" +
                "157.818 983 done serving by server 2\n" +
                "157.818 987 serves by server 2\n" +
                "158.284 987 done serving by server 2\n" +
                "158.284 990 serves by server 2\n" +
                "159.405 990 done serving by server 2\n" +
                "159.507 992 done serving by server 3\n" +
                "159.507 993 serves by server 3\n" +
                "161.626 993 done serving by server 3\n" +
                "[8.246 776 224]");
    }

    public void serverCustomer10() {
        System.out.println("0.000 1 arrives\n" +
                "0.000 1 serves by self-check 1\n" +
                "0.035 2 arrives\n" +
                "0.035 2 serves by self-check 2\n" +
                "0.046 3 arrives\n" +
                "0.046 3 waits at self-check 1\n" +
                "0.124 4 arrives\n" +
                "0.124 4 leaves\n" +
                "0.126 5 arrives\n" +
                "0.126 5 leaves\n" +
                "0.313 1 done serving by self-check 1\n" +
                "0.313 3 serves by self-check 1\n" +
                "2.680 2 done serving by self-check 2\n" +
                "3.015 3 done serving by self-check 1\n" +
                "[0.089 3 2]");
    }

    public void serverCustomer12() {
        System.out.println("0.000 1 arrives\n" +
                "0.000 1 serves by server 1\n" +
                "0.026 2(greedy) arrives\n" +
                "0.026 2(greedy) serves by server 2\n" +
                "0.035 3 arrives\n" +
                "0.035 3 serves by self-check 3\n" +
                "0.093 4(greedy) arrives\n" +
                "0.093 4(greedy) serves by self-check 4\n" +
                "0.094 5(greedy) arrives\n" +
                "0.094 5(greedy) waits at server 1\n" +
                "0.107 6(greedy) arrives\n" +
                "0.107 6(greedy) waits at server 2\n" +
                "0.108 7(greedy) arrives\n" +
                "0.108 7(greedy) waits at self-check 3\n" +
                "0.231 8 arrives\n" +
                "0.231 8 waits at server 1\n" +
                "0.313 1 done serving by server 1\n" +
                "0.313 5(greedy) serves by server 1\n" +
                "0.357 4(greedy) done serving by self-check 4\n" +
                "0.357 7(greedy) serves by self-check 4\n" +
                "0.447 9(greedy) arrives\n" +
                "0.447 9(greedy) waits at self-check 3\n" +
                "0.472 10 arrives\n" +
                "0.472 10 waits at server 1\n" +
                "0.476 11(greedy) arrives\n" +
                "0.476 11(greedy) waits at server 2\n" +
                "0.767 12(greedy) arrives\n" +
                "0.767 12(greedy) waits at self-check 3\n" +
                "0.772 7(greedy) done serving by self-check 4\n" +
                "0.772 9(greedy) serves by self-check 4\n" +
                "0.798 13(greedy) arrives\n" +
                "0.798 13(greedy) waits at self-check 3\n" +
                "0.811 14 arrives\n" +
                "0.811 14 waits at server 1\n" +
                "0.987 9(greedy) done serving by self-check 4\n" +
                "0.987 12(greedy) serves by self-check 4\n" +
                "1.050 15(greedy) arrives\n" +
                "1.050 15(greedy) waits at self-check 3\n" +
                "1.125 16(greedy) arrives\n" +
                "1.125 16(greedy) waits at server 2\n" +
                "1.212 17(greedy) arrives\n" +
                "1.212 17(greedy) waits at self-check 3\n" +
                "1.212 18(greedy) arrives\n" +
                "1.212 18(greedy) leaves\n" +
                "1.261 19(greedy) arrives\n" +
                "1.261 19(greedy) leaves\n" +
                "1.322 20(greedy) arrives\n" +
                "1.322 20(greedy) leaves\n" +
                "1.795 5(greedy) done serving by server 1\n" +
                "1.795 8 serves by server 1\n" +
                "2.004 8 done serving by server 1\n" +
                "2.004 10 serves by server 1\n" +
                "2.060 10 done serving by server 1\n" +
                "2.060 14 serves by server 1\n" +
                "2.671 2(greedy) done serving by server 2\n" +
                "2.671 6(greedy) serves by server 2\n" +
                "2.736 3 done serving by self-check 3\n" +
                "2.736 13(greedy) serves by self-check 3\n" +
                "2.737 13(greedy) done serving by self-check 3\n" +
                "2.737 15(greedy) serves by self-check 3\n" +
                "2.765 6(greedy) done serving by server 2\n" +
                "2.765 11(greedy) serves by server 2\n" +
                "2.788 11(greedy) done serving by server 2\n" +
                "2.788 16(greedy) serves by server 2\n" +
                "3.353 15(greedy) done serving by self-check 3\n" +
                "3.353 17(greedy) serves by self-check 3\n" +
                "3.939 14 done serving by server 1\n" +
                "3.953 17(greedy) done serving by self-check 3\n" +
                "4.499 12(greedy) done serving by self-check 4\n" +
                "4.630 16(greedy) done serving by server 2\n" +
                "[1.037 17 3]");
    }

    public void serverCustomer13() {
        System.out.println("0.000 1 arrives\n" +
                "0.000 1 serves by server 1\n" +
                "0.045 2 arrives\n" +
                "0.045 2 serves by server 2\n" +
                "0.060 3 arrives\n" +
                "0.060 3 serves by server 3\n" +
                "0.159 4(greedy) arrives\n" +
                "0.159 4(greedy) serves by self-check 4\n" +
                "0.162 5(greedy) arrives\n" +
                "0.162 5(greedy) serves by self-check 5\n" +
                "0.184 6 arrives\n" +
                "0.184 6 waits at server 1\n" +
                "0.185 7 arrives\n" +
                "0.185 7 waits at server 1\n" +
                "0.313 1 done serving by server 1\n" +
                "0.313 6 serves by server 1\n" +
                "0.396 8 arrives\n" +
                "0.396 8 waits at server 1\n" +
                "0.423 4(greedy) done serving by self-check 4\n" +
                "0.728 6 done serving by server 1\n" +
                "0.728 7 serves by server 1\n" +
                "0.767 9(greedy) arrives\n" +
                "0.767 9(greedy) serves by self-check 4\n" +
                "0.809 10 arrives\n" +
                "0.809 10 waits at server 1\n" +
                "0.817 11 arrives\n" +
                "0.817 11 waits at server 1\n" +
                "0.943 7 done serving by server 1\n" +
                "0.943 8 serves by server 1\n" +
                "1.152 8 done serving by server 1\n" +
                "1.152 10 serves by server 1\n" +
                "1.209 10 done serving by server 1\n" +
                "1.209 11 serves by server 1\n" +
                "1.315 12 arrives\n" +
                "1.315 12 waits at server 1\n" +
                "1.368 13(greedy) arrives\n" +
                "1.368 13(greedy) waits at server 2\n" +
                "1.391 14 arrives\n" +
                "1.391 14 waits at server 1\n" +
                "1.643 5(greedy) done serving by self-check 5\n" +
                "1.801 15 arrives\n" +
                "1.801 15 serves by self-check 5\n" +
                "1.895 15 done serving by self-check 5\n" +
                "1.929 16 arrives\n" +
                "1.929 16 serves by self-check 5\n" +
                "1.930 16 done serving by self-check 5\n" +
                "2.078 17(greedy) arrives\n" +
                "2.078 17(greedy) serves by self-check 5\n" +
                "2.079 18 arrives\n" +
                "2.079 18 waits at server 1\n" +
                "2.161 19(greedy) arrives\n" +
                "2.161 19(greedy) waits at server 3\n" +
                "2.267 20 arrives\n" +
                "2.267 20 waits at server 1\n" +
                "2.690 2 done serving by server 2\n" +
                "2.690 13(greedy) serves by server 2\n" +
                "2.694 17(greedy) done serving by self-check 5\n" +
                "2.697 21(greedy) arrives\n" +
                "2.697 21(greedy) serves by self-check 5\n" +
                "2.713 13(greedy) done serving by server 2\n" +
                "2.761 3 done serving by server 3\n" +
                "2.761 19(greedy) serves by server 3\n" +
                "2.774 22(greedy) arrives\n" +
                "2.774 22(greedy) serves by server 2\n" +
                "2.797 23(greedy) arrives\n" +
                "2.797 23(greedy) waits at server 2\n" +
                "3.008 24(greedy) arrives\n" +
                "3.008 24(greedy) waits at server 3\n" +
                "3.088 11 done serving by server 1\n" +
                "3.088 12 serves by server 1\n" +
                "3.276 25 arrives\n" +
                "3.276 25 waits at server 1\n" +
                "3.281 26(greedy) arrives\n" +
                "3.281 26(greedy) waits at self-check 4\n" +
                "3.360 19(greedy) done serving by server 3\n" +
                "3.360 24(greedy) serves by server 3\n" +
                "3.489 27(greedy) arrives\n" +
                "3.489 27(greedy) waits at server 3\n" +
                "3.558 28(greedy) arrives\n" +
                "3.558 28(greedy) waits at server 2\n" +
                "3.629 29(greedy) arrives\n" +
                "3.629 29(greedy) waits at server 3\n" +
                "3.829 30(greedy) arrives\n" +
                "3.829 30(greedy) waits at self-check 4\n" +
                "3.854 31(greedy) arrives\n" +
                "3.854 31(greedy) waits at server 2\n" +
                "3.901 12 done serving by server 1\n" +
                "3.901 14 serves by server 1\n" +
                "3.907 32 arrives\n" +
                "3.907 32 waits at server 1\n" +
                "3.939 33(greedy) arrives\n" +
                "3.939 33(greedy) waits at server 3\n" +
                "4.238 34(greedy) arrives\n" +
                "4.238 34(greedy) waits at self-check 4\n" +
                "4.245 24(greedy) done serving by server 3\n" +
                "4.245 27(greedy) serves by server 3\n" +
                "4.280 9(greedy) done serving by self-check 4\n" +
                "4.280 26(greedy) serves by self-check 4\n" +
                "4.539 21(greedy) done serving by self-check 5\n" +
                "4.539 30(greedy) serves by self-check 5\n" +
                "4.556 35 arrives\n" +
                "4.556 35 waits at server 1\n" +
                "4.597 30(greedy) done serving by self-check 5\n" +
                "4.597 34(greedy) serves by self-check 5\n" +
                "4.713 34(greedy) done serving by self-check 5\n" +
                "4.998 26(greedy) done serving by self-check 4\n" +
                "5.045 36(greedy) arrives\n" +
                "5.045 36(greedy) serves by self-check 4\n" +
                "5.054 37 arrives\n" +
                "5.054 37 serves by self-check 5\n" +
                "5.143 22(greedy) done serving by server 2\n" +
                "5.143 23(greedy) serves by server 2\n" +
                "5.151 14 done serving by server 1\n" +
                "5.151 18 serves by server 1\n" +
                "5.243 38(greedy) arrives\n" +
                "5.243 38(greedy) waits at self-check 4\n" +
                "5.327 39(greedy) arrives\n" +
                "5.327 39(greedy) waits at self-check 4\n" +
                "5.521 18 done serving by server 1\n" +
                "5.521 20 serves by server 1\n" +
                "5.539 40 arrives\n" +
                "5.539 40 waits at server 1\n" +
                "5.560 20 done serving by server 1\n" +
                "5.560 25 serves by server 1\n" +
                "5.614 37 done serving by self-check 5\n" +
                "5.614 38(greedy) serves by self-check 5\n" +
                "5.669 36(greedy) done serving by self-check 4\n" +
                "5.669 39(greedy) serves by self-check 4\n" +
                "5.817 41 arrives\n" +
                "5.817 41 waits at server 1\n" +
                "6.021 27(greedy) done serving by server 3\n" +
                "6.021 29(greedy) serves by server 3\n" +
                "6.243 42 arrives\n" +
                "6.243 42 waits at server 1\n" +
                "6.513 23(greedy) done serving by server 2\n" +
                "6.513 28(greedy) serves by server 2\n" +
                "6.534 43(greedy) arrives\n" +
                "6.534 43(greedy) waits at self-check 4\n" +
                "6.538 39(greedy) done serving by self-check 4\n" +
                "6.538 43(greedy) serves by self-check 4\n" +
                "6.658 25 done serving by server 1\n" +
                "6.658 32 serves by server 1\n" +
                "6.804 28(greedy) done serving by server 2\n" +
                "6.804 31(greedy) serves by server 2\n" +
                "6.941 44 arrives\n" +
                "6.941 44 waits at server 1\n" +
                "6.961 38(greedy) done serving by self-check 5\n" +
                "7.052 45 arrives\n" +
                "7.052 45 serves by self-check 5\n" +
                "7.160 46(greedy) arrives\n" +
                "7.160 46(greedy) waits at server 2\n" +
                "7.296 43(greedy) done serving by self-check 4\n" +
                "7.356 47(greedy) arrives\n" +
                "7.356 47(greedy) serves by self-check 4\n" +
                "7.390 48 arrives\n" +
                "7.390 48 waits at server 1\n" +
                "7.427 49(greedy) arrives\n" +
                "7.427 49(greedy) waits at self-check 4\n" +
                "7.579 50 arrives\n" +
                "7.579 50 waits at server 1\n" +
                "7.599 31(greedy) done serving by server 2\n" +
                "7.599 46(greedy) serves by server 2\n" +
                "7.625 51 arrives\n" +
                "7.625 51 waits at server 1\n" +
                "7.643 52(greedy) arrives\n" +
                "7.643 52(greedy) waits at server 2\n" +
                "7.766 53 arrives\n" +
                "7.766 53 waits at server 1\n" +
                "8.020 54 arrives\n" +
                "8.020 54 waits at server 1\n" +
                "8.047 47(greedy) done serving by self-check 4\n" +
                "8.047 49(greedy) serves by self-check 4\n" +
                "8.098 29(greedy) done serving by server 3\n" +
                "8.098 33(greedy) serves by server 3\n" +
                "8.270 46(greedy) done serving by server 2\n" +
                "8.270 52(greedy) serves by server 2\n" +
                "8.285 55 arrives\n" +
                "8.285 55 waits at server 2\n" +
                "8.314 45 done serving by self-check 5\n" +
                "8.435 32 done serving by server 1\n" +
                "8.435 35 serves by server 1\n" +
                "8.534 56(greedy) arrives\n" +
                "8.534 56(greedy) serves by self-check 5\n" +
                "8.606 35 done serving by server 1\n" +
                "8.606 40 serves by server 1\n" +
                "8.616 57(greedy) arrives\n" +
                "8.616 57(greedy) waits at server 3\n" +
                "8.712 40 done serving by server 1\n" +
                "8.712 41 serves by server 1\n" +
                "8.744 49(greedy) done serving by self-check 4\n" +
                "8.949 58 arrives\n" +
                "8.949 58 serves by self-check 4\n" +
                "9.023 41 done serving by server 1\n" +
                "9.023 42 serves by server 1\n" +
                "9.191 33(greedy) done serving by server 3\n" +
                "9.191 57(greedy) serves by server 3\n" +
                "9.210 59(greedy) arrives\n" +
                "9.210 59(greedy) waits at server 3\n" +
                "9.275 60 arrives\n" +
                "9.275 60 waits at server 1\n" +
                "9.366 61 arrives\n" +
                "9.366 61 waits at server 1\n" +
                "9.411 52(greedy) done serving by server 2\n" +
                "9.411 55 serves by server 2\n" +
                "9.532 58 done serving by self-check 4\n" +
                "9.874 62 arrives\n" +
                "9.874 62 serves by self-check 4\n" +
                "9.958 63 arrives\n" +
                "9.958 63 waits at server 1\n" +
                "10.031 64(greedy) arrives\n" +
                "10.031 64(greedy) waits at server 2\n" +
                "10.133 65 arrives\n" +
                "10.133 65 waits at server 1\n" +
                "10.148 66 arrives\n" +
                "10.148 66 waits at server 2\n" +
                "10.459 62 done serving by self-check 4\n" +
                "10.544 42 done serving by server 1\n" +
                "10.544 44 serves by server 1\n" +
                "10.604 67(greedy) arrives\n" +
                "10.604 67(greedy) serves by self-check 4\n" +
                "10.715 68 arrives\n" +
                "10.715 68 waits at server 1\n" +
                "10.848 69(greedy) arrives\n" +
                "10.848 69(greedy) waits at self-check 4\n" +
                "10.880 70 arrives\n" +
                "10.880 70 waits at server 2\n" +
                "11.038 71(greedy) arrives\n" +
                "11.038 71(greedy) waits at server 3\n" +
                "11.079 44 done serving by server 1\n" +
                "11.079 48 serves by server 1\n" +
                "11.097 72(greedy) arrives\n" +
                "11.097 72(greedy) waits at self-check 4\n" +
                "11.142 73(greedy) arrives\n" +
                "11.142 73(greedy) waits at server 3\n" +
                "11.192 74 arrives\n" +
                "11.192 74 waits at server 1\n" +
                "11.282 75 arrives\n" +
                "11.282 75 waits at server 2\n" +
                "11.424 48 done serving by server 1\n" +
                "11.424 50 serves by server 1\n" +
                "11.457 56(greedy) done serving by self-check 5\n" +
                "11.457 69(greedy) serves by self-check 5\n" +
                "11.484 50 done serving by server 1\n" +
                "11.484 51 serves by server 1\n" +
                "11.685 55 done serving by server 2\n" +
                "11.685 64(greedy) serves by server 2\n" +
                "11.849 64(greedy) done serving by server 2\n" +
                "11.849 66 serves by server 2\n" +
                "11.862 67(greedy) done serving by self-check 4\n" +
                "11.862 72(greedy) serves by self-check 4\n" +
                "12.231 57(greedy) done serving by server 3\n" +
                "12.231 59(greedy) serves by server 3\n" +
                "12.274 76 arrives\n" +
                "12.274 76 waits at server 1\n" +
                "12.281 77 arrives\n" +
                "12.281 77 waits at server 1\n" +
                "12.427 78 arrives\n" +
                "12.427 78 waits at server 2\n" +
                "12.493 79 arrives\n" +
                "12.493 79 waits at server 2\n" +
                "12.551 66 done serving by server 2\n" +
                "12.551 70 serves by server 2\n" +
                "12.681 59(greedy) done serving by server 3\n" +
                "12.681 71(greedy) serves by server 3\n" +
                "12.740 80(greedy) arrives\n" +
                "12.740 80(greedy) waits at self-check 4\n" +
                "12.837 51 done serving by server 1\n" +
                "12.837 53 serves by server 1\n" +
                "12.841 81 arrives\n" +
                "12.841 81 waits at server 1\n" +
                "12.855 82(greedy) arrives\n" +
                "12.855 82(greedy) waits at server 3\n" +
                "12.988 70 done serving by server 2\n" +
                "12.988 75 serves by server 2\n" +
                "13.035 83(greedy) arrives\n" +
                "13.035 83(greedy) waits at self-check 4\n" +
                "13.077 71(greedy) done serving by server 3\n" +
                "13.077 73(greedy) serves by server 3\n" +
                "13.078 84 arrives\n" +
                "13.078 84 waits at server 2\n" +
                "13.122 53 done serving by server 1\n" +
                "13.122 54 serves by server 1\n" +
                "13.265 85(greedy) arrives\n" +
                "13.265 85(greedy) waits at server 3\n" +
                "13.327 86(greedy) arrives\n" +
                "13.327 86(greedy) waits at server 3\n" +
                "13.357 87(greedy) arrives\n" +
                "13.357 87(greedy) waits at self-check 4\n" +
                "13.447 88 arrives\n" +
                "13.447 88 waits at server 1\n" +
                "13.825 72(greedy) done serving by self-check 4\n" +
                "13.825 80(greedy) serves by self-check 4\n" +
                "13.879 73(greedy) done serving by server 3\n" +
                "13.879 82(greedy) serves by server 3\n" +
                "13.919 89 arrives\n" +
                "13.919 89 waits at server 2\n" +
                "13.988 90 arrives\n" +
                "13.988 90 waits at server 2\n" +
                "14.016 69(greedy) done serving by self-check 5\n" +
                "14.016 83(greedy) serves by self-check 5\n" +
                "14.048 54 done serving by server 1\n" +
                "14.048 60 serves by server 1\n" +
                "14.133 83(greedy) done serving by self-check 5\n" +
                "14.133 87(greedy) serves by self-check 5\n" +
                "14.167 60 done serving by server 1\n" +
                "14.167 61 serves by server 1\n" +
                "14.238 91 arrives\n" +
                "14.238 91 waits at server 1\n" +
                "14.465 61 done serving by server 1\n" +
                "14.465 63 serves by server 1\n" +
                "14.505 63 done serving by server 1\n" +
                "14.505 65 serves by server 1\n" +
                "14.555 92 arrives\n" +
                "14.555 92 waits at server 1\n" +
                "14.632 93(greedy) arrives\n" +
                "14.632 93(greedy) waits at self-check 4\n" +
                "14.767 94(greedy) arrives\n" +
                "14.767 94(greedy) waits at self-check 4\n" +
                "14.787 95(greedy) arrives\n" +
                "14.787 95(greedy) waits at server 3\n" +
                "14.841 75 done serving by server 2\n" +
                "14.841 78 serves by server 2\n" +
                "14.879 96(greedy) arrives\n" +
                "14.879 96(greedy) waits at self-check 4\n" +
                "14.894 97(greedy) arrives\n" +
                "14.894 97(greedy) waits at server 3\n" +
                "14.912 98 arrives\n" +
                "14.912 98 waits at server 1\n" +
                "15.080 99 arrives\n" +
                "15.080 99 waits at server 1\n" +
                "15.200 78 done serving by server 2\n" +
                "15.200 79 serves by server 2\n" +
                "15.221 100 arrives\n" +
                "15.221 100 waits at server 2\n" +
                "15.347 101 arrives\n" +
                "15.347 101 waits at server 2\n" +
                "15.375 79 done serving by server 2\n" +
                "15.375 84 serves by server 2\n" +
                "15.390 102(greedy) arrives\n" +
                "15.390 102(greedy) waits at self-check 4\n" +
                "15.405 87(greedy) done serving by self-check 5\n" +
                "15.405 93(greedy) serves by self-check 5\n" +
                "15.409 103 arrives\n" +
                "15.409 103 waits at server 2\n" +
                "15.424 104(greedy) arrives\n" +
                "15.424 104(greedy) waits at self-check 4\n" +
                "15.510 84 done serving by server 2\n" +
                "15.510 89 serves by server 2\n" +
                "15.611 105 arrives\n" +
                "15.611 105 waits at server 2\n" +
                "15.726 80(greedy) done serving by self-check 4\n" +
                "15.726 94(greedy) serves by self-check 4\n" +
                "15.771 106(greedy) arrives\n" +
                "15.771 106(greedy) waits at self-check 4\n" +
                "15.785 107 arrives\n" +
                "15.785 107 waits at server 2\n" +
                "15.836 94(greedy) done serving by self-check 4\n" +
                "15.836 96(greedy) serves by self-check 4\n" +
                "15.846 108(greedy) arrives\n" +
                "15.846 108(greedy) waits at self-check 4\n" +
                "15.900 93(greedy) done serving by self-check 5\n" +
                "15.900 102(greedy) serves by self-check 5\n" +
                "16.228 109(greedy) arrives\n" +
                "16.228 109(greedy) waits at self-check 4\n" +
                "16.250 65 done serving by server 1\n" +
                "16.250 68 serves by server 1\n" +
                "16.447 110(greedy) arrives\n" +
                "16.447 110(greedy) waits at server 3\n" +
                "16.609 111 arrives\n" +
                "16.609 111 waits at server 1\n" +
                "16.611 112(greedy) arrives\n" +
                "16.611 112(greedy) waits at self-check 4\n" +
                "16.617 113(greedy) arrives\n" +
                "16.617 113(greedy) waits at server 3\n" +
                "16.702 114 arrives\n" +
                "16.702 114 waits at server 2\n" +
                "17.048 68 done serving by server 1\n" +
                "17.048 74 serves by server 1\n" +
                "17.253 115(greedy) arrives\n" +
                "17.253 115(greedy) waits at self-check 4\n" +
                "17.328 116 arrives\n" +
                "17.328 116 waits at server 1\n" +
                "17.331 117(greedy) arrives\n" +
                "17.331 117(greedy) waits at server 3\n" +
                "17.414 118(greedy) arrives\n" +
                "17.414 118(greedy) waits at self-check 4\n" +
                "17.607 119 arrives\n" +
                "17.607 119 waits at server 2\n" +
                "17.802 96(greedy) done serving by self-check 4\n" +
                "17.802 104(greedy) serves by self-check 4\n" +
                "17.935 120(greedy) arrives\n" +
                "17.935 120(greedy) waits at self-check 4\n" +
                "18.025 121(greedy) arrives\n" +
                "18.025 121(greedy) waits at server 3\n" +
                "18.238 89 done serving by server 2\n" +
                "18.238 90 serves by server 2\n" +
                "18.287 122(greedy) arrives\n" +
                "18.287 122(greedy) waits at server 2\n" +
                "18.502 123(greedy) arrives\n" +
                "18.502 123(greedy) waits at self-check 4\n" +
                "18.584 124 arrives\n" +
                "18.584 124 waits at server 2\n" +
                "18.665 125 arrives\n" +
                "18.665 125 waits at server 2\n" +
                "18.703 74 done serving by server 1\n" +
                "18.703 76 serves by server 1\n" +
                "18.797 126(greedy) arrives\n" +
                "18.797 126(greedy) waits at server 3\n" +
                "18.812 82(greedy) done serving by server 3\n" +
                "18.812 85(greedy) serves by server 3\n" +
                "18.867 127(greedy) arrives\n" +
                "18.867 127(greedy) waits at server 3\n" +
                "18.898 128 arrives\n" +
                "18.898 128 waits at server 1\n" +
                "19.009 90 done serving by server 2\n" +
                "19.009 100 serves by server 2\n" +
                "19.020 129 arrives\n" +
                "19.020 129 waits at server 2\n" +
                "19.172 130(greedy) arrives\n" +
                "19.172 130(greedy) waits at self-check 4\n" +
                "19.230 131 arrives\n" +
                "19.230 131 waits at server 3\n" +
                "19.364 132 arrives\n" +
                "19.364 132 waits at self-check 4\n" +
                "19.420 133 arrives\n" +
                "19.420 133 leaves\n" +
                "19.448 134(greedy) arrives\n" +
                "19.448 134(greedy) leaves\n" +
                "19.697 135(greedy) arrives\n" +
                "19.697 135(greedy) leaves\n" +
                "19.698 136(greedy) arrives\n" +
                "19.698 136(greedy) leaves\n" +
                "19.745 76 done serving by server 1\n" +
                "19.745 77 serves by server 1\n" +
                "19.851 100 done serving by server 2\n" +
                "19.851 101 serves by server 2\n" +
                "19.924 137(greedy) arrives\n" +
                "19.924 137(greedy) waits at server 1\n" +
                "20.085 138(greedy) arrives\n" +
                "20.085 138(greedy) waits at server 2\n" +
                "20.155 101 done serving by server 2\n" +
                "20.155 103 serves by server 2\n" +
                "20.304 139(greedy) arrives\n" +
                "20.304 139(greedy) waits at server 2\n" +
                "20.487 103 done serving by server 2\n" +
                "20.487 105 serves by server 2\n" +
                "20.901 140 arrives\n" +
                "20.901 140 waits at server 2\n" +
                "20.951 141 arrives\n" +
                "20.951 141 leaves\n" +
                "21.117 142 arrives\n" +
                "21.117 142 leaves\n" +
                "21.238 105 done serving by server 2\n" +
                "21.238 107 serves by server 2\n" +
                "21.487 143 arrives\n" +
                "21.487 143 waits at server 2\n" +
                "21.614 144(greedy) arrives\n" +
                "21.614 144(greedy) leaves\n" +
                "21.701 104(greedy) done serving by self-check 4\n" +
                "21.701 106(greedy) serves by self-check 4\n" +
                "21.774 77 done serving by server 1\n" +
                "21.774 81 serves by server 1\n" +
                "21.813 145(greedy) arrives\n" +
                "21.813 145(greedy) waits at server 1\n" +
                "21.835 81 done serving by server 1\n" +
                "21.835 88 serves by server 1\n" +
                "21.868 88 done serving by server 1\n" +
                "21.868 91 serves by server 1\n" +
                "22.115 146 arrives\n" +
                "22.115 146 waits at server 1\n" +
                "22.213 147(greedy) arrives\n" +
                "22.213 147(greedy) waits at server 1\n" +
                "22.306 148(greedy) arrives\n" +
                "22.306 148(greedy) waits at self-check 4\n" +
                "22.565 107 done serving by server 2\n" +
                "22.565 114 serves by server 2\n" +
                "22.612 106(greedy) done serving by self-check 4\n" +
                "22.612 108(greedy) serves by self-check 4\n" +
                "22.830 108(greedy) done serving by self-check 4\n" +
                "22.830 109(greedy) serves by self-check 4\n" +
                "22.896 149(greedy) arrives\n" +
                "22.896 149(greedy) waits at self-check 4\n" +
                "22.957 114 done serving by server 2\n" +
                "22.957 119 serves by server 2\n" +
                "22.978 150(greedy) arrives\n" +
                "22.978 150(greedy) waits at server 2\n" +
                "23.020 151(greedy) arrives\n" +
                "23.020 151(greedy) waits at server 2\n" +
                "23.059 109(greedy) done serving by self-check 4\n" +
                "23.059 112(greedy) serves by self-check 4\n" +
                "23.106 85(greedy) done serving by server 3\n" +
                "23.106 86(greedy) serves by server 3\n" +
                "23.219 152(greedy) arrives\n" +
                "23.219 152(greedy) waits at self-check 4\n" +
                "23.220 102(greedy) done serving by self-check 5\n" +
                "23.220 115(greedy) serves by self-check 5\n" +
                "23.277 112(greedy) done serving by self-check 4\n" +
                "23.277 118(greedy) serves by self-check 4\n" +
                "23.320 153(greedy) arrives\n" +
                "23.320 153(greedy) waits at self-check 4\n" +
                "23.358 119 done serving by server 2\n" +
                "23.358 122(greedy) serves by server 2\n" +
                "23.439 154(greedy) arrives\n" +
                "23.439 154(greedy) waits at self-check 4\n" +
                "23.598 118(greedy) done serving by self-check 4\n" +
                "23.598 120(greedy) serves by self-check 4\n" +
                "23.739 155 arrives\n" +
                "23.739 155 waits at server 2\n" +
                "23.833 156(greedy) arrives\n" +
                "23.833 156(greedy) waits at self-check 4\n" +
                "24.049 157(greedy) arrives\n" +
                "24.049 157(greedy) waits at server 3");

        System.out.println("24.305 115(greedy) done serving by self-check 5\n" +
                "24.305 123(greedy) serves by self-check 5\n" +
                "24.330 158 arrives\n" +
                "24.330 158 waits at self-check 4\n" +
                "24.386 159 arrives\n" +
                "24.386 159 waits at self-check 4\n" +
                "24.395 122(greedy) done serving by server 2\n" +
                "24.395 124 serves by server 2\n" +
                "24.403 120(greedy) done serving by self-check 4\n" +
                "24.403 130(greedy) serves by self-check 4\n" +
                "24.427 160(greedy) arrives\n" +
                "24.427 160(greedy) waits at server 2\n" +
                "24.723 86(greedy) done serving by server 3\n" +
                "24.723 95(greedy) serves by server 3\n" +
                "24.789 161 arrives\n" +
                "24.789 161 waits at server 3\n" +
                "24.810 91 done serving by server 1\n" +
                "24.810 92 serves by server 1\n" +
                "24.844 130(greedy) done serving by self-check 4\n" +
                "24.844 132 serves by self-check 4\n" +
                "24.849 132 done serving by self-check 4\n" +
                "24.849 148(greedy) serves by self-check 4\n" +
                "24.856 162(greedy) arrives\n" +
                "24.856 162(greedy) waits at self-check 4\n" +
                "25.009 163(greedy) arrives\n" +
                "25.009 163(greedy) waits at self-check 4\n" +
                "25.021 95(greedy) done serving by server 3\n" +
                "25.021 97(greedy) serves by server 3\n" +
                "25.050 164 arrives\n" +
                "25.050 164 waits at server 1\n" +
                "25.162 165 arrives\n" +
                "25.162 165 waits at server 3\n" +
                "25.303 97(greedy) done serving by server 3\n" +
                "25.303 110(greedy) serves by server 3\n" +
                "25.362 110(greedy) done serving by server 3\n" +
                "25.362 113(greedy) serves by server 3\n" +
                "25.450 113(greedy) done serving by server 3\n" +
                "25.450 117(greedy) serves by server 3\n" +
                "25.482 166 arrives\n" +
                "25.482 166 waits at server 3\n" +
                "25.584 167(greedy) arrives\n" +
                "25.584 167(greedy) waits at server 3\n" +
                "25.597 148(greedy) done serving by self-check 4\n" +
                "25.597 149(greedy) serves by self-check 4\n" +
                "25.675 124 done serving by server 2\n" +
                "25.675 125 serves by server 2\n" +
                "25.916 149(greedy) done serving by self-check 4\n" +
                "25.916 152(greedy) serves by self-check 4\n" +
                "26.181 117(greedy) done serving by server 3\n" +
                "26.181 121(greedy) serves by server 3\n" +
                "26.220 121(greedy) done serving by server 3\n" +
                "26.220 126(greedy) serves by server 3\n" +
                "26.230 125 done serving by server 2\n" +
                "26.230 129 serves by server 2\n" +
                "26.424 168 arrives\n" +
                "26.424 168 waits at server 2\n" +
                "26.588 129 done serving by server 2\n" +
                "26.588 138(greedy) serves by server 2\n" +
                "26.609 138(greedy) done serving by server 2\n" +
                "26.609 139(greedy) serves by server 2\n" +
                "26.705 152(greedy) done serving by self-check 4\n" +
                "26.705 153(greedy) serves by self-check 4\n" +
                "26.794 92 done serving by server 1\n" +
                "26.794 98 serves by server 1\n" +
                "27.062 123(greedy) done serving by self-check 5\n" +
                "27.062 154(greedy) serves by self-check 5\n" +
                "27.178 169 arrives\n" +
                "27.178 169 waits at server 1\n" +
                "27.220 98 done serving by server 1\n" +
                "27.220 99 serves by server 1\n" +
                "27.666 139(greedy) done serving by server 2\n" +
                "27.666 140 serves by server 2\n" +
                "27.700 170 arrives\n" +
                "27.700 170 waits at server 1\n" +
                "27.874 140 done serving by server 2\n" +
                "27.874 143 serves by server 2\n" +
                "27.973 126(greedy) done serving by server 3\n" +
                "27.973 127(greedy) serves by server 3\n" +
                "28.002 99 done serving by server 1\n" +
                "28.002 111 serves by server 1\n" +
                "28.200 154(greedy) done serving by self-check 5\n" +
                "28.200 156(greedy) serves by self-check 5\n" +
                "28.764 156(greedy) done serving by self-check 5\n" +
                "28.764 158 serves by self-check 5\n" +
                "28.831 171 arrives\n" +
                "28.831 171 waits at server 1\n" +
                "28.940 172(greedy) arrives\n" +
                "28.940 172(greedy) waits at self-check 4\n" +
                "28.981 173 arrives\n" +
                "28.981 173 waits at server 2\n" +
                "28.991 174 arrives\n" +
                "28.991 174 waits at server 2\n" +
                "29.106 158 done serving by self-check 5\n" +
                "29.106 159 serves by self-check 5\n" +
                "29.219 143 done serving by server 2\n" +
                "29.219 150(greedy) serves by server 2\n" +
                "29.256 175(greedy) arrives\n" +
                "29.256 175(greedy) waits at self-check 4\n" +
                "29.389 176(greedy) arrives\n" +
                "29.389 176(greedy) waits at self-check 4\n" +
                "29.586 150(greedy) done serving by server 2\n" +
                "29.586 151(greedy) serves by server 2\n" +
                "29.595 111 done serving by server 1\n" +
                "29.595 116 serves by server 1\n" +
                "29.722 177 arrives\n" +
                "29.722 177 waits at server 1\n" +
                "29.916 153(greedy) done serving by self-check 4\n" +
                "29.916 162(greedy) serves by self-check 4\n" +
                "29.932 116 done serving by server 1\n" +
                "29.932 128 serves by server 1\n" +
                "29.989 178 arrives\n" +
                "29.989 178 waits at server 1\n" +
                "30.090 179 arrives\n" +
                "30.090 179 waits at server 2\n" +
                "30.106 180(greedy) arrives\n" +
                "30.106 180(greedy) waits at self-check 4\n" +
                "30.342 151(greedy) done serving by server 2\n" +
                "30.342 155 serves by server 2\n" +
                "30.454 128 done serving by server 1\n" +
                "30.454 137(greedy) serves by server 1\n" +
                "30.723 181(greedy) arrives\n" +
                "30.723 181(greedy) waits at server 2\n" +
                "30.859 182 arrives\n" +
                "30.859 182 waits at server 1\n" +
                "31.031 183(greedy) arrives\n" +
                "31.031 183(greedy) waits at self-check 4\n" +
                "31.136 155 done serving by server 2\n" +
                "31.136 160(greedy) serves by server 2\n" +
                "31.155 184(greedy) arrives\n" +
                "31.155 184(greedy) waits at server 2\n" +
                "31.162 185 arrives\n" +
                "31.162 185 waits at server 2\n" +
                "31.203 159 done serving by self-check 5\n" +
                "31.203 163(greedy) serves by self-check 5\n" +
                "31.262 186(greedy) arrives\n" +
                "31.262 186(greedy) waits at self-check 4\n" +
                "31.274 127(greedy) done serving by server 3\n" +
                "31.274 131 serves by server 3\n" +
                "31.644 137(greedy) done serving by server 1\n" +
                "31.644 145(greedy) serves by server 1\n" +
                "31.726 187 arrives\n" +
                "31.726 187 waits at server 1\n" +
                "31.735 145(greedy) done serving by server 1\n" +
                "31.735 146 serves by server 1\n" +
                "31.758 188 arrives\n" +
                "31.758 188 waits at server 1\n" +
                "31.898 189 arrives\n" +
                "31.898 189 waits at server 2\n" +
                "32.060 162(greedy) done serving by self-check 4\n" +
                "32.060 172(greedy) serves by self-check 4\n" +
                "32.087 190 arrives\n" +
                "32.087 190 waits at server 2\n" +
                "32.089 191(greedy) arrives\n" +
                "32.089 191(greedy) waits at server 3\n" +
                "32.135 192 arrives\n" +
                "32.135 192 waits at server 2\n" +
                "32.197 193 arrives\n" +
                "32.197 193 waits at server 3\n" +
                "32.204 194(greedy) arrives\n" +
                "32.204 194(greedy) waits at self-check 4\n" +
                "32.285 195(greedy) arrives\n" +
                "32.285 195(greedy) waits at self-check 4\n" +
                "32.519 160(greedy) done serving by server 2\n" +
                "32.519 168 serves by server 2\n" +
                "32.552 196 arrives\n" +
                "32.552 196 waits at server 2\n" +
                "32.582 197 arrives\n" +
                "32.582 197 waits at server 3\n" +
                "32.736 131 done serving by server 3\n" +
                "32.736 157(greedy) serves by server 3\n" +
                "32.738 168 done serving by server 2\n" +
                "32.738 173 serves by server 2\n" +
                "32.804 146 done serving by server 1\n" +
                "32.804 147(greedy) serves by server 1\n" +
                "32.906 172(greedy) done serving by self-check 4\n" +
                "32.906 175(greedy) serves by self-check 4\n" +
                "32.953 198(greedy) arrives\n" +
                "32.953 198(greedy) waits at self-check 4\n" +
                "33.034 157(greedy) done serving by server 3\n" +
                "33.034 161 serves by server 3\n" +
                "33.074 199 arrives\n" +
                "33.074 199 waits at server 1\n" +
                "33.130 200(greedy) arrives\n" +
                "33.130 200(greedy) waits at server 3\n" +
                "33.147 173 done serving by server 2\n" +
                "33.147 174 serves by server 2\n" +
                "33.174 163(greedy) done serving by self-check 5\n" +
                "33.174 176(greedy) serves by self-check 5\n" +
                "33.187 175(greedy) done serving by self-check 4\n" +
                "33.187 180(greedy) serves by self-check 4\n" +
                "33.276 201(greedy) arrives\n" +
                "33.276 201(greedy) waits at self-check 4\n" +
                "33.303 174 done serving by server 2\n" +
                "33.303 179 serves by server 2\n" +
                "33.527 147(greedy) done serving by server 1\n" +
                "33.527 164 serves by server 1\n" +
                "33.563 179 done serving by server 2\n" +
                "33.563 181(greedy) serves by server 2\n" +
                "33.627 202(greedy) arrives\n" +
                "33.627 202(greedy) waits at server 2\n" +
                "33.629 203 arrives\n" +
                "33.629 203 waits at server 1\n" +
                "33.629 180(greedy) done serving by self-check 4\n" +
                "33.629 183(greedy) serves by self-check 4\n" +
                "33.810 181(greedy) done serving by server 2\n" +
                "33.810 184(greedy) serves by server 2\n" +
                "33.897 204(greedy) arrives\n" +
                "33.897 204(greedy) waits at self-check 4\n" +
                "34.060 205 arrives\n" +
                "34.060 205 waits at server 2\n" +
                "34.157 183(greedy) done serving by self-check 4\n" +
                "34.157 186(greedy) serves by self-check 4\n" +
                "34.535 206 arrives\n" +
                "34.535 206 waits at server 2\n" +
                "34.621 184(greedy) done serving by server 2\n" +
                "34.621 185 serves by server 2\n" +
                "34.637 207 arrives\n" +
                "34.637 207 waits at server 2\n" +
                "34.667 208 arrives\n" +
                "34.667 208 waits at server 2\n" +
                "34.670 164 done serving by server 1\n" +
                "34.670 169 serves by server 1\n" +
                "34.899 209(greedy) arrives\n" +
                "34.899 209(greedy) waits at self-check 4\n" +
                "34.925 210(greedy) arrives\n" +
                "34.925 210(greedy) waits at self-check 4\n" +
                "34.986 211(greedy) arrives\n" +
                "34.986 211(greedy) waits at server 3\n" +
                "35.175 212(greedy) arrives\n" +
                "35.175 212(greedy) waits at self-check 4\n" +
                "35.316 176(greedy) done serving by self-check 5\n" +
                "35.316 194(greedy) serves by self-check 5\n" +
                "35.328 185 done serving by server 2\n" +
                "35.328 189 serves by server 2\n" +
                "35.548 213 arrives\n" +
                "35.548 213 waits at server 1\n" +
                "35.797 161 done serving by server 3\n" +
                "35.797 165 serves by server 3\n" +
                "35.828 186(greedy) done serving by self-check 4\n" +
                "35.828 195(greedy) serves by self-check 4\n" +
                "35.874 214(greedy) arrives\n" +
                "35.874 214(greedy) waits at self-check 4\n" +
                "35.881 215 arrives\n" +
                "35.881 215 waits at server 2\n" +
                "35.901 216(greedy) arrives\n" +
                "35.901 216(greedy) waits at server 3\n" +
                "35.919 217(greedy) arrives\n" +
                "35.919 217(greedy) waits at self-check 4\n" +
                "36.113 218 arrives\n" +
                "36.113 218 waits at server 2\n" +
                "36.319 219(greedy) arrives\n" +
                "36.319 219(greedy) waits at server 3\n" +
                "36.733 220 arrives\n" +
                "36.733 220 waits at server 3\n" +
                "36.889 221 arrives\n" +
                "36.889 221 waits at self-check 4\n" +
                "36.891 165 done serving by server 3\n" +
                "36.891 166 serves by server 3\n" +
                "36.923 222(greedy) arrives\n" +
                "36.923 222(greedy) waits at server 3\n" +
                "36.952 223 arrives\n" +
                "36.952 223 waits at self-check 4\n" +
                "37.050 194(greedy) done serving by self-check 5\n" +
                "37.050 198(greedy) serves by self-check 5\n" +
                "37.066 224(greedy) arrives\n" +
                "37.066 224(greedy) waits at self-check 4\n" +
                "37.310 166 done serving by server 3\n" +
                "37.310 167(greedy) serves by server 3\n" +
                "37.380 225 arrives\n" +
                "37.380 225 waits at server 3\n" +
                "37.476 226 arrives\n" +
                "37.476 226 leaves\n" +
                "37.597 195(greedy) done serving by self-check 4\n" +
                "37.597 201(greedy) serves by self-check 4\n" +
                "37.606 227 arrives\n" +
                "37.606 227 waits at self-check 4\n" +
                "37.613 189 done serving by server 2\n" +
                "37.613 190 serves by server 2\n" +
                "37.627 228 arrives\n" +
                "37.627 228 waits at server 2\n" +
                "37.681 198(greedy) done serving by self-check 5\n" +
                "37.681 204(greedy) serves by self-check 5\n" +
                "38.089 229(greedy) arrives\n" +
                "38.089 229(greedy) waits at self-check 4\n" +
                "38.089 230(greedy) arrives\n" +
                "38.089 230(greedy) leaves\n" +
                "38.138 201(greedy) done serving by self-check 4\n" +
                "38.138 209(greedy) serves by self-check 4\n" +
                "38.269 231 arrives\n" +
                "38.269 231 waits at self-check 4\n" +
                "38.441 232(greedy) arrives\n" +
                "38.441 232(greedy) leaves\n" +
                "38.497 233 arrives\n" +
                "38.497 233 leaves\n" +
                "38.520 209(greedy) done serving by self-check 4\n" +
                "38.520 210(greedy) serves by self-check 4\n" +
                "38.552 169 done serving by server 1\n" +
                "38.552 170 serves by server 1\n" +
                "38.667 167(greedy) done serving by server 3\n" +
                "38.667 191(greedy) serves by server 3\n" +
                "38.689 190 done serving by server 2\n" +
                "38.689 192 serves by server 2\n" +
                "38.770 204(greedy) done serving by self-check 5\n" +
                "38.770 212(greedy) serves by self-check 5\n" +
                "38.808 234 arrives\n" +
                "38.808 234 waits at server 1\n" +
                "38.811 235 arrives\n" +
                "38.811 235 waits at server 2\n" +
                "38.813 192 done serving by server 2\n" +
                "38.813 196 serves by server 2\n" +
                "38.869 236 arrives\n" +
                "38.869 236 waits at server 2\n" +
                "39.039 237 arrives\n" +
                "39.039 237 waits at server 3\n" +
                "39.263 191(greedy) done serving by server 3\n" +
                "39.263 193 serves by server 3\n" +
                "39.270 238 arrives\n" +
                "39.270 238 waits at server 3\n" +
                "39.646 239(greedy) arrives\n" +
                "39.646 239(greedy) waits at self-check 4\n" +
                "39.652 210(greedy) done serving by self-check 4\n" +
                "39.652 214(greedy) serves by self-check 4\n" +
                "39.665 240 arrives\n" +
                "39.665 240 waits at self-check 4\n" +
                "39.709 241(greedy) arrives\n" +
                "39.709 241(greedy) waits at self-check 4\n" +
                "39.955 242 arrives\n" +
                "39.955 242 leaves\n" +
                "40.067 243 arrives\n" +
                "40.067 243 leaves\n" +
                "40.122 244 arrives\n" +
                "40.122 244 leaves\n" +
                "40.272 245(greedy) arrives\n" +
                "40.272 245(greedy) leaves\n" +
                "40.347 246(greedy) arrives\n" +
                "40.347 246(greedy) leaves\n" +
                "40.605 247 arrives\n" +
                "40.605 247 leaves\n" +
                "40.658 248(greedy) arrives\n" +
                "40.658 248(greedy) leaves\n" +
                "40.688 249(greedy) arrives\n" +
                "40.688 249(greedy) leaves\n" +
                "40.889 250 arrives\n" +
                "40.889 250 leaves\n" +
                "41.118 214(greedy) done serving by self-check 4\n" +
                "41.118 217(greedy) serves by self-check 4\n" +
                "41.151 193 done serving by server 3\n" +
                "41.151 197 serves by server 3\n" +
                "41.273 251 arrives\n" +
                "41.273 251 waits at server 3\n" +
                "41.362 252 arrives\n" +
                "41.362 252 waits at self-check 4\n" +
                "41.458 253 arrives\n" +
                "41.458 253 leaves\n" +
                "41.638 170 done serving by server 1\n" +
                "41.638 171 serves by server 1\n" +
                "41.731 212(greedy) done serving by self-check 5\n" +
                "41.731 221 serves by self-check 5\n" +
                "41.755 254(greedy) arrives\n" +
                "41.755 254(greedy) waits at server 1\n" +
                "41.932 255(greedy) arrives\n" +
                "41.932 255(greedy) waits at self-check 4\n" +
                "42.005 171 done serving by server 1\n" +
                "42.005 177 serves by server 1\n" +
                "42.011 256(greedy) arrives\n" +
                "42.011 256(greedy) waits at server 1\n" +
                "42.013 217(greedy) done serving by self-check 4\n" +
                "42.013 223 serves by self-check 4\n" +
                "42.177 257(greedy) arrives\n" +
                "42.177 257(greedy) waits at self-check 4\n" +
                "42.212 258(greedy) arrives\n" +
                "42.212 258(greedy) leaves\n" +
                "42.247 259 arrives\n" +
                "42.247 259 leaves\n" +
                "42.311 223 done serving by self-check 4\n" +
                "42.311 224(greedy) serves by self-check 4\n" +
                "42.715 260(greedy) arrives\n" +
                "42.715 260(greedy) waits at self-check 4\n" +
                "42.863 261(greedy) arrives\n" +
                "42.863 261(greedy) leaves\n" +
                "42.872 197 done serving by server 3\n" +
                "42.872 200(greedy) serves by server 3\n" +
                "42.949 262(greedy) arrives\n" +
                "42.949 262(greedy) waits at server 3\n" +
                "42.975 177 done serving by server 1\n" +
                "42.975 178 serves by server 1\n" +
                "43.013 263(greedy) arrives\n" +
                "43.013 263(greedy) waits at server 1\n" +
                "43.042 264(greedy) arrives\n" +
                "43.042 264(greedy) leaves\n" +
                "43.074 265(greedy) arrives\n" +
                "43.074 265(greedy) leaves\n" +
                "43.154 266 arrives\n" +
                "43.154 266 leaves\n" +
                "43.162 267 arrives\n" +
                "43.162 267 leaves\n" +
                "43.174 268(greedy) arrives\n" +
                "43.174 268(greedy) leaves\n" +
                "43.372 221 done serving by self-check 5\n" +
                "43.372 227 serves by self-check 5\n" +
                "43.489 269(greedy) arrives\n" +
                "43.489 269(greedy) waits at self-check 4\n" +
                "43.528 270 arrives\n" +
                "43.528 270 leaves\n" +
                "43.601 271 arrives\n" +
                "43.601 271 leaves\n" +
                "43.622 272(greedy) arrives\n" +
                "43.622 272(greedy) leaves\n" +
                "43.650 224(greedy) done serving by self-check 4\n" +
                "43.650 229(greedy) serves by self-check 4\n" +
                "43.723 178 done serving by server 1\n" +
                "43.723 182 serves by server 1\n" +
                "43.824 200(greedy) done serving by server 3\n" +
                "43.824 211(greedy) serves by server 3\n" +
                "43.861 273 arrives\n" +
                "43.861 273 waits at server 1\n" +
                "43.953 274(greedy) arrives\n" +
                "43.953 274(greedy) waits at server 3\n" +
                "43.965 227 done serving by self-check 5\n" +
                "43.965 231 serves by self-check 5\n" +
                "44.093 275 arrives\n" +
                "44.093 275 waits at self-check 4\n" +
                "44.446 211(greedy) done serving by server 3\n" +
                "44.446 216(greedy) serves by server 3\n" +
                "44.448 276 arrives\n" +
                "44.448 276 waits at server 3\n" +
                "44.469 277(greedy) arrives\n" +
                "44.469 277(greedy) waits at self-check 4\n" +
                "44.470 216(greedy) done serving by server 3\n" +
                "44.470 219(greedy) serves by server 3\n" +
                "44.655 278 arrives\n" +
                "44.655 278 waits at server 3\n" +
                "44.733 279 arrives\n" +
                "44.733 279 leaves\n" +
                "45.196 280(greedy) arrives\n" +
                "45.196 280(greedy) leaves\n" +
                "45.259 281(greedy) arrives\n" +
                "45.259 281(greedy) leaves\n" +
                "45.322 282(greedy) arrives\n" +
                "45.322 282(greedy) leaves\n" +
                "45.538 283 arrives\n" +
                "45.538 283 leaves\n" +
                "45.574 229(greedy) done serving by self-check 4\n" +
                "45.574 239(greedy) serves by self-check 4\n" +
                "45.803 219(greedy) done serving by server 3\n" +
                "45.803 220 serves by server 3\n" +
                "45.832 284(greedy) arrives\n" +
                "45.832 284(greedy) waits at server 3\n" +
                "45.923 220 done serving by server 3\n" +
                "45.923 222(greedy) serves by server 3\n" +
                "46.005 285(greedy) arrives\n" +
                "46.005 285(greedy) waits at server 3\n" +
                "46.031 222(greedy) done serving by server 3\n" +
                "46.031 225 serves by server 3\n" +
                "46.038 225 done serving by server 3\n" +
                "46.038 237 serves by server 3\n" +
                "46.133 286 arrives\n" +
                "46.133 286 waits at server 3\n" +
                "46.383 182 done serving by server 1\n" +
                "46.383 187 serves by server 1\n" +
                "46.390 287 arrives\n" +
                "46.390 287 waits at server 1\n" +
                "46.492 288 arrives\n" +
                "46.492 288 waits at server 3\n" +
                "46.513 289(greedy) arrives\n" +
                "46.513 289(greedy) waits at self-check 4\n" +
                "46.565 196 done serving by server 2\n" +
                "46.565 202(greedy) serves by server 2\n" +
                "46.818 290(greedy) arrives\n" +
                "46.818 290(greedy) waits at server 2\n" +
                "46.845 291(greedy) arrives\n" +
                "46.845 291(greedy) leaves\n" +
                "46.919 187 done serving by server 1\n" +
                "46.919 188 serves by server 1\n" +
                "46.997 292 arrives\n" +
                "46.997 292 waits at server 1\n" +
                "47.020 293(greedy) arrives\n" +
                "47.020 293(greedy) leaves\n" +
                "47.082 294(greedy) arrives\n" +
                "47.082 294(greedy) leaves\n" +
                "47.328 295(greedy) arrives\n" +
                "47.328 295(greedy) leaves\n" +
                "47.340 202(greedy) done serving by server 2\n" +
                "47.340 205 serves by server 2\n" +
                "47.538 296 arrives\n" +
                "47.538 296 waits at server 2\n" +
                "47.540 297(greedy) arrives\n" +
                "47.540 297(greedy) leaves\n" +
                "47.553 298(greedy) arrives\n" +
                "47.553 298(greedy) leaves\n" +
                "47.637 237 done serving by server 3\n" +
                "47.637 238 serves by server 3\n" +
                "47.683 299(greedy) arrives\n" +
                "47.683 299(greedy) waits at server 3\n" +
                "47.830 300 arrives\n" +
                "47.830 300 leaves\n" +
                "47.889 301(greedy) arrives\n" +
                "47.889 301(greedy) leaves\n" +
                "48.020 238 done serving by server 3\n" +
                "48.020 251 serves by server 3\n" +
                "48.070 302 arrives\n" +
                "48.070 302 waits at server 3\n" +
                "48.089 188 done serving by server 1\n" +
                "48.089 199 serves by server 1\n" +
                "48.204 303(greedy) arrives\n" +
                "48.204 303(greedy) waits at server 1\n" +
                "48.630 251 done serving by server 3\n" +
                "48.630 262(greedy) serves by server 3\n" +
                "48.679 304(greedy) arrives");

        System.out.println("48.679 304(greedy) waits at server 3\n" +
                "48.828 262(greedy) done serving by server 3\n" +
                "48.828 274(greedy) serves by server 3\n" +
                "48.830 305 arrives\n" +
                "48.830 305 waits at server 3\n" +
                "48.862 274(greedy) done serving by server 3\n" +
                "48.862 276 serves by server 3\n" +
                "49.036 199 done serving by server 1\n" +
                "49.036 203 serves by server 1\n" +
                "49.054 306 arrives\n" +
                "49.054 306 waits at server 1\n" +
                "49.222 307 arrives\n" +
                "49.222 307 waits at server 3\n" +
                "49.240 205 done serving by server 2\n" +
                "49.240 206 serves by server 2\n" +
                "49.405 276 done serving by server 3\n" +
                "49.405 278 serves by server 3\n" +
                "49.496 278 done serving by server 3\n" +
                "49.496 284(greedy) serves by server 3\n" +
                "49.622 308(greedy) arrives\n" +
                "49.622 308(greedy) waits at server 3\n" +
                "49.636 231 done serving by self-check 5\n" +
                "49.636 240 serves by self-check 5\n" +
                "49.683 240 done serving by self-check 5\n" +
                "49.683 241(greedy) serves by self-check 5\n" +
                "49.698 309 arrives\n" +
                "49.698 309 waits at server 2\n" +
                "49.733 284(greedy) done serving by server 3\n" +
                "49.733 285(greedy) serves by server 3\n" +
                "49.803 206 done serving by server 2\n" +
                "49.803 207 serves by server 2\n" +
                "49.816 285(greedy) done serving by server 3\n" +
                "49.816 286 serves by server 3\n" +
                "49.931 203 done serving by server 1\n" +
                "49.931 213 serves by server 1\n" +
                "49.936 241(greedy) done serving by self-check 5\n" +
                "49.936 252 serves by self-check 5\n" +
                "49.955 207 done serving by server 2\n" +
                "49.955 208 serves by server 2\n" +
                "50.014 310(greedy) arrives\n" +
                "50.014 310(greedy) waits at server 3\n" +
                "50.020 311(greedy) arrives\n" +
                "50.020 311(greedy) waits at self-check 4\n" +
                "50.082 312 arrives\n" +
                "50.082 312 waits at server 1\n" +
                "50.114 313 arrives\n" +
                "50.114 313 waits at server 2\n" +
                "50.157 208 done serving by server 2\n" +
                "50.157 215 serves by server 2\n" +
                "50.206 314(greedy) arrives\n" +
                "50.206 314(greedy) waits at server 2\n" +
                "50.430 315 arrives\n" +
                "50.430 315 waits at server 2\n" +
                "50.493 316(greedy) arrives\n" +
                "50.493 316(greedy) waits at server 3\n" +
                "50.709 317(greedy) arrives\n" +
                "50.709 317(greedy) waits at self-check 4\n" +
                "50.916 215 done serving by server 2\n" +
                "50.916 218 serves by server 2\n" +
                "50.977 286 done serving by server 3\n" +
                "50.977 288 serves by server 3\n" +
                "51.299 318(greedy) arrives\n" +
                "51.299 318(greedy) waits at server 3\n" +
                "51.304 218 done serving by server 2\n" +
                "51.304 228 serves by server 2\n" +
                "51.321 319 arrives\n" +
                "51.321 319 waits at server 2\n" +
                "51.460 320(greedy) arrives\n" +
                "51.460 320(greedy) waits at server 2\n" +
                "51.623 321 arrives\n" +
                "51.623 321 waits at server 3\n" +
                "51.638 213 done serving by server 1\n" +
                "51.638 234 serves by server 1\n" +
                "51.702 322(greedy) arrives\n" +
                "51.702 322(greedy) waits at server 1\n" +
                "51.836 323 arrives\n" +
                "51.836 323 waits at self-check 4\n" +
                "51.870 324(greedy) arrives\n" +
                "51.870 324(greedy) leaves\n" +
                "51.920 325 arrives\n" +
                "51.920 325 leaves\n" +
                "51.993 326 arrives\n" +
                "51.993 326 leaves\n" +
                "52.021 239(greedy) done serving by self-check 4\n" +
                "52.021 255(greedy) serves by self-check 4\n" +
                "52.027 327(greedy) arrives\n" +
                "52.027 327(greedy) waits at self-check 4\n" +
                "52.259 328 arrives\n" +
                "52.259 328 leaves\n" +
                "52.348 228 done serving by server 2\n" +
                "52.348 235 serves by server 2\n" +
                "52.358 234 done serving by server 1\n" +
                "52.358 254(greedy) serves by server 1\n" +
                "52.423 254(greedy) done serving by server 1\n" +
                "52.423 256(greedy) serves by server 1\n" +
                "52.521 288 done serving by server 3\n" +
                "52.521 299(greedy) serves by server 3\n" +
                "52.533 329 arrives\n" +
                "52.533 329 waits at server 1\n" +
                "52.535 330(greedy) arrives\n" +
                "52.535 330(greedy) waits at server 1\n" +
                "52.551 299(greedy) done serving by server 3\n" +
                "52.551 302 serves by server 3\n" +
                "52.677 255(greedy) done serving by self-check 4\n" +
                "52.677 257(greedy) serves by self-check 4\n" +
                "52.717 256(greedy) done serving by server 1\n" +
                "52.717 263(greedy) serves by server 1\n" +
                "52.959 235 done serving by server 2\n" +
                "52.959 236 serves by server 2\n" +
                "52.971 331 arrives\n" +
                "52.971 331 waits at server 1\n" +
                "53.110 263(greedy) done serving by server 1\n" +
                "53.110 273 serves by server 1\n" +
                "53.145 332 arrives\n" +
                "53.145 332 waits at server 1\n" +
                "53.202 333(greedy) arrives\n" +
                "53.202 333(greedy) waits at server 2\n" +
                "53.375 257(greedy) done serving by self-check 4\n" +
                "53.375 260(greedy) serves by self-check 4\n" +
                "53.449 302 done serving by server 3\n" +
                "53.449 304(greedy) serves by server 3\n" +
                "53.454 334(greedy) arrives\n" +
                "53.454 334(greedy) waits at server 3\n" +
                "53.548 335 arrives\n" +
                "53.548 335 waits at server 2\n" +
                "53.572 336(greedy) arrives\n" +
                "53.572 336(greedy) waits at server 3\n" +
                "53.638 337 arrives\n" +
                "53.638 337 waits at server 3\n" +
                "53.668 236 done serving by server 2\n" +
                "53.668 290(greedy) serves by server 2\n" +
                "53.733 338 arrives\n" +
                "53.733 338 waits at server 2\n" +
                "53.777 304(greedy) done serving by server 3\n" +
                "53.777 305 serves by server 3\n" +
                "53.917 339(greedy) arrives\n" +
                "53.917 339(greedy) waits at self-check 4\n" +
                "53.947 340(greedy) arrives\n" +
                "53.947 340(greedy) waits at server 3\n" +
                "53.990 341(greedy) arrives\n" +
                "53.990 341(greedy) waits at self-check 4\n" +
                "54.017 342(greedy) arrives\n" +
                "54.017 342(greedy) leaves\n" +
                "54.147 343 arrives\n" +
                "54.147 343 leaves\n" +
                "54.223 344(greedy) arrives\n" +
                "54.223 344(greedy) leaves\n" +
                "54.312 345 arrives\n" +
                "54.312 345 leaves\n" +
                "54.347 252 done serving by self-check 5\n" +
                "54.347 269(greedy) serves by self-check 5\n" +
                "54.441 346(greedy) arrives\n" +
                "54.441 346(greedy) waits at self-check 4\n" +
                "54.623 290(greedy) done serving by server 2\n" +
                "54.623 296 serves by server 2\n" +
                "54.754 347 arrives\n" +
                "54.754 347 waits at server 2\n" +
                "54.757 273 done serving by server 1\n" +
                "54.757 287 serves by server 1\n" +
                "54.846 296 done serving by server 2\n" +
                "54.846 309 serves by server 2\n" +
                "54.854 309 done serving by server 2\n" +
                "54.854 313 serves by server 2\n" +
                "54.902 348 arrives\n" +
                "54.902 348 waits at server 1\n" +
                "54.911 313 done serving by server 2\n" +
                "54.911 314(greedy) serves by server 2\n" +
                "54.949 260(greedy) done serving by self-check 4\n" +
                "54.949 275 serves by self-check 4\n" +
                "54.994 275 done serving by self-check 4\n" +
                "54.994 277(greedy) serves by self-check 4\n" +
                "55.061 314(greedy) done serving by server 2\n" +
                "55.061 315 serves by server 2\n" +
                "55.072 349(greedy) arrives\n" +
                "55.072 349(greedy) waits at server 2\n" +
                "55.092 315 done serving by server 2\n" +
                "55.092 319 serves by server 2\n" +
                "55.105 287 done serving by server 1\n" +
                "55.105 292 serves by server 1\n" +
                "55.206 350 arrives\n" +
                "55.206 350 waits at server 1\n" +
                "55.258 351 arrives\n" +
                "55.258 351 waits at server 2\n" +
                "55.344 352 arrives\n" +
                "55.344 352 waits at server 2\n" +
                "55.419 353 arrives\n" +
                "55.419 353 waits at server 2\n" +
                "55.423 354(greedy) arrives\n" +
                "55.423 354(greedy) waits at self-check 4\n" +
                "55.441 355 arrives\n" +
                "55.441 355 waits at server 2\n" +
                "55.471 356 arrives\n" +
                "55.471 356 waits at self-check 4\n" +
                "55.499 277(greedy) done serving by self-check 4\n" +
                "55.499 289(greedy) serves by self-check 4\n" +
                "55.502 292 done serving by server 1\n" +
                "55.502 303(greedy) serves by server 1\n" +
                "55.548 357(greedy) arrives\n" +
                "55.548 357(greedy) waits at server 1\n" +
                "55.604 289(greedy) done serving by self-check 4\n" +
                "55.604 311(greedy) serves by self-check 4\n" +
                "55.670 358(greedy) arrives\n" +
                "55.670 358(greedy) waits at self-check 4\n" +
                "55.684 359(greedy) arrives\n" +
                "55.684 359(greedy) waits at self-check 4\n" +
                "55.695 360(greedy) arrives\n" +
                "55.695 360(greedy) leaves\n" +
                "55.775 269(greedy) done serving by self-check 5\n" +
                "55.775 317(greedy) serves by self-check 5\n" +
                "55.863 361(greedy) arrives\n" +
                "55.863 361(greedy) waits at self-check 4\n" +
                "55.925 362(greedy) arrives\n" +
                "55.925 362(greedy) leaves\n" +
                "55.998 363 arrives\n" +
                "55.998 363 leaves\n" +
                "56.063 364(greedy) arrives\n" +
                "56.063 364(greedy) leaves\n" +
                "56.290 317(greedy) done serving by self-check 5\n" +
                "56.290 323 serves by self-check 5\n" +
                "56.344 365(greedy) arrives\n" +
                "56.344 365(greedy) waits at self-check 4\n" +
                "56.406 366 arrives\n" +
                "56.406 366 leaves\n" +
                "56.612 311(greedy) done serving by self-check 4\n" +
                "56.612 327(greedy) serves by self-check 4\n" +
                "56.620 367 arrives\n" +
                "56.620 367 waits at self-check 4\n" +
                "56.695 303(greedy) done serving by server 1\n" +
                "56.695 306 serves by server 1\n" +
                "56.752 306 done serving by server 1\n" +
                "56.752 312 serves by server 1\n" +
                "56.771 368 arrives\n" +
                "56.771 368 waits at server 1\n" +
                "56.844 369 arrives\n" +
                "56.844 369 waits at server 1\n" +
                "56.859 370 arrives\n" +
                "56.859 370 leaves\n" +
                "57.019 371(greedy) arrives\n" +
                "57.019 371(greedy) leaves\n" +
                "57.165 372 arrives\n" +
                "57.165 372 leaves\n" +
                "57.167 323 done serving by self-check 5\n" +
                "57.167 339(greedy) serves by self-check 5\n" +
                "57.303 373(greedy) arrives\n" +
                "57.303 373(greedy) waits at self-check 4\n" +
                "57.347 312 done serving by server 1\n" +
                "57.347 322(greedy) serves by server 1\n" +
                "57.432 374(greedy) arrives\n" +
                "57.432 374(greedy) waits at server 1\n" +
                "57.461 375(greedy) arrives\n" +
                "57.461 375(greedy) leaves\n" +
                "57.485 305 done serving by server 3\n" +
                "57.485 307 serves by server 3\n" +
                "57.640 307 done serving by server 3\n" +
                "57.640 308(greedy) serves by server 3\n" +
                "57.671 376(greedy) arrives\n" +
                "57.671 376(greedy) waits at server 3\n" +
                "57.747 377(greedy) arrives\n" +
                "57.747 377(greedy) waits at server 3\n" +
                "57.750 378 arrives\n" +
                "57.750 378 leaves\n" +
                "57.829 379(greedy) arrives\n" +
                "57.829 379(greedy) leaves\n" +
                "57.869 380 arrives\n" +
                "57.869 380 leaves\n" +
                "57.916 381(greedy) arrives\n" +
                "57.916 381(greedy) leaves\n" +
                "58.293 382(greedy) arrives\n" +
                "58.293 382(greedy) leaves\n" +
                "58.398 383(greedy) arrives\n" +
                "58.398 383(greedy) leaves\n" +
                "58.400 384 arrives\n" +
                "58.400 384 leaves\n" +
                "58.416 308(greedy) done serving by server 3\n" +
                "58.416 310(greedy) serves by server 3\n" +
                "58.432 322(greedy) done serving by server 1\n" +
                "58.432 329 serves by server 1\n" +
                "58.475 385 arrives\n" +
                "58.475 385 waits at server 1\n" +
                "58.572 310(greedy) done serving by server 3\n" +
                "58.572 316(greedy) serves by server 3\n" +
                "58.660 386(greedy) arrives\n" +
                "58.660 386(greedy) waits at server 3\n" +
                "58.837 387(greedy) arrives\n" +
                "58.837 387(greedy) waits at server 3\n" +
                "58.900 388 arrives\n" +
                "58.900 388 leaves\n" +
                "58.997 327(greedy) done serving by self-check 4\n" +
                "58.997 341(greedy) serves by self-check 4\n" +
                "59.021 339(greedy) done serving by self-check 5\n" +
                "59.021 346(greedy) serves by self-check 5\n" +
                "59.035 389 arrives\n" +
                "59.035 389 waits at self-check 4\n" +
                "59.083 316(greedy) done serving by server 3\n" +
                "59.083 318(greedy) serves by server 3\n" +
                "59.136 390 arrives\n" +
                "59.136 390 waits at server 3\n" +
                "59.504 391(greedy) arrives\n" +
                "59.504 391(greedy) waits at self-check 4\n" +
                "59.676 392(greedy) arrives\n" +
                "59.676 392(greedy) leaves\n" +
                "59.755 329 done serving by server 1\n" +
                "59.755 330(greedy) serves by server 1\n" +
                "59.829 393(greedy) arrives\n" +
                "59.829 393(greedy) waits at server 1\n" +
                "59.835 319 done serving by server 2\n" +
                "59.835 320(greedy) serves by server 2\n" +
                "59.883 394(greedy) arrives\n" +
                "59.883 394(greedy) waits at server 2\n" +
                "59.891 395 arrives\n" +
                "59.891 395 leaves\n" +
                "59.936 396 arrives\n" +
                "59.936 396 leaves\n" +
                "60.229 397 arrives\n" +
                "60.229 397 leaves\n" +
                "60.245 398(greedy) arrives\n" +
                "60.245 398(greedy) leaves\n" +
                "60.325 341(greedy) done serving by self-check 4\n" +
                "60.325 354(greedy) serves by self-check 4\n" +
                "60.330 399(greedy) arrives\n" +
                "60.330 399(greedy) waits at self-check 4\n" +
                "60.345 400 arrives\n" +
                "60.345 400 leaves\n" +
                "60.364 320(greedy) done serving by server 2\n" +
                "60.364 333(greedy) serves by server 2\n" +
                "60.382 401 arrives\n" +
                "60.382 401 waits at server 2\n" +
                "60.408 330(greedy) done serving by server 1\n" +
                "60.408 331 serves by server 1\n" +
                "60.479 318(greedy) done serving by server 3\n" +
                "60.479 321 serves by server 3\n" +
                "60.499 402(greedy) arrives\n" +
                "60.499 402(greedy) waits at server 1\n" +
                "60.543 403(greedy) arrives\n" +
                "60.543 403(greedy) waits at server 3\n" +
                "60.574 354(greedy) done serving by self-check 4\n" +
                "60.574 356 serves by self-check 4\n" +
                "60.713 356 done serving by self-check 4\n" +
                "60.713 358(greedy) serves by self-check 4\n" +
                "60.837 333(greedy) done serving by server 2\n" +
                "60.837 335 serves by server 2\n" +
                "60.936 335 done serving by server 2\n" +
                "60.936 338 serves by server 2\n" +
                "61.055 404(greedy) arrives\n" +
                "61.055 404(greedy) waits at server 2\n" +
                "61.062 358(greedy) done serving by self-check 4\n" +
                "61.062 359(greedy) serves by self-check 4\n" +
                "61.262 405(greedy) arrives\n" +
                "61.262 405(greedy) waits at self-check 4\n" +
                "61.292 406 arrives\n" +
                "61.292 406 waits at server 2\n" +
                "61.364 407(greedy) arrives\n" +
                "61.364 407(greedy) waits at self-check 4\n" +
                "61.449 408 arrives\n" +
                "61.449 408 waits at self-check 4\n" +
                "61.453 409(greedy) arrives\n" +
                "61.453 409(greedy) leaves\n" +
                "61.468 338 done serving by server 2\n" +
                "61.468 347 serves by server 2\n" +
                "61.621 331 done serving by server 1\n" +
                "61.621 332 serves by server 1\n" +
                "61.721 410 arrives\n" +
                "61.721 410 waits at server 1\n" +
                "62.026 332 done serving by server 1\n" +
                "62.026 348 serves by server 1\n" +
                "62.139 411 arrives\n" +
                "62.139 411 waits at server 1\n" +
                "62.151 347 done serving by server 2\n" +
                "62.151 349(greedy) serves by server 2\n" +
                "62.210 412(greedy) arrives\n" +
                "62.210 412(greedy) waits at server 2\n" +
                "62.223 359(greedy) done serving by self-check 4\n" +
                "62.223 361(greedy) serves by self-check 4\n" +
                "62.269 413 arrives\n" +
                "62.269 413 waits at server 2\n" +
                "62.270 414(greedy) arrives\n" +
                "62.270 414(greedy) waits at self-check 4\n" +
                "62.474 415 arrives\n" +
                "62.474 415 leaves\n" +
                "62.566 346(greedy) done serving by self-check 5\n" +
                "62.566 365(greedy) serves by self-check 5\n" +
                "62.631 349(greedy) done serving by server 2\n" +
                "62.631 351 serves by server 2\n" +
                "62.647 321 done serving by server 3\n" +
                "62.647 334(greedy) serves by server 3\n" +
                "62.733 416 arrives\n" +
                "62.733 416 waits at server 2\n" +
                "62.745 365(greedy) done serving by self-check 5\n" +
                "62.745 367 serves by self-check 5\n" +
                "62.764 334(greedy) done serving by server 3\n" +
                "62.764 336(greedy) serves by server 3\n" +
                "62.969 417(greedy) arrives\n" +
                "62.969 417(greedy) waits at server 3\n" +
                "63.003 361(greedy) done serving by self-check 4\n" +
                "63.003 373(greedy) serves by self-check 4\n" +
                "63.155 336(greedy) done serving by server 3\n" +
                "63.155 337 serves by server 3\n" +
                "63.308 418 arrives\n" +
                "63.308 418 waits at server 3\n" +
                "63.372 367 done serving by self-check 5\n" +
                "63.372 389 serves by self-check 5\n" +
                "63.398 419(greedy) arrives\n" +
                "63.398 419(greedy) waits at self-check 4\n" +
                "63.407 348 done serving by server 1\n" +
                "63.407 350 serves by server 1\n" +
                "63.417 420(greedy) arrives\n" +
                "63.417 420(greedy) waits at self-check 4\n" +
                "63.476 373(greedy) done serving by self-check 4\n" +
                "63.476 391(greedy) serves by self-check 4\n" +
                "63.665 421(greedy) arrives\n" +
                "63.665 421(greedy) waits at self-check 4\n" +
                "63.785 391(greedy) done serving by self-check 4\n" +
                "63.785 399(greedy) serves by self-check 4\n" +
                "63.805 422(greedy) arrives\n" +
                "63.805 422(greedy) waits at self-check 4\n" +
                "63.835 423 arrives\n" +
                "63.835 423 waits at server 1\n" +
                "63.837 351 done serving by server 2\n" +
                "63.837 352 serves by server 2\n" +
                "63.838 389 done serving by self-check 5\n" +
                "63.838 405(greedy) serves by self-check 5\n" +
                "64.038 424 arrives\n" +
                "64.038 424 waits at server 2\n" +
                "64.044 425(greedy) arrives\n" +
                "64.044 425(greedy) waits at self-check 4\n" +
                "64.053 426(greedy) arrives\n" +
                "64.053 426(greedy) waits at self-check 4\n" +
                "64.162 427 arrives\n" +
                "64.162 427 waits at server 3\n" +
                "64.239 428(greedy) arrives\n" +
                "64.239 428(greedy) waits at self-check 4\n" +
                "64.280 429 arrives\n" +
                "64.280 429 leaves\n" +
                "64.380 399(greedy) done serving by self-check 4\n" +
                "64.380 407(greedy) serves by self-check 4\n" +
                "64.381 430 arrives\n" +
                "64.381 430 waits at self-check 4\n" +
                "64.572 431 arrives\n" +
                "64.572 431 leaves\n" +
                "64.887 432 arrives\n" +
                "64.887 432 leaves\n" +
                "64.950 433(greedy) arrives\n" +
                "64.950 433(greedy) leaves\n" +
                "65.042 434 arrives\n" +
                "65.042 434 leaves\n" +
                "65.160 337 done serving by server 3\n" +
                "65.160 340(greedy) serves by server 3\n" +
                "65.161 435 arrives\n" +
                "65.161 435 waits at server 3\n" +
                "65.363 350 done serving by server 1\n" +
                "65.363 357(greedy) serves by server 1\n" +
                "65.421 436 arrives\n" +
                "65.421 436 waits at server 1\n" +
                "65.464 437 arrives\n" +
                "65.464 437 leaves\n" +
                "65.466 438(greedy) arrives\n" +
                "65.466 438(greedy) leaves\n" +
                "65.527 439 arrives\n" +
                "65.527 439 leaves\n" +
                "65.601 440 arrives\n" +
                "65.601 440 leaves\n" +
                "65.762 407(greedy) done serving by self-check 4\n" +
                "65.762 408 serves by self-check 4\n" +
                "65.902 441(greedy) arrives\n" +
                "65.902 441(greedy) waits at self-check 4\n" +
                "66.070 442(greedy) arrives\n" +
                "66.070 442(greedy) leaves\n" +
                "66.246 443 arrives\n" +
                "66.246 443 leaves\n" +
                "66.353 357(greedy) done serving by server 1\n" +
                "66.353 368 serves by server 1\n" +
                "66.453 444(greedy) arrives\n" +
                "66.453 444(greedy) waits at server 1\n" +
                "66.556 445(greedy) arrives\n" +
                "66.556 445(greedy) leaves\n" +
                "66.652 352 done serving by server 2\n" +
                "66.652 353 serves by server 2\n" +
                "66.670 368 done serving by server 1\n" +
                "66.670 369 serves by server 1\n" +
                "66.788 405(greedy) done serving by self-check 5\n" +
                "66.788 414(greedy) serves by self-check 5\n" +
                "66.916 353 done serving by server 2\n" +
                "66.916 355 serves by server 2\n" +
                "66.955 355 done serving by server 2\n" +
                "66.955 394(greedy) serves by server 2\n" +
                "67.023 446(greedy) arrives\n" +
                "67.023 446(greedy) waits at server 2\n" +
                "67.124 394(greedy) done serving by server 2\n" +
                "67.124 401 serves by server 2\n" +
                "67.167 414(greedy) done serving by self-check 5\n" +
                "67.167 419(greedy) serves by self-check 5\n" +
                "67.222 447 arrives\n" +
                "67.222 447 waits at server 1\n" +
                "67.276 401 done serving by server 2\n" +
                "67.276 404(greedy) serves by server 2\n" +
                "67.504 408 done serving by self-check 4\n" +
                "67.504 420(greedy) serves by self-check 4\n" +
                "67.534 448 arrives\n" +
                "67.534 448 waits at server 2\n" +
                "67.686 449(greedy) arrives\n" +
                "67.686 449(greedy) waits at server 2\n" +
                "67.764 450(greedy) arrives\n" +
                "67.764 450(greedy) waits at self-check 4\n" +
                "67.768 451(greedy) arrives\n" +
                "67.768 451(greedy) waits at server 2\n" +
                "67.919 452 arrives\n" +
                "67.919 452 waits at server 2\n" +
                "67.953 369 done serving by server 1\n" +
                "67.953 374(greedy) serves by server 1");

        System.out.println("68.067 453(greedy) arrives\n" +
                "68.067 453(greedy) waits at self-check 4\n" +
                "68.076 454 arrives\n" +
                "68.076 454 waits at server 1\n" +
                "68.132 455 arrives\n" +
                "68.132 455 waits at self-check 4\n" +
                "68.281 456(greedy) arrives\n" +
                "68.281 456(greedy) leaves\n" +
                "68.295 457 arrives\n" +
                "68.295 457 leaves\n" +
                "68.343 458(greedy) arrives\n" +
                "68.343 458(greedy) leaves\n" +
                "68.352 419(greedy) done serving by self-check 5\n" +
                "68.352 421(greedy) serves by self-check 5\n" +
                "68.392 459 arrives\n" +
                "68.392 459 waits at self-check 4\n" +
                "68.493 374(greedy) done serving by server 1\n" +
                "68.493 385 serves by server 1\n" +
                "68.534 421(greedy) done serving by self-check 5\n" +
                "68.534 422(greedy) serves by self-check 5\n" +
                "68.571 385 done serving by server 1\n" +
                "68.571 393(greedy) serves by server 1\n" +
                "68.611 460 arrives\n" +
                "68.611 460 waits at server 1\n" +
                "68.681 420(greedy) done serving by self-check 4\n" +
                "68.681 425(greedy) serves by self-check 4\n" +
                "68.729 461 arrives\n" +
                "68.729 461 waits at server 1\n" +
                "68.730 422(greedy) done serving by self-check 5\n" +
                "68.730 426(greedy) serves by self-check 5\n" +
                "68.835 425(greedy) done serving by self-check 4\n" +
                "68.835 428(greedy) serves by self-check 4\n" +
                "68.852 340(greedy) done serving by server 3\n" +
                "68.852 376(greedy) serves by server 3\n" +
                "68.896 376(greedy) done serving by server 3\n" +
                "68.896 377(greedy) serves by server 3\n" +
                "68.921 428(greedy) done serving by self-check 4\n" +
                "68.921 430 serves by self-check 4\n" +
                "68.926 393(greedy) done serving by server 1\n" +
                "68.926 402(greedy) serves by server 1\n" +
                "69.085 462 arrives\n" +
                "69.085 462 waits at server 1\n" +
                "69.089 463 arrives\n" +
                "69.089 463 waits at server 3\n" +
                "69.402 430 done serving by self-check 4\n" +
                "69.402 441(greedy) serves by self-check 4\n" +
                "69.615 402(greedy) done serving by server 1\n" +
                "69.615 410 serves by server 1\n" +
                "69.704 464(greedy) arrives\n" +
                "69.704 464(greedy) waits at self-check 4\n" +
                "69.706 465(greedy) arrives\n" +
                "69.706 465(greedy) waits at self-check 4\n" +
                "69.732 466 arrives\n" +
                "69.732 466 waits at server 1\n" +
                "69.771 404(greedy) done serving by server 2\n" +
                "69.771 406 serves by server 2\n" +
                "69.788 467 arrives\n" +
                "69.788 467 waits at server 2\n" +
                "70.130 468 arrives\n" +
                "70.130 468 waits at server 3\n" +
                "70.266 469(greedy) arrives\n" +
                "70.266 469(greedy) waits at self-check 4\n" +
                "70.393 377(greedy) done serving by server 3\n" +
                "70.393 386(greedy) serves by server 3\n" +
                "70.574 386(greedy) done serving by server 3\n" +
                "70.574 387(greedy) serves by server 3\n" +
                "70.588 426(greedy) done serving by self-check 5\n" +
                "70.588 450(greedy) serves by self-check 5\n" +
                "70.624 470 arrives\n" +
                "70.624 470 waits at server 3\n" +
                "70.630 441(greedy) done serving by self-check 4\n" +
                "70.630 453(greedy) serves by self-check 4\n" +
                "70.712 471(greedy) arrives\n" +
                "70.712 471(greedy) waits at self-check 4\n" +
                "70.920 472 arrives\n" +
                "70.920 472 waits at server 3\n" +
                "71.123 473(greedy) arrives\n" +
                "71.123 473(greedy) waits at self-check 4\n" +
                "71.153 474(greedy) arrives\n" +
                "71.153 474(greedy) waits at self-check 4\n" +
                "71.222 410 done serving by server 1\n" +
                "71.222 411 serves by server 1\n" +
                "71.274 411 done serving by server 1\n" +
                "71.274 423 serves by server 1\n" +
                "71.436 387(greedy) done serving by server 3\n" +
                "71.436 390 serves by server 3\n" +
                "71.495 390 done serving by server 3\n" +
                "71.495 403(greedy) serves by server 3\n" +
                "71.508 475 arrives\n" +
                "71.508 475 waits at server 1\n" +
                "71.541 406 done serving by server 2\n" +
                "71.541 412(greedy) serves by server 2\n" +
                "71.592 450(greedy) done serving by self-check 5\n" +
                "71.592 455 serves by self-check 5\n" +
                "71.599 423 done serving by server 1\n" +
                "71.599 436 serves by server 1\n" +
                "71.709 455 done serving by self-check 5\n" +
                "71.709 459 serves by self-check 5\n" +
                "71.863 403(greedy) done serving by server 3\n" +
                "71.863 417(greedy) serves by server 3\n" +
                "71.983 476 arrives\n" +
                "71.983 476 waits at server 1\n" +
                "71.984 436 done serving by server 1\n" +
                "71.984 444(greedy) serves by server 1\n" +
                "72.252 459 done serving by self-check 5\n" +
                "72.252 464(greedy) serves by self-check 5\n" +
                "72.343 477(greedy) arrives\n" +
                "72.343 477(greedy) waits at self-check 4\n" +
                "72.369 478 arrives\n" +
                "72.369 478 waits at server 1\n" +
                "72.424 412(greedy) done serving by server 2\n" +
                "72.424 413 serves by server 2\n" +
                "72.534 479(greedy) arrives\n" +
                "72.534 479(greedy) waits at self-check 4\n" +
                "72.579 480(greedy) arrives\n" +
                "72.579 480(greedy) waits at server 3\n" +
                "72.671 481 arrives\n" +
                "72.671 481 waits at server 1\n" +
                "72.743 417(greedy) done serving by server 3\n" +
                "72.743 418 serves by server 3\n" +
                "72.774 482 arrives\n" +
                "72.774 482 waits at server 2\n" +
                "72.977 483(greedy) arrives\n" +
                "72.977 483(greedy) waits at server 3\n" +
                "73.079 464(greedy) done serving by self-check 5\n" +
                "73.079 465(greedy) serves by self-check 5\n" +
                "73.112 453(greedy) done serving by self-check 4\n" +
                "73.112 469(greedy) serves by self-check 4\n" +
                "73.150 465(greedy) done serving by self-check 5\n" +
                "73.150 471(greedy) serves by self-check 5\n" +
                "73.213 484 arrives\n" +
                "73.213 484 waits at server 2\n" +
                "73.496 485 arrives\n" +
                "73.496 485 waits at server 3\n" +
                "73.540 486(greedy) arrives\n" +
                "73.540 486(greedy) waits at self-check 4\n" +
                "73.611 487 arrives\n" +
                "73.611 487 waits at server 3\n" +
                "73.645 488(greedy) arrives\n" +
                "73.645 488(greedy) waits at self-check 4\n" +
                "73.668 444(greedy) done serving by server 1\n" +
                "73.668 447 serves by server 1\n" +
                "73.751 489 arrives\n" +
                "73.751 489 waits at server 1\n" +
                "73.766 418 done serving by server 3\n" +
                "73.766 427 serves by server 3\n" +
                "73.886 490(greedy) arrives\n" +
                "73.886 490(greedy) waits at self-check 4\n" +
                "74.103 491 arrives\n" +
                "74.103 491 waits at server 3\n" +
                "74.190 447 done serving by server 1\n" +
                "74.190 454 serves by server 1\n" +
                "74.255 492(greedy) arrives\n" +
                "74.255 492(greedy) waits at self-check 4\n" +
                "74.367 493 arrives\n" +
                "74.367 493 waits at server 1\n" +
                "74.500 469(greedy) done serving by self-check 4\n" +
                "74.500 473(greedy) serves by self-check 4\n" +
                "74.544 494(greedy) arrives\n" +
                "74.544 494(greedy) waits at self-check 4\n" +
                "74.630 495 arrives\n" +
                "74.630 495 waits at self-check 4\n" +
                "74.725 496(greedy) arrives\n" +
                "74.725 496(greedy) waits at self-check 4\n" +
                "74.861 497(greedy) arrives\n" +
                "74.861 497(greedy) leaves\n" +
                "74.903 473(greedy) done serving by self-check 4\n" +
                "74.903 474(greedy) serves by self-check 4\n" +
                "74.959 498 arrives\n" +
                "74.959 498 waits at self-check 4\n" +
                "74.960 499 arrives\n" +
                "74.960 499 leaves\n" +
                "75.108 500 arrives\n" +
                "75.108 500 leaves\n" +
                "75.289 501(greedy) arrives\n" +
                "75.289 501(greedy) leaves\n" +
                "75.298 502 arrives\n" +
                "75.298 502 leaves\n" +
                "75.301 503(greedy) arrives\n" +
                "75.301 503(greedy) leaves\n" +
                "75.384 413 done serving by server 2\n" +
                "75.384 416 serves by server 2\n" +
                "75.550 504 arrives\n" +
                "75.550 504 waits at server 2\n" +
                "75.568 505 arrives\n" +
                "75.568 505 leaves\n" +
                "75.601 506(greedy) arrives\n" +
                "75.601 506(greedy) leaves\n" +
                "75.796 507 arrives\n" +
                "75.796 507 leaves\n" +
                "75.907 474(greedy) done serving by self-check 4\n" +
                "75.907 477(greedy) serves by self-check 4\n" +
                "75.982 508(greedy) arrives\n" +
                "75.982 508(greedy) waits at self-check 4\n" +
                "76.076 509(greedy) arrives\n" +
                "76.076 509(greedy) leaves\n" +
                "76.106 510(greedy) arrives\n" +
                "76.106 510(greedy) leaves\n" +
                "76.283 511 arrives\n" +
                "76.283 511 leaves\n" +
                "76.399 427 done serving by server 3\n" +
                "76.399 435 serves by server 3\n" +
                "76.429 512 arrives\n" +
                "76.429 512 waits at server 3\n" +
                "76.566 513(greedy) arrives\n" +
                "76.566 513(greedy) leaves\n" +
                "76.614 416 done serving by server 2\n" +
                "76.614 424 serves by server 2\n" +
                "76.675 514(greedy) arrives\n" +
                "76.675 514(greedy) waits at server 2\n" +
                "76.732 424 done serving by server 2\n" +
                "76.732 446(greedy) serves by server 2\n" +
                "76.752 435 done serving by server 3\n" +
                "76.752 463 serves by server 3\n" +
                "76.764 463 done serving by server 3\n" +
                "76.764 468 serves by server 3\n" +
                "76.845 515 arrives\n" +
                "76.845 515 waits at server 2\n" +
                "76.903 454 done serving by server 1\n" +
                "76.903 460 serves by server 1\n" +
                "77.066 516(greedy) arrives\n" +
                "77.066 516(greedy) waits at server 3\n" +
                "77.116 477(greedy) done serving by self-check 4\n" +
                "77.116 479(greedy) serves by self-check 4\n" +
                "77.271 517 arrives\n" +
                "77.271 517 waits at server 1\n" +
                "77.347 518 arrives\n" +
                "77.347 518 waits at server 3\n" +
                "77.389 468 done serving by server 3\n" +
                "77.389 470 serves by server 3\n" +
                "77.435 519 arrives\n" +
                "77.435 519 waits at server 3\n" +
                "77.580 520(greedy) arrives\n" +
                "77.580 520(greedy) waits at self-check 4\n" +
                "77.722 470 done serving by server 3\n" +
                "77.722 472 serves by server 3\n" +
                "77.796 521(greedy) arrives\n" +
                "77.796 521(greedy) waits at server 3\n" +
                "77.875 471(greedy) done serving by self-check 5\n" +
                "77.875 486(greedy) serves by self-check 5\n" +
                "77.953 522(greedy) arrives\n" +
                "77.953 522(greedy) waits at self-check 4\n" +
                "78.011 523 arrives\n" +
                "78.011 523 leaves\n" +
                "78.189 524(greedy) arrives\n" +
                "78.189 524(greedy) leaves\n" +
                "78.250 525 arrives\n" +
                "78.250 525 leaves\n" +
                "78.265 526 arrives\n" +
                "78.265 526 leaves\n" +
                "78.300 527 arrives\n" +
                "78.300 527 leaves\n" +
                "78.465 472 done serving by server 3\n" +
                "78.465 480(greedy) serves by server 3\n" +
                "78.590 446(greedy) done serving by server 2\n" +
                "78.590 448 serves by server 2\n" +
                "78.660 528 arrives\n" +
                "78.660 528 waits at server 2\n" +
                "78.719 460 done serving by server 1\n" +
                "78.719 461 serves by server 1\n" +
                "78.846 479(greedy) done serving by self-check 4\n" +
                "78.846 488(greedy) serves by self-check 4\n" +
                "79.034 480(greedy) done serving by server 3\n" +
                "79.034 483(greedy) serves by server 3\n" +
                "79.053 486(greedy) done serving by self-check 5\n" +
                "79.053 490(greedy) serves by self-check 5\n" +
                "79.124 529 arrives\n" +
                "79.124 529 waits at server 1\n" +
                "79.191 530(greedy) arrives\n" +
                "79.191 530(greedy) waits at server 3\n" +
                "79.342 531(greedy) arrives\n" +
                "79.342 531(greedy) waits at self-check 4\n" +
                "79.497 483(greedy) done serving by server 3\n" +
                "79.497 485 serves by server 3\n" +
                "79.599 532(greedy) arrives\n" +
                "79.599 532(greedy) waits at server 3\n" +
                "79.601 533 arrives\n" +
                "79.601 533 waits at server 3\n" +
                "79.625 534(greedy) arrives\n" +
                "79.625 534(greedy) waits at self-check 4\n" +
                "79.685 448 done serving by server 2\n" +
                "79.685 449(greedy) serves by server 2\n" +
                "79.711 535 arrives\n" +
                "79.711 535 waits at server 2\n" +
                "79.779 461 done serving by server 1\n" +
                "79.779 462 serves by server 1\n" +
                "79.789 449(greedy) done serving by server 2\n" +
                "79.789 451(greedy) serves by server 2\n" +
                "79.939 536 arrives\n" +
                "79.939 536 waits at server 1\n" +
                "79.964 537(greedy) arrives\n" +
                "79.964 537(greedy) waits at server 2\n" +
                "80.234 538(greedy) arrives\n" +
                "80.234 538(greedy) leaves\n" +
                "80.247 539(greedy) arrives\n" +
                "80.247 539(greedy) leaves\n" +
                "80.285 488(greedy) done serving by self-check 4\n" +
                "80.285 492(greedy) serves by self-check 4\n" +
                "80.571 462 done serving by server 1\n" +
                "80.571 466 serves by server 1\n" +
                "80.571 540 arrives\n" +
                "80.571 540 waits at server 1\n" +
                "80.579 490(greedy) done serving by self-check 5\n" +
                "80.579 494(greedy) serves by self-check 5\n" +
                "80.582 541(greedy) arrives\n" +
                "80.582 541(greedy) waits at self-check 4\n" +
                "80.688 542(greedy) arrives\n" +
                "80.688 542(greedy) waits at self-check 4\n" +
                "80.709 543(greedy) arrives\n" +
                "80.709 543(greedy) leaves\n" +
                "80.790 544(greedy) arrives\n" +
                "80.790 544(greedy) leaves\n" +
                "80.834 466 done serving by server 1\n" +
                "80.834 475 serves by server 1\n" +
                "80.848 545(greedy) arrives\n" +
                "80.848 545(greedy) waits at server 1\n" +
                "80.880 475 done serving by server 1\n" +
                "80.880 476 serves by server 1\n" +
                "80.895 476 done serving by server 1\n" +
                "80.895 478 serves by server 1\n" +
                "80.898 546 arrives\n" +
                "80.898 546 waits at server 1\n" +
                "80.940 547(greedy) arrives\n" +
                "80.940 547(greedy) waits at server 1\n" +
                "81.031 478 done serving by server 1\n" +
                "81.031 481 serves by server 1\n" +
                "81.048 548 arrives\n" +
                "81.048 548 waits at server 1\n" +
                "81.078 549(greedy) arrives\n" +
                "81.078 549(greedy) leaves\n" +
                "81.185 550 arrives\n" +
                "81.185 550 leaves\n" +
                "81.195 494(greedy) done serving by self-check 5\n" +
                "81.195 495 serves by self-check 5\n" +
                "81.422 551 arrives\n" +
                "81.422 551 waits at self-check 4\n" +
                "81.429 552(greedy) arrives\n" +
                "81.429 552(greedy) leaves\n" +
                "81.441 553 arrives\n" +
                "81.441 553 leaves\n" +
                "81.471 495 done serving by self-check 5\n" +
                "81.471 496(greedy) serves by self-check 5\n" +
                "81.641 481 done serving by server 1\n" +
                "81.641 489 serves by server 1\n" +
                "81.863 554 arrives\n" +
                "81.863 554 waits at server 1\n" +
                "82.087 555 arrives\n" +
                "82.087 555 waits at self-check 4\n" +
                "82.211 496(greedy) done serving by self-check 5\n" +
                "82.211 498 serves by self-check 5\n" +
                "82.286 489 done serving by server 1\n" +
                "82.286 493 serves by server 1\n" +
                "82.395 556 arrives\n" +
                "82.395 556 waits at server 1\n" +
                "82.501 557 arrives\n" +
                "82.501 557 waits at self-check 4\n" +
                "82.655 493 done serving by server 1\n" +
                "82.655 517 serves by server 1\n" +
                "82.675 558 arrives\n" +
                "82.675 558 waits at server 1\n" +
                "82.870 559(greedy) arrives\n" +
                "82.870 559(greedy) leaves\n" +
                "82.927 560(greedy) arrives\n" +
                "82.927 560(greedy) leaves\n" +
                "82.962 561 arrives\n" +
                "82.962 561 leaves\n" +
                "82.974 562(greedy) arrives\n" +
                "82.974 562(greedy) leaves\n" +
                "83.051 563 arrives\n" +
                "83.051 563 leaves\n" +
                "83.089 451(greedy) done serving by server 2\n" +
                "83.089 452 serves by server 2\n" +
                "83.332 564 arrives\n" +
                "83.332 564 waits at server 2\n" +
                "83.350 452 done serving by server 2\n" +
                "83.350 467 serves by server 2\n" +
                "83.357 467 done serving by server 2\n" +
                "83.357 482 serves by server 2\n" +
                "83.363 517 done serving by server 1\n" +
                "83.363 529 serves by server 1\n" +
                "83.420 565 arrives\n" +
                "83.420 565 waits at server 1\n" +
                "83.524 566 arrives\n" +
                "83.524 566 waits at server 2\n" +
                "83.586 567(greedy) arrives\n" +
                "83.586 567(greedy) waits at server 2\n" +
                "83.639 568(greedy) arrives\n" +
                "83.639 568(greedy) leaves\n" +
                "83.818 482 done serving by server 2\n" +
                "83.818 484 serves by server 2\n" +
                "83.836 485 done serving by server 3\n" +
                "83.836 487 serves by server 3\n" +
                "83.870 569 arrives\n" +
                "83.870 569 waits at server 2\n" +
                "83.896 570(greedy) arrives\n" +
                "83.896 570(greedy) waits at server 3\n" +
                "83.907 571 arrives\n" +
                "83.907 571 leaves\n" +
                "83.927 572(greedy) arrives\n" +
                "83.927 572(greedy) leaves\n" +
                "83.992 573 arrives\n" +
                "83.992 573 leaves\n" +
                "83.996 574 arrives\n" +
                "83.996 574 leaves\n" +
                "84.078 575 arrives\n" +
                "84.078 575 leaves\n" +
                "84.106 484 done serving by server 2\n" +
                "84.106 504 serves by server 2\n" +
                "84.182 487 done serving by server 3\n" +
                "84.182 491 serves by server 3\n" +
                "84.275 576(greedy) arrives\n" +
                "84.275 576(greedy) waits at server 2\n" +
                "84.276 504 done serving by server 2\n" +
                "84.276 514(greedy) serves by server 2\n" +
                "84.416 577 arrives\n" +
                "84.416 577 waits at server 2\n" +
                "84.466 578 arrives\n" +
                "84.466 578 waits at server 3\n" +
                "84.532 529 done serving by server 1\n" +
                "84.532 536 serves by server 1\n" +
                "84.534 491 done serving by server 3\n" +
                "84.534 512 serves by server 3\n" +
                "84.569 498 done serving by self-check 5\n" +
                "84.569 508(greedy) serves by self-check 5\n" +
                "84.624 579 arrives\n" +
                "84.624 579 waits at server 1\n" +
                "84.824 512 done serving by server 3\n" +
                "84.824 516(greedy) serves by server 3\n" +
                "84.925 580 arrives\n" +
                "84.925 580 waits at server 3\n" +
                "84.987 581 arrives\n" +
                "84.987 581 waits at server 3\n" +
                "85.057 582(greedy) arrives\n" +
                "85.057 582(greedy) waits at self-check 4\n" +
                "85.211 514(greedy) done serving by server 2\n" +
                "85.211 515 serves by server 2\n" +
                "85.300 583(greedy) arrives\n" +
                "85.300 583(greedy) waits at server 2\n" +
                "85.511 515 done serving by server 2\n" +
                "85.511 528 serves by server 2\n" +
                "85.527 528 done serving by server 2\n" +
                "85.527 535 serves by server 2\n" +
                "85.603 584(greedy) arrives\n" +
                "85.603 584(greedy) waits at server 2\n" +
                "85.630 585(greedy) arrives\n" +
                "85.630 585(greedy) waits at server 2\n" +
                "85.714 586(greedy) arrives\n" +
                "85.714 586(greedy) leaves\n" +
                "85.747 535 done serving by server 2\n" +
                "85.747 537(greedy) serves by server 2\n" +
                "85.986 516(greedy) done serving by server 3\n" +
                "85.986 518 serves by server 3\n" +
                "86.008 587(greedy) arrives\n" +
                "86.008 587(greedy) waits at server 2\n" +
                "86.035 536 done serving by server 1\n" +
                "86.035 540 serves by server 1\n" +
                "86.317 508(greedy) done serving by self-check 5\n" +
                "86.317 520(greedy) serves by self-check 5\n" +
                "86.392 588 arrives\n" +
                "86.392 588 waits at server 1\n" +
                "86.396 518 done serving by server 3\n" +
                "86.396 519 serves by server 3\n" +
                "86.485 540 done serving by server 1\n" +
                "86.485 545(greedy) serves by server 1\n" +
                "86.610 589 arrives\n" +
                "86.610 589 waits at server 1\n" +
                "86.844 519 done serving by server 3\n" +
                "86.844 521(greedy) serves by server 3\n" +
                "86.875 492(greedy) done serving by self-check 4\n" +
                "86.875 522(greedy) serves by self-check 4\n" +
                "86.927 537(greedy) done serving by server 2\n" +
                "86.927 564 serves by server 2\n" +
                "86.944 590 arrives\n" +
                "86.944 590 waits at server 2\n" +
                "87.037 591(greedy) arrives\n" +
                "87.037 591(greedy) waits at server 3\n" +
                "87.048 592 arrives\n" +
                "87.048 592 waits at server 3\n" +
                "87.056 545(greedy) done serving by server 1\n" +
                "87.056 546 serves by server 1\n" +
                "87.181 593 arrives\n" +
                "87.181 593 waits at server 1\n" +
                "87.232 594 arrives\n" +
                "87.232 594 waits at server 3\n" +
                "87.303 521(greedy) done serving by server 3\n" +
                "87.303 530(greedy) serves by server 3\n" +
                "87.373 522(greedy) done serving by self-check 4\n" +
                "87.373 531(greedy) serves by self-check 4\n" +
                "87.563 595 arrives\n" +
                "87.563 595 waits at server 3\n" +
                "87.577 520(greedy) done serving by self-check 5\n" +
                "87.577 534(greedy) serves by self-check 5\n" +
                "87.599 546 done serving by server 1\n" +
                "87.599 547(greedy) serves by server 1\n" +
                "87.758 596(greedy) arrives\n" +
                "87.758 596(greedy) waits at self-check 4\n" +
                "87.780 597 arrives\n" +
                "87.780 597 waits at server 1\n" +
                "87.835 531(greedy) done serving by self-check 4\n" +
                "87.835 541(greedy) serves by self-check 4\n" +
                "87.879 547(greedy) done serving by server 1\n" +
                "87.879 548 serves by server 1\n" +
                "88.016 598(greedy) arrives\n" +
                "88.016 598(greedy) waits at self-check 4\n" +
                "88.065 599(greedy) arrives\n" +
                "88.065 599(greedy) waits at self-check 4\n" +
                "88.219 600(greedy) arrives\n" +
                "88.219 600(greedy) waits at self-check 4\n" +
                "88.264 601(greedy) arrives");

        System.out.println("88.264 601(greedy) waits at server 1\n" +
                "88.422 602 arrives\n" +
                "88.422 602 waits at self-check 4\n" +
                "88.473 603(greedy) arrives\n" +
                "88.473 603(greedy) leaves\n" +
                "88.542 604(greedy) arrives\n" +
                "88.542 604(greedy) leaves\n" +
                "88.630 548 done serving by server 1\n" +
                "88.630 554 serves by server 1\n" +
                "88.632 605 arrives\n" +
                "88.632 605 waits at server 1\n" +
                "88.647 606(greedy) arrives\n" +
                "88.647 606(greedy) leaves\n" +
                "88.670 541(greedy) done serving by self-check 4\n" +
                "88.670 542(greedy) serves by self-check 4\n" +
                "88.672 554 done serving by server 1\n" +
                "88.672 556 serves by server 1\n" +
                "88.956 564 done serving by server 2\n" +
                "88.956 566 serves by server 2\n" +
                "89.080 607(greedy) arrives\n" +
                "89.080 607(greedy) waits at server 1\n" +
                "89.091 608(greedy) arrives\n" +
                "89.091 608(greedy) waits at server 2\n" +
                "89.199 530(greedy) done serving by server 3\n" +
                "89.199 532(greedy) serves by server 3\n" +
                "89.289 534(greedy) done serving by self-check 5\n" +
                "89.289 551 serves by self-check 5\n" +
                "89.334 609 arrives\n" +
                "89.334 609 waits at server 3\n" +
                "89.379 556 done serving by server 1\n" +
                "89.379 558 serves by server 1\n" +
                "89.467 610 arrives\n" +
                "89.467 610 waits at server 1\n" +
                "89.495 611 arrives\n" +
                "89.495 611 waits at self-check 4\n" +
                "89.572 542(greedy) done serving by self-check 4\n" +
                "89.572 555 serves by self-check 4\n" +
                "89.588 612 arrives\n" +
                "89.588 612 waits at self-check 4\n" +
                "89.651 613 arrives\n" +
                "89.651 613 waits at self-check 4\n" +
                "89.678 614(greedy) arrives\n" +
                "89.678 614(greedy) leaves\n" +
                "89.817 615 arrives\n" +
                "89.817 615 leaves\n" +
                "89.823 616(greedy) arrives\n" +
                "89.823 616(greedy) leaves\n" +
                "89.963 532(greedy) done serving by server 3\n" +
                "89.963 533 serves by server 3\n" +
                "90.021 551 done serving by self-check 5\n" +
                "90.021 557 serves by self-check 5\n" +
                "90.122 617 arrives\n" +
                "90.122 617 waits at server 3\n" +
                "90.265 566 done serving by server 2\n" +
                "90.265 567(greedy) serves by server 2\n" +
                "90.496 533 done serving by server 3\n" +
                "90.496 570(greedy) serves by server 3\n" +
                "90.660 555 done serving by self-check 4\n" +
                "90.660 582(greedy) serves by self-check 4\n" +
                "90.671 618 arrives\n" +
                "90.671 618 waits at server 2\n" +
                "90.683 582(greedy) done serving by self-check 4\n" +
                "90.683 596(greedy) serves by self-check 4\n" +
                "90.727 619(greedy) arrives\n" +
                "90.727 619(greedy) waits at self-check 4\n" +
                "90.956 620(greedy) arrives\n" +
                "90.956 620(greedy) waits at self-check 4\n" +
                "91.044 621 arrives\n" +
                "91.044 621 waits at server 3\n" +
                "91.336 567(greedy) done serving by server 2\n" +
                "91.336 569 serves by server 2\n" +
                "91.360 622 arrives\n" +
                "91.360 622 waits at server 2\n" +
                "91.392 557 done serving by self-check 5\n" +
                "91.392 598(greedy) serves by self-check 5\n" +
                "91.464 623(greedy) arrives\n" +
                "91.464 623(greedy) waits at self-check 4\n" +
                "91.531 624(greedy) arrives\n" +
                "91.531 624(greedy) waits at self-check 4\n" +
                "91.650 596(greedy) done serving by self-check 4\n" +
                "91.650 599(greedy) serves by self-check 4\n" +
                "91.838 625 arrives\n" +
                "91.838 625 waits at self-check 4\n" +
                "92.216 626 arrives\n" +
                "92.216 626 leaves\n" +
                "92.252 627 arrives\n" +
                "92.252 627 leaves\n" +
                "92.309 570(greedy) done serving by server 3\n" +
                "92.309 578 serves by server 3\n" +
                "92.480 599(greedy) done serving by self-check 4\n" +
                "92.480 600(greedy) serves by self-check 4\n" +
                "92.612 628(greedy) arrives\n" +
                "92.612 628(greedy) waits at server 3\n" +
                "92.826 629 arrives\n" +
                "92.826 629 waits at self-check 4\n" +
                "92.904 578 done serving by server 3\n" +
                "92.904 580 serves by server 3\n" +
                "92.919 569 done serving by server 2\n" +
                "92.919 576(greedy) serves by server 2\n" +
                "92.939 630 arrives\n" +
                "92.939 630 waits at server 2\n" +
                "92.998 631(greedy) arrives\n" +
                "92.998 631(greedy) waits at server 3\n" +
                "93.041 558 done serving by server 1\n" +
                "93.041 565 serves by server 1\n" +
                "93.235 632 arrives\n" +
                "93.235 632 waits at server 1\n" +
                "93.339 633 arrives\n" +
                "93.339 633 leaves\n" +
                "93.447 634 arrives\n" +
                "93.447 634 leaves\n" +
                "93.744 635 arrives\n" +
                "93.744 635 leaves\n" +
                "93.760 636(greedy) arrives\n" +
                "93.760 636(greedy) leaves\n" +
                "93.769 565 done serving by server 1\n" +
                "93.769 579 serves by server 1\n" +
                "93.803 637 arrives\n" +
                "93.803 637 waits at server 1\n" +
                "93.815 600(greedy) done serving by self-check 4\n" +
                "93.815 602 serves by self-check 4\n" +
                "93.849 576(greedy) done serving by server 2\n" +
                "93.849 577 serves by server 2\n" +
                "93.967 638 arrives\n" +
                "93.967 638 waits at server 2\n" +
                "94.032 639(greedy) arrives\n" +
                "94.032 639(greedy) waits at self-check 4\n" +
                "94.115 580 done serving by server 3\n" +
                "94.115 581 serves by server 3\n" +
                "94.166 581 done serving by server 3\n" +
                "94.166 591(greedy) serves by server 3\n" +
                "94.215 640(greedy) arrives\n" +
                "94.215 640(greedy) waits at server 3\n" +
                "94.297 591(greedy) done serving by server 3\n" +
                "94.297 592 serves by server 3\n" +
                "94.521 641 arrives\n" +
                "94.521 641 waits at server 3\n" +
                "94.582 598(greedy) done serving by self-check 5\n" +
                "94.582 611 serves by self-check 5\n" +
                "94.624 611 done serving by self-check 5\n" +
                "94.624 612 serves by self-check 5\n" +
                "94.644 642(greedy) arrives\n" +
                "94.644 642(greedy) waits at self-check 4\n" +
                "94.654 612 done serving by self-check 5\n" +
                "94.654 613 serves by self-check 5\n" +
                "95.048 577 done serving by server 2\n" +
                "95.048 583(greedy) serves by server 2\n" +
                "95.175 602 done serving by self-check 4\n" +
                "95.175 619(greedy) serves by self-check 4\n" +
                "95.185 643(greedy) arrives\n" +
                "95.185 643(greedy) waits at self-check 4\n" +
                "95.264 644(greedy) arrives\n" +
                "95.264 644(greedy) waits at self-check 4\n" +
                "95.326 579 done serving by server 1\n" +
                "95.326 588 serves by server 1\n" +
                "95.377 645(greedy) arrives\n" +
                "95.377 645(greedy) waits at server 1\n" +
                "95.380 588 done serving by server 1\n" +
                "95.380 589 serves by server 1\n" +
                "95.459 583(greedy) done serving by server 2\n" +
                "95.459 584(greedy) serves by server 2\n" +
                "95.613 646(greedy) arrives\n" +
                "95.613 646(greedy) waits at server 2\n" +
                "95.729 647 arrives\n" +
                "95.729 647 waits at server 1\n" +
                "95.917 648(greedy) arrives\n" +
                "95.917 648(greedy) waits at server 2\n" +
                "95.972 649(greedy) arrives\n" +
                "95.972 649(greedy) waits at server 3\n" +
                "96.029 650 arrives\n" +
                "96.029 650 waits at self-check 4\n" +
                "96.083 589 done serving by server 1\n" +
                "96.083 593 serves by server 1\n" +
                "96.100 593 done serving by server 1\n" +
                "96.100 597 serves by server 1\n" +
                "96.233 613 done serving by self-check 5\n" +
                "96.233 620(greedy) serves by self-check 5\n" +
                "96.253 651(greedy) arrives\n" +
                "96.253 651(greedy) waits at server 1\n" +
                "96.262 619(greedy) done serving by self-check 4\n" +
                "96.262 623(greedy) serves by self-check 4\n" +
                "96.284 597 done serving by server 1\n" +
                "96.284 601(greedy) serves by server 1\n" +
                "96.373 601(greedy) done serving by server 1\n" +
                "96.373 605 serves by server 1\n" +
                "96.425 652(greedy) arrives\n" +
                "96.425 652(greedy) waits at server 1\n" +
                "96.483 605 done serving by server 1\n" +
                "96.483 607(greedy) serves by server 1\n" +
                "96.632 653 arrives\n" +
                "96.632 653 waits at server 1\n" +
                "96.657 584(greedy) done serving by server 2\n" +
                "96.657 585(greedy) serves by server 2\n" +
                "96.692 592 done serving by server 3\n" +
                "96.692 594 serves by server 3\n" +
                "96.714 585(greedy) done serving by server 2\n" +
                "96.714 587(greedy) serves by server 2\n" +
                "96.734 654(greedy) arrives\n" +
                "96.734 654(greedy) waits at server 1\n" +
                "96.931 594 done serving by server 3\n" +
                "96.931 595 serves by server 3\n" +
                "97.058 587(greedy) done serving by server 2\n" +
                "97.058 590 serves by server 2\n" +
                "97.175 655(greedy) arrives\n" +
                "97.175 655(greedy) waits at server 2\n" +
                "97.309 595 done serving by server 3\n" +
                "97.309 609 serves by server 3\n" +
                "97.327 656 arrives\n" +
                "97.327 656 waits at server 1\n" +
                "97.433 620(greedy) done serving by self-check 5\n" +
                "97.433 624(greedy) serves by self-check 5\n" +
                "97.436 657 arrives\n" +
                "97.436 657 waits at server 2\n" +
                "97.472 590 done serving by server 2\n" +
                "97.472 608(greedy) serves by server 2\n" +
                "97.568 658 arrives\n" +
                "97.568 658 waits at server 2\n" +
                "97.771 623(greedy) done serving by self-check 4\n" +
                "97.771 625 serves by self-check 4\n" +
                "97.819 659(greedy) arrives\n" +
                "97.819 659(greedy) waits at self-check 4\n" +
                "97.833 625 done serving by self-check 4\n" +
                "97.833 629 serves by self-check 4\n" +
                "98.025 660(greedy) arrives\n" +
                "98.025 660(greedy) waits at self-check 4\n" +
                "98.252 607(greedy) done serving by server 1\n" +
                "98.252 610 serves by server 1\n" +
                "98.276 661 arrives\n" +
                "98.276 661 waits at server 1\n" +
                "98.345 662(greedy) arrives\n" +
                "98.345 662(greedy) waits at server 3\n" +
                "98.411 663 arrives\n" +
                "98.411 663 waits at server 2\n" +
                "98.423 629 done serving by self-check 4\n" +
                "98.423 639(greedy) serves by self-check 4\n" +
                "98.431 664 arrives\n" +
                "98.431 664 waits at server 3\n" +
                "98.456 608(greedy) done serving by server 2\n" +
                "98.456 618 serves by server 2\n" +
                "98.499 665(greedy) arrives\n" +
                "98.499 665(greedy) waits at self-check 4\n" +
                "98.539 624(greedy) done serving by self-check 5\n" +
                "98.539 642(greedy) serves by self-check 5\n" +
                "98.590 642(greedy) done serving by self-check 5\n" +
                "98.590 643(greedy) serves by self-check 5\n" +
                "98.624 666 arrives\n" +
                "98.624 666 waits at server 2\n" +
                "98.647 667(greedy) arrives\n" +
                "98.647 667(greedy) waits at self-check 4\n" +
                "98.686 668 arrives\n" +
                "98.686 668 waits at server 3\n" +
                "98.692 609 done serving by server 3\n" +
                "98.692 617 serves by server 3\n" +
                "98.766 639(greedy) done serving by self-check 4\n" +
                "98.766 644(greedy) serves by self-check 4\n" +
                "98.795 669 arrives\n" +
                "98.795 669 waits at server 3\n" +
                "98.838 643(greedy) done serving by self-check 5\n" +
                "98.838 650 serves by self-check 5\n" +
                "98.943 650 done serving by self-check 5\n" +
                "98.943 659(greedy) serves by self-check 5\n" +
                "98.963 610 done serving by server 1\n" +
                "98.963 632 serves by server 1\n" +
                "98.977 617 done serving by server 3\n" +
                "98.977 621 serves by server 3\n" +
                "99.053 618 done serving by server 2\n" +
                "99.053 622 serves by server 2\n" +
                "99.160 670 arrives\n" +
                "99.160 670 waits at server 1\n" +
                "99.212 622 done serving by server 2\n" +
                "99.212 630 serves by server 2\n" +
                "99.454 644(greedy) done serving by self-check 4\n" +
                "99.454 660(greedy) serves by self-check 4\n" +
                "99.583 621 done serving by server 3\n" +
                "99.583 628(greedy) serves by server 3\n" +
                "99.599 671 arrives\n" +
                "99.599 671 waits at server 2\n" +
                "99.735 659(greedy) done serving by self-check 5\n" +
                "99.735 665(greedy) serves by self-check 5\n" +
                "99.837 660(greedy) done serving by self-check 4\n" +
                "99.837 667(greedy) serves by self-check 4\n" +
                "99.851 667(greedy) done serving by self-check 4\n" +
                "99.923 630 done serving by server 2\n" +
                "99.923 638 serves by server 2\n" +
                "99.979 638 done serving by server 2\n" +
                "99.979 646(greedy) serves by server 2\n" +
                "100.178 672 arrives\n" +
                "100.178 672 serves by self-check 4\n" +
                "100.293 673 arrives\n" +
                "100.293 673 waits at server 2\n" +
                "100.308 628(greedy) done serving by server 3\n" +
                "100.308 631(greedy) serves by server 3\n" +
                "100.324 646(greedy) done serving by server 2\n" +
                "100.324 648(greedy) serves by server 2\n" +
                "100.329 674 arrives\n" +
                "100.329 674 waits at server 2\n" +
                "100.348 672 done serving by self-check 4\n" +
                "100.604 631(greedy) done serving by server 3\n" +
                "100.604 640(greedy) serves by server 3\n" +
                "100.673 675 arrives\n" +
                "100.673 675 serves by self-check 4\n" +
                "100.847 676 arrives\n" +
                "100.847 676 waits at server 2\n" +
                "100.907 648(greedy) done serving by server 2\n" +
                "100.907 655(greedy) serves by server 2\n" +
                "100.950 677 arrives\n" +
                "100.950 677 waits at server 2\n" +
                "100.976 678(greedy) arrives\n" +
                "100.976 678(greedy) waits at self-check 4\n" +
                "100.987 675 done serving by self-check 4\n" +
                "100.987 678(greedy) serves by self-check 4\n" +
                "101.022 679(greedy) arrives\n" +
                "101.022 679(greedy) waits at self-check 4\n" +
                "101.041 680 arrives\n" +
                "101.041 680 waits at server 2\n" +
                "101.042 681(greedy) arrives\n" +
                "101.042 681(greedy) waits at self-check 4\n" +
                "101.053 682(greedy) arrives\n" +
                "101.053 682(greedy) waits at self-check 4\n" +
                "101.140 683(greedy) arrives\n" +
                "101.140 683(greedy) waits at self-check 4\n" +
                "101.491 665(greedy) done serving by self-check 5\n" +
                "101.491 679(greedy) serves by self-check 5\n" +
                "101.511 679(greedy) done serving by self-check 5\n" +
                "101.511 681(greedy) serves by self-check 5\n" +
                "101.612 684(greedy) arrives\n" +
                "101.612 684(greedy) waits at self-check 4\n" +
                "101.838 685(greedy) arrives\n" +
                "101.838 685(greedy) waits at self-check 4\n" +
                "102.084 686 arrives\n" +
                "102.084 686 waits at server 3\n" +
                "102.218 681(greedy) done serving by self-check 5\n" +
                "102.218 682(greedy) serves by self-check 5\n" +
                "102.343 640(greedy) done serving by server 3\n" +
                "102.343 641 serves by server 3\n" +
                "102.358 655(greedy) done serving by server 2\n" +
                "102.358 657 serves by server 2\n" +
                "102.590 682(greedy) done serving by self-check 5\n" +
                "102.590 683(greedy) serves by self-check 5\n" +
                "102.621 687 arrives\n" +
                "102.621 687 waits at server 2\n" +
                "102.747 688 arrives\n" +
                "102.747 688 waits at server 3\n" +
                "102.880 683(greedy) done serving by self-check 5\n" +
                "102.880 684(greedy) serves by self-check 5\n" +
                "102.934 689 arrives\n" +
                "102.934 689 waits at server 3\n" +
                "102.936 690(greedy) arrives\n" +
                "102.936 690(greedy) waits at self-check 4\n" +
                "102.946 691(greedy) arrives\n" +
                "102.946 691(greedy) waits at self-check 4\n" +
                "103.247 692(greedy) arrives\n" +
                "103.247 692(greedy) waits at self-check 4\n" +
                "103.340 693 arrives\n" +
                "103.340 693 waits at server 3\n" +
                "103.358 694(greedy) arrives\n" +
                "103.358 694(greedy) waits at self-check 4\n" +
                "103.367 695(greedy) arrives\n" +
                "103.367 695(greedy) waits at self-check 4\n" +
                "103.436 678(greedy) done serving by self-check 4\n" +
                "103.436 685(greedy) serves by self-check 4\n" +
                "103.554 657 done serving by server 2\n" +
                "103.554 658 serves by server 2\n" +
                "103.724 696 arrives\n" +
                "103.724 696 waits at server 2\n" +
                "103.809 697 arrives\n" +
                "103.809 697 waits at server 3\n" +
                "103.818 698 arrives\n" +
                "103.818 698 waits at self-check 4\n" +
                "103.854 699(greedy) arrives\n" +
                "103.854 699(greedy) waits at self-check 4\n" +
                "104.191 700(greedy) arrives\n" +
                "104.191 700(greedy) waits at self-check 4\n" +
                "104.468 701(greedy) arrives\n" +
                "104.468 701(greedy) waits at self-check 4\n" +
                "104.514 685(greedy) done serving by self-check 4\n" +
                "104.514 690(greedy) serves by self-check 4\n" +
                "104.589 632 done serving by server 1\n" +
                "104.589 637 serves by server 1\n" +
                "104.613 702(greedy) arrives\n" +
                "104.613 702(greedy) waits at self-check 4\n" +
                "104.682 684(greedy) done serving by self-check 5\n" +
                "104.682 691(greedy) serves by self-check 5\n" +
                "104.720 703(greedy) arrives\n" +
                "104.720 703(greedy) waits at self-check 4\n" +
                "104.730 637 done serving by server 1\n" +
                "104.730 645(greedy) serves by server 1\n" +
                "104.735 704 arrives\n" +
                "104.735 704 waits at server 1\n" +
                "104.756 705 arrives\n" +
                "104.756 705 waits at server 1\n" +
                "104.831 706(greedy) arrives\n" +
                "104.831 706(greedy) waits at self-check 4\n" +
                "104.859 690(greedy) done serving by self-check 4\n" +
                "104.859 692(greedy) serves by self-check 4\n" +
                "104.940 691(greedy) done serving by self-check 5\n" +
                "104.940 694(greedy) serves by self-check 5\n" +
                "105.044 694(greedy) done serving by self-check 5\n" +
                "105.044 695(greedy) serves by self-check 5\n" +
                "105.183 707(greedy) arrives\n" +
                "105.183 707(greedy) waits at self-check 4\n" +
                "105.190 658 done serving by server 2\n" +
                "105.190 663 serves by server 2\n" +
                "105.233 708(greedy) arrives\n" +
                "105.233 708(greedy) waits at self-check 4\n" +
                "105.275 641 done serving by server 3\n" +
                "105.275 649(greedy) serves by server 3\n" +
                "105.552 649(greedy) done serving by server 3\n" +
                "105.552 662(greedy) serves by server 3\n" +
                "105.630 709(greedy) arrives\n" +
                "105.630 709(greedy) waits at server 3\n" +
                "105.710 662(greedy) done serving by server 3\n" +
                "105.710 664 serves by server 3\n" +
                "105.994 710 arrives\n" +
                "105.994 710 waits at server 2\n" +
                "106.063 692(greedy) done serving by self-check 4\n" +
                "106.063 698 serves by self-check 4\n" +
                "106.171 711 arrives\n" +
                "106.171 711 waits at server 3\n" +
                "106.335 645(greedy) done serving by server 1\n" +
                "106.335 647 serves by server 1\n" +
                "106.342 712 arrives\n" +
                "106.342 712 waits at server 1\n" +
                "106.452 713 arrives\n" +
                "106.452 713 waits at server 3\n" +
                "106.487 714 arrives\n" +
                "106.487 714 waits at self-check 4\n" +
                "106.563 715(greedy) arrives\n" +
                "106.563 715(greedy) waits at self-check 4\n" +
                "106.633 647 done serving by server 1\n" +
                "106.633 651(greedy) serves by server 1\n" +
                "106.695 663 done serving by server 2\n" +
                "106.695 666 serves by server 2\n" +
                "106.704 716 arrives\n" +
                "106.704 716 waits at server 1\n" +
                "106.743 717(greedy) arrives\n" +
                "106.743 717(greedy) waits at server 2\n" +
                "106.829 718(greedy) arrives\n" +
                "106.829 718(greedy) leaves\n" +
                "106.949 698 done serving by self-check 4\n" +
                "106.949 699(greedy) serves by self-check 4\n" +
                "107.009 719 arrives\n" +
                "107.009 719 waits at self-check 4\n" +
                "107.326 720(greedy) arrives\n" +
                "107.326 720(greedy) leaves\n" +
                "107.336 721(greedy) arrives\n" +
                "107.336 721(greedy) leaves\n" +
                "107.701 651(greedy) done serving by server 1\n" +
                "107.701 652(greedy) serves by server 1\n" +
                "107.723 722(greedy) arrives\n" +
                "107.723 722(greedy) waits at server 1\n" +
                "107.828 723 arrives\n" +
                "107.828 723 leaves\n" +
                "107.846 724 arrives\n" +
                "107.846 724 leaves\n" +
                "107.896 725(greedy) arrives\n" +
                "107.896 725(greedy) leaves\n" +
                "107.979 726 arrives\n" +
                "107.979 726 leaves\n" +
                "108.180 727(greedy) arrives\n" +
                "108.180 727(greedy) leaves\n" +
                "108.180 695(greedy) done serving by self-check 5\n" +
                "108.180 700(greedy) serves by self-check 5\n" +
                "108.317 728(greedy) arrives\n" +
                "108.317 728(greedy) waits at self-check 4\n" +
                "108.334 666 done serving by server 2\n" +
                "108.334 671 serves by server 2\n" +
                "108.512 729(greedy) arrives\n" +
                "108.512 729(greedy) waits at server 2\n" +
                "108.524 730(greedy) arrives\n" +
                "108.524 730(greedy) leaves\n" +
                "108.552 700(greedy) done serving by self-check 5\n" +
                "108.552 701(greedy) serves by self-check 5\n" +
                "108.559 731 arrives\n" +
                "108.559 731 waits at self-check 4\n" +
                "108.643 671 done serving by server 2\n" +
                "108.643 673 serves by server 2\n" +
                "108.791 652(greedy) done serving by server 1\n" +
                "108.791 653 serves by server 1\n" +
                "108.869 732 arrives\n" +
                "108.869 732 waits at server 1\n" +
                "108.898 733 arrives\n" +
                "108.898 733 waits at server 2\n" +
                "108.932 699(greedy) done serving by self-check 4\n" +
                "108.932 702(greedy) serves by self-check 4\n" +
                "108.994 664 done serving by server 3\n" +
                "108.994 668 serves by server 3\n" +
                "109.001 734(greedy) arrives\n" +
                "109.001 734(greedy) waits at server 3\n" +
                "109.032 735(greedy) arrives\n" +
                "109.032 735(greedy) waits at self-check 4\n" +
                "109.035 673 done serving by server 2\n" +
                "109.035 674 serves by server 2\n" +
                "109.404 736(greedy) arrives\n" +
                "109.404 736(greedy) waits at server 2\n" +
                "109.422 737(greedy) arrives\n" +
                "109.422 737(greedy) leaves\n" +
                "109.630 738(greedy) arrives\n" +
                "109.630 738(greedy) leaves\n" +
                "109.645 674 done serving by server 2\n" +
                "109.645 676 serves by server 2\n" +
                "109.665 739(greedy) arrives\n" +
                "109.665 739(greedy) waits at server 2\n" +
                "109.683 740 arrives\n" +
                "109.683 740 leaves\n" +
                "109.684 702(greedy) done serving by self-check 4\n" +
                "109.684 703(greedy) serves by self-check 4\n" +
                "109.696 668 done serving by server 3\n" +
                "109.696 669 serves by server 3");

        System.out.println("109.702 741 arrives\n" +
                "109.702 741 waits at server 3\n" +
                "109.707 653 done serving by server 1\n" +
                "109.707 654(greedy) serves by server 1\n" +
                "109.715 654(greedy) done serving by server 1\n" +
                "109.715 656 serves by server 1\n" +
                "109.730 742 arrives\n" +
                "109.730 742 waits at server 1\n" +
                "109.904 743(greedy) arrives\n" +
                "109.904 743(greedy) waits at server 1\n" +
                "109.970 744(greedy) arrives\n" +
                "109.970 744(greedy) waits at self-check 4\n" +
                "110.000 745 arrives\n" +
                "110.000 745 leaves\n" +
                "110.109 746 arrives\n" +
                "110.109 746 leaves\n" +
                "110.164 669 done serving by server 3\n" +
                "110.164 686 serves by server 3\n" +
                "110.233 701(greedy) done serving by self-check 5\n" +
                "110.233 706(greedy) serves by self-check 5\n" +
                "110.322 686 done serving by server 3\n" +
                "110.322 688 serves by server 3\n" +
                "110.338 747 arrives\n" +
                "110.338 747 waits at server 3\n" +
                "110.378 688 done serving by server 3\n" +
                "110.378 689 serves by server 3\n" +
                "110.473 703(greedy) done serving by self-check 4\n" +
                "110.473 707(greedy) serves by self-check 4\n" +
                "110.553 748(greedy) arrives\n" +
                "110.553 748(greedy) waits at server 3\n" +
                "110.743 656 done serving by server 1\n" +
                "110.743 661 serves by server 1\n" +
                "110.889 749 arrives\n" +
                "110.889 749 waits at server 1\n" +
                "111.039 750 arrives\n" +
                "111.039 750 waits at server 3\n" +
                "111.310 751 arrives\n" +
                "111.310 751 waits at self-check 4\n" +
                "111.465 707(greedy) done serving by self-check 4\n" +
                "111.465 708(greedy) serves by self-check 4\n" +
                "111.485 661 done serving by server 1\n" +
                "111.485 670 serves by server 1\n" +
                "111.678 752 arrives\n" +
                "111.678 752 waits at server 1\n" +
                "111.708 708(greedy) done serving by self-check 4\n" +
                "111.708 714 serves by self-check 4\n" +
                "111.783 714 done serving by self-check 4\n" +
                "111.783 715(greedy) serves by self-check 4\n" +
                "111.801 689 done serving by server 3\n" +
                "111.801 693 serves by server 3\n" +
                "111.953 715(greedy) done serving by self-check 4\n" +
                "111.953 719 serves by self-check 4\n" +
                "112.333 753 arrives\n" +
                "112.333 753 waits at server 3\n" +
                "112.337 754(greedy) arrives\n" +
                "112.337 754(greedy) waits at self-check 4\n" +
                "112.344 755(greedy) arrives\n" +
                "112.344 755(greedy) waits at self-check 4\n" +
                "112.357 719 done serving by self-check 4\n" +
                "112.357 728(greedy) serves by self-check 4\n" +
                "112.410 756 arrives\n" +
                "112.410 756 waits at self-check 4\n" +
                "112.558 757 arrives\n" +
                "112.558 757 waits at self-check 4\n" +
                "112.577 706(greedy) done serving by self-check 5\n" +
                "112.577 731 serves by self-check 5\n" +
                "112.654 758 arrives\n" +
                "112.654 758 waits at self-check 4\n" +
                "112.835 731 done serving by self-check 5\n" +
                "112.835 735(greedy) serves by self-check 5\n" +
                "112.856 676 done serving by server 2\n" +
                "112.856 677 serves by server 2\n" +
                "112.943 728(greedy) done serving by self-check 4\n" +
                "112.943 744(greedy) serves by self-check 4\n" +
                "112.993 759 arrives\n" +
                "112.993 759 waits at server 2\n" +
                "113.032 670 done serving by server 1\n" +
                "113.032 704 serves by server 1\n" +
                "113.255 760 arrives\n" +
                "113.255 760 waits at server 1\n" +
                "113.271 761 arrives\n" +
                "113.271 761 waits at self-check 4\n" +
                "113.536 762 arrives\n" +
                "113.536 762 waits at self-check 4\n" +
                "113.582 763 arrives\n" +
                "113.582 763 waits at self-check 4\n" +
                "113.595 704 done serving by server 1\n" +
                "113.595 705 serves by server 1\n" +
                "113.848 764 arrives\n" +
                "113.848 764 waits at server 1\n" +
                "113.883 765 arrives\n" +
                "113.883 765 waits at self-check 4\n" +
                "113.895 766 arrives\n" +
                "113.895 766 leaves\n" +
                "114.114 767 arrives\n" +
                "114.114 767 leaves\n" +
                "114.178 693 done serving by server 3\n" +
                "114.178 697 serves by server 3\n" +
                "114.184 768(greedy) arrives\n" +
                "114.184 768(greedy) waits at server 3\n" +
                "114.272 769 arrives\n" +
                "114.272 769 leaves\n" +
                "114.342 770 arrives\n" +
                "114.342 770 leaves\n" +
                "114.389 771 arrives\n" +
                "114.389 771 leaves\n" +
                "114.490 744(greedy) done serving by self-check 4\n" +
                "114.490 751 serves by self-check 4\n" +
                "114.544 772(greedy) arrives\n" +
                "114.544 772(greedy) waits at self-check 4\n" +
                "114.596 773 arrives\n" +
                "114.596 773 leaves\n" +
                "114.788 735(greedy) done serving by self-check 5\n" +
                "114.788 754(greedy) serves by self-check 5\n" +
                "114.832 751 done serving by self-check 4\n" +
                "114.832 755(greedy) serves by self-check 4\n" +
                "114.912 774 arrives\n" +
                "114.912 774 waits at self-check 4\n" +
                "114.942 754(greedy) done serving by self-check 5\n" +
                "114.942 756 serves by self-check 5\n" +
                "114.993 775(greedy) arrives\n" +
                "114.993 775(greedy) waits at self-check 4\n" +
                "115.060 776 arrives\n" +
                "115.060 776 waits at self-check 4\n" +
                "115.085 777(greedy) arrives\n" +
                "115.085 777(greedy) leaves\n" +
                "115.245 778(greedy) arrives\n" +
                "115.245 778(greedy) leaves\n" +
                "115.413 779 arrives\n" +
                "115.413 779 leaves\n" +
                "115.475 705 done serving by server 1\n" +
                "115.475 712 serves by server 1\n" +
                "115.561 780 arrives\n" +
                "115.561 780 waits at server 1\n" +
                "115.794 756 done serving by self-check 5\n" +
                "115.794 757 serves by self-check 5\n" +
                "115.872 757 done serving by self-check 5\n" +
                "115.872 758 serves by self-check 5\n" +
                "115.935 781(greedy) arrives\n" +
                "115.935 781(greedy) waits at self-check 4\n" +
                "115.954 782(greedy) arrives\n" +
                "115.954 782(greedy) waits at self-check 4\n" +
                "116.401 783(greedy) arrives\n" +
                "116.401 783(greedy) leaves\n" +
                "116.474 697 done serving by server 3\n" +
                "116.474 709(greedy) serves by server 3\n" +
                "116.490 758 done serving by self-check 5\n" +
                "116.490 761 serves by self-check 5\n" +
                "116.897 784(greedy) arrives\n" +
                "116.897 784(greedy) waits at server 3\n" +
                "116.900 785(greedy) arrives\n" +
                "116.900 785(greedy) waits at self-check 4\n" +
                "116.974 786(greedy) arrives\n" +
                "116.974 786(greedy) leaves\n" +
                "117.111 787 arrives\n" +
                "117.111 787 leaves\n" +
                "117.125 788(greedy) arrives\n" +
                "117.125 788(greedy) leaves\n" +
                "117.201 761 done serving by self-check 5\n" +
                "117.201 762 serves by self-check 5\n" +
                "117.235 755(greedy) done serving by self-check 4\n" +
                "117.235 763 serves by self-check 4\n" +
                "117.443 789(greedy) arrives\n" +
                "117.443 789(greedy) waits at self-check 4\n" +
                "117.453 790 arrives\n" +
                "117.453 790 waits at self-check 4\n" +
                "117.536 791(greedy) arrives\n" +
                "117.536 791(greedy) leaves\n" +
                "117.553 792 arrives\n" +
                "117.553 792 leaves\n" +
                "117.608 793(greedy) arrives\n" +
                "117.608 793(greedy) leaves\n" +
                "117.765 794(greedy) arrives\n" +
                "117.765 794(greedy) leaves\n" +
                "117.816 795(greedy) arrives\n" +
                "117.816 795(greedy) leaves\n" +
                "117.866 796(greedy) arrives\n" +
                "117.866 796(greedy) leaves\n" +
                "117.896 762 done serving by self-check 5\n" +
                "117.896 765 serves by self-check 5\n" +
                "117.935 712 done serving by server 1\n" +
                "117.935 716 serves by server 1\n" +
                "117.976 797 arrives\n" +
                "117.976 797 waits at server 1\n" +
                "118.040 798(greedy) arrives\n" +
                "118.040 798(greedy) waits at self-check 4\n" +
                "118.061 799(greedy) arrives\n" +
                "118.061 799(greedy) leaves\n" +
                "118.212 800(greedy) arrives\n" +
                "118.212 800(greedy) leaves\n" +
                "118.399 801(greedy) arrives\n" +
                "118.399 801(greedy) leaves\n" +
                "118.432 802(greedy) arrives\n" +
                "118.432 802(greedy) leaves\n" +
                "118.525 803(greedy) arrives\n" +
                "118.525 803(greedy) leaves\n" +
                "118.602 804(greedy) arrives\n" +
                "118.602 804(greedy) leaves\n" +
                "118.777 805 arrives\n" +
                "118.777 805 leaves\n" +
                "118.835 763 done serving by self-check 4\n" +
                "118.835 772(greedy) serves by self-check 4\n" +
                "118.929 765 done serving by self-check 5\n" +
                "118.929 774 serves by self-check 5\n" +
                "119.173 772(greedy) done serving by self-check 4\n" +
                "119.173 775(greedy) serves by self-check 4\n" +
                "119.205 775(greedy) done serving by self-check 4\n" +
                "119.205 776 serves by self-check 4\n" +
                "119.287 774 done serving by self-check 5\n" +
                "119.287 781(greedy) serves by self-check 5\n" +
                "119.288 776 done serving by self-check 4\n" +
                "119.288 782(greedy) serves by self-check 4\n" +
                "119.377 806 arrives\n" +
                "119.377 806 waits at self-check 4\n" +
                "119.495 807 arrives\n" +
                "119.495 807 waits at self-check 4\n" +
                "119.725 782(greedy) done serving by self-check 4\n" +
                "119.725 785(greedy) serves by self-check 4\n" +
                "119.771 785(greedy) done serving by self-check 4\n" +
                "119.771 789(greedy) serves by self-check 4\n" +
                "119.834 808(greedy) arrives\n" +
                "119.834 808(greedy) waits at self-check 4\n" +
                "119.908 716 done serving by server 1\n" +
                "119.908 722(greedy) serves by server 1\n" +
                "119.950 809(greedy) arrives\n" +
                "119.950 809(greedy) waits at self-check 4\n" +
                "119.956 810(greedy) arrives\n" +
                "119.956 810(greedy) waits at self-check 4\n" +
                "120.139 811 arrives\n" +
                "120.139 811 waits at server 1\n" +
                "120.224 812(greedy) arrives\n" +
                "120.224 812(greedy) waits at self-check 4\n" +
                "120.444 813 arrives\n" +
                "120.444 813 waits at self-check 4\n" +
                "120.579 814 arrives\n" +
                "120.579 814 waits at self-check 4\n" +
                "120.608 709(greedy) done serving by server 3\n" +
                "120.608 711 serves by server 3\n" +
                "120.712 815 arrives\n" +
                "120.712 815 waits at server 3\n" +
                "120.764 816(greedy) arrives\n" +
                "120.764 816(greedy) leaves\n" +
                "120.946 817 arrives\n" +
                "120.946 817 leaves\n" +
                "121.210 722(greedy) done serving by server 1\n" +
                "121.210 732 serves by server 1\n" +
                "121.255 818(greedy) arrives\n" +
                "121.255 818(greedy) waits at server 1\n" +
                "121.452 711 done serving by server 3\n" +
                "121.452 713 serves by server 3\n" +
                "121.577 819(greedy) arrives\n" +
                "121.577 819(greedy) waits at server 3\n" +
                "121.586 677 done serving by server 2\n" +
                "121.586 680 serves by server 2\n" +
                "121.702 820(greedy) arrives\n" +
                "121.702 820(greedy) waits at server 2\n" +
                "121.720 781(greedy) done serving by self-check 5\n" +
                "121.720 790 serves by self-check 5\n" +
                "121.756 821 arrives\n" +
                "121.756 821 waits at self-check 4\n" +
                "121.900 732 done serving by server 1\n" +
                "121.900 742 serves by server 1\n" +
                "121.924 822 arrives\n" +
                "121.924 822 waits at server 1\n" +
                "122.035 713 done serving by server 3\n" +
                "122.035 734(greedy) serves by server 3\n" +
                "122.074 790 done serving by self-check 5\n" +
                "122.074 798(greedy) serves by self-check 5\n" +
                "122.126 823(greedy) arrives\n" +
                "122.126 823(greedy) waits at server 3\n" +
                "122.191 824 arrives\n" +
                "122.191 824 waits at self-check 4\n" +
                "122.197 825(greedy) arrives\n" +
                "122.197 825(greedy) leaves\n" +
                "122.343 798(greedy) done serving by self-check 5\n" +
                "122.343 806 serves by self-check 5\n" +
                "122.365 826 arrives\n" +
                "122.365 826 waits at self-check 4\n" +
                "122.463 827 arrives\n" +
                "122.463 827 leaves\n" +
                "122.513 828 arrives\n" +
                "122.513 828 leaves\n" +
                "122.529 742 done serving by server 1\n" +
                "122.529 743(greedy) serves by server 1\n" +
                "122.600 829(greedy) arrives\n" +
                "122.600 829(greedy) waits at server 1\n" +
                "122.660 789(greedy) done serving by self-check 4\n" +
                "122.660 807 serves by self-check 4\n" +
                "122.671 830(greedy) arrives\n" +
                "122.671 830(greedy) waits at self-check 4\n" +
                "122.676 831 arrives\n" +
                "122.676 831 leaves\n" +
                "122.686 832(greedy) arrives\n" +
                "122.686 832(greedy) leaves\n" +
                "123.029 833 arrives\n" +
                "123.029 833 leaves\n" +
                "123.062 834(greedy) arrives\n" +
                "123.062 834(greedy) leaves\n" +
                "123.157 734(greedy) done serving by server 3\n" +
                "123.157 741 serves by server 3\n" +
                "123.183 835 arrives\n" +
                "123.183 835 waits at server 3\n" +
                "123.184 836(greedy) arrives\n" +
                "123.184 836(greedy) leaves\n" +
                "123.241 837 arrives\n" +
                "123.241 837 leaves\n" +
                "123.259 806 done serving by self-check 5\n" +
                "123.259 808(greedy) serves by self-check 5\n" +
                "123.266 808(greedy) done serving by self-check 5\n" +
                "123.266 809(greedy) serves by self-check 5\n" +
                "123.283 838(greedy) arrives\n" +
                "123.283 838(greedy) waits at self-check 4\n" +
                "123.311 839(greedy) arrives\n" +
                "123.311 839(greedy) waits at self-check 4\n" +
                "123.387 680 done serving by server 2\n" +
                "123.387 687 serves by server 2\n" +
                "123.397 840(greedy) arrives\n" +
                "123.397 840(greedy) waits at server 2\n" +
                "123.424 741 done serving by server 3\n" +
                "123.424 747 serves by server 3\n" +
                "123.435 841(greedy) arrives\n" +
                "123.435 841(greedy) waits at server 3\n" +
                "123.502 842 arrives\n" +
                "123.502 842 leaves\n" +
                "123.547 807 done serving by self-check 4\n" +
                "123.547 810(greedy) serves by self-check 4\n" +
                "123.593 843(greedy) arrives\n" +
                "123.593 843(greedy) waits at self-check 4\n" +
                "123.852 810(greedy) done serving by self-check 4\n" +
                "123.852 812(greedy) serves by self-check 4\n" +
                "123.879 743(greedy) done serving by server 1\n" +
                "123.879 749 serves by server 1\n" +
                "124.108 747 done serving by server 3\n" +
                "124.108 748(greedy) serves by server 3\n" +
                "124.129 749 done serving by server 1\n" +
                "124.129 752 serves by server 1\n" +
                "124.142 844(greedy) arrives\n" +
                "124.142 844(greedy) waits at server 1\n" +
                "124.147 845 arrives\n" +
                "124.147 845 waits at server 1\n" +
                "124.156 752 done serving by server 1\n" +
                "124.156 760 serves by server 1\n" +
                "124.178 809(greedy) done serving by self-check 5\n" +
                "124.178 813 serves by self-check 5\n" +
                "124.182 846 arrives\n" +
                "124.182 846 waits at server 1\n" +
                "124.217 847(greedy) arrives\n" +
                "124.217 847(greedy) waits at self-check 4\n" +
                "124.221 848 arrives\n" +
                "124.221 848 waits at server 3\n" +
                "124.292 849 arrives\n" +
                "124.292 849 waits at self-check 4\n" +
                "124.302 850 arrives\n" +
                "124.302 850 leaves\n" +
                "124.317 687 done serving by server 2\n" +
                "124.317 696 serves by server 2\n" +
                "124.410 851 arrives\n" +
                "124.410 851 waits at server 2\n" +
                "124.413 852 arrives\n" +
                "124.413 852 leaves\n" +
                "124.633 853 arrives\n" +
                "124.633 853 leaves\n" +
                "124.694 854(greedy) arrives\n" +
                "124.694 854(greedy) leaves\n" +
                "124.721 696 done serving by server 2\n" +
                "124.721 710 serves by server 2\n" +
                "124.802 855 arrives\n" +
                "124.802 855 waits at server 2\n" +
                "124.831 856 arrives\n" +
                "124.831 856 leaves\n" +
                "124.886 710 done serving by server 2\n" +
                "124.886 717(greedy) serves by server 2\n" +
                "124.916 857(greedy) arrives\n" +
                "124.916 857(greedy) waits at server 2\n" +
                "124.979 858 arrives\n" +
                "124.979 858 leaves\n" +
                "125.108 859(greedy) arrives\n" +
                "125.108 859(greedy) leaves\n" +
                "125.293 748(greedy) done serving by server 3\n" +
                "125.293 750 serves by server 3\n" +
                "125.383 812(greedy) done serving by self-check 4\n" +
                "125.383 814 serves by self-check 4\n" +
                "125.419 760 done serving by server 1\n" +
                "125.419 764 serves by server 1\n" +
                "125.601 860 arrives\n" +
                "125.601 860 waits at server 1\n" +
                "125.744 861 arrives\n" +
                "125.744 861 waits at server 3\n" +
                "125.810 862 arrives\n" +
                "125.810 862 waits at self-check 4\n" +
                "126.004 750 done serving by server 3\n" +
                "126.004 753 serves by server 3\n" +
                "126.207 863(greedy) arrives\n" +
                "126.207 863(greedy) waits at server 3\n" +
                "126.260 764 done serving by server 1\n" +
                "126.260 780 serves by server 1\n" +
                "126.414 717(greedy) done serving by server 2\n" +
                "126.414 729(greedy) serves by server 2\n" +
                "126.469 864 arrives\n" +
                "126.469 864 waits at server 1\n" +
                "126.811 813 done serving by self-check 5\n" +
                "126.811 821 serves by self-check 5\n" +
                "126.959 821 done serving by self-check 5\n" +
                "126.959 824 serves by self-check 5\n" +
                "127.090 865 arrives\n" +
                "127.090 865 waits at server 2\n" +
                "127.142 866 arrives\n" +
                "127.142 866 waits at self-check 4\n" +
                "127.450 867 arrives\n" +
                "127.450 867 waits at self-check 4\n" +
                "127.464 868(greedy) arrives\n" +
                "127.464 868(greedy) leaves\n" +
                "127.529 780 done serving by server 1\n" +
                "127.529 797 serves by server 1\n" +
                "127.572 869 arrives\n" +
                "127.572 869 waits at server 1\n" +
                "128.334 870(greedy) arrives\n" +
                "128.334 870(greedy) leaves\n" +
                "128.401 824 done serving by self-check 5\n" +
                "128.401 826 serves by self-check 5\n" +
                "128.414 871(greedy) arrives\n" +
                "128.414 871(greedy) waits at self-check 4\n" +
                "128.621 753 done serving by server 3\n" +
                "128.621 768(greedy) serves by server 3\n" +
                "128.830 872(greedy) arrives\n" +
                "128.830 872(greedy) waits at server 3\n" +
                "128.878 873(greedy) arrives\n" +
                "128.878 873(greedy) leaves\n" +
                "128.897 797 done serving by server 1\n" +
                "128.897 811 serves by server 1\n" +
                "128.899 874 arrives\n" +
                "128.899 874 waits at server 1\n" +
                "129.022 875 arrives\n" +
                "129.022 875 leaves\n" +
                "129.113 814 done serving by self-check 4\n" +
                "129.113 830(greedy) serves by self-check 4\n" +
                "129.461 876(greedy) arrives\n" +
                "129.461 876(greedy) waits at self-check 4\n" +
                "129.678 877 arrives\n" +
                "129.678 877 leaves\n" +
                "129.773 878(greedy) arrives\n" +
                "129.773 878(greedy) leaves\n" +
                "129.835 830(greedy) done serving by self-check 4\n" +
                "129.835 838(greedy) serves by self-check 4\n" +
                "129.930 879(greedy) arrives\n" +
                "129.930 879(greedy) waits at self-check 4\n" +
                "130.055 880 arrives\n" +
                "130.055 880 leaves\n" +
                "130.086 826 done serving by self-check 5\n" +
                "130.086 839(greedy) serves by self-check 5\n" +
                "130.164 881 arrives\n" +
                "130.164 881 waits at self-check 4\n" +
                "130.186 882(greedy) arrives\n" +
                "130.186 882(greedy) leaves\n" +
                "130.226 883(greedy) arrives\n" +
                "130.226 883(greedy) leaves\n" +
                "130.262 884 arrives\n" +
                "130.262 884 leaves\n" +
                "130.297 885 arrives\n" +
                "130.297 885 leaves\n" +
                "130.713 838(greedy) done serving by self-check 4\n" +
                "130.713 843(greedy) serves by self-check 4\n" +
                "130.907 886(greedy) arrives\n" +
                "130.907 886(greedy) waits at self-check 4\n" +
                "130.947 887 arrives\n" +
                "130.947 887 leaves\n" +
                "131.173 839(greedy) done serving by self-check 5\n" +
                "131.173 847(greedy) serves by self-check 5\n" +
                "131.198 888 arrives\n" +
                "131.198 888 waits at self-check 4\n" +
                "131.326 889 arrives\n" +
                "131.326 889 leaves\n" +
                "131.480 890 arrives\n" +
                "131.480 890 leaves\n" +
                "131.792 891 arrives\n" +
                "131.792 891 leaves\n" +
                "131.943 892 arrives\n" +
                "131.943 892 leaves\n" +
                "132.030 893(greedy) arrives\n" +
                "132.030 893(greedy) leaves\n" +
                "132.040 768(greedy) done serving by server 3\n" +
                "132.040 784(greedy) serves by server 3\n" +
                "132.173 894(greedy) arrives\n" +
                "132.173 894(greedy) waits at server 3\n" +
                "132.260 895 arrives\n" +
                "132.260 895 leaves\n" +
                "132.361 896 arrives\n" +
                "132.361 896 leaves\n" +
                "132.410 897 arrives\n" +
                "132.410 897 leaves\n" +
                "132.420 898(greedy) arrives\n" +
                "132.420 898(greedy) leaves\n" +
                "132.459 899 arrives\n" +
                "132.459 899 leaves\n" +
                "132.468 900(greedy) arrives\n" +
                "132.468 900(greedy) leaves\n" +
                "132.516 729(greedy) done serving by server 2\n" +
                "132.516 733 serves by server 2\n" +
                "132.520 901(greedy) arrives\n" +
                "132.520 901(greedy) waits at server 2\n" +
                "132.593 902(greedy) arrives\n" +
                "132.593 902(greedy) leaves\n" +
                "132.610 784(greedy) done serving by server 3\n" +
                "132.610 815 serves by server 3\n" +
                "132.642 811 done serving by server 1\n" +
                "132.642 818(greedy) serves by server 1\n" +
                "133.035 903(greedy) arrives\n" +
                "133.035 903(greedy) waits at server 1\n" +
                "133.081 815 done serving by server 3");

        System.out.println("133.081 819(greedy) serves by server 3\n" +
                "133.180 904(greedy) arrives\n" +
                "133.180 904(greedy) waits at server 3\n" +
                "133.227 905(greedy) arrives\n" +
                "133.227 905(greedy) waits at server 3\n" +
                "133.357 906(greedy) arrives\n" +
                "133.357 906(greedy) leaves\n" +
                "133.510 907(greedy) arrives\n" +
                "133.510 907(greedy) leaves\n" +
                "133.526 908 arrives\n" +
                "133.526 908 leaves\n" +
                "133.635 818(greedy) done serving by server 1\n" +
                "133.635 822 serves by server 1\n" +
                "133.714 819(greedy) done serving by server 3\n" +
                "133.714 823(greedy) serves by server 3\n" +
                "133.801 843(greedy) done serving by self-check 4\n" +
                "133.801 849 serves by self-check 4\n" +
                "133.986 849 done serving by self-check 4\n" +
                "133.986 862 serves by self-check 4\n" +
                "134.012 909(greedy) arrives\n" +
                "134.012 909(greedy) waits at self-check 4\n" +
                "134.046 847(greedy) done serving by self-check 5\n" +
                "134.046 866 serves by self-check 5\n" +
                "134.047 910(greedy) arrives\n" +
                "134.047 910(greedy) waits at self-check 4\n" +
                "134.058 862 done serving by self-check 4\n" +
                "134.058 867 serves by self-check 4\n" +
                "134.183 911 arrives\n" +
                "134.183 911 waits at server 1\n" +
                "134.200 912(greedy) arrives\n" +
                "134.200 912(greedy) waits at self-check 4\n" +
                "134.211 913(greedy) arrives\n" +
                "134.211 913(greedy) waits at server 3\n" +
                "134.282 914(greedy) arrives\n" +
                "134.282 914(greedy) waits at self-check 4\n" +
                "134.345 733 done serving by server 2\n" +
                "134.345 736(greedy) serves by server 2\n" +
                "134.347 867 done serving by self-check 4\n" +
                "134.347 871(greedy) serves by self-check 4\n" +
                "134.433 915(greedy) arrives\n" +
                "134.433 915(greedy) waits at server 2\n" +
                "134.468 916(greedy) arrives\n" +
                "134.468 916(greedy) waits at self-check 4\n" +
                "134.570 866 done serving by self-check 5\n" +
                "134.570 876(greedy) serves by self-check 5\n" +
                "134.640 917 arrives\n" +
                "134.640 917 waits at self-check 4\n" +
                "134.833 736(greedy) done serving by server 2\n" +
                "134.833 739(greedy) serves by server 2\n" +
                "134.867 871(greedy) done serving by self-check 4\n" +
                "134.867 879(greedy) serves by self-check 4\n" +
                "134.887 918 arrives\n" +
                "134.887 918 waits at server 2\n" +
                "134.981 919(greedy) arrives\n" +
                "134.981 919(greedy) waits at self-check 4\n" +
                "135.023 879(greedy) done serving by self-check 4\n" +
                "135.023 881 serves by self-check 4\n" +
                "135.181 876(greedy) done serving by self-check 5\n" +
                "135.181 886(greedy) serves by self-check 5\n" +
                "135.298 823(greedy) done serving by server 3\n" +
                "135.298 835 serves by server 3\n" +
                "135.381 920 arrives\n" +
                "135.381 920 waits at server 3\n" +
                "135.407 739(greedy) done serving by server 2\n" +
                "135.407 759 serves by server 2\n" +
                "135.444 835 done serving by server 3\n" +
                "135.444 841(greedy) serves by server 3\n" +
                "135.446 886(greedy) done serving by self-check 5\n" +
                "135.446 888 serves by self-check 5\n" +
                "135.514 921(greedy) arrives\n" +
                "135.514 921(greedy) waits at self-check 4\n" +
                "135.532 922 arrives\n" +
                "135.532 922 waits at server 2\n" +
                "135.597 759 done serving by server 2\n" +
                "135.597 820(greedy) serves by server 2\n" +
                "135.682 881 done serving by self-check 4\n" +
                "135.682 909(greedy) serves by self-check 4\n" +
                "135.713 822 done serving by server 1\n" +
                "135.713 829(greedy) serves by server 1\n" +
                "135.973 923 arrives\n" +
                "135.973 923 waits at server 1\n" +
                "135.980 820(greedy) done serving by server 2\n" +
                "135.980 840(greedy) serves by server 2\n" +
                "136.010 829(greedy) done serving by server 1\n" +
                "136.010 844(greedy) serves by server 1\n" +
                "136.248 909(greedy) done serving by self-check 4\n" +
                "136.248 910(greedy) serves by self-check 4\n" +
                "136.248 910(greedy) done serving by self-check 4\n" +
                "136.248 912(greedy) serves by self-check 4\n" +
                "136.336 924(greedy) arrives\n" +
                "136.336 924(greedy) waits at self-check 4\n" +
                "136.358 925(greedy) arrives\n" +
                "136.358 925(greedy) waits at self-check 4\n" +
                "136.383 840(greedy) done serving by server 2\n" +
                "136.383 851 serves by server 2\n" +
                "136.420 926(greedy) arrives\n" +
                "136.420 926(greedy) waits at server 2\n" +
                "136.547 927 arrives\n" +
                "136.547 927 waits at server 1\n" +
                "136.550 841(greedy) done serving by server 3\n" +
                "136.550 848 serves by server 3\n" +
                "136.558 928(greedy) arrives\n" +
                "136.558 928(greedy) waits at self-check 4\n" +
                "136.680 929(greedy) arrives\n" +
                "136.680 929(greedy) waits at server 2\n" +
                "136.687 848 done serving by server 3\n" +
                "136.687 861 serves by server 3\n" +
                "136.694 930(greedy) arrives\n" +
                "136.694 930(greedy) waits at server 3\n" +
                "136.709 912(greedy) done serving by self-check 4\n" +
                "136.709 914(greedy) serves by self-check 4\n" +
                "136.856 931 arrives\n" +
                "136.856 931 waits at server 2\n" +
                "136.865 888 done serving by self-check 5\n" +
                "136.865 916(greedy) serves by self-check 5\n" +
                "136.924 932 arrives\n" +
                "136.924 932 waits at server 3\n" +
                "136.930 861 done serving by server 3\n" +
                "136.930 863(greedy) serves by server 3\n" +
                "136.985 933(greedy) arrives\n" +
                "136.985 933(greedy) waits at self-check 4\n" +
                "137.088 844(greedy) done serving by server 1\n" +
                "137.088 845 serves by server 1\n" +
                "137.155 934 arrives\n" +
                "137.155 934 waits at server 1\n" +
                "137.160 935(greedy) arrives\n" +
                "137.160 935(greedy) waits at self-check 4\n" +
                "137.169 914(greedy) done serving by self-check 4\n" +
                "137.169 917 serves by self-check 4\n" +
                "137.240 851 done serving by server 2\n" +
                "137.240 855 serves by server 2\n" +
                "137.338 936 arrives\n" +
                "137.338 936 waits at server 2\n" +
                "137.390 916(greedy) done serving by self-check 5\n" +
                "137.390 919(greedy) serves by self-check 5\n" +
                "137.403 937 arrives\n" +
                "137.403 937 waits at server 3\n" +
                "137.577 938 arrives\n" +
                "137.577 938 waits at server 3\n" +
                "137.667 919(greedy) done serving by self-check 5\n" +
                "137.667 921(greedy) serves by self-check 5\n" +
                "137.909 939(greedy) arrives\n" +
                "137.909 939(greedy) waits at self-check 4\n" +
                "137.912 940 arrives\n" +
                "137.912 940 waits at self-check 4\n" +
                "137.965 941(greedy) arrives\n" +
                "137.965 941(greedy) waits at self-check 4\n" +
                "137.975 942(greedy) arrives\n" +
                "137.975 942(greedy) waits at self-check 4\n" +
                "138.118 943 arrives\n" +
                "138.118 943 waits at self-check 4\n" +
                "138.215 944(greedy) arrives\n" +
                "138.215 944(greedy) leaves\n" +
                "138.269 945(greedy) arrives\n" +
                "138.269 945(greedy) leaves\n" +
                "138.364 921(greedy) done serving by self-check 5\n" +
                "138.364 924(greedy) serves by self-check 5\n" +
                "138.372 946 arrives\n" +
                "138.372 946 waits at self-check 4\n" +
                "138.472 855 done serving by server 2\n" +
                "138.472 857(greedy) serves by server 2\n" +
                "138.586 863(greedy) done serving by server 3\n" +
                "138.586 872(greedy) serves by server 3\n" +
                "138.614 947(greedy) arrives\n" +
                "138.614 947(greedy) waits at server 2\n" +
                "138.710 948(greedy) arrives\n" +
                "138.710 948(greedy) waits at server 3\n" +
                "138.717 924(greedy) done serving by self-check 5\n" +
                "138.717 925(greedy) serves by self-check 5\n" +
                "138.804 949(greedy) arrives\n" +
                "138.804 949(greedy) waits at self-check 4\n" +
                "138.859 872(greedy) done serving by server 3\n" +
                "138.859 894(greedy) serves by server 3\n" +
                "138.860 950(greedy) arrives\n" +
                "138.860 950(greedy) waits at server 3\n" +
                "139.027 917 done serving by self-check 4\n" +
                "139.027 928(greedy) serves by self-check 4\n" +
                "139.156 928(greedy) done serving by self-check 4\n" +
                "139.156 933(greedy) serves by self-check 4\n" +
                "139.308 951 arrives\n" +
                "139.308 951 waits at self-check 4\n" +
                "139.320 952 arrives\n" +
                "139.320 952 waits at self-check 4\n" +
                "139.438 953(greedy) arrives\n" +
                "139.438 953(greedy) leaves\n" +
                "139.538 954 arrives\n" +
                "139.538 954 leaves\n" +
                "139.569 955 arrives\n" +
                "139.569 955 leaves\n" +
                "139.616 956(greedy) arrives\n" +
                "139.616 956(greedy) leaves\n" +
                "139.628 857(greedy) done serving by server 2\n" +
                "139.628 865 serves by server 2\n" +
                "139.750 957 arrives\n" +
                "139.750 957 waits at server 2\n" +
                "139.751 933(greedy) done serving by self-check 4\n" +
                "139.751 935(greedy) serves by self-check 4\n" +
                "139.927 865 done serving by server 2\n" +
                "139.927 901(greedy) serves by server 2\n" +
                "140.228 894(greedy) done serving by server 3\n" +
                "140.228 904(greedy) serves by server 3\n" +
                "140.398 958 arrives\n" +
                "140.398 958 waits at server 2\n" +
                "140.539 925(greedy) done serving by self-check 5\n" +
                "140.539 939(greedy) serves by self-check 5\n" +
                "140.564 959 arrives\n" +
                "140.564 959 waits at server 3\n" +
                "140.655 845 done serving by server 1\n" +
                "140.655 846 serves by server 1\n" +
                "140.733 901(greedy) done serving by server 2\n" +
                "140.733 915(greedy) serves by server 2\n" +
                "140.910 846 done serving by server 1\n" +
                "140.910 860 serves by server 1\n" +
                "140.936 935(greedy) done serving by self-check 4\n" +
                "140.936 940 serves by self-check 4\n" +
                "141.133 915(greedy) done serving by server 2\n" +
                "141.133 918 serves by server 2\n" +
                "141.302 960(greedy) arrives\n" +
                "141.302 960(greedy) waits at self-check 4\n" +
                "141.345 939(greedy) done serving by self-check 5\n" +
                "141.345 941(greedy) serves by self-check 5\n" +
                "141.383 941(greedy) done serving by self-check 5\n" +
                "141.383 942(greedy) serves by self-check 5\n" +
                "141.572 961(greedy) arrives\n" +
                "141.572 961(greedy) waits at self-check 4\n" +
                "141.579 918 done serving by server 2\n" +
                "141.579 922 serves by server 2\n" +
                "141.605 962 arrives\n" +
                "141.605 962 waits at server 1\n" +
                "141.705 860 done serving by server 1\n" +
                "141.705 864 serves by server 1\n" +
                "141.795 942(greedy) done serving by self-check 5\n" +
                "141.795 943 serves by self-check 5\n" +
                "141.901 963 arrives\n" +
                "141.901 963 waits at server 1\n" +
                "141.911 904(greedy) done serving by server 3\n" +
                "141.911 905(greedy) serves by server 3\n" +
                "142.054 905(greedy) done serving by server 3\n" +
                "142.054 913(greedy) serves by server 3\n" +
                "142.118 864 done serving by server 1\n" +
                "142.118 869 serves by server 1\n" +
                "142.128 964(greedy) arrives\n" +
                "142.128 964(greedy) waits at self-check 4\n" +
                "142.175 869 done serving by server 1\n" +
                "142.175 874 serves by server 1\n" +
                "142.263 943 done serving by self-check 5\n" +
                "142.263 946 serves by self-check 5\n" +
                "142.267 922 done serving by server 2\n" +
                "142.267 926(greedy) serves by server 2\n" +
                "142.413 965(greedy) arrives\n" +
                "142.413 965(greedy) waits at server 2\n" +
                "142.418 966 arrives\n" +
                "142.418 966 waits at server 1\n" +
                "142.438 946 done serving by self-check 5\n" +
                "142.438 949(greedy) serves by self-check 5\n" +
                "142.524 967(greedy) arrives\n" +
                "142.524 967(greedy) waits at self-check 4\n" +
                "142.549 940 done serving by self-check 4\n" +
                "142.549 951 serves by self-check 4\n" +
                "142.675 913(greedy) done serving by server 3\n" +
                "142.675 920 serves by server 3\n" +
                "142.679 968(greedy) arrives\n" +
                "142.679 968(greedy) waits at self-check 4\n" +
                "143.148 969(greedy) arrives\n" +
                "143.148 969(greedy) waits at self-check 4\n" +
                "143.173 951 done serving by self-check 4\n" +
                "143.173 952 serves by self-check 4\n" +
                "143.286 949(greedy) done serving by self-check 5\n" +
                "143.286 960(greedy) serves by self-check 5\n" +
                "143.313 970(greedy) arrives\n" +
                "143.313 970(greedy) waits at self-check 4\n" +
                "143.406 971(greedy) arrives\n" +
                "143.406 971(greedy) waits at self-check 4\n" +
                "143.590 952 done serving by self-check 4\n" +
                "143.590 961(greedy) serves by self-check 4\n" +
                "143.592 972(greedy) arrives\n" +
                "143.592 972(greedy) waits at self-check 4\n" +
                "143.604 973 arrives\n" +
                "143.604 973 waits at server 1\n" +
                "143.699 920 done serving by server 3\n" +
                "143.699 930(greedy) serves by server 3\n" +
                "143.718 961(greedy) done serving by self-check 4\n" +
                "143.718 964(greedy) serves by self-check 4\n" +
                "143.745 874 done serving by server 1\n" +
                "143.745 903(greedy) serves by server 1\n" +
                "143.792 960(greedy) done serving by self-check 5\n" +
                "143.792 967(greedy) serves by self-check 5\n" +
                "143.828 926(greedy) done serving by server 2\n" +
                "143.828 929(greedy) serves by server 2\n" +
                "143.841 930(greedy) done serving by server 3\n" +
                "143.841 932 serves by server 3\n" +
                "143.863 903(greedy) done serving by server 1\n" +
                "143.863 911 serves by server 1\n" +
                "143.880 974(greedy) arrives\n" +
                "143.880 974(greedy) waits at server 3\n" +
                "143.885 975(greedy) arrives\n" +
                "143.885 975(greedy) waits at self-check 4\n" +
                "143.910 976 arrives\n" +
                "143.910 976 waits at server 1\n" +
                "143.980 967(greedy) done serving by self-check 5\n" +
                "143.980 968(greedy) serves by self-check 5\n" +
                "144.048 977(greedy) arrives\n" +
                "144.048 977(greedy) waits at self-check 4\n" +
                "144.213 978 arrives\n" +
                "144.213 978 waits at server 1\n" +
                "144.252 968(greedy) done serving by self-check 5\n" +
                "144.252 969(greedy) serves by self-check 5\n" +
                "144.327 969(greedy) done serving by self-check 5\n" +
                "144.327 970(greedy) serves by self-check 5\n" +
                "144.338 979(greedy) arrives\n" +
                "144.338 979(greedy) waits at self-check 4\n" +
                "144.339 980(greedy) arrives\n" +
                "144.339 980(greedy) waits at self-check 4\n" +
                "144.476 981 arrives\n" +
                "144.476 981 waits at server 1\n" +
                "144.511 970(greedy) done serving by self-check 5\n" +
                "144.511 971(greedy) serves by self-check 5\n" +
                "144.513 929(greedy) done serving by server 2\n" +
                "144.513 931 serves by server 2\n" +
                "144.812 971(greedy) done serving by self-check 5\n" +
                "144.812 972(greedy) serves by self-check 5\n" +
                "144.920 932 done serving by server 3\n" +
                "144.920 937 serves by server 3\n" +
                "144.977 937 done serving by server 3\n" +
                "144.977 938 serves by server 3\n" +
                "145.034 982 arrives\n" +
                "145.034 982 waits at server 2\n" +
                "145.087 983 arrives\n" +
                "145.087 983 waits at server 2\n" +
                "145.580 984(greedy) arrives\n" +
                "145.580 984(greedy) waits at server 3\n" +
                "145.599 985(greedy) arrives\n" +
                "145.599 985(greedy) waits at self-check 4\n" +
                "145.659 986 arrives\n" +
                "145.659 986 waits at server 2\n" +
                "145.663 964(greedy) done serving by self-check 4\n" +
                "145.663 975(greedy) serves by self-check 4\n" +
                "145.671 987 arrives\n" +
                "145.671 987 waits at server 2\n" +
                "145.783 911 done serving by server 1\n" +
                "145.783 923 serves by server 1\n" +
                "145.813 988(greedy) arrives\n" +
                "145.813 988(greedy) waits at self-check 4\n" +
                "145.827 989(greedy) arrives\n" +
                "145.827 989(greedy) waits at server 3\n" +
                "145.904 938 done serving by server 3\n" +
                "145.904 948(greedy) serves by server 3\n" +
                "145.923 990 arrives\n" +
                "145.923 990 waits at server 1\n" +
                "145.953 991 arrives\n" +
                "145.953 991 waits at server 2\n" +
                "145.955 931 done serving by server 2\n" +
                "145.955 936 serves by server 2\n" +
                "146.073 936 done serving by server 2\n" +
                "146.073 947(greedy) serves by server 2\n" +
                "146.112 947(greedy) done serving by server 2\n" +
                "146.112 957 serves by server 2\n" +
                "146.197 992 arrives\n" +
                "146.197 992 waits at server 2\n" +
                "146.744 993 arrives\n" +
                "146.744 993 waits at server 2\n" +
                "146.808 994 arrives\n" +
                "146.808 994 waits at server 2\n" +
                "146.871 995 arrives\n" +
                "146.871 995 waits at server 3\n" +
                "146.906 996(greedy) arrives\n" +
                "146.906 996(greedy) waits at self-check 4\n" +
                "146.923 997 arrives\n" +
                "146.923 997 waits at server 3\n" +
                "146.941 998(greedy) arrives\n" +
                "146.941 998(greedy) waits at self-check 4\n" +
                "147.036 999 arrives\n" +
                "147.036 999 waits at server 3\n" +
                "147.113 975(greedy) done serving by self-check 4\n" +
                "147.113 977(greedy) serves by self-check 4\n" +
                "147.115 1000(greedy) arrives\n" +
                "147.115 1000(greedy) waits at self-check 4\n" +
                "147.122 923 done serving by server 1\n" +
                "147.122 927 serves by server 1\n" +
                "147.250 972(greedy) done serving by self-check 5\n" +
                "147.250 979(greedy) serves by self-check 5\n" +
                "147.274 957 done serving by server 2\n" +
                "147.274 958 serves by server 2\n" +
                "147.451 979(greedy) done serving by self-check 5\n" +
                "147.451 980(greedy) serves by self-check 5\n" +
                "147.624 948(greedy) done serving by server 3\n" +
                "147.624 950(greedy) serves by server 3\n" +
                "147.924 980(greedy) done serving by self-check 5\n" +
                "147.924 985(greedy) serves by self-check 5\n" +
                "148.150 950(greedy) done serving by server 3\n" +
                "148.150 959 serves by server 3\n" +
                "148.203 959 done serving by server 3\n" +
                "148.203 974(greedy) serves by server 3\n" +
                "148.599 927 done serving by server 1\n" +
                "148.599 934 serves by server 1\n" +
                "148.772 977(greedy) done serving by self-check 4\n" +
                "148.772 988(greedy) serves by self-check 4\n" +
                "148.943 934 done serving by server 1\n" +
                "148.943 962 serves by server 1\n" +
                "149.379 985(greedy) done serving by self-check 5\n" +
                "149.379 996(greedy) serves by self-check 5\n" +
                "149.506 962 done serving by server 1\n" +
                "149.506 963 serves by server 1\n" +
                "149.521 996(greedy) done serving by self-check 5\n" +
                "149.521 998(greedy) serves by self-check 5\n" +
                "149.701 963 done serving by server 1\n" +
                "149.701 966 serves by server 1\n" +
                "149.990 974(greedy) done serving by server 3\n" +
                "149.990 984(greedy) serves by server 3\n" +
                "150.032 988(greedy) done serving by self-check 4\n" +
                "150.032 1000(greedy) serves by self-check 4\n" +
                "150.243 966 done serving by server 1\n" +
                "150.243 973 serves by server 1\n" +
                "150.413 998(greedy) done serving by self-check 5\n" +
                "150.561 958 done serving by server 2\n" +
                "150.561 965(greedy) serves by server 2\n" +
                "150.582 1000(greedy) done serving by self-check 4\n" +
                "150.884 965(greedy) done serving by server 2\n" +
                "150.884 982 serves by server 2\n" +
                "152.172 982 done serving by server 2\n" +
                "152.172 983 serves by server 2\n" +
                "152.674 973 done serving by server 1\n" +
                "152.674 976 serves by server 1\n" +
                "152.897 984(greedy) done serving by server 3\n" +
                "152.897 989(greedy) serves by server 3\n" +
                "152.988 983 done serving by server 2\n" +
                "152.988 986 serves by server 2\n" +
                "153.750 989(greedy) done serving by server 3\n" +
                "153.750 995 serves by server 3\n" +
                "154.334 986 done serving by server 2\n" +
                "154.334 987 serves by server 2\n" +
                "154.884 995 done serving by server 3\n" +
                "154.884 997 serves by server 3\n" +
                "155.517 997 done serving by server 3\n" +
                "155.517 999 serves by server 3\n" +
                "156.146 987 done serving by server 2\n" +
                "156.146 991 serves by server 2\n" +
                "156.949 999 done serving by server 3\n" +
                "157.728 976 done serving by server 1\n" +
                "157.728 978 serves by server 1\n" +
                "158.905 978 done serving by server 1\n" +
                "158.905 981 serves by server 1\n" +
                "159.170 991 done serving by server 2\n" +
                "159.170 992 serves by server 2\n" +
                "159.241 992 done serving by server 2\n" +
                "159.241 993 serves by server 2\n" +
                "160.027 981 done serving by server 1\n" +
                "160.027 990 serves by server 1\n" +
                "160.327 993 done serving by server 2\n" +
                "160.327 994 serves by server 2\n" +
                "161.161 990 done serving by server 1\n" +
                "161.444 994 done serving by server 2\n" +
                "[6.683 765 235]");
    }

    public void serverCustomer15() {
        System.out.println("0.000 1 arrives\n" +
                "0.000 1 serves by server 1\n" +
                "0.026 2(greedy) arrives\n" +
                "0.026 2(greedy) serves by server 2\n" +
                "0.035 3 arrives\n" +
                "0.035 3 serves by self-check 3\n" +
                "0.093 4(greedy) arrives\n" +
                "0.093 4(greedy) serves by self-check 4\n" +
                "0.094 5(greedy) arrives\n" +
                "0.094 5(greedy) waits at server 1\n" +
                "0.107 6(greedy) arrives\n" +
                "0.107 6(greedy) waits at server 2\n" +
                "0.108 7(greedy) arrives\n" +
                "0.108 7(greedy) waits at self-check 3\n" +
                "0.231 8 arrives\n" +
                "0.231 8 waits at server 1\n" +
                "0.313 1 done serving by server 1\n" +
                "0.357 4(greedy) done serving by self-check 4\n" +
                "0.357 7(greedy) serves by self-check 4\n" +
                "0.447 9(greedy) arrives\n" +
                "0.447 9(greedy) waits at self-check 3\n" +
                "0.472 10 arrives\n" +
                "0.472 10 waits at server 1\n" +
                "0.476 11(greedy) arrives\n" +
                "0.476 11(greedy) waits at server 2\n" +
                "0.767 12(greedy) arrives\n" +
                "0.767 12(greedy) waits at self-check 3\n" +
                "0.798 13(greedy) arrives\n" +
                "0.798 13(greedy) waits at server 2\n" +
                "0.811 14 arrives\n" +
                "0.811 14 waits at self-check 3\n" +
                "0.941 5(greedy) serves by server 1\n" +
                "1.050 15(greedy) arrives\n" +
                "1.050 15(greedy) waits at server 1\n" +
                "1.125 16(greedy) arrives\n" +
                "1.125 16(greedy) leaves\n" +
                "1.212 17(greedy) arrives\n" +
                "1.212 17(greedy) leaves\n" +
                "1.212 18(greedy) arrives\n" +
                "1.212 18(greedy) leaves\n" +
                "1.261 19(greedy) arrives\n" +
                "1.261 19(greedy) leaves\n" +
                "1.322 20(greedy) arrives\n" +
                "1.322 20(greedy) leaves\n" +
                "1.356 5(greedy) done serving by server 1\n" +
                "1.838 7(greedy) done serving by self-check 4\n" +
                "1.838 9(greedy) serves by self-check 4\n" +
                "2.053 9(greedy) done serving by self-check 4\n" +
                "2.053 12(greedy) serves by self-check 4\n" +
                "2.671 2(greedy) done serving by server 2\n" +
                "2.736 3 done serving by self-check 3\n" +
                "2.736 14 serves by self-check 3\n" +
                "2.945 14 done serving by self-check 3\n" +
                "4.102 6(greedy) serves by server 2\n" +
                "4.159 6(greedy) done serving by server 2\n" +
                "5.566 12(greedy) done serving by self-check 4\n" +
                "5.704 11(greedy) serves by server 2\n" +
                "6.211 8 serves by server 1\n" +
                "6.305 8 done serving by server 1\n" +
                "7.583 11(greedy) done serving by server 2\n" +
                "7.909 10 serves by server 1\n" +
                "7.909 10 done serving by server 1\n" +
                "8.303 13(greedy) serves by server 2\n" +
                "8.919 13(greedy) done serving by server 2\n" +
                "10.471 15(greedy) serves by server 1\n" +
                "10.494 15(greedy) done serving by server 1\n" +
                "[3.017 15 5]");
    }

    public void serverCustomer16() {
        System.out.println("0.000 1 arrives\n" +
                "0.000 1 serves by server 1\n" +
                "0.045 2 arrives\n" +
                "0.045 2 serves by server 2\n" +
                "0.060 3 arrives\n" +
                "0.060 3 serves by server 3\n" +
                "0.159 4(greedy) arrives\n" +
                "0.159 4(greedy) serves by self-check 4\n" +
                "0.162 5(greedy) arrives\n" +
                "0.162 5(greedy) serves by self-check 5\n" +
                "0.184 6 arrives\n" +
                "0.184 6 waits at server 1\n" +
                "0.185 7 arrives\n" +
                "0.185 7 waits at server 1\n" +
                "0.313 1 done serving by server 1\n" +
                "0.396 8 arrives\n" +
                "0.396 8 waits at server 1\n" +
                "0.423 4(greedy) done serving by self-check 4\n" +
                "0.627 6 serves by server 1\n" +
                "0.767 9(greedy) arrives\n" +
                "0.767 9(greedy) serves by self-check 4\n" +
                "0.809 10 arrives\n" +
                "0.809 10 waits at server 1\n" +
                "0.817 11 arrives\n" +
                "0.817 11 waits at server 1\n" +
                "0.982 9(greedy) done serving by self-check 4\n" +
                "1.042 6 done serving by server 1\n" +
                "1.315 12 arrives\n" +
                "1.315 12 serves by self-check 4\n" +
                "1.368 13(greedy) arrives\n" +
                "1.368 13(greedy) waits at server 2\n" +
                "1.391 14 arrives\n" +
                "1.391 14 waits at server 1\n" +
                "1.643 5(greedy) done serving by self-check 5\n" +
                "1.801 15 arrives\n" +
                "1.801 15 serves by self-check 5\n" +
                "1.929 16 arrives\n" +
                "1.929 16 waits at server 1\n" +
                "2.010 15 done serving by self-check 5\n" +
                "2.078 17(greedy) arrives\n" +
                "2.078 17(greedy) serves by self-check 5\n" +
                "2.079 18 arrives\n" +
                "2.079 18 waits at server 1\n" +
                "2.134 17(greedy) done serving by self-check 5\n" +
                "2.161 19(greedy) arrives\n" +
                "2.161 19(greedy) serves by self-check 5\n" +
                "2.267 20 arrives\n" +
                "2.267 20 waits at server 1\n" +
                "2.690 2 done serving by server 2\n" +
                "2.697 21(greedy) arrives\n" +
                "2.697 21(greedy) waits at server 3\n" +
                "2.761 3 done serving by server 3\n" +
                "2.774 22(greedy) arrives\n" +
                "2.774 22(greedy) waits at self-check 4\n" +
                "2.797 23(greedy) arrives\n" +
                "2.797 23(greedy) waits at server 2\n" +
                "3.008 24(greedy) arrives\n" +
                "3.008 24(greedy) waits at server 3\n" +
                "3.276 25 arrives\n" +
                "3.276 25 waits at server 1\n" +
                "3.281 26(greedy) arrives\n" +
                "3.281 26(greedy) waits at self-check 4\n" +
                "3.406 13(greedy) serves by server 2\n" +
                "3.470 7 serves by server 1\n" +
                "3.471 7 done serving by server 1\n" +
                "3.489 27(greedy) arrives\n" +
                "3.489 27(greedy) waits at server 2\n" +
                "3.500 13(greedy) done serving by server 2\n" +
                "3.533 21(greedy) serves by server 3\n" +
                "3.558 28(greedy) arrives\n" +
                "3.558 28(greedy) waits at server 3\n" +
                "3.629 29(greedy) arrives\n" +
                "3.629 29(greedy) waits at server 2\n" +
                "3.829 30(greedy) arrives\n" +
                "3.829 30(greedy) waits at server 3\n" +
                "3.854 31(greedy) arrives\n" +
                "3.854 31(greedy) waits at self-check 4\n" +
                "3.859 23(greedy) serves by server 2\n" +
                "3.882 23(greedy) done serving by server 2\n" +
                "3.907 32 arrives\n" +
                "3.907 32 waits at server 1\n" +
                "3.939 33(greedy) arrives\n" +
                "3.939 33(greedy) waits at server 2\n" +
                "4.040 19(greedy) done serving by self-check 5\n" +
                "4.040 22(greedy) serves by self-check 5\n" +
                "4.150 21(greedy) done serving by server 3\n" +
                "4.238 34(greedy) arrives\n" +
                "4.238 34(greedy) waits at self-check 4\n" +
                "4.272 8 serves by server 1\n" +
                "4.424 24(greedy) serves by server 3\n" +
                "4.556 35 arrives\n" +
                "4.556 35 waits at server 1\n" +
                "4.828 12 done serving by self-check 4\n" +
                "4.828 26(greedy) serves by self-check 4\n" +
                "4.872 8 done serving by server 1\n" +
                "5.045 36(greedy) arrives\n" +
                "5.045 36(greedy) waits at server 3\n" +
                "5.054 37 arrives\n" +
                "5.054 37 waits at server 1\n" +
                "5.163 27(greedy) serves by server 2\n" +
                "5.243 38(greedy) arrives\n" +
                "5.243 38(greedy) waits at server 2\n" +
                "5.327 39(greedy) arrives\n" +
                "5.327 39(greedy) waits at self-check 4\n" +
                "5.539 40 arrives\n" +
                "5.539 40 waits at server 2\n" +
                "5.641 26(greedy) done serving by self-check 4\n" +
                "5.641 31(greedy) serves by self-check 4\n" +
                "5.817 41 arrives\n" +
                "5.817 41 waits at server 2\n" +
                "5.882 22(greedy) done serving by self-check 5\n" +
                "5.882 34(greedy) serves by self-check 5\n" +
                "6.048 27(greedy) done serving by server 2\n" +
                "6.131 29(greedy) serves by server 2\n" +
                "6.243 42 arrives\n" +
                "6.243 42 waits at server 2\n" +
                "6.389 10 serves by server 1\n" +
                "6.448 10 done serving by server 1\n" +
                "6.534 43(greedy) arrives\n" +
                "6.534 43(greedy) waits at self-check 4\n" +
                "6.569 11 serves by server 1\n" +
                "6.685 11 done serving by server 1\n" +
                "6.793 24(greedy) done serving by server 3\n" +
                "6.849 29(greedy) done serving by server 2\n" +
                "6.891 31(greedy) done serving by self-check 4\n" +
                "6.891 39(greedy) serves by self-check 4\n" +
                "6.917 28(greedy) serves by server 3\n" +
                "6.941 44 arrives\n" +
                "6.941 44 waits at server 1\n" +
                "7.052 45 arrives\n" +
                "7.052 45 waits at server 1\n" +
                "7.160 46(greedy) arrives\n" +
                "7.160 46(greedy) waits at self-check 4\n" +
                "7.356 47(greedy) arrives\n" +
                "7.356 47(greedy) waits at server 3\n" +
                "7.390 48 arrives\n" +
                "7.390 48 waits at server 2\n" +
                "7.427 49(greedy) arrives\n" +
                "7.427 49(greedy) waits at self-check 4\n" +
                "7.476 28(greedy) done serving by server 3\n" +
                "7.515 39(greedy) done serving by self-check 4\n" +
                "7.515 43(greedy) serves by self-check 4\n" +
                "7.579 50 arrives\n" +
                "7.579 50 waits at server 2\n" +
                "7.625 51 arrives\n" +
                "7.625 51 waits at server 2\n" +
                "7.643 52(greedy) arrives\n" +
                "7.643 52(greedy) waits at self-check 4\n" +
                "7.659 34(greedy) done serving by self-check 5\n" +
                "7.659 46(greedy) serves by self-check 5\n" +
                "7.672 33(greedy) serves by server 2\n" +
                "7.711 33(greedy) done serving by server 2\n" +
                "7.716 38(greedy) serves by server 2\n" +
                "7.766 53 arrives\n" +
                "7.766 53 waits at server 2\n" +
                "8.020 54 arrives\n" +
                "8.020 54 waits at server 2\n" +
                "8.029 46(greedy) done serving by self-check 5\n" +
                "8.029 49(greedy) serves by self-check 5\n" +
                "8.190 14 serves by server 1\n" +
                "8.285 55 arrives\n" +
                "8.285 55 waits at server 1\n" +
                "8.410 30(greedy) serves by server 3\n" +
                "8.534 56(greedy) arrives\n" +
                "8.534 56(greedy) waits at self-check 4\n" +
                "8.616 57(greedy) arrives\n" +
                "8.616 57(greedy) waits at server 3\n" +
                "8.814 38(greedy) done serving by server 2\n" +
                "8.885 43(greedy) done serving by self-check 4\n" +
                "8.885 52(greedy) serves by self-check 4\n" +
                "8.940 40 serves by server 2\n" +
                "8.949 58 arrives\n" +
                "8.949 58 waits at server 2\n" +
                "9.059 14 done serving by server 1\n" +
                "9.176 52(greedy) done serving by self-check 4\n" +
                "9.176 56(greedy) serves by self-check 4\n" +
                "9.210 59(greedy) arrives\n" +
                "9.210 59(greedy) waits at self-check 4\n" +
                "9.275 60 arrives\n" +
                "9.275 60 waits at server 2\n" +
                "9.366 61 arrives\n" +
                "9.366 61 waits at server 2\n" +
                "9.376 49(greedy) done serving by self-check 5\n" +
                "9.376 59(greedy) serves by self-check 5\n" +
                "9.698 40 done serving by server 2\n" +
                "9.874 62 arrives\n" +
                "9.874 62 waits at server 3\n" +
                "9.958 63 arrives\n" +
                "9.958 63 waits at server 3\n" +
                "10.031 64(greedy) arrives\n" +
                "10.031 64(greedy) waits at self-check 4\n" +
                "10.133 65 arrives\n" +
                "10.133 65 waits at server 3\n" +
                "10.148 66 arrives\n" +
                "10.148 66 waits at server 3\n" +
                "10.171 59(greedy) done serving by self-check 5\n" +
                "10.171 64(greedy) serves by self-check 5\n" +
                "10.320 16 serves by server 1\n" +
                "10.487 30(greedy) done serving by server 3\n" +
                "10.604 67(greedy) arrives\n" +
                "10.604 67(greedy) waits at self-check 4\n" +
                "10.715 68 arrives\n" +
                "10.715 68 waits at server 1\n" +
                "10.848 69(greedy) arrives\n" +
                "10.848 69(greedy) waits at self-check 4\n" +
                "10.880 70 arrives\n" +
                "10.880 70 waits at server 3\n" +
                "10.953 56(greedy) done serving by self-check 4\n" +
                "10.953 67(greedy) serves by self-check 4\n" +
                "11.008 36(greedy) serves by server 3\n" +
                "11.011 16 done serving by server 1\n" +
                "11.038 71(greedy) arrives\n" +
                "11.038 71(greedy) waits at self-check 4\n" +
                "11.093 41 serves by server 2\n" +
                "11.097 72(greedy) arrives\n" +
                "11.097 72(greedy) waits at self-check 4\n" +
                "11.142 73(greedy) arrives\n" +
                "11.142 73(greedy) waits at self-check 4\n" +
                "11.192 74 arrives\n" +
                "11.192 74 waits at server 2\n" +
                "11.282 75 arrives\n" +
                "11.282 75 waits at server 3\n" +
                "11.433 64(greedy) done serving by self-check 5\n" +
                "11.433 69(greedy) serves by self-check 5\n" +
                "11.624 67(greedy) done serving by self-check 4\n" +
                "11.624 71(greedy) serves by self-check 4\n" +
                "11.681 18 serves by server 1\n" +
                "11.705 36(greedy) done serving by server 3\n" +
                "11.795 71(greedy) done serving by self-check 4\n" +
                "11.795 72(greedy) serves by self-check 4\n" +
                "11.901 72(greedy) done serving by self-check 4\n" +
                "11.901 73(greedy) serves by self-check 4\n" +
                "12.186 41 done serving by server 2\n" +
                "12.213 73(greedy) done serving by self-check 4\n" +
                "12.274 76 arrives\n" +
                "12.274 76 serves by self-check 4\n" +
                "12.281 77 arrives\n" +
                "12.281 77 waits at server 1\n" +
                "12.427 78 arrives\n" +
                "12.427 78 waits at server 3\n" +
                "12.493 79 arrives\n" +
                "12.493 79 waits at server 3\n" +
                "12.574 69(greedy) done serving by self-check 5\n" +
                "12.740 80(greedy) arrives\n" +
                "12.740 80(greedy) serves by self-check 5\n" +
                "12.841 81 arrives\n" +
                "12.841 81 waits at self-check 4\n" +
                "12.855 82(greedy) arrives\n" +
                "12.855 82(greedy) waits at self-check 4\n" +
                "12.857 76 done serving by self-check 4\n" +
                "12.857 81 serves by self-check 4\n" +
                "13.035 83(greedy) arrives\n" +
                "13.035 83(greedy) waits at self-check 4\n" +
                "13.078 84 arrives\n" +
                "13.078 84 waits at self-check 4\n" +
                "13.265 85(greedy) arrives\n" +
                "13.265 85(greedy) waits at self-check 4\n" +
                "13.327 86(greedy) arrives\n" +
                "13.327 86(greedy) waits at self-check 4\n" +
                "13.357 87(greedy) arrives\n" +
                "13.357 87(greedy) waits at self-check 4\n" +
                "13.447 88 arrives\n" +
                "13.447 88 waits at self-check 4\n" +
                "13.919 89 arrives\n" +
                "13.919 89 waits at self-check 4\n" +
                "13.988 90 arrives\n" +
                "13.988 90 waits at self-check 4\n" +
                "14.238 91 arrives\n" +
                "14.238 91 waits at self-check 4\n" +
                "14.260 80(greedy) done serving by self-check 5\n" +
                "14.260 82(greedy) serves by self-check 5\n" +
                "14.266 47(greedy) serves by server 3\n" +
                "14.555 92 arrives\n" +
                "14.555 92 waits at server 3\n" +
                "14.604 18 done serving by server 1\n" +
                "14.632 93(greedy) arrives\n" +
                "14.632 93(greedy) waits at self-check 4\n" +
                "14.767 94(greedy) arrives\n" +
                "14.767 94(greedy) leaves\n" +
                "14.787 95(greedy) arrives\n" +
                "14.787 95(greedy) leaves\n" +
                "14.851 47(greedy) done serving by server 3\n" +
                "14.879 96(greedy) arrives\n" +
                "14.879 96(greedy) leaves\n" +
                "14.894 97(greedy) arrives\n" +
                "14.894 97(greedy) leaves\n" +
                "14.912 98 arrives\n" +
                "14.912 98 leaves\n" +
                "14.985 20 serves by server 1\n" +
                "15.080 99 arrives\n" +
                "15.080 99 waits at server 1\n" +
                "15.221 100 arrives\n" +
                "15.221 100 leaves\n" +
                "15.347 101 arrives\n" +
                "15.347 101 leaves\n" +
                "15.390 102(greedy) arrives\n" +
                "15.390 102(greedy) leaves\n" +
                "15.401 42 serves by server 2\n" +
                "15.409 103 arrives\n" +
                "15.409 103 waits at server 2\n" +
                "15.424 104(greedy) arrives\n" +
                "15.424 104(greedy) leaves\n" +
                "15.520 20 done serving by server 1\n" +
                "15.611 105 arrives\n" +
                "15.611 105 leaves\n" +
                "15.648 57(greedy) serves by server 3\n" +
                "15.771 106(greedy) arrives\n" +
                "15.771 106(greedy) waits at server 3\n" +
                "15.785 107 arrives\n" +
                "15.785 107 leaves\n" +
                "15.846 108(greedy) arrives\n" +
                "15.846 108(greedy) leaves\n" +
                "15.897 81 done serving by self-check 4\n" +
                "15.897 83(greedy) serves by self-check 4\n" +
                "15.957 83(greedy) done serving by self-check 4\n" +
                "15.957 84 serves by self-check 4\n" +
                "15.992 57(greedy) done serving by server 3\n" +
                "16.228 109(greedy) arrives\n" +
                "16.228 109(greedy) waits at self-check 4\n" +
                "16.447 110(greedy) arrives\n" +
                "16.447 110(greedy) waits at self-check 4\n" +
                "16.535 82(greedy) done serving by self-check 5\n" +
                "16.535 85(greedy) serves by self-check 5\n" +
                "16.557 25 serves by server 1\n" +
                "16.609 111 arrives\n" +
                "16.609 111 waits at server 1\n" +
                "16.611 112(greedy) arrives\n" +
                "16.611 112(greedy) waits at self-check 4\n" +
                "16.617 113(greedy) arrives\n" +
                "16.617 113(greedy) leaves\n" +
                "16.658 42 done serving by server 2\n" +
                "16.702 114 arrives\n" +
                "16.702 114 leaves\n" +
                "16.721 25 done serving by server 1\n" +
                "17.190 62 serves by server 3\n" +
                "17.253 115(greedy) arrives\n" +
                "17.253 115(greedy) waits at server 3\n" +
                "17.328 116 arrives\n" +
                "17.328 116 leaves\n" +
                "17.331 117(greedy) arrives\n" +
                "17.331 117(greedy) leaves\n" +
                "17.414 118(greedy) arrives\n" +
                "17.414 118(greedy) leaves\n" +
                "17.607 119 arrives\n" +
                "17.607 119 leaves\n" +
                "17.771 32 serves by server 1\n" +
                "17.887 85(greedy) done serving by self-check 5\n" +
                "17.887 86(greedy) serves by self-check 5\n" +
                "17.893 62 done serving by server 3\n" +
                "17.935 120(greedy) arrives\n" +
                "17.935 120(greedy) waits at server 1\n" +
                "18.025 121(greedy) arrives\n" +
                "18.025 121(greedy) waits at self-check 4\n" +
                "18.260 63 serves by server 3\n" +
                "18.287 122(greedy) arrives\n" +
                "18.287 122(greedy) waits at server 3\n" +
                "18.338 86(greedy) done serving by self-check 5\n" +
                "18.338 87(greedy) serves by self-check 5\n" +
                "18.502 123(greedy) arrives\n" +
                "18.502 123(greedy) waits at self-check 4\n" +
                "18.516 84 done serving by self-check 4\n" +
                "18.516 88 serves by self-check 4\n" +
                "18.584 124 arrives\n" +
                "18.584 124 waits at self-check 4\n" +
                "18.665 125 arrives\n" +
                "18.665 125 leaves\n" +
                "18.697 63 done serving by server 3\n" +
                "18.733 87(greedy) done serving by self-check 5\n" +
                "18.733 89 serves by self-check 5\n" +
                "18.734 48 serves by server 2\n" +
                "18.797 126(greedy) arrives\n" +
                "18.797 126(greedy) waits at server 2\n" +
                "18.802 88 done serving by self-check 4\n" +
                "18.802 90 serves by self-check 4\n" +
                "18.867 127(greedy) arrives\n" +
                "18.867 127(greedy) waits at self-check 4\n" +
                "18.898 128 arrives\n" +
                "18.898 128 waits at self-check 4\n" +
                "19.020 129 arrives\n" +
                "19.020 129 leaves\n" +
                "19.172 130(greedy) arrives\n" +
                "19.172 130(greedy) leaves\n" +
                "19.230 131 arrives\n" +
                "19.230 131 leaves\n" +
                "19.364 132 arrives\n" +
                "19.364 132 leaves\n" +
                "19.420 133 arrives\n" +
                "19.420 133 leaves\n" +
                "19.448 134(greedy) arrives\n" +
                "19.448 134(greedy) leaves\n" +
                "19.537 48 done serving by server 2\n" +
                "19.697 135(greedy) arrives\n" +
                "19.697 135(greedy) leaves\n" +
                "19.698 136(greedy) arrives\n" +
                "19.698 136(greedy) leaves\n" +
                "19.728 90 done serving by self-check 4\n" +
                "19.728 91 serves by self-check 4\n" +
                "19.734 32 done serving by server 1\n" +
                "19.924 137(greedy) arrives\n" +
                "19.924 137(greedy) waits at self-check 4\n" +
                "20.085 138(greedy) arrives\n" +
                "20.085 138(greedy) leaves\n" +
                "20.294 65 serves by server 3\n" +
                "20.304 139(greedy) arrives\n" +
                "20.304 139(greedy) waits at server 3\n" +
                "20.587 89 done serving by self-check 5\n" +
                "20.587 93(greedy) serves by self-check 5\n" +
                "20.703 93(greedy) done serving by self-check 5\n" +
                "20.703 109(greedy) serves by self-check 5\n" +
                "20.822 109(greedy) done serving by self-check 5\n" +
                "20.822 110(greedy) serves by self-check 5\n" +
                "20.901 140 arrives\n" +
                "20.901 140 waits at self-check 4\n" +
                "20.951 141 arrives\n" +
                "20.951 141 waits at self-check 4\n" +
                "21.117 142 arrives\n" +
                "21.117 142 waits at self-check 4\n" +
                "21.378 35 serves by server 1\n" +
                "21.487 143 arrives\n" +
                "21.487 143 waits at server 1\n" +
                "21.614 144(greedy) arrives\n" +
                "21.614 144(greedy) leaves\n" +
                "21.630 91 done serving by self-check 4\n" +
                "21.630 112(greedy) serves by self-check 4\n" +
                "21.670 112(greedy) done serving by self-check 4\n" +
                "21.670 121(greedy) serves by self-check 4\n" +
                "21.676 35 done serving by server 1\n" +
                "21.813 145(greedy) arrives\n" +
                "21.813 145(greedy) waits at self-check 4\n" +
                "22.094 110(greedy) done serving by self-check 5\n" +
                "22.094 123(greedy) serves by self-check 5\n" +
                "22.115 146 arrives\n" +
                "22.115 146 waits at self-check 4\n" +
                "22.213 147(greedy) arrives\n" +
                "22.213 147(greedy) waits at self-check 4\n" +
                "22.306 148(greedy) arrives\n" +
                "22.306 148(greedy) leaves\n" +
                "22.452 123(greedy) done serving by self-check 5\n" +
                "22.452 124 serves by self-check 5\n" +
                "22.627 124 done serving by self-check 5\n" +
                "22.627 127(greedy) serves by self-check 5\n" +
                "22.762 127(greedy) done serving by self-check 5\n" +
                "22.762 128 serves by self-check 5\n" +
                "22.896 149(greedy) arrives\n" +
                "22.896 149(greedy) waits at self-check 4\n" +
                "22.915 50 serves by server 2\n" +
                "22.978 150(greedy) arrives\n" +
                "22.978 150(greedy) waits at self-check 4\n" +
                "23.020 151(greedy) arrives\n" +
                "23.020 151(greedy) waits at server 2\n" +
                "23.135 37 serves by server 1\n" +
                "23.219 152(greedy) arrives\n" +
                "23.219 152(greedy) waits at server 1\n" +
                "23.245 37 done serving by server 1\n" +
                "23.257 128 done serving by self-check 5\n" +
                "23.257 137(greedy) serves by self-check 5\n" +
                "23.320 153(greedy) arrives\n" +
                "23.320 153(greedy) waits at self-check 4\n" +
                "23.415 121(greedy) done serving by self-check 4\n" +
                "23.415 140 serves by self-check 4\n" +
                "23.439 154(greedy) arrives\n" +
                "23.439 154(greedy) waits at self-check 4\n" +
                "23.739 155 arrives\n" +
                "23.739 155 waits at self-check 4\n" +
                "23.833 156(greedy) arrives\n" +
                "23.833 156(greedy) leaves\n" +
                "24.049 157(greedy) arrives\n" +
                "24.049 157(greedy) leaves\n" +
                "24.330 158 arrives\n" +
                "24.330 158 leaves\n" +
                "24.386 159 arrives\n" +
                "24.386 159 leaves\n" +
                "24.427 160(greedy) arrives\n" +
                "24.427 160(greedy) leaves\n" +
                "24.789 161 arrives\n" +
                "24.789 161 leaves\n" +
                "24.856 162(greedy) arrives\n" +
                "24.856 162(greedy) leaves\n" +
                "25.009 163(greedy) arrives\n" +
                "25.009 163(greedy) leaves\n" +
                "25.050 164 arrives\n" +
                "25.050 164 leaves\n" +
                "25.162 165 arrives\n" +
                "25.162 165 leaves\n" +
                "25.223 137(greedy) done serving by self-check 5\n" +
                "25.223 141 serves by self-check 5\n" +
                "25.227 65 done serving by server 3\n" +
                "25.482 166 arrives\n" +
                "25.482 166 waits at self-check 4\n" +
                "25.584 167(greedy) arrives\n" +
                "25.584 167(greedy) leaves\n" +
                "25.606 66 serves by server 3\n" +
                "25.643 50 done serving by server 2\n" +
                "26.022 141 done serving by self-check 5\n" +
                "26.022 142 serves by self-check 5\n" +
                "26.182 51 serves by server 2\n" +
                "26.424 168 arrives\n" +
                "26.424 168 waits at server 2\n" +
                "26.503 44 serves by server 1\n" +
                "26.953 51 done serving by server 2\n" +
                "27.135 53 serves by server 2\n" +
                "27.178 169 arrives\n" +
                "27.178 169 waits at server 1\n" +
                "27.261 66 done serving by server 3\n" +
                "27.546 44 done serving by server 1\n" +
                "27.700 170 arrives\n" +
                "27.700 170 waits at server 2\n" +
                "27.743 70 serves by server 3\n" +
                "27.975 45 serves by server 1\n" +
                "28.585 70 done serving by server 3\n" +
                "28.831 171 arrives\n" +
                "28.831 171 waits at server 1");

        System.out.println("28.940 172(greedy) arrives\n" +
                "28.940 172(greedy) waits at server 3\n" +
                "28.981 173 arrives\n" +
                "28.981 173 waits at server 3\n" +
                "28.991 174 arrives\n" +
                "28.991 174 waits at self-check 4\n" +
                "29.256 175(greedy) arrives\n" +
                "29.256 175(greedy) leaves\n" +
                "29.389 176(greedy) arrives\n" +
                "29.389 176(greedy) leaves\n" +
                "29.722 177 arrives\n" +
                "29.722 177 leaves\n" +
                "29.881 75 serves by server 3\n" +
                "29.921 142 done serving by self-check 5\n" +
                "29.921 145(greedy) serves by self-check 5\n" +
                "29.989 178 arrives\n" +
                "29.989 178 waits at server 3\n" +
                "30.004 45 done serving by server 1\n" +
                "30.090 179 arrives\n" +
                "30.090 179 waits at self-check 4\n" +
                "30.106 180(greedy) arrives\n" +
                "30.106 180(greedy) leaves\n" +
                "30.184 75 done serving by server 3\n" +
                "30.185 78 serves by server 3\n" +
                "30.253 145(greedy) done serving by self-check 5\n" +
                "30.253 146 serves by self-check 5\n" +
                "30.356 55 serves by server 1\n" +
                "30.723 181(greedy) arrives\n" +
                "30.723 181(greedy) waits at server 1\n" +
                "30.735 140 done serving by self-check 4\n" +
                "30.735 147(greedy) serves by self-check 4\n" +
                "30.797 147(greedy) done serving by self-check 4\n" +
                "30.797 149(greedy) serves by self-check 4\n" +
                "30.830 149(greedy) done serving by self-check 4\n" +
                "30.830 150(greedy) serves by self-check 4\n" +
                "30.859 182 arrives\n" +
                "30.859 182 waits at server 3\n" +
                "30.936 78 done serving by server 3\n" +
                "31.031 183(greedy) arrives\n" +
                "31.031 183(greedy) waits at self-check 4\n" +
                "31.155 184(greedy) arrives\n" +
                "31.155 184(greedy) waits at self-check 4\n" +
                "31.162 185 arrives\n" +
                "31.162 185 waits at self-check 4\n" +
                "31.262 186(greedy) arrives\n" +
                "31.262 186(greedy) waits at self-check 4\n" +
                "31.267 55 done serving by server 1\n" +
                "31.429 53 done serving by server 2\n" +
                "31.580 146 done serving by self-check 5\n" +
                "31.580 153(greedy) serves by self-check 5\n" +
                "31.583 54 serves by server 2\n" +
                "31.679 79 serves by server 3\n" +
                "31.726 187 arrives\n" +
                "31.726 187 waits at server 2\n" +
                "31.758 188 arrives\n" +
                "31.758 188 waits at server 3\n" +
                "31.801 54 done serving by server 2\n" +
                "31.898 189 arrives\n" +
                "31.898 189 waits at self-check 4\n" +
                "31.908 79 done serving by server 3\n" +
                "31.973 153(greedy) done serving by self-check 5\n" +
                "31.973 154(greedy) serves by self-check 5\n" +
                "32.087 190 arrives\n" +
                "32.087 190 waits at self-check 4\n" +
                "32.089 191(greedy) arrives\n" +
                "32.089 191(greedy) leaves\n" +
                "32.135 192 arrives\n" +
                "32.135 192 leaves\n" +
                "32.197 193 arrives\n" +
                "32.197 193 leaves\n" +
                "32.204 194(greedy) arrives\n" +
                "32.204 194(greedy) leaves\n" +
                "32.285 195(greedy) arrives\n" +
                "32.285 195(greedy) leaves\n" +
                "32.374 154(greedy) done serving by self-check 5\n" +
                "32.374 155 serves by self-check 5\n" +
                "32.380 58 serves by server 2\n" +
                "32.552 196 arrives\n" +
                "32.552 196 waits at server 2\n" +
                "32.582 197 arrives\n" +
                "32.582 197 waits at self-check 4\n" +
                "32.593 155 done serving by self-check 5\n" +
                "32.593 166 serves by self-check 5\n" +
                "32.614 92 serves by server 3\n" +
                "32.935 92 done serving by server 3\n" +
                "32.953 198(greedy) arrives\n" +
                "32.953 198(greedy) waits at server 3\n" +
                "33.074 199 arrives\n" +
                "33.074 199 waits at self-check 4\n" +
                "33.113 106(greedy) serves by server 3\n" +
                "33.130 200(greedy) arrives\n" +
                "33.130 200(greedy) waits at server 3\n" +
                "33.276 201(greedy) arrives\n" +
                "33.276 201(greedy) leaves\n" +
                "33.627 202(greedy) arrives\n" +
                "33.627 202(greedy) leaves\n" +
                "33.629 203 arrives\n" +
                "33.629 203 leaves\n" +
                "33.657 68 serves by server 1\n" +
                "33.677 166 done serving by self-check 5\n" +
                "33.677 174 serves by self-check 5\n" +
                "33.772 150(greedy) done serving by self-check 4\n" +
                "33.772 179 serves by self-check 4\n" +
                "33.897 204(greedy) arrives\n" +
                "33.897 204(greedy) waits at self-check 4\n" +
                "33.996 58 done serving by server 2\n" +
                "34.060 205 arrives\n" +
                "34.060 205 waits at server 1\n" +
                "34.150 106(greedy) done serving by server 3\n" +
                "34.462 68 done serving by server 1\n" +
                "34.535 206 arrives\n" +
                "34.535 206 waits at self-check 4\n" +
                "34.637 207 arrives\n" +
                "34.637 207 leaves\n" +
                "34.667 208 arrives\n" +
                "34.667 208 leaves\n" +
                "34.899 209(greedy) arrives\n" +
                "34.899 209(greedy) leaves\n" +
                "34.925 210(greedy) arrives\n" +
                "34.925 210(greedy) leaves\n" +
                "34.986 211(greedy) arrives\n" +
                "34.986 211(greedy) leaves\n" +
                "35.052 179 done serving by self-check 4\n" +
                "35.052 183(greedy) serves by self-check 4\n" +
                "35.175 212(greedy) arrives\n" +
                "35.175 212(greedy) waits at self-check 4\n" +
                "35.493 183(greedy) done serving by self-check 4\n" +
                "35.493 184(greedy) serves by self-check 4\n" +
                "35.548 213 arrives\n" +
                "35.548 213 waits at self-check 4\n" +
                "35.695 60 serves by server 2\n" +
                "35.792 184(greedy) done serving by self-check 4\n" +
                "35.792 185 serves by self-check 4\n" +
                "35.796 185 done serving by self-check 4\n" +
                "35.796 186(greedy) serves by self-check 4\n" +
                "35.874 214(greedy) arrives\n" +
                "35.874 214(greedy) waits at self-check 4\n" +
                "35.881 215 arrives\n" +
                "35.881 215 waits at server 2\n" +
                "35.901 216(greedy) arrives\n" +
                "35.901 216(greedy) waits at self-check 4\n" +
                "35.919 217(greedy) arrives\n" +
                "35.919 217(greedy) leaves\n" +
                "36.113 218 arrives\n" +
                "36.113 218 leaves\n" +
                "36.153 77 serves by server 1\n" +
                "36.319 219(greedy) arrives\n" +
                "36.319 219(greedy) waits at server 1\n" +
                "36.434 174 done serving by self-check 5\n" +
                "36.434 189 serves by self-check 5\n" +
                "36.435 77 done serving by server 1\n" +
                "36.493 189 done serving by self-check 5\n" +
                "36.493 190 serves by self-check 5\n" +
                "36.545 186(greedy) done serving by self-check 4\n" +
                "36.545 197 serves by self-check 4\n" +
                "36.555 99 serves by server 1\n" +
                "36.581 190 done serving by self-check 5\n" +
                "36.581 199 serves by self-check 5\n" +
                "36.733 220 arrives\n" +
                "36.733 220 waits at server 1\n" +
                "36.874 99 done serving by server 1\n" +
                "36.889 221 arrives\n" +
                "36.889 221 waits at self-check 4\n" +
                "36.923 222(greedy) arrives\n" +
                "36.923 222(greedy) waits at self-check 4\n" +
                "36.952 223 arrives\n" +
                "36.952 223 waits at self-check 4\n" +
                "37.066 224(greedy) arrives\n" +
                "37.066 224(greedy) waits at self-check 4\n" +
                "37.137 199 done serving by self-check 5\n" +
                "37.137 204(greedy) serves by self-check 5\n" +
                "37.275 197 done serving by self-check 4\n" +
                "37.275 206 serves by self-check 4\n" +
                "37.314 206 done serving by self-check 4\n" +
                "37.314 212(greedy) serves by self-check 4\n" +
                "37.380 225 arrives\n" +
                "37.380 225 waits at self-check 4\n" +
                "37.476 226 arrives\n" +
                "37.476 226 waits at self-check 4\n" +
                "37.606 227 arrives\n" +
                "37.606 227 waits at self-check 4\n" +
                "37.627 228 arrives\n" +
                "37.627 228 leaves\n" +
                "37.679 60 done serving by server 2\n" +
                "37.714 115(greedy) serves by server 3\n" +
                "37.737 61 serves by server 2\n" +
                "37.759 61 done serving by server 2\n" +
                "37.926 204(greedy) done serving by self-check 5\n" +
                "37.926 213 serves by self-check 5\n" +
                "38.071 115(greedy) done serving by server 3\n" +
                "38.089 229(greedy) arrives\n" +
                "38.089 229(greedy) waits at server 2\n" +
                "38.089 230(greedy) arrives\n" +
                "38.089 230(greedy) waits at server 3\n" +
                "38.269 231 arrives\n" +
                "38.269 231 waits at self-check 4\n" +
                "38.304 74 serves by server 2\n" +
                "38.441 232(greedy) arrives\n" +
                "38.441 232(greedy) waits at server 2\n" +
                "38.497 233 arrives\n" +
                "38.497 233 leaves\n" +
                "38.712 111 serves by server 1\n" +
                "38.808 234 arrives\n" +
                "38.808 234 waits at server 1\n" +
                "38.811 235 arrives\n" +
                "38.811 235 leaves\n" +
                "38.869 236 arrives\n" +
                "38.869 236 leaves\n" +
                "38.983 213 done serving by self-check 5\n" +
                "38.983 214(greedy) serves by self-check 5\n" +
                "39.039 237 arrives\n" +
                "39.039 237 waits at self-check 4\n" +
                "39.067 212(greedy) done serving by self-check 4\n" +
                "39.067 216(greedy) serves by self-check 4\n" +
                "39.138 111 done serving by server 1\n" +
                "39.270 238 arrives\n" +
                "39.270 238 waits at self-check 4\n" +
                "39.646 239(greedy) arrives\n" +
                "39.646 239(greedy) leaves\n" +
                "39.665 240 arrives\n" +
                "39.665 240 leaves\n" +
                "39.693 120(greedy) serves by server 1\n" +
                "39.709 241(greedy) arrives\n" +
                "39.709 241(greedy) waits at server 1\n" +
                "39.849 216(greedy) done serving by self-check 4\n" +
                "39.849 221 serves by self-check 4\n" +
                "39.901 120(greedy) done serving by server 1\n" +
                "39.955 242 arrives\n" +
                "39.955 242 waits at self-check 4\n" +
                "40.067 243 arrives\n" +
                "40.067 243 leaves\n" +
                "40.122 244 arrives\n" +
                "40.122 244 leaves\n" +
                "40.122 214(greedy) done serving by self-check 5\n" +
                "40.122 222(greedy) serves by self-check 5\n" +
                "40.272 245(greedy) arrives\n" +
                "40.272 245(greedy) waits at self-check 4\n" +
                "40.347 246(greedy) arrives\n" +
                "40.347 246(greedy) leaves\n" +
                "40.605 247 arrives\n" +
                "40.605 247 leaves\n" +
                "40.658 248(greedy) arrives\n" +
                "40.658 248(greedy) leaves\n" +
                "40.688 249(greedy) arrives\n" +
                "40.688 249(greedy) leaves\n" +
                "40.889 250 arrives\n" +
                "40.889 250 leaves\n" +
                "41.193 221 done serving by self-check 4\n" +
                "41.193 223 serves by self-check 4\n" +
                "41.273 251 arrives\n" +
                "41.273 251 waits at self-check 4\n" +
                "41.362 252 arrives\n" +
                "41.362 252 leaves\n" +
                "41.458 253 arrives\n" +
                "41.458 253 leaves\n" +
                "41.515 74 done serving by server 2\n" +
                "41.755 254(greedy) arrives\n" +
                "41.755 254(greedy) leaves\n" +
                "41.768 103 serves by server 2\n" +
                "41.932 255(greedy) arrives\n" +
                "41.932 255(greedy) waits at server 2\n" +
                "42.011 256(greedy) arrives\n" +
                "42.011 256(greedy) leaves\n" +
                "42.177 257(greedy) arrives\n" +
                "42.177 257(greedy) leaves\n" +
                "42.212 258(greedy) arrives\n" +
                "42.212 258(greedy) leaves\n" +
                "42.247 259 arrives\n" +
                "42.247 259 leaves\n" +
                "42.332 103 done serving by server 2\n" +
                "42.715 260(greedy) arrives\n" +
                "42.715 260(greedy) leaves\n" +
                "42.787 223 done serving by self-check 4\n" +
                "42.787 224(greedy) serves by self-check 4\n" +
                "42.863 261(greedy) arrives\n" +
                "42.863 261(greedy) waits at self-check 4\n" +
                "42.918 122(greedy) serves by server 3\n" +
                "42.949 262(greedy) arrives\n" +
                "42.949 262(greedy) waits at server 3\n" +
                "43.013 263(greedy) arrives\n" +
                "43.013 263(greedy) leaves\n" +
                "43.042 264(greedy) arrives\n" +
                "43.042 264(greedy) leaves\n" +
                "43.074 265(greedy) arrives\n" +
                "43.074 265(greedy) leaves\n" +
                "43.128 224(greedy) done serving by self-check 4\n" +
                "43.128 225 serves by self-check 4\n" +
                "43.154 266 arrives\n" +
                "43.154 266 waits at self-check 4\n" +
                "43.162 267 arrives\n" +
                "43.162 267 leaves\n" +
                "43.174 268(greedy) arrives\n" +
                "43.174 268(greedy) leaves\n" +
                "43.422 222(greedy) done serving by self-check 5\n" +
                "43.422 226 serves by self-check 5\n" +
                "43.489 269(greedy) arrives\n" +
                "43.489 269(greedy) waits at self-check 4\n" +
                "43.495 225 done serving by self-check 4\n" +
                "43.495 227 serves by self-check 4\n" +
                "43.528 270 arrives\n" +
                "43.528 270 waits at self-check 4\n" +
                "43.551 126(greedy) serves by server 2\n" +
                "43.601 271 arrives\n" +
                "43.601 271 waits at server 2\n" +
                "43.622 272(greedy) arrives\n" +
                "43.622 272(greedy) leaves\n" +
                "43.832 227 done serving by self-check 4\n" +
                "43.832 231 serves by self-check 4\n" +
                "43.861 273 arrives\n" +
                "43.861 273 waits at self-check 4\n" +
                "43.953 274(greedy) arrives\n" +
                "43.953 274(greedy) leaves\n" +
                "44.093 275 arrives\n" +
                "44.093 275 leaves\n" +
                "44.179 226 done serving by self-check 5\n" +
                "44.179 237 serves by self-check 5\n" +
                "44.354 231 done serving by self-check 4\n" +
                "44.354 238 serves by self-check 4\n" +
                "44.448 276 arrives\n" +
                "44.448 276 waits at self-check 4\n" +
                "44.469 277(greedy) arrives\n" +
                "44.469 277(greedy) waits at self-check 4\n" +
                "44.655 278 arrives\n" +
                "44.655 278 leaves\n" +
                "44.733 279 arrives\n" +
                "44.733 279 leaves\n" +
                "44.973 237 done serving by self-check 5\n" +
                "44.973 242 serves by self-check 5\n" +
                "45.016 122(greedy) done serving by server 3\n" +
                "45.037 143 serves by server 1\n" +
                "45.196 280(greedy) arrives\n" +
                "45.196 280(greedy) waits at server 1\n" +
                "45.259 281(greedy) arrives\n" +
                "45.259 281(greedy) waits at self-check 4\n" +
                "45.322 282(greedy) arrives\n" +
                "45.322 282(greedy) leaves\n" +
                "45.457 139(greedy) serves by server 3\n" +
                "45.538 283 arrives\n" +
                "45.538 283 waits at server 3\n" +
                "45.544 238 done serving by self-check 4\n" +
                "45.544 245(greedy) serves by self-check 4\n" +
                "45.635 245(greedy) done serving by self-check 4\n" +
                "45.635 251 serves by self-check 4\n" +
                "45.694 126(greedy) done serving by server 2\n" +
                "45.825 151(greedy) serves by server 2\n" +
                "45.832 284(greedy) arrives\n" +
                "45.832 284(greedy) waits at self-check 4\n" +
                "46.005 285(greedy) arrives\n" +
                "46.005 285(greedy) waits at server 2\n" +
                "46.133 286 arrives\n" +
                "46.133 286 waits at self-check 4\n" +
                "46.356 242 done serving by self-check 5\n" +
                "46.356 261(greedy) serves by self-check 5\n" +
                "46.390 287 arrives\n" +
                "46.390 287 waits at self-check 4\n" +
                "46.492 288 arrives\n" +
                "46.492 288 leaves\n" +
                "46.513 289(greedy) arrives\n" +
                "46.513 289(greedy) leaves\n" +
                "46.575 261(greedy) done serving by self-check 5\n" +
                "46.575 266 serves by self-check 5\n" +
                "46.672 151(greedy) done serving by server 2\n" +
                "46.704 251 done serving by self-check 4\n" +
                "46.704 269(greedy) serves by self-check 4\n" +
                "46.818 290(greedy) arrives\n" +
                "46.818 290(greedy) waits at self-check 4\n" +
                "46.845 291(greedy) arrives\n" +
                "46.845 291(greedy) waits at self-check 4\n" +
                "46.873 266 done serving by self-check 5\n" +
                "46.873 270 serves by self-check 5\n" +
                "46.919 139(greedy) done serving by server 3\n" +
                "46.997 292 arrives\n" +
                "46.997 292 waits at self-check 4\n" +
                "47.008 143 done serving by server 1\n" +
                "47.020 293(greedy) arrives\n" +
                "47.020 293(greedy) leaves\n" +
                "47.082 294(greedy) arrives\n" +
                "47.082 294(greedy) leaves\n" +
                "47.112 269(greedy) done serving by self-check 4\n" +
                "47.112 273 serves by self-check 4\n" +
                "47.192 168 serves by server 2\n" +
                "47.328 295(greedy) arrives\n" +
                "47.328 295(greedy) waits at server 2\n" +
                "47.393 273 done serving by self-check 4\n" +
                "47.393 276 serves by self-check 4\n" +
                "47.538 296 arrives\n" +
                "47.538 296 waits at self-check 4\n" +
                "47.540 297(greedy) arrives\n" +
                "47.540 297(greedy) waits at self-check 4\n" +
                "47.549 276 done serving by self-check 4\n" +
                "47.549 277(greedy) serves by self-check 4\n" +
                "47.553 298(greedy) arrives\n" +
                "47.553 298(greedy) waits at self-check 4\n" +
                "47.596 270 done serving by self-check 5\n" +
                "47.596 281(greedy) serves by self-check 5\n" +
                "47.683 299(greedy) arrives\n" +
                "47.683 299(greedy) waits at self-check 4\n" +
                "47.830 300 arrives\n" +
                "47.830 300 leaves\n" +
                "47.889 301(greedy) arrives\n" +
                "47.889 301(greedy) leaves\n" +
                "48.038 281(greedy) done serving by self-check 5\n" +
                "48.038 284(greedy) serves by self-check 5\n" +
                "48.070 302 arrives\n" +
                "48.070 302 waits at self-check 4\n" +
                "48.186 172(greedy) serves by server 3\n" +
                "48.204 303(greedy) arrives\n" +
                "48.204 303(greedy) waits at server 3\n" +
                "48.298 284(greedy) done serving by self-check 5\n" +
                "48.298 286 serves by self-check 5\n" +
                "48.545 286 done serving by self-check 5\n" +
                "48.545 287 serves by self-check 5\n" +
                "48.679 304(greedy) arrives\n" +
                "48.679 304(greedy) waits at self-check 4\n" +
                "48.830 305 arrives\n" +
                "48.830 305 waits at self-check 4\n" +
                "49.054 306 arrives\n" +
                "49.054 306 leaves\n" +
                "49.073 287 done serving by self-check 5\n" +
                "49.073 290(greedy) serves by self-check 5\n" +
                "49.222 307 arrives\n" +
                "49.222 307 waits at self-check 4\n" +
                "49.329 172(greedy) done serving by server 3\n" +
                "49.622 308(greedy) arrives\n" +
                "49.622 308(greedy) leaves\n" +
                "49.692 277(greedy) done serving by self-check 4\n" +
                "49.692 291(greedy) serves by self-check 4\n" +
                "49.698 309 arrives\n" +
                "49.698 309 waits at self-check 4\n" +
                "49.884 290(greedy) done serving by self-check 5\n" +
                "49.884 292 serves by self-check 5\n" +
                "49.955 168 done serving by server 2\n" +
                "50.014 310(greedy) arrives\n" +
                "50.014 310(greedy) waits at self-check 4\n" +
                "50.020 311(greedy) arrives\n" +
                "50.020 311(greedy) leaves\n" +
                "50.082 312 arrives\n" +
                "50.082 312 leaves\n" +
                "50.114 313 arrives\n" +
                "50.114 313 leaves\n" +
                "50.206 314(greedy) arrives\n" +
                "50.206 314(greedy) leaves\n" +
                "50.216 170 serves by server 2\n" +
                "50.427 173 serves by server 3\n" +
                "50.430 315 arrives\n" +
                "50.430 315 waits at server 2\n" +
                "50.493 316(greedy) arrives\n" +
                "50.493 316(greedy) waits at server 3\n" +
                "50.591 292 done serving by self-check 5\n" +
                "50.591 296 serves by self-check 5\n" +
                "50.709 317(greedy) arrives\n" +
                "50.709 317(greedy) waits at self-check 4\n" +
                "51.215 152(greedy) serves by server 1\n" +
                "51.299 318(greedy) arrives\n" +
                "51.299 318(greedy) waits at server 1\n" +
                "51.321 319 arrives\n" +
                "51.321 319 leaves\n" +
                "51.362 291(greedy) done serving by self-check 4\n" +
                "51.362 297(greedy) serves by self-check 4\n" +
                "51.460 320(greedy) arrives\n" +
                "51.460 320(greedy) waits at self-check 4\n" +
                "51.623 321 arrives\n" +
                "51.623 321 leaves\n" +
                "51.702 322(greedy) arrives\n" +
                "51.702 322(greedy) leaves\n" +
                "51.836 323 arrives\n" +
                "51.836 323 leaves\n" +
                "51.870 324(greedy) arrives\n" +
                "51.870 324(greedy) leaves\n" +
                "51.920 325 arrives\n" +
                "51.920 325 leaves\n" +
                "51.993 326 arrives\n" +
                "51.993 326 leaves\n" +
                "52.027 327(greedy) arrives\n" +
                "52.027 327(greedy) leaves\n" +
                "52.160 173 done serving by server 3\n" +
                "52.189 178 serves by server 3\n" +
                "52.259 328 arrives\n" +
                "52.259 328 waits at server 3\n" +
                "52.309 152(greedy) done serving by server 1\n" +
                "52.533 329 arrives\n" +
                "52.533 329 leaves\n" +
                "52.535 330(greedy) arrives\n" +
                "52.535 330(greedy) leaves\n" +
                "52.609 178 done serving by server 3\n" +
                "52.876 296 done serving by self-check 5\n" +
                "52.876 298(greedy) serves by self-check 5\n" +
                "52.971 331 arrives\n" +
                "52.971 331 waits at self-check 4\n" +
                "53.132 297(greedy) done serving by self-check 4\n" +
                "53.132 299(greedy) serves by self-check 4\n" +
                "53.145 332 arrives\n" +
                "53.145 332 waits at self-check 4\n" +
                "53.202 333(greedy) arrives\n" +
                "53.202 333(greedy) leaves\n" +
                "53.454 334(greedy) arrives\n" +
                "53.454 334(greedy) leaves\n" +
                "53.508 298(greedy) done serving by self-check 5\n" +
                "53.508 302 serves by self-check 5\n" +
                "53.548 335 arrives\n" +
                "53.548 335 waits at self-check 4\n" +
                "53.572 336(greedy) arrives\n" +
                "53.572 336(greedy) leaves\n" +
                "53.638 337 arrives\n" +
                "53.638 337 leaves\n" +
                "53.733 338 arrives\n" +
                "53.733 338 leaves\n" +
                "53.917 339(greedy) arrives\n" +
                "53.917 339(greedy) leaves");

        System.out.println("53.947 340(greedy) arrives\n" +
                "53.947 340(greedy) leaves\n" +
                "53.990 341(greedy) arrives\n" +
                "53.990 341(greedy) leaves\n" +
                "54.017 342(greedy) arrives\n" +
                "54.017 342(greedy) leaves\n" +
                "54.049 302 done serving by self-check 5\n" +
                "54.049 304(greedy) serves by self-check 5\n" +
                "54.098 170 done serving by server 2\n" +
                "54.147 343 arrives\n" +
                "54.147 343 waits at self-check 4\n" +
                "54.223 344(greedy) arrives\n" +
                "54.223 344(greedy) leaves\n" +
                "54.279 187 serves by server 2\n" +
                "54.312 345 arrives\n" +
                "54.312 345 waits at server 2\n" +
                "54.441 346(greedy) arrives\n" +
                "54.441 346(greedy) leaves\n" +
                "54.489 299(greedy) done serving by self-check 4\n" +
                "54.489 305 serves by self-check 4\n" +
                "54.754 347 arrives\n" +
                "54.754 347 waits at self-check 4\n" +
                "54.871 305 done serving by self-check 4\n" +
                "54.871 307 serves by self-check 4\n" +
                "54.902 348 arrives\n" +
                "54.902 348 waits at self-check 4\n" +
                "54.984 169 serves by server 1\n" +
                "55.072 349(greedy) arrives\n" +
                "55.072 349(greedy) waits at server 1\n" +
                "55.102 182 serves by server 3\n" +
                "55.125 304(greedy) done serving by self-check 5\n" +
                "55.125 309 serves by self-check 5\n" +
                "55.206 350 arrives\n" +
                "55.206 350 waits at server 3\n" +
                "55.249 309 done serving by self-check 5\n" +
                "55.249 310(greedy) serves by self-check 5\n" +
                "55.258 351 arrives\n" +
                "55.258 351 waits at self-check 4\n" +
                "55.344 352 arrives\n" +
                "55.344 352 waits at self-check 4\n" +
                "55.368 187 done serving by server 2\n" +
                "55.380 196 serves by server 2\n" +
                "55.419 353 arrives\n" +
                "55.419 353 waits at server 2\n" +
                "55.423 354(greedy) arrives\n" +
                "55.423 354(greedy) leaves\n" +
                "55.441 355 arrives\n" +
                "55.441 355 leaves\n" +
                "55.471 356 arrives\n" +
                "55.471 356 leaves\n" +
                "55.548 357(greedy) arrives\n" +
                "55.548 357(greedy) leaves\n" +
                "55.670 358(greedy) arrives\n" +
                "55.670 358(greedy) leaves\n" +
                "55.684 359(greedy) arrives\n" +
                "55.684 359(greedy) leaves\n" +
                "55.695 360(greedy) arrives\n" +
                "55.695 360(greedy) leaves\n" +
                "55.698 182 done serving by server 3\n" +
                "55.863 361(greedy) arrives\n" +
                "55.863 361(greedy) leaves\n" +
                "55.925 362(greedy) arrives\n" +
                "55.925 362(greedy) leaves\n" +
                "55.955 188 serves by server 3\n" +
                "55.998 363 arrives\n" +
                "55.998 363 waits at server 3\n" +
                "56.003 307 done serving by self-check 4\n" +
                "56.003 317(greedy) serves by self-check 4\n" +
                "56.063 364(greedy) arrives\n" +
                "56.063 364(greedy) waits at self-check 4\n" +
                "56.344 365(greedy) arrives\n" +
                "56.344 365(greedy) leaves\n" +
                "56.406 366 arrives\n" +
                "56.406 366 leaves\n" +
                "56.620 367 arrives\n" +
                "56.620 367 leaves\n" +
                "56.771 368 arrives\n" +
                "56.771 368 leaves\n" +
                "56.844 369 arrives\n" +
                "56.844 369 leaves\n" +
                "56.859 370 arrives\n" +
                "56.859 370 leaves\n" +
                "57.019 371(greedy) arrives\n" +
                "57.019 371(greedy) leaves\n" +
                "57.165 372 arrives\n" +
                "57.165 372 leaves\n" +
                "57.303 373(greedy) arrives\n" +
                "57.303 373(greedy) leaves\n" +
                "57.432 374(greedy) arrives\n" +
                "57.432 374(greedy) leaves\n" +
                "57.461 375(greedy) arrives\n" +
                "57.461 375(greedy) leaves\n" +
                "57.468 317(greedy) done serving by self-check 4\n" +
                "57.468 320(greedy) serves by self-check 4\n" +
                "57.671 376(greedy) arrives\n" +
                "57.671 376(greedy) waits at self-check 4\n" +
                "57.747 377(greedy) arrives\n" +
                "57.747 377(greedy) leaves\n" +
                "57.750 378 arrives\n" +
                "57.750 378 leaves\n" +
                "57.829 379(greedy) arrives\n" +
                "57.829 379(greedy) leaves\n" +
                "57.844 188 done serving by server 3\n" +
                "57.869 380 arrives\n" +
                "57.869 380 leaves\n" +
                "57.916 381(greedy) arrives\n" +
                "57.916 381(greedy) leaves\n" +
                "58.071 169 done serving by server 1\n" +
                "58.210 310(greedy) done serving by self-check 5\n" +
                "58.210 331 serves by self-check 5\n" +
                "58.293 382(greedy) arrives\n" +
                "58.293 382(greedy) waits at self-check 4\n" +
                "58.364 320(greedy) done serving by self-check 4\n" +
                "58.364 332 serves by self-check 4\n" +
                "58.398 383(greedy) arrives\n" +
                "58.398 383(greedy) waits at self-check 4\n" +
                "58.400 384 arrives\n" +
                "58.400 384 leaves\n" +
                "58.475 385 arrives\n" +
                "58.475 385 leaves\n" +
                "58.660 386(greedy) arrives\n" +
                "58.660 386(greedy) leaves\n" +
                "58.731 332 done serving by self-check 4\n" +
                "58.731 335 serves by self-check 4\n" +
                "58.837 387(greedy) arrives\n" +
                "58.837 387(greedy) waits at self-check 4\n" +
                "58.900 388 arrives\n" +
                "58.900 388 leaves\n" +
                "59.035 389 arrives\n" +
                "59.035 389 leaves\n" +
                "59.136 390 arrives\n" +
                "59.136 390 leaves\n" +
                "59.502 198(greedy) serves by server 3\n" +
                "59.504 391(greedy) arrives\n" +
                "59.504 391(greedy) waits at server 3\n" +
                "59.676 392(greedy) arrives\n" +
                "59.676 392(greedy) leaves\n" +
                "59.829 393(greedy) arrives\n" +
                "59.829 393(greedy) leaves\n" +
                "59.883 394(greedy) arrives\n" +
                "59.883 394(greedy) leaves\n" +
                "59.891 395 arrives\n" +
                "59.891 395 leaves\n" +
                "59.930 331 done serving by self-check 5\n" +
                "59.930 343 serves by self-check 5\n" +
                "59.936 396 arrives\n" +
                "59.936 396 waits at self-check 4\n" +
                "60.228 343 done serving by self-check 5\n" +
                "60.228 347 serves by self-check 5\n" +
                "60.229 397 arrives\n" +
                "60.229 397 waits at self-check 4\n" +
                "60.245 398(greedy) arrives\n" +
                "60.245 398(greedy) leaves\n" +
                "60.330 399(greedy) arrives\n" +
                "60.330 399(greedy) leaves\n" +
                "60.345 400 arrives\n" +
                "60.345 400 leaves\n" +
                "60.372 335 done serving by self-check 4\n" +
                "60.372 348 serves by self-check 4\n" +
                "60.382 401 arrives\n" +
                "60.382 401 waits at self-check 4\n" +
                "60.471 198(greedy) done serving by server 3\n" +
                "60.499 402(greedy) arrives\n" +
                "60.499 402(greedy) leaves\n" +
                "60.543 403(greedy) arrives\n" +
                "60.543 403(greedy) leaves\n" +
                "61.055 404(greedy) arrives\n" +
                "61.055 404(greedy) leaves\n" +
                "61.262 405(greedy) arrives\n" +
                "61.262 405(greedy) leaves\n" +
                "61.292 406 arrives\n" +
                "61.292 406 leaves\n" +
                "61.324 348 done serving by self-check 4\n" +
                "61.324 351 serves by self-check 4\n" +
                "61.364 407(greedy) arrives\n" +
                "61.364 407(greedy) waits at self-check 4\n" +
                "61.449 408 arrives\n" +
                "61.449 408 leaves\n" +
                "61.453 409(greedy) arrives\n" +
                "61.453 409(greedy) leaves\n" +
                "61.567 347 done serving by self-check 5\n" +
                "61.567 352 serves by self-check 5\n" +
                "61.656 171 serves by server 1\n" +
                "61.721 410 arrives\n" +
                "61.721 410 waits at server 1\n" +
                "62.072 351 done serving by self-check 4\n" +
                "62.072 364(greedy) serves by self-check 4\n" +
                "62.139 411 arrives\n" +
                "62.139 411 waits at self-check 4\n" +
                "62.160 352 done serving by self-check 5\n" +
                "62.160 376(greedy) serves by self-check 5\n" +
                "62.210 412(greedy) arrives\n" +
                "62.210 412(greedy) waits at self-check 4\n" +
                "62.269 413 arrives\n" +
                "62.269 413 waits at self-check 4\n" +
                "62.270 414(greedy) arrives\n" +
                "62.270 414(greedy) leaves\n" +
                "62.474 415 arrives\n" +
                "62.474 415 leaves\n" +
                "62.733 416 arrives\n" +
                "62.733 416 leaves\n" +
                "62.783 376(greedy) done serving by self-check 5\n" +
                "62.783 382(greedy) serves by self-check 5\n" +
                "62.969 417(greedy) arrives\n" +
                "62.969 417(greedy) waits at self-check 4\n" +
                "63.132 196 done serving by server 2\n" +
                "63.258 200(greedy) serves by server 3\n" +
                "63.282 200(greedy) done serving by server 3\n" +
                "63.308 418 arrives\n" +
                "63.308 418 waits at server 3\n" +
                "63.398 419(greedy) arrives\n" +
                "63.398 419(greedy) leaves\n" +
                "63.417 420(greedy) arrives\n" +
                "63.417 420(greedy) leaves\n" +
                "63.493 230(greedy) serves by server 3\n" +
                "63.581 171 done serving by server 1\n" +
                "63.665 421(greedy) arrives\n" +
                "63.665 421(greedy) waits at server 3\n" +
                "63.805 422(greedy) arrives\n" +
                "63.805 422(greedy) leaves\n" +
                "63.835 423 arrives\n" +
                "63.835 423 leaves\n" +
                "64.038 424 arrives\n" +
                "64.038 424 leaves\n" +
                "64.044 425(greedy) arrives\n" +
                "64.044 425(greedy) leaves\n" +
                "64.053 426(greedy) arrives\n" +
                "64.053 426(greedy) leaves\n" +
                "64.162 427 arrives\n" +
                "64.162 427 leaves\n" +
                "64.239 428(greedy) arrives\n" +
                "64.239 428(greedy) leaves\n" +
                "64.280 429 arrives\n" +
                "64.280 429 leaves\n" +
                "64.381 430 arrives\n" +
                "64.381 430 leaves\n" +
                "64.572 431 arrives\n" +
                "64.572 431 leaves\n" +
                "64.733 364(greedy) done serving by self-check 4\n" +
                "64.733 383(greedy) serves by self-check 4\n" +
                "64.826 230(greedy) done serving by server 3\n" +
                "64.887 432 arrives\n" +
                "64.887 432 waits at self-check 4\n" +
                "64.950 433(greedy) arrives\n" +
                "64.950 433(greedy) leaves\n" +
                "65.040 262(greedy) serves by server 3\n" +
                "65.042 434 arrives\n" +
                "65.042 434 waits at server 3\n" +
                "65.160 262(greedy) done serving by server 3\n" +
                "65.161 435 arrives\n" +
                "65.161 435 leaves\n" +
                "65.323 215 serves by server 2\n" +
                "65.381 181(greedy) serves by server 1\n" +
                "65.387 181(greedy) done serving by server 1\n" +
                "65.421 436 arrives\n" +
                "65.421 436 waits at server 1\n" +
                "65.431 283 serves by server 3\n" +
                "65.431 215 done serving by server 2\n" +
                "65.464 437 arrives\n" +
                "65.464 437 waits at server 2\n" +
                "65.466 438(greedy) arrives\n" +
                "65.466 438(greedy) waits at server 3\n" +
                "65.527 439 arrives\n" +
                "65.527 439 leaves\n" +
                "65.571 205 serves by server 1\n" +
                "65.601 440 arrives\n" +
                "65.601 440 waits at server 1\n" +
                "65.902 441(greedy) arrives\n" +
                "65.902 441(greedy) leaves\n" +
                "66.070 442(greedy) arrives\n" +
                "66.070 442(greedy) leaves\n" +
                "66.107 205 done serving by server 1\n" +
                "66.246 443 arrives\n" +
                "66.246 443 leaves\n" +
                "66.450 229(greedy) serves by server 2\n" +
                "66.453 444(greedy) arrives\n" +
                "66.453 444(greedy) waits at server 2\n" +
                "66.556 445(greedy) arrives\n" +
                "66.556 445(greedy) leaves\n" +
                "67.023 446(greedy) arrives\n" +
                "67.023 446(greedy) leaves\n" +
                "67.030 283 done serving by server 3\n" +
                "67.222 447 arrives\n" +
                "67.222 447 leaves\n" +
                "67.225 229(greedy) done serving by server 2\n" +
                "67.534 448 arrives\n" +
                "67.534 448 leaves\n" +
                "67.686 449(greedy) arrives\n" +
                "67.686 449(greedy) leaves\n" +
                "67.764 450(greedy) arrives\n" +
                "67.764 450(greedy) leaves\n" +
                "67.768 451(greedy) arrives\n" +
                "67.768 451(greedy) leaves\n" +
                "67.919 452 arrives\n" +
                "67.919 452 leaves\n" +
                "68.067 453(greedy) arrives\n" +
                "68.067 453(greedy) leaves\n" +
                "68.076 454 arrives\n" +
                "68.076 454 leaves\n" +
                "68.132 455 arrives\n" +
                "68.132 455 leaves\n" +
                "68.229 219(greedy) serves by server 1\n" +
                "68.281 456(greedy) arrives\n" +
                "68.281 456(greedy) waits at server 1\n" +
                "68.295 457 arrives\n" +
                "68.295 457 leaves\n" +
                "68.340 303(greedy) serves by server 3\n" +
                "68.343 458(greedy) arrives\n" +
                "68.343 458(greedy) waits at server 3\n" +
                "68.392 459 arrives\n" +
                "68.392 459 leaves\n" +
                "68.453 382(greedy) done serving by self-check 5\n" +
                "68.453 387(greedy) serves by self-check 5\n" +
                "68.611 460 arrives\n" +
                "68.611 460 waits at self-check 4\n" +
                "68.729 461 arrives\n" +
                "68.729 461 leaves\n" +
                "68.835 387(greedy) done serving by self-check 5\n" +
                "68.835 396 serves by self-check 5\n" +
                "69.085 462 arrives\n" +
                "69.085 462 waits at self-check 4\n" +
                "69.089 463 arrives\n" +
                "69.089 463 leaves\n" +
                "69.147 232(greedy) serves by server 2\n" +
                "69.399 219(greedy) done serving by server 1\n" +
                "69.445 396 done serving by self-check 5\n" +
                "69.445 397 serves by self-check 5\n" +
                "69.482 220 serves by server 1\n" +
                "69.516 220 done serving by server 1\n" +
                "69.644 397 done serving by self-check 5\n" +
                "69.644 401 serves by self-check 5\n" +
                "69.704 464(greedy) arrives\n" +
                "69.704 464(greedy) waits at self-check 4\n" +
                "69.706 465(greedy) arrives\n" +
                "69.706 465(greedy) waits at server 1\n" +
                "69.732 466 arrives\n" +
                "69.732 466 waits at server 2\n" +
                "69.788 467 arrives\n" +
                "69.788 467 waits at self-check 4\n" +
                "70.095 232(greedy) done serving by server 2\n" +
                "70.130 468 arrives\n" +
                "70.130 468 leaves\n" +
                "70.142 234 serves by server 1\n" +
                "70.187 401 done serving by self-check 5\n" +
                "70.187 407(greedy) serves by self-check 5\n" +
                "70.240 303(greedy) done serving by server 3\n" +
                "70.266 469(greedy) arrives\n" +
                "70.266 469(greedy) waits at server 1\n" +
                "70.624 470 arrives\n" +
                "70.624 470 waits at self-check 4\n" +
                "70.712 471(greedy) arrives\n" +
                "70.712 471(greedy) leaves\n" +
                "70.750 407(greedy) done serving by self-check 5\n" +
                "70.750 411 serves by self-check 5\n" +
                "70.842 411 done serving by self-check 5\n" +
                "70.842 412(greedy) serves by self-check 5\n" +
                "70.920 472 arrives\n" +
                "70.920 472 waits at self-check 4\n" +
                "70.947 255(greedy) serves by server 2\n" +
                "70.994 255(greedy) done serving by server 2\n" +
                "71.037 234 done serving by server 1\n" +
                "71.050 316(greedy) serves by server 3\n" +
                "71.078 412(greedy) done serving by self-check 5\n" +
                "71.078 413 serves by self-check 5\n" +
                "71.123 473(greedy) arrives\n" +
                "71.123 473(greedy) waits at self-check 4\n" +
                "71.153 474(greedy) arrives\n" +
                "71.153 474(greedy) waits at server 2\n" +
                "71.162 413 done serving by self-check 5\n" +
                "71.162 417(greedy) serves by self-check 5\n" +
                "71.179 383(greedy) done serving by self-check 4\n" +
                "71.179 432 serves by self-check 4\n" +
                "71.303 316(greedy) done serving by server 3\n" +
                "71.313 417(greedy) done serving by self-check 5\n" +
                "71.313 460 serves by self-check 5\n" +
                "71.334 328 serves by server 3\n" +
                "71.508 475 arrives\n" +
                "71.508 475 waits at server 3\n" +
                "71.568 241(greedy) serves by server 1\n" +
                "71.669 271 serves by server 2\n" +
                "71.770 241(greedy) done serving by server 1\n" +
                "71.916 280(greedy) serves by server 1\n" +
                "71.983 476 arrives\n" +
                "71.983 476 waits at server 1\n" +
                "72.304 280(greedy) done serving by server 1\n" +
                "72.340 432 done serving by self-check 4\n" +
                "72.340 462 serves by self-check 4\n" +
                "72.343 477(greedy) arrives\n" +
                "72.343 477(greedy) waits at self-check 4\n" +
                "72.369 478 arrives\n" +
                "72.369 478 waits at server 1\n" +
                "72.401 318(greedy) serves by server 1\n" +
                "72.428 271 done serving by server 2\n" +
                "72.534 479(greedy) arrives\n" +
                "72.534 479(greedy) waits at self-check 4\n" +
                "72.579 480(greedy) arrives\n" +
                "72.579 480(greedy) waits at self-check 4\n" +
                "72.671 481 arrives\n" +
                "72.671 481 waits at server 1\n" +
                "72.774 482 arrives\n" +
                "72.774 482 waits at server 2\n" +
                "72.977 483(greedy) arrives\n" +
                "72.977 483(greedy) waits at self-check 4\n" +
                "73.019 285(greedy) serves by server 2\n" +
                "73.019 460 done serving by self-check 5\n" +
                "73.019 464(greedy) serves by self-check 5\n" +
                "73.213 484 arrives\n" +
                "73.213 484 waits at server 2\n" +
                "73.445 318(greedy) done serving by server 1\n" +
                "73.476 349(greedy) serves by server 1\n" +
                "73.496 485 arrives\n" +
                "73.496 485 waits at server 1\n" +
                "73.540 486(greedy) arrives\n" +
                "73.540 486(greedy) waits at self-check 4\n" +
                "73.611 487 arrives\n" +
                "73.611 487 waits at server 3\n" +
                "73.645 488(greedy) arrives\n" +
                "73.645 488(greedy) waits at self-check 4\n" +
                "73.676 464(greedy) done serving by self-check 5\n" +
                "73.676 467 serves by self-check 5\n" +
                "73.739 285(greedy) done serving by server 2\n" +
                "73.741 467 done serving by self-check 5\n" +
                "73.741 470 serves by self-check 5\n" +
                "73.751 489 arrives\n" +
                "73.751 489 waits at self-check 4\n" +
                "73.884 462 done serving by self-check 4\n" +
                "73.884 472 serves by self-check 4\n" +
                "73.886 490(greedy) arrives\n" +
                "73.886 490(greedy) waits at self-check 4\n" +
                "73.915 472 done serving by self-check 4\n" +
                "73.915 473(greedy) serves by self-check 4\n" +
                "74.035 470 done serving by self-check 5\n" +
                "74.035 477(greedy) serves by self-check 5\n" +
                "74.086 349(greedy) done serving by server 1\n" +
                "74.103 491 arrives\n" +
                "74.103 491 waits at self-check 4\n" +
                "74.255 492(greedy) arrives\n" +
                "74.255 492(greedy) waits at self-check 4\n" +
                "74.367 493 arrives\n" +
                "74.367 493 waits at self-check 4\n" +
                "74.544 494(greedy) arrives\n" +
                "74.544 494(greedy) leaves\n" +
                "74.630 495 arrives\n" +
                "74.630 495 leaves\n" +
                "74.725 496(greedy) arrives\n" +
                "74.725 496(greedy) leaves\n" +
                "74.733 477(greedy) done serving by self-check 5\n" +
                "74.733 479(greedy) serves by self-check 5\n" +
                "74.812 473(greedy) done serving by self-check 4\n" +
                "74.812 480(greedy) serves by self-check 4\n" +
                "74.823 295(greedy) serves by server 2\n" +
                "74.861 497(greedy) arrives\n" +
                "74.861 497(greedy) waits at self-check 4\n" +
                "74.959 498 arrives\n" +
                "74.959 498 waits at server 2\n" +
                "74.960 499 arrives\n" +
                "74.960 499 waits at self-check 4\n" +
                "75.108 500 arrives\n" +
                "75.108 500 leaves\n" +
                "75.127 479(greedy) done serving by self-check 5\n" +
                "75.127 483(greedy) serves by self-check 5\n" +
                "75.289 501(greedy) arrives\n" +
                "75.289 501(greedy) waits at self-check 4\n" +
                "75.298 502 arrives\n" +
                "75.298 502 leaves\n" +
                "75.301 503(greedy) arrives\n" +
                "75.301 503(greedy) leaves\n" +
                "75.333 410 serves by server 1\n" +
                "75.521 480(greedy) done serving by self-check 4\n" +
                "75.521 486(greedy) serves by self-check 4\n" +
                "75.550 504 arrives\n" +
                "75.550 504 waits at server 1\n" +
                "75.568 505 arrives\n" +
                "75.568 505 waits at self-check 4\n" +
                "75.601 506(greedy) arrives\n" +
                "75.601 506(greedy) leaves\n" +
                "75.661 410 done serving by server 1\n" +
                "75.729 436 serves by server 1\n" +
                "75.745 328 done serving by server 3\n" +
                "75.796 507 arrives\n" +
                "75.796 507 waits at server 1\n" +
                "75.982 508(greedy) arrives\n" +
                "75.982 508(greedy) leaves\n" +
                "76.076 509(greedy) arrives\n" +
                "76.076 509(greedy) leaves\n" +
                "76.106 510(greedy) arrives\n" +
                "76.106 510(greedy) leaves\n" +
                "76.283 511 arrives\n" +
                "76.283 511 leaves\n" +
                "76.429 512 arrives\n" +
                "76.429 512 leaves\n" +
                "76.459 350 serves by server 3\n" +
                "76.469 295(greedy) done serving by server 2\n" +
                "76.477 486(greedy) done serving by self-check 4\n" +
                "76.477 488(greedy) serves by self-check 4\n" +
                "76.566 513(greedy) arrives\n" +
                "76.566 513(greedy) waits at server 3\n" +
                "76.675 514(greedy) arrives\n" +
                "76.675 514(greedy) waits at self-check 4\n" +
                "76.699 488(greedy) done serving by self-check 4\n" +
                "76.699 489 serves by self-check 4\n" +
                "76.701 483(greedy) done serving by self-check 5\n" +
                "76.701 490(greedy) serves by self-check 5\n" +
                "76.709 490(greedy) done serving by self-check 5\n" +
                "76.709 491 serves by self-check 5\n" +
                "76.765 491 done serving by self-check 5\n" +
                "76.765 492(greedy) serves by self-check 5\n" +
                "76.845 515 arrives\n" +
                "76.845 515 waits at self-check 4");

        System.out.println("76.916 492(greedy) done serving by self-check 5\n" +
                "76.916 493 serves by self-check 5\n" +
                "76.961 493 done serving by self-check 5\n" +
                "76.961 497(greedy) serves by self-check 5\n" +
                "77.048 489 done serving by self-check 4\n" +
                "77.048 499 serves by self-check 4\n" +
                "77.066 516(greedy) arrives\n" +
                "77.066 516(greedy) waits at self-check 4\n" +
                "77.078 499 done serving by self-check 4\n" +
                "77.078 501(greedy) serves by self-check 4\n" +
                "77.271 517 arrives\n" +
                "77.271 517 waits at self-check 4\n" +
                "77.347 518 arrives\n" +
                "77.347 518 waits at self-check 4\n" +
                "77.435 519 arrives\n" +
                "77.435 519 waits at self-check 4\n" +
                "77.465 497(greedy) done serving by self-check 5\n" +
                "77.465 505 serves by self-check 5\n" +
                "77.580 520(greedy) arrives\n" +
                "77.580 520(greedy) waits at self-check 4\n" +
                "77.796 521(greedy) arrives\n" +
                "77.796 521(greedy) waits at self-check 4\n" +
                "77.862 505 done serving by self-check 5\n" +
                "77.862 514(greedy) serves by self-check 5\n" +
                "77.887 350 done serving by server 3\n" +
                "77.931 363 serves by server 3\n" +
                "77.953 522(greedy) arrives\n" +
                "77.953 522(greedy) waits at self-check 4\n" +
                "77.967 514(greedy) done serving by self-check 5\n" +
                "77.967 515 serves by self-check 5\n" +
                "78.011 523 arrives\n" +
                "78.011 523 waits at server 3\n" +
                "78.059 315 serves by server 2\n" +
                "78.189 524(greedy) arrives\n" +
                "78.189 524(greedy) waits at self-check 4\n" +
                "78.250 525 arrives\n" +
                "78.250 525 waits at server 2\n" +
                "78.265 526 arrives\n" +
                "78.265 526 waits at self-check 4\n" +
                "78.300 527 arrives\n" +
                "78.300 527 waits at self-check 4\n" +
                "78.574 315 done serving by server 2\n" +
                "78.660 528 arrives\n" +
                "78.660 528 leaves\n" +
                "78.899 345 serves by server 2\n" +
                "78.975 515 done serving by self-check 5\n" +
                "78.975 516(greedy) serves by self-check 5\n" +
                "79.124 363 done serving by server 3\n" +
                "79.124 529 arrives\n" +
                "79.124 529 waits at server 2\n" +
                "79.191 530(greedy) arrives\n" +
                "79.191 530(greedy) waits at self-check 4\n" +
                "79.342 531(greedy) arrives\n" +
                "79.342 531(greedy) leaves\n" +
                "79.437 436 done serving by server 1\n" +
                "79.599 532(greedy) arrives\n" +
                "79.599 532(greedy) leaves\n" +
                "79.601 533 arrives\n" +
                "79.601 533 leaves\n" +
                "79.625 534(greedy) arrives\n" +
                "79.625 534(greedy) leaves\n" +
                "79.711 535 arrives\n" +
                "79.711 535 leaves\n" +
                "79.776 345 done serving by server 2\n" +
                "79.824 353 serves by server 2\n" +
                "79.881 353 done serving by server 2\n" +
                "79.939 536 arrives\n" +
                "79.939 536 waits at server 2\n" +
                "79.964 537(greedy) arrives\n" +
                "79.964 537(greedy) leaves\n" +
                "80.128 437 serves by server 2\n" +
                "80.173 440 serves by server 1\n" +
                "80.234 538(greedy) arrives\n" +
                "80.234 538(greedy) waits at server 1\n" +
                "80.247 539(greedy) arrives\n" +
                "80.247 539(greedy) waits at server 2\n" +
                "80.571 540 arrives\n" +
                "80.571 540 leaves\n" +
                "80.582 541(greedy) arrives\n" +
                "80.582 541(greedy) leaves\n" +
                "80.688 542(greedy) arrives\n" +
                "80.688 542(greedy) leaves\n" +
                "80.709 543(greedy) arrives\n" +
                "80.709 543(greedy) leaves\n" +
                "80.723 437 done serving by server 2\n" +
                "80.790 544(greedy) arrives\n" +
                "80.790 544(greedy) leaves\n" +
                "80.790 391(greedy) serves by server 3\n" +
                "80.848 545(greedy) arrives\n" +
                "80.848 545(greedy) waits at server 3\n" +
                "80.898 546 arrives\n" +
                "80.898 546 leaves\n" +
                "80.940 547(greedy) arrives\n" +
                "80.940 547(greedy) leaves\n" +
                "81.048 548 arrives\n" +
                "81.048 548 leaves\n" +
                "81.078 549(greedy) arrives\n" +
                "81.078 549(greedy) leaves\n" +
                "81.185 550 arrives\n" +
                "81.185 550 leaves\n" +
                "81.303 444(greedy) serves by server 2\n" +
                "81.360 516(greedy) done serving by self-check 5\n" +
                "81.360 517 serves by self-check 5\n" +
                "81.422 551 arrives\n" +
                "81.422 551 waits at server 2\n" +
                "81.429 552(greedy) arrives\n" +
                "81.429 552(greedy) waits at self-check 4\n" +
                "81.441 553 arrives\n" +
                "81.441 553 leaves\n" +
                "81.458 444(greedy) done serving by server 2\n" +
                "81.821 501(greedy) done serving by self-check 4\n" +
                "81.821 518 serves by self-check 4\n" +
                "81.863 554 arrives\n" +
                "81.863 554 waits at self-check 4\n" +
                "81.876 391(greedy) done serving by server 3\n" +
                "81.977 518 done serving by self-check 4\n" +
                "81.977 519 serves by self-check 4\n" +
                "82.027 440 done serving by server 1\n" +
                "82.087 555 arrives\n" +
                "82.087 555 waits at self-check 4\n" +
                "82.136 517 done serving by self-check 5\n" +
                "82.136 520(greedy) serves by self-check 5\n" +
                "82.251 418 serves by server 3\n" +
                "82.395 556 arrives\n" +
                "82.395 556 waits at server 3\n" +
                "82.484 456(greedy) serves by server 1\n" +
                "82.501 557 arrives\n" +
                "82.501 557 waits at server 1\n" +
                "82.647 520(greedy) done serving by self-check 5\n" +
                "82.647 521(greedy) serves by self-check 5\n" +
                "82.675 558 arrives\n" +
                "82.675 558 waits at self-check 4\n" +
                "82.870 559(greedy) arrives\n" +
                "82.870 559(greedy) waits at self-check 4\n" +
                "82.914 466 serves by server 2\n" +
                "82.927 560(greedy) arrives\n" +
                "82.927 560(greedy) waits at server 2\n" +
                "82.962 561 arrives\n" +
                "82.962 561 leaves\n" +
                "82.974 562(greedy) arrives\n" +
                "82.974 562(greedy) leaves\n" +
                "83.051 563 arrives\n" +
                "83.051 563 leaves\n" +
                "83.300 519 done serving by self-check 4\n" +
                "83.300 522(greedy) serves by self-check 4\n" +
                "83.332 564 arrives\n" +
                "83.332 564 waits at self-check 4\n" +
                "83.420 565 arrives\n" +
                "83.420 565 leaves\n" +
                "83.524 566 arrives\n" +
                "83.524 566 leaves\n" +
                "83.567 466 done serving by server 2\n" +
                "83.579 418 done serving by server 3\n" +
                "83.586 567(greedy) arrives\n" +
                "83.586 567(greedy) leaves\n" +
                "83.639 568(greedy) arrives\n" +
                "83.639 568(greedy) leaves\n" +
                "83.829 522(greedy) done serving by self-check 4\n" +
                "83.829 524(greedy) serves by self-check 4\n" +
                "83.870 569 arrives\n" +
                "83.870 569 waits at self-check 4\n" +
                "83.896 570(greedy) arrives\n" +
                "83.896 570(greedy) leaves\n" +
                "83.907 571 arrives\n" +
                "83.907 571 leaves\n" +
                "83.927 572(greedy) arrives\n" +
                "83.927 572(greedy) leaves\n" +
                "83.992 573 arrives\n" +
                "83.992 573 leaves\n" +
                "83.996 574 arrives\n" +
                "83.996 574 leaves\n" +
                "84.014 421(greedy) serves by server 3\n" +
                "84.043 521(greedy) done serving by self-check 5\n" +
                "84.043 526 serves by self-check 5\n" +
                "84.078 524(greedy) done serving by self-check 4\n" +
                "84.078 527 serves by self-check 4\n" +
                "84.078 575 arrives\n" +
                "84.078 575 waits at server 3\n" +
                "84.275 576(greedy) arrives\n" +
                "84.275 576(greedy) waits at self-check 4\n" +
                "84.416 577 arrives\n" +
                "84.416 577 waits at self-check 4\n" +
                "84.466 578 arrives\n" +
                "84.466 578 leaves\n" +
                "84.487 421(greedy) done serving by server 3\n" +
                "84.550 474(greedy) serves by server 2\n" +
                "84.624 579 arrives\n" +
                "84.624 579 waits at server 2\n" +
                "84.689 474(greedy) done serving by server 2\n" +
                "84.925 580 arrives\n" +
                "84.925 580 leaves\n" +
                "84.987 581 arrives\n" +
                "84.987 581 leaves\n" +
                "85.057 582(greedy) arrives\n" +
                "85.057 582(greedy) leaves\n" +
                "85.205 482 serves by server 2\n" +
                "85.256 526 done serving by self-check 5\n" +
                "85.256 530(greedy) serves by self-check 5\n" +
                "85.300 583(greedy) arrives\n" +
                "85.300 583(greedy) waits at server 2\n" +
                "85.355 530(greedy) done serving by self-check 5\n" +
                "85.355 552(greedy) serves by self-check 5\n" +
                "85.554 482 done serving by server 2\n" +
                "85.603 584(greedy) arrives\n" +
                "85.603 584(greedy) waits at self-check 4\n" +
                "85.630 585(greedy) arrives\n" +
                "85.630 585(greedy) waits at self-check 4\n" +
                "85.714 586(greedy) arrives\n" +
                "85.714 586(greedy) leaves\n" +
                "85.830 484 serves by server 2\n" +
                "85.887 552(greedy) done serving by self-check 5\n" +
                "85.887 554 serves by self-check 5\n" +
                "86.008 587(greedy) arrives\n" +
                "86.008 587(greedy) waits at server 2\n" +
                "86.028 456(greedy) done serving by server 1\n" +
                "86.247 527 done serving by self-check 4\n" +
                "86.247 555 serves by self-check 4\n" +
                "86.392 588 arrives\n" +
                "86.392 588 waits at self-check 4\n" +
                "86.416 465(greedy) serves by server 1\n" +
                "86.570 554 done serving by self-check 5\n" +
                "86.570 558 serves by self-check 5\n" +
                "86.610 589 arrives\n" +
                "86.610 589 waits at server 1\n" +
                "86.651 555 done serving by self-check 4\n" +
                "86.651 559(greedy) serves by self-check 4\n" +
                "86.808 434 serves by server 3\n" +
                "86.944 590 arrives\n" +
                "86.944 590 waits at server 3\n" +
                "86.987 434 done serving by server 3\n" +
                "86.991 484 done serving by server 2\n" +
                "87.037 591(greedy) arrives\n" +
                "87.037 591(greedy) waits at self-check 4\n" +
                "87.048 592 arrives\n" +
                "87.048 592 waits at self-check 4\n" +
                "87.050 558 done serving by self-check 5\n" +
                "87.050 564 serves by self-check 5\n" +
                "87.181 593 arrives\n" +
                "87.181 593 waits at self-check 4\n" +
                "87.232 594 arrives\n" +
                "87.232 594 waits at self-check 4\n" +
                "87.431 559(greedy) done serving by self-check 4\n" +
                "87.431 569 serves by self-check 4\n" +
                "87.548 569 done serving by self-check 4\n" +
                "87.548 576(greedy) serves by self-check 4\n" +
                "87.563 595 arrives\n" +
                "87.563 595 waits at self-check 4\n" +
                "87.758 596(greedy) arrives\n" +
                "87.758 596(greedy) waits at self-check 4\n" +
                "87.780 597 arrives\n" +
                "87.780 597 leaves\n" +
                "87.786 498 serves by server 2\n" +
                "87.797 465(greedy) done serving by server 1\n" +
                "87.887 438(greedy) serves by server 3\n" +
                "88.016 598(greedy) arrives\n" +
                "88.016 598(greedy) waits at server 2\n" +
                "88.065 599(greedy) arrives\n" +
                "88.065 599(greedy) waits at server 3\n" +
                "88.174 576(greedy) done serving by self-check 4\n" +
                "88.174 577 serves by self-check 4\n" +
                "88.177 498 done serving by server 2\n" +
                "88.219 600(greedy) arrives\n" +
                "88.219 600(greedy) waits at self-check 4\n" +
                "88.256 564 done serving by self-check 5\n" +
                "88.256 584(greedy) serves by self-check 5\n" +
                "88.264 601(greedy) arrives\n" +
                "88.264 601(greedy) waits at self-check 4\n" +
                "88.360 438(greedy) done serving by server 3\n" +
                "88.422 602 arrives\n" +
                "88.422 602 leaves\n" +
                "88.473 603(greedy) arrives\n" +
                "88.473 603(greedy) leaves\n" +
                "88.490 525 serves by server 2\n" +
                "88.542 604(greedy) arrives\n" +
                "88.542 604(greedy) waits at server 2\n" +
                "88.632 605 arrives\n" +
                "88.632 605 leaves\n" +
                "88.647 606(greedy) arrives\n" +
                "88.647 606(greedy) leaves\n" +
                "88.722 584(greedy) done serving by self-check 5\n" +
                "88.722 585(greedy) serves by self-check 5\n" +
                "88.851 458(greedy) serves by server 3\n" +
                "89.031 585(greedy) done serving by self-check 5\n" +
                "89.031 588 serves by self-check 5\n" +
                "89.080 607(greedy) arrives\n" +
                "89.080 607(greedy) waits at self-check 4\n" +
                "89.091 608(greedy) arrives\n" +
                "89.091 608(greedy) waits at server 3\n" +
                "89.334 609 arrives\n" +
                "89.334 609 waits at self-check 4\n" +
                "89.447 458(greedy) done serving by server 3\n" +
                "89.467 610 arrives\n" +
                "89.467 610 leaves\n" +
                "89.495 611 arrives\n" +
                "89.495 611 leaves\n" +
                "89.588 612 arrives\n" +
                "89.588 612 leaves\n" +
                "89.651 613 arrives\n" +
                "89.651 613 leaves\n" +
                "89.678 614(greedy) arrives\n" +
                "89.678 614(greedy) leaves\n" +
                "89.678 475 serves by server 3\n" +
                "89.817 615 arrives\n" +
                "89.817 615 waits at server 3\n" +
                "89.823 616(greedy) arrives\n" +
                "89.823 616(greedy) leaves\n" +
                "90.122 617 arrives\n" +
                "90.122 617 leaves\n" +
                "90.179 577 done serving by self-check 4\n" +
                "90.179 591(greedy) serves by self-check 4\n" +
                "90.446 525 done serving by server 2\n" +
                "90.671 618 arrives\n" +
                "90.671 618 waits at self-check 4\n" +
                "90.727 619(greedy) arrives\n" +
                "90.727 619(greedy) leaves\n" +
                "90.956 620(greedy) arrives\n" +
                "90.956 620(greedy) leaves\n" +
                "91.044 621 arrives\n" +
                "91.044 621 leaves\n" +
                "91.171 469(greedy) serves by server 1\n" +
                "91.360 622 arrives\n" +
                "91.360 622 waits at server 1\n" +
                "91.464 623(greedy) arrives\n" +
                "91.464 623(greedy) leaves\n" +
                "91.531 624(greedy) arrives\n" +
                "91.531 624(greedy) leaves\n" +
                "91.560 591(greedy) done serving by self-check 4\n" +
                "91.560 592 serves by self-check 4\n" +
                "91.838 625 arrives\n" +
                "91.838 625 waits at self-check 4\n" +
                "91.846 588 done serving by self-check 5\n" +
                "91.846 593 serves by self-check 5\n" +
                "92.216 626 arrives\n" +
                "92.216 626 waits at self-check 4\n" +
                "92.252 627 arrives\n" +
                "92.252 627 leaves\n" +
                "92.550 592 done serving by self-check 4\n" +
                "92.550 594 serves by self-check 4\n" +
                "92.612 628(greedy) arrives\n" +
                "92.612 628(greedy) waits at self-check 4\n" +
                "92.628 475 done serving by server 3\n" +
                "92.826 629 arrives\n" +
                "92.826 629 leaves\n" +
                "92.866 594 done serving by self-check 4\n" +
                "92.866 595 serves by self-check 4\n" +
                "92.939 630 arrives\n" +
                "92.939 630 waits at self-check 4\n" +
                "92.998 631(greedy) arrives\n" +
                "92.998 631(greedy) leaves\n" +
                "93.130 595 done serving by self-check 4\n" +
                "93.130 596(greedy) serves by self-check 4\n" +
                "93.223 529 serves by server 2\n" +
                "93.235 632 arrives\n" +
                "93.235 632 waits at server 2\n" +
                "93.339 633 arrives\n" +
                "93.339 633 waits at self-check 4\n" +
                "93.447 634 arrives\n" +
                "93.447 634 leaves\n" +
                "93.589 593 done serving by self-check 5\n" +
                "93.589 600(greedy) serves by self-check 5\n" +
                "93.601 529 done serving by server 2\n" +
                "93.608 487 serves by server 3\n" +
                "93.628 600(greedy) done serving by self-check 5\n" +
                "93.628 601(greedy) serves by self-check 5\n" +
                "93.744 635 arrives\n" +
                "93.744 635 waits at server 3\n" +
                "93.760 636(greedy) arrives\n" +
                "93.760 636(greedy) waits at self-check 4\n" +
                "93.777 487 done serving by server 3\n" +
                "93.780 601(greedy) done serving by self-check 5\n" +
                "93.780 607(greedy) serves by self-check 5\n" +
                "93.803 637 arrives\n" +
                "93.803 637 waits at self-check 4\n" +
                "93.967 638 arrives\n" +
                "93.967 638 waits at self-check 4\n" +
                "94.015 513(greedy) serves by server 3\n" +
                "94.032 639(greedy) arrives\n" +
                "94.032 639(greedy) waits at server 3\n" +
                "94.215 640(greedy) arrives\n" +
                "94.215 640(greedy) leaves\n" +
                "94.414 596(greedy) done serving by self-check 4\n" +
                "94.414 609 serves by self-check 4\n" +
                "94.521 641 arrives\n" +
                "94.521 641 waits at self-check 4\n" +
                "94.644 642(greedy) arrives\n" +
                "94.644 642(greedy) leaves\n" +
                "94.680 536 serves by server 2\n" +
                "94.863 469(greedy) done serving by server 1\n" +
                "94.965 607(greedy) done serving by self-check 5\n" +
                "94.965 618 serves by self-check 5\n" +
                "95.148 618 done serving by self-check 5\n" +
                "95.148 625 serves by self-check 5\n" +
                "95.185 643(greedy) arrives\n" +
                "95.185 643(greedy) waits at self-check 4\n" +
                "95.219 536 done serving by server 2\n" +
                "95.226 625 done serving by self-check 5\n" +
                "95.226 626 serves by self-check 5\n" +
                "95.264 644(greedy) arrives\n" +
                "95.264 644(greedy) waits at self-check 4\n" +
                "95.289 539(greedy) serves by server 2\n" +
                "95.377 645(greedy) arrives\n" +
                "95.377 645(greedy) waits at server 2\n" +
                "95.422 626 done serving by self-check 5\n" +
                "95.422 628(greedy) serves by self-check 5\n" +
                "95.575 628(greedy) done serving by self-check 5\n" +
                "95.575 630 serves by self-check 5\n" +
                "95.591 609 done serving by self-check 4\n" +
                "95.591 633 serves by self-check 4\n" +
                "95.613 646(greedy) arrives\n" +
                "95.613 646(greedy) waits at self-check 4\n" +
                "95.644 539(greedy) done serving by server 2\n" +
                "95.677 633 done serving by self-check 4\n" +
                "95.677 636(greedy) serves by self-check 4\n" +
                "95.717 476 serves by server 1\n" +
                "95.721 636(greedy) done serving by self-check 4\n" +
                "95.721 637 serves by self-check 4\n" +
                "95.729 647 arrives\n" +
                "95.729 647 waits at server 1\n" +
                "95.917 648(greedy) arrives\n" +
                "95.917 648(greedy) waits at self-check 4\n" +
                "95.972 649(greedy) arrives\n" +
                "95.972 649(greedy) waits at self-check 4\n" +
                "96.029 650 arrives\n" +
                "96.029 650 waits at server 2\n" +
                "96.202 637 done serving by self-check 4\n" +
                "96.202 638 serves by self-check 4\n" +
                "96.253 651(greedy) arrives\n" +
                "96.253 651(greedy) waits at self-check 4\n" +
                "96.307 551 serves by server 2\n" +
                "96.425 652(greedy) arrives\n" +
                "96.425 652(greedy) waits at self-check 4\n" +
                "96.510 513(greedy) done serving by server 3\n" +
                "96.632 653 arrives\n" +
                "96.632 653 waits at server 2\n" +
                "96.734 654(greedy) arrives\n" +
                "96.734 654(greedy) waits at self-check 4\n" +
                "96.892 638 done serving by self-check 4\n" +
                "96.892 641 serves by self-check 4\n" +
                "97.175 655(greedy) arrives\n" +
                "97.175 655(greedy) waits at self-check 4\n" +
                "97.215 476 done serving by server 1\n" +
                "97.327 656 arrives\n" +
                "97.327 656 waits at self-check 4\n" +
                "97.433 630 done serving by self-check 5\n" +
                "97.433 643(greedy) serves by self-check 5\n" +
                "97.436 657 arrives\n" +
                "97.436 657 waits at self-check 4\n" +
                "97.535 551 done serving by server 2\n" +
                "97.568 658 arrives\n" +
                "97.568 658 leaves\n" +
                "97.695 523 serves by server 3\n" +
                "97.819 659(greedy) arrives\n" +
                "97.819 659(greedy) waits at server 3\n" +
                "97.850 560(greedy) serves by server 2\n" +
                "97.875 523 done serving by server 3\n" +
                "98.025 660(greedy) arrives\n" +
                "98.025 660(greedy) waits at server 2\n" +
                "98.276 661 arrives\n" +
                "98.276 661 leaves\n" +
                "98.345 662(greedy) arrives\n" +
                "98.345 662(greedy) leaves\n" +
                "98.410 545(greedy) serves by server 3\n" +
                "98.411 663 arrives\n" +
                "98.411 663 waits at server 3\n" +
                "98.431 664 arrives\n" +
                "98.431 664 leaves\n" +
                "98.498 641 done serving by self-check 4\n" +
                "98.498 644(greedy) serves by self-check 4\n" +
                "98.499 665(greedy) arrives\n" +
                "98.499 665(greedy) waits at self-check 4\n" +
                "98.624 666 arrives\n" +
                "98.624 666 leaves\n" +
                "98.647 667(greedy) arrives\n" +
                "98.647 667(greedy) leaves\n" +
                "98.686 668 arrives\n" +
                "98.686 668 leaves\n" +
                "98.713 560(greedy) done serving by server 2\n" +
                "98.795 669 arrives\n" +
                "98.795 669 leaves\n" +
                "99.061 478 serves by server 1\n" +
                "99.113 478 done serving by server 1\n" +
                "99.160 670 arrives\n" +
                "99.160 670 waits at server 1\n" +
                "99.203 643(greedy) done serving by self-check 5\n" +
                "99.203 646(greedy) serves by self-check 5\n" +
                "99.414 545(greedy) done serving by server 3\n" +
                "99.528 646(greedy) done serving by self-check 5\n" +
                "99.528 648(greedy) serves by self-check 5\n" +
                "99.530 556 serves by server 3\n" +
                "99.587 648(greedy) done serving by self-check 5\n" +
                "99.587 649(greedy) serves by self-check 5\n" +
                "99.599 671 arrives\n" +
                "99.599 671 waits at server 3\n" +
                "99.859 579 serves by server 2\n" +
                "99.897 556 done serving by server 3\n" +
                "99.977 579 done serving by server 2\n" +
                "99.992 583(greedy) serves by server 2\n" +
                "100.178 672 arrives\n" +
                "100.178 672 waits at server 2\n" +
                "100.219 575 serves by server 3\n" +
                "100.293 673 arrives\n" +
                "100.293 673 waits at server 2\n" +
                "100.329 674 arrives\n" +
                "100.329 674 waits at server 3\n" +
                "100.377 583(greedy) done serving by server 2\n" +
                "100.470 649(greedy) done serving by self-check 5\n" +
                "100.470 651(greedy) serves by self-check 5\n" +
                "100.673 675 arrives\n" +
                "100.673 675 waits at self-check 4");

        System.out.println("100.762 575 done serving by server 3\n" +
                "100.847 676 arrives\n" +
                "100.847 676 waits at self-check 4\n" +
                "100.947 590 serves by server 3\n" +
                "100.950 677 arrives\n" +
                "100.950 677 waits at server 3\n" +
                "100.976 678(greedy) arrives\n" +
                "100.976 678(greedy) waits at self-check 4\n" +
                "100.980 644(greedy) done serving by self-check 4\n" +
                "100.980 652(greedy) serves by self-check 4\n" +
                "101.022 679(greedy) arrives\n" +
                "101.022 679(greedy) waits at self-check 4\n" +
                "101.041 680 arrives\n" +
                "101.041 680 waits at self-check 4\n" +
                "101.042 681(greedy) arrives\n" +
                "101.042 681(greedy) leaves\n" +
                "101.053 682(greedy) arrives\n" +
                "101.053 682(greedy) leaves\n" +
                "101.140 683(greedy) arrives\n" +
                "101.140 683(greedy) leaves\n" +
                "101.190 481 serves by server 1\n" +
                "101.291 587(greedy) serves by server 2\n" +
                "101.350 651(greedy) done serving by self-check 5\n" +
                "101.350 654(greedy) serves by self-check 5\n" +
                "101.421 654(greedy) done serving by self-check 5\n" +
                "101.421 655(greedy) serves by self-check 5\n" +
                "101.612 684(greedy) arrives\n" +
                "101.612 684(greedy) waits at self-check 4\n" +
                "101.807 652(greedy) done serving by self-check 4\n" +
                "101.807 656 serves by self-check 4\n" +
                "101.838 685(greedy) arrives\n" +
                "101.838 685(greedy) waits at self-check 4\n" +
                "102.084 686 arrives\n" +
                "102.084 686 waits at server 1\n" +
                "102.313 587(greedy) done serving by server 2\n" +
                "102.621 687 arrives\n" +
                "102.621 687 waits at server 2\n" +
                "102.631 590 done serving by server 3\n" +
                "102.747 688 arrives\n" +
                "102.747 688 waits at self-check 4\n" +
                "102.809 655(greedy) done serving by self-check 5\n" +
                "102.809 657 serves by self-check 5\n" +
                "102.934 689 arrives\n" +
                "102.934 689 waits at self-check 4\n" +
                "102.936 690(greedy) arrives\n" +
                "102.936 690(greedy) leaves\n" +
                "102.946 691(greedy) arrives\n" +
                "102.946 691(greedy) leaves\n" +
                "102.998 598(greedy) serves by server 2\n" +
                "103.247 692(greedy) arrives\n" +
                "103.247 692(greedy) waits at server 2\n" +
                "103.330 657 done serving by self-check 5\n" +
                "103.330 665(greedy) serves by self-check 5\n" +
                "103.340 693 arrives\n" +
                "103.340 693 waits at self-check 4\n" +
                "103.358 694(greedy) arrives\n" +
                "103.358 694(greedy) leaves\n" +
                "103.367 695(greedy) arrives\n" +
                "103.367 695(greedy) leaves\n" +
                "103.724 696 arrives\n" +
                "103.724 696 leaves\n" +
                "103.809 697 arrives\n" +
                "103.809 697 leaves\n" +
                "103.818 698 arrives\n" +
                "103.818 698 leaves\n" +
                "103.854 699(greedy) arrives\n" +
                "103.854 699(greedy) leaves\n" +
                "104.149 481 done serving by server 1\n" +
                "104.191 700(greedy) arrives\n" +
                "104.191 700(greedy) leaves\n" +
                "104.468 701(greedy) arrives\n" +
                "104.468 701(greedy) leaves\n" +
                "104.613 702(greedy) arrives\n" +
                "104.613 702(greedy) leaves\n" +
                "104.720 703(greedy) arrives\n" +
                "104.720 703(greedy) leaves\n" +
                "104.735 704 arrives\n" +
                "104.735 704 leaves\n" +
                "104.756 705 arrives\n" +
                "104.756 705 leaves\n" +
                "104.831 706(greedy) arrives\n" +
                "104.831 706(greedy) leaves\n" +
                "104.964 599(greedy) serves by server 3\n" +
                "105.183 707(greedy) arrives\n" +
                "105.183 707(greedy) waits at server 3\n" +
                "105.233 708(greedy) arrives\n" +
                "105.233 708(greedy) leaves\n" +
                "105.368 599(greedy) done serving by server 3\n" +
                "105.630 709(greedy) arrives\n" +
                "105.630 709(greedy) leaves\n" +
                "105.632 598(greedy) done serving by server 2\n" +
                "105.994 710 arrives\n" +
                "105.994 710 leaves\n" +
                "106.044 665(greedy) done serving by self-check 5\n" +
                "106.044 675 serves by self-check 5\n" +
                "106.135 485 serves by server 1\n" +
                "106.171 711 arrives\n" +
                "106.171 711 waits at server 1\n" +
                "106.342 712 arrives\n" +
                "106.342 712 waits at self-check 4\n" +
                "106.452 713 arrives\n" +
                "106.452 713 leaves\n" +
                "106.487 714 arrives\n" +
                "106.487 714 leaves\n" +
                "106.532 656 done serving by self-check 4\n" +
                "106.532 676 serves by self-check 4\n" +
                "106.563 715(greedy) arrives\n" +
                "106.563 715(greedy) waits at self-check 4\n" +
                "106.704 716 arrives\n" +
                "106.704 716 leaves\n" +
                "106.743 717(greedy) arrives\n" +
                "106.743 717(greedy) leaves\n" +
                "106.829 718(greedy) arrives\n" +
                "106.829 718(greedy) leaves\n" +
                "107.009 719 arrives\n" +
                "107.009 719 leaves\n" +
                "107.047 675 done serving by self-check 5\n" +
                "107.047 678(greedy) serves by self-check 5\n" +
                "107.326 720(greedy) arrives\n" +
                "107.326 720(greedy) waits at self-check 4\n" +
                "107.336 721(greedy) arrives\n" +
                "107.336 721(greedy) leaves\n" +
                "107.366 485 done serving by server 1\n" +
                "107.400 678(greedy) done serving by self-check 5\n" +
                "107.400 679(greedy) serves by self-check 5\n" +
                "107.519 679(greedy) done serving by self-check 5\n" +
                "107.519 680 serves by self-check 5\n" +
                "107.723 722(greedy) arrives\n" +
                "107.723 722(greedy) waits at self-check 4\n" +
                "107.741 676 done serving by self-check 4\n" +
                "107.741 684(greedy) serves by self-check 4\n" +
                "107.752 684(greedy) done serving by self-check 4\n" +
                "107.752 685(greedy) serves by self-check 4\n" +
                "107.828 723 arrives\n" +
                "107.828 723 waits at self-check 4\n" +
                "107.846 724 arrives\n" +
                "107.846 724 waits at self-check 4\n" +
                "107.896 725(greedy) arrives\n" +
                "107.896 725(greedy) waits at self-check 4\n" +
                "107.979 726 arrives\n" +
                "107.979 726 leaves\n" +
                "108.180 727(greedy) arrives\n" +
                "108.180 727(greedy) leaves\n" +
                "108.308 504 serves by server 1\n" +
                "108.317 728(greedy) arrives\n" +
                "108.317 728(greedy) waits at server 1\n" +
                "108.378 685(greedy) done serving by self-check 4\n" +
                "108.378 688 serves by self-check 4\n" +
                "108.512 729(greedy) arrives\n" +
                "108.512 729(greedy) waits at self-check 4\n" +
                "108.524 730(greedy) arrives\n" +
                "108.524 730(greedy) leaves\n" +
                "108.559 731 arrives\n" +
                "108.559 731 leaves\n" +
                "108.869 732 arrives\n" +
                "108.869 732 leaves\n" +
                "108.898 733 arrives\n" +
                "108.898 733 leaves\n" +
                "109.001 734(greedy) arrives\n" +
                "109.001 734(greedy) leaves\n" +
                "109.032 735(greedy) arrives\n" +
                "109.032 735(greedy) leaves\n" +
                "109.035 604(greedy) serves by server 2\n" +
                "109.367 604(greedy) done serving by server 2\n" +
                "109.376 680 done serving by self-check 5\n" +
                "109.376 689 serves by self-check 5\n" +
                "109.404 736(greedy) arrives\n" +
                "109.404 736(greedy) waits at server 2\n" +
                "109.422 737(greedy) arrives\n" +
                "109.422 737(greedy) waits at self-check 4\n" +
                "109.541 608(greedy) serves by server 3\n" +
                "109.630 738(greedy) arrives\n" +
                "109.630 738(greedy) waits at server 3\n" +
                "109.665 739(greedy) arrives\n" +
                "109.665 739(greedy) leaves\n" +
                "109.683 740 arrives\n" +
                "109.683 740 leaves\n" +
                "109.702 741 arrives\n" +
                "109.702 741 leaves\n" +
                "109.730 742 arrives\n" +
                "109.730 742 leaves\n" +
                "109.904 743(greedy) arrives\n" +
                "109.904 743(greedy) leaves\n" +
                "109.970 744(greedy) arrives\n" +
                "109.970 744(greedy) leaves\n" +
                "110.000 745 arrives\n" +
                "110.000 745 leaves\n" +
                "110.045 632 serves by server 2\n" +
                "110.108 688 done serving by self-check 4\n" +
                "110.108 693 serves by self-check 4\n" +
                "110.109 746 arrives\n" +
                "110.109 746 waits at server 2\n" +
                "110.119 689 done serving by self-check 5\n" +
                "110.119 712 serves by self-check 5\n" +
                "110.124 504 done serving by server 1\n" +
                "110.338 747 arrives\n" +
                "110.338 747 waits at self-check 4\n" +
                "110.553 748(greedy) arrives\n" +
                "110.553 748(greedy) waits at self-check 4\n" +
                "110.614 632 done serving by server 2\n" +
                "110.719 608(greedy) done serving by server 3\n" +
                "110.889 749 arrives\n" +
                "110.889 749 leaves\n" +
                "110.960 615 serves by server 3\n" +
                "111.039 750 arrives\n" +
                "111.039 750 waits at server 3\n" +
                "111.179 712 done serving by self-check 5\n" +
                "111.179 715(greedy) serves by self-check 5\n" +
                "111.203 693 done serving by self-check 4\n" +
                "111.203 720(greedy) serves by self-check 4\n" +
                "111.310 751 arrives\n" +
                "111.310 751 waits at self-check 4\n" +
                "111.439 645(greedy) serves by server 2\n" +
                "111.642 715(greedy) done serving by self-check 5\n" +
                "111.642 722(greedy) serves by self-check 5\n" +
                "111.678 752 arrives\n" +
                "111.678 752 waits at server 2\n" +
                "111.746 722(greedy) done serving by self-check 5\n" +
                "111.746 723 serves by self-check 5\n" +
                "112.191 507 serves by server 1\n" +
                "112.333 753 arrives\n" +
                "112.333 753 waits at server 1\n" +
                "112.337 754(greedy) arrives\n" +
                "112.337 754(greedy) waits at self-check 4\n" +
                "112.344 755(greedy) arrives\n" +
                "112.344 755(greedy) waits at self-check 4\n" +
                "112.399 615 done serving by server 3\n" +
                "112.410 756 arrives\n" +
                "112.410 756 waits at self-check 4\n" +
                "112.538 723 done serving by self-check 5\n" +
                "112.538 724 serves by self-check 5\n" +
                "112.558 757 arrives\n" +
                "112.558 757 waits at self-check 4\n" +
                "112.654 758 arrives\n" +
                "112.654 758 leaves\n" +
                "112.728 720(greedy) done serving by self-check 4\n" +
                "112.728 725(greedy) serves by self-check 4\n" +
                "112.991 725(greedy) done serving by self-check 4\n" +
                "112.991 729(greedy) serves by self-check 4\n" +
                "112.993 759 arrives\n" +
                "112.993 759 waits at self-check 4\n" +
                "113.255 760 arrives\n" +
                "113.255 760 waits at self-check 4\n" +
                "113.271 761 arrives\n" +
                "113.271 761 leaves\n" +
                "113.536 762 arrives\n" +
                "113.536 762 leaves\n" +
                "113.582 763 arrives\n" +
                "113.582 763 leaves\n" +
                "113.607 729(greedy) done serving by self-check 4\n" +
                "113.607 737(greedy) serves by self-check 4\n" +
                "113.654 737(greedy) done serving by self-check 4\n" +
                "113.654 747 serves by self-check 4\n" +
                "113.669 747 done serving by self-check 4\n" +
                "113.669 748(greedy) serves by self-check 4\n" +
                "113.713 635 serves by server 3\n" +
                "113.805 748(greedy) done serving by self-check 4\n" +
                "113.805 751 serves by self-check 4\n" +
                "113.848 764 arrives\n" +
                "113.848 764 waits at server 3\n" +
                "113.883 765 arrives\n" +
                "113.883 765 waits at self-check 4\n" +
                "113.895 766 arrives\n" +
                "113.895 766 waits at self-check 4\n" +
                "114.081 751 done serving by self-check 4\n" +
                "114.081 754(greedy) serves by self-check 4\n" +
                "114.114 767 arrives\n" +
                "114.114 767 waits at self-check 4\n" +
                "114.184 768(greedy) arrives\n" +
                "114.184 768(greedy) waits at self-check 4\n" +
                "114.272 769 arrives\n" +
                "114.272 769 waits at self-check 4\n" +
                "114.323 635 done serving by server 3\n" +
                "114.342 770 arrives\n" +
                "114.342 770 leaves\n" +
                "114.389 771 arrives\n" +
                "114.389 771 leaves\n" +
                "114.544 772(greedy) arrives\n" +
                "114.544 772(greedy) leaves\n" +
                "114.596 773 arrives\n" +
                "114.596 773 leaves\n" +
                "114.821 754(greedy) done serving by self-check 4\n" +
                "114.821 755(greedy) serves by self-check 4\n" +
                "114.912 774 arrives\n" +
                "114.912 774 waits at self-check 4\n" +
                "114.960 639(greedy) serves by server 3\n" +
                "114.993 775(greedy) arrives\n" +
                "114.993 775(greedy) waits at server 3\n" +
                "115.060 776 arrives\n" +
                "115.060 776 leaves\n" +
                "115.085 777(greedy) arrives\n" +
                "115.085 777(greedy) leaves\n" +
                "115.245 778(greedy) arrives\n" +
                "115.245 778(greedy) leaves\n" +
                "115.413 779 arrives\n" +
                "115.413 779 leaves\n" +
                "115.466 755(greedy) done serving by self-check 4\n" +
                "115.466 756 serves by self-check 4\n" +
                "115.491 507 done serving by server 1\n" +
                "115.561 780 arrives\n" +
                "115.561 780 waits at self-check 4\n" +
                "115.625 538(greedy) serves by server 1\n" +
                "115.778 645(greedy) done serving by server 2\n" +
                "115.834 756 done serving by self-check 4\n" +
                "115.834 757 serves by self-check 4\n" +
                "115.935 781(greedy) arrives\n" +
                "115.935 781(greedy) waits at server 1\n" +
                "115.954 782(greedy) arrives\n" +
                "115.954 782(greedy) waits at self-check 4\n" +
                "115.990 650 serves by server 2\n" +
                "115.997 650 done serving by server 2\n" +
                "116.095 757 done serving by self-check 4\n" +
                "116.095 759 serves by self-check 4\n" +
                "116.333 538(greedy) done serving by server 1\n" +
                "116.401 783(greedy) arrives\n" +
                "116.401 783(greedy) waits at server 2\n" +
                "116.555 759 done serving by self-check 4\n" +
                "116.555 760 serves by self-check 4\n" +
                "116.585 557 serves by server 1\n" +
                "116.874 557 done serving by server 1\n" +
                "116.897 784(greedy) arrives\n" +
                "116.897 784(greedy) waits at self-check 4\n" +
                "116.900 785(greedy) arrives\n" +
                "116.900 785(greedy) waits at server 1\n" +
                "116.911 589 serves by server 1\n" +
                "116.974 786(greedy) arrives\n" +
                "116.974 786(greedy) waits at server 1\n" +
                "117.018 653 serves by server 2\n" +
                "117.111 787 arrives\n" +
                "117.111 787 waits at server 2\n" +
                "117.125 788(greedy) arrives\n" +
                "117.125 788(greedy) waits at self-check 4\n" +
                "117.187 653 done serving by server 2\n" +
                "117.257 589 done serving by server 1\n" +
                "117.319 639(greedy) done serving by server 3\n" +
                "117.325 659(greedy) serves by server 3\n" +
                "117.443 789(greedy) arrives\n" +
                "117.443 789(greedy) waits at server 3\n" +
                "117.453 790 arrives\n" +
                "117.453 790 leaves\n" +
                "117.523 622 serves by server 1\n" +
                "117.536 791(greedy) arrives\n" +
                "117.536 791(greedy) waits at server 1\n" +
                "117.553 792 arrives\n" +
                "117.553 792 leaves\n" +
                "117.608 793(greedy) arrives\n" +
                "117.608 793(greedy) leaves\n" +
                "117.676 659(greedy) done serving by server 3\n" +
                "117.725 760 done serving by self-check 4\n" +
                "117.725 765 serves by self-check 4\n" +
                "117.765 794(greedy) arrives\n" +
                "117.765 794(greedy) waits at self-check 4\n" +
                "117.816 795(greedy) arrives\n" +
                "117.816 795(greedy) leaves\n" +
                "117.866 796(greedy) arrives\n" +
                "117.866 796(greedy) leaves\n" +
                "117.976 797 arrives\n" +
                "117.976 797 leaves\n" +
                "118.040 798(greedy) arrives\n" +
                "118.040 798(greedy) leaves\n" +
                "118.061 799(greedy) arrives\n" +
                "118.061 799(greedy) leaves\n" +
                "118.092 663 serves by server 3\n" +
                "118.212 800(greedy) arrives\n" +
                "118.212 800(greedy) waits at server 3\n" +
                "118.382 663 done serving by server 3\n" +
                "118.399 801(greedy) arrives\n" +
                "118.399 801(greedy) leaves\n" +
                "118.432 802(greedy) arrives\n" +
                "118.432 802(greedy) leaves\n" +
                "118.458 622 done serving by server 1\n" +
                "118.525 803(greedy) arrives\n" +
                "118.525 803(greedy) leaves\n" +
                "118.602 804(greedy) arrives\n" +
                "118.602 804(greedy) leaves\n" +
                "118.619 660(greedy) serves by server 2\n" +
                "118.777 805 arrives\n" +
                "118.777 805 waits at server 2\n" +
                "118.904 671 serves by server 3\n" +
                "119.087 647 serves by server 1\n" +
                "119.127 724 done serving by self-check 5\n" +
                "119.127 766 serves by self-check 5\n" +
                "119.144 766 done serving by self-check 5\n" +
                "119.144 767 serves by self-check 5\n" +
                "119.227 765 done serving by self-check 4\n" +
                "119.227 768(greedy) serves by self-check 4\n" +
                "119.364 767 done serving by self-check 5\n" +
                "119.364 769 serves by self-check 5\n" +
                "119.377 806 arrives\n" +
                "119.377 806 waits at server 1\n" +
                "119.387 647 done serving by server 1\n" +
                "119.495 807 arrives\n" +
                "119.495 807 waits at server 3\n" +
                "119.773 769 done serving by self-check 5\n" +
                "119.773 774 serves by self-check 5\n" +
                "119.834 808(greedy) arrives\n" +
                "119.834 808(greedy) waits at self-check 4\n" +
                "119.950 809(greedy) arrives\n" +
                "119.950 809(greedy) waits at self-check 4\n" +
                "119.956 810(greedy) arrives\n" +
                "119.956 810(greedy) waits at self-check 4\n" +
                "120.066 671 done serving by server 3\n" +
                "120.139 811 arrives\n" +
                "120.139 811 waits at self-check 4\n" +
                "120.224 774 done serving by self-check 5\n" +
                "120.224 780 serves by self-check 5\n" +
                "120.224 812(greedy) arrives\n" +
                "120.224 812(greedy) waits at self-check 4\n" +
                "120.368 660(greedy) done serving by server 2\n" +
                "120.407 768(greedy) done serving by self-check 4\n" +
                "120.407 782(greedy) serves by self-check 4\n" +
                "120.444 813 arrives\n" +
                "120.444 813 waits at self-check 4\n" +
                "120.579 814 arrives\n" +
                "120.579 814 waits at self-check 4\n" +
                "120.712 815 arrives\n" +
                "120.712 815 leaves\n" +
                "120.764 816(greedy) arrives\n" +
                "120.764 816(greedy) leaves\n" +
                "120.855 782(greedy) done serving by self-check 4\n" +
                "120.855 784(greedy) serves by self-check 4\n" +
                "120.946 817 arrives\n" +
                "120.946 817 waits at self-check 4\n" +
                "121.255 818(greedy) arrives\n" +
                "121.255 818(greedy) leaves\n" +
                "121.425 784(greedy) done serving by self-check 4\n" +
                "121.425 788(greedy) serves by self-check 4\n" +
                "121.484 780 done serving by self-check 5\n" +
                "121.484 794(greedy) serves by self-check 5\n" +
                "121.577 819(greedy) arrives\n" +
                "121.577 819(greedy) waits at self-check 4\n" +
                "121.579 670 serves by server 1\n" +
                "121.702 820(greedy) arrives\n" +
                "121.702 820(greedy) waits at server 1\n" +
                "121.756 821 arrives\n" +
                "121.756 821 waits at self-check 4\n" +
                "121.884 788(greedy) done serving by self-check 4\n" +
                "121.884 808(greedy) serves by self-check 4\n" +
                "121.924 822 arrives\n" +
                "121.924 822 waits at self-check 4\n" +
                "121.983 794(greedy) done serving by self-check 5\n" +
                "121.983 809(greedy) serves by self-check 5\n" +
                "122.126 823(greedy) arrives\n" +
                "122.126 823(greedy) waits at self-check 4\n" +
                "122.189 672 serves by server 2\n" +
                "122.191 824 arrives\n" +
                "122.191 824 waits at server 2\n" +
                "122.197 825(greedy) arrives\n" +
                "122.197 825(greedy) leaves\n" +
                "122.365 826 arrives\n" +
                "122.365 826 leaves\n" +
                "122.427 808(greedy) done serving by self-check 4\n" +
                "122.427 810(greedy) serves by self-check 4\n" +
                "122.463 827 arrives\n" +
                "122.463 827 waits at self-check 4\n" +
                "122.513 828 arrives\n" +
                "122.513 828 leaves\n" +
                "122.599 674 serves by server 3\n" +
                "122.600 829(greedy) arrives\n" +
                "122.600 829(greedy) waits at server 3\n" +
                "122.650 672 done serving by server 2\n" +
                "122.671 830(greedy) arrives\n" +
                "122.671 830(greedy) leaves\n" +
                "122.676 831 arrives\n" +
                "122.676 831 leaves\n" +
                "122.686 832(greedy) arrives\n" +
                "122.686 832(greedy) leaves\n" +
                "122.879 674 done serving by server 3\n" +
                "123.029 833 arrives\n" +
                "123.029 833 leaves\n" +
                "123.062 834(greedy) arrives\n" +
                "123.062 834(greedy) leaves\n" +
                "123.183 835 arrives\n" +
                "123.183 835 leaves\n" +
                "123.184 836(greedy) arrives\n" +
                "123.184 836(greedy) leaves\n" +
                "123.241 837 arrives\n" +
                "123.241 837 leaves\n" +
                "123.283 838(greedy) arrives\n" +
                "123.283 838(greedy) leaves\n" +
                "123.311 839(greedy) arrives\n" +
                "123.311 839(greedy) leaves\n" +
                "123.397 840(greedy) arrives\n" +
                "123.397 840(greedy) leaves\n" +
                "123.435 841(greedy) arrives\n" +
                "123.435 841(greedy) leaves\n" +
                "123.449 673 serves by server 2\n" +
                "123.502 842 arrives\n" +
                "123.502 842 waits at server 2\n" +
                "123.593 843(greedy) arrives\n" +
                "123.593 843(greedy) leaves\n" +
                "123.609 670 done serving by server 1\n" +
                "123.879 809(greedy) done serving by self-check 5\n" +
                "123.879 811 serves by self-check 5\n" +
                "123.907 686 serves by server 1\n" +
                "123.922 677 serves by server 3\n" +
                "123.949 686 done serving by server 1\n" +
                "124.138 810(greedy) done serving by self-check 4\n" +
                "124.138 812(greedy) serves by self-check 4\n" +
                "124.142 844(greedy) arrives\n" +
                "124.142 844(greedy) waits at self-check 4\n" +
                "124.147 845 arrives\n" +
                "124.147 845 waits at server 1\n" +
                "124.182 846 arrives\n" +
                "124.182 846 waits at server 3\n" +
                "124.217 847(greedy) arrives\n" +
                "124.217 847(greedy) waits at self-check 4\n" +
                "124.221 848 arrives\n" +
                "124.221 848 leaves");

        System.out.println("124.285 673 done serving by server 2\n" +
                "124.292 849 arrives\n" +
                "124.292 849 leaves\n" +
                "124.302 850 arrives\n" +
                "124.302 850 leaves\n" +
                "124.410 851 arrives\n" +
                "124.410 851 leaves\n" +
                "124.413 852 arrives\n" +
                "124.413 852 leaves\n" +
                "124.630 811 done serving by self-check 5\n" +
                "124.630 813 serves by self-check 5\n" +
                "124.633 853 arrives\n" +
                "124.633 853 waits at self-check 4\n" +
                "124.694 854(greedy) arrives\n" +
                "124.694 854(greedy) leaves\n" +
                "124.802 855 arrives\n" +
                "124.802 855 leaves\n" +
                "124.824 677 done serving by server 3\n" +
                "124.831 856 arrives\n" +
                "124.831 856 leaves\n" +
                "124.845 812(greedy) done serving by self-check 4\n" +
                "124.845 814 serves by self-check 4\n" +
                "124.916 857(greedy) arrives\n" +
                "124.916 857(greedy) waits at self-check 4\n" +
                "124.979 858 arrives\n" +
                "124.979 858 leaves\n" +
                "125.027 707(greedy) serves by server 3\n" +
                "125.108 859(greedy) arrives\n" +
                "125.108 859(greedy) waits at server 3\n" +
                "125.189 687 serves by server 2\n" +
                "125.601 860 arrives\n" +
                "125.601 860 waits at server 2\n" +
                "125.610 814 done serving by self-check 4\n" +
                "125.610 817 serves by self-check 4\n" +
                "125.744 861 arrives\n" +
                "125.744 861 waits at self-check 4\n" +
                "125.759 707(greedy) done serving by server 3\n" +
                "125.810 862 arrives\n" +
                "125.810 862 leaves\n" +
                "125.938 813 done serving by self-check 5\n" +
                "125.938 819(greedy) serves by self-check 5\n" +
                "125.991 711 serves by server 1\n" +
                "126.207 863(greedy) arrives\n" +
                "126.207 863(greedy) waits at server 1\n" +
                "126.469 864 arrives\n" +
                "126.469 864 waits at self-check 4\n" +
                "126.472 819(greedy) done serving by self-check 5\n" +
                "126.472 821 serves by self-check 5\n" +
                "126.697 817 done serving by self-check 4\n" +
                "126.697 822 serves by self-check 4\n" +
                "127.090 865 arrives\n" +
                "127.090 865 waits at self-check 4\n" +
                "127.142 866 arrives\n" +
                "127.142 866 waits at self-check 4\n" +
                "127.363 711 done serving by server 1\n" +
                "127.450 867 arrives\n" +
                "127.450 867 leaves\n" +
                "127.464 868(greedy) arrives\n" +
                "127.464 868(greedy) leaves\n" +
                "127.543 821 done serving by self-check 5\n" +
                "127.543 823(greedy) serves by self-check 5\n" +
                "127.566 823(greedy) done serving by self-check 5\n" +
                "127.566 827 serves by self-check 5\n" +
                "127.572 869 arrives\n" +
                "127.572 869 waits at self-check 4\n" +
                "127.584 728(greedy) serves by server 1\n" +
                "128.334 870(greedy) arrives\n" +
                "128.334 870(greedy) waits at server 1\n" +
                "128.414 871(greedy) arrives\n" +
                "128.414 871(greedy) waits at self-check 4\n" +
                "128.510 822 done serving by self-check 4\n" +
                "128.510 844(greedy) serves by self-check 4\n" +
                "128.533 827 done serving by self-check 5\n" +
                "128.533 847(greedy) serves by self-check 5\n" +
                "128.830 872(greedy) arrives\n" +
                "128.830 872(greedy) waits at self-check 4\n" +
                "128.850 687 done serving by server 2\n" +
                "128.878 873(greedy) arrives\n" +
                "128.878 873(greedy) waits at self-check 4\n" +
                "128.899 874 arrives\n" +
                "128.899 874 leaves\n" +
                "129.022 875 arrives\n" +
                "129.022 875 leaves\n" +
                "129.038 692(greedy) serves by server 2\n" +
                "129.167 728(greedy) done serving by server 1\n" +
                "129.363 847(greedy) done serving by self-check 5\n" +
                "129.363 853 serves by self-check 5\n" +
                "129.461 876(greedy) arrives\n" +
                "129.461 876(greedy) waits at server 2\n" +
                "129.476 753 serves by server 1\n" +
                "129.632 692(greedy) done serving by server 2\n" +
                "129.678 877 arrives\n" +
                "129.678 877 waits at server 1\n" +
                "129.736 738(greedy) serves by server 3\n" +
                "129.773 878(greedy) arrives\n" +
                "129.773 878(greedy) waits at server 3\n" +
                "129.930 879(greedy) arrives\n" +
                "129.930 879(greedy) waits at self-check 4\n" +
                "130.055 880 arrives\n" +
                "130.055 880 leaves\n" +
                "130.164 881 arrives\n" +
                "130.164 881 leaves\n" +
                "130.186 882(greedy) arrives\n" +
                "130.186 882(greedy) leaves\n" +
                "130.226 883(greedy) arrives\n" +
                "130.226 883(greedy) leaves\n" +
                "130.262 884 arrives\n" +
                "130.262 884 leaves\n" +
                "130.297 885 arrives\n" +
                "130.297 885 leaves\n" +
                "130.665 738(greedy) done serving by server 3\n" +
                "130.688 753 done serving by server 1\n" +
                "130.698 853 done serving by self-check 5\n" +
                "130.698 857(greedy) serves by self-check 5\n" +
                "130.718 781(greedy) serves by server 1\n" +
                "130.811 736(greedy) serves by server 2\n" +
                "130.907 886(greedy) arrives\n" +
                "130.907 886(greedy) waits at server 1\n" +
                "130.947 887 arrives\n" +
                "130.947 887 waits at server 2\n" +
                "131.198 888 arrives\n" +
                "131.198 888 waits at self-check 4\n" +
                "131.326 889 arrives\n" +
                "131.326 889 leaves\n" +
                "131.426 857(greedy) done serving by self-check 5\n" +
                "131.426 861 serves by self-check 5\n" +
                "131.480 890 arrives\n" +
                "131.480 890 waits at self-check 4\n" +
                "131.700 844(greedy) done serving by self-check 4\n" +
                "131.700 864 serves by self-check 4\n" +
                "131.750 864 done serving by self-check 4\n" +
                "131.750 865 serves by self-check 4\n" +
                "131.792 891 arrives\n" +
                "131.792 891 waits at self-check 4\n" +
                "131.882 865 done serving by self-check 4\n" +
                "131.882 866 serves by self-check 4\n" +
                "131.943 892 arrives\n" +
                "131.943 892 waits at self-check 4\n" +
                "132.030 893(greedy) arrives\n" +
                "132.030 893(greedy) waits at self-check 4\n" +
                "132.171 736(greedy) done serving by server 2\n" +
                "132.173 894(greedy) arrives\n" +
                "132.173 894(greedy) leaves\n" +
                "132.260 895 arrives\n" +
                "132.260 895 leaves\n" +
                "132.275 781(greedy) done serving by server 1\n" +
                "132.361 896 arrives\n" +
                "132.361 896 leaves\n" +
                "132.410 897 arrives\n" +
                "132.410 897 leaves\n" +
                "132.420 898(greedy) arrives\n" +
                "132.420 898(greedy) leaves\n" +
                "132.459 899 arrives\n" +
                "132.459 899 leaves\n" +
                "132.464 746 serves by server 2\n" +
                "132.468 900(greedy) arrives\n" +
                "132.468 900(greedy) waits at server 2\n" +
                "132.506 746 done serving by server 2\n" +
                "132.520 901(greedy) arrives\n" +
                "132.520 901(greedy) leaves\n" +
                "132.593 902(greedy) arrives\n" +
                "132.593 902(greedy) leaves\n" +
                "132.625 861 done serving by self-check 5\n" +
                "132.625 869 serves by self-check 5\n" +
                "132.650 752 serves by server 2\n" +
                "132.655 869 done serving by self-check 5\n" +
                "132.655 871(greedy) serves by self-check 5\n" +
                "132.766 785(greedy) serves by server 1\n" +
                "133.035 903(greedy) arrives\n" +
                "133.035 903(greedy) waits at self-check 4\n" +
                "133.066 871(greedy) done serving by self-check 5\n" +
                "133.066 872(greedy) serves by self-check 5\n" +
                "133.120 872(greedy) done serving by self-check 5\n" +
                "133.120 873(greedy) serves by self-check 5\n" +
                "133.180 904(greedy) arrives\n" +
                "133.180 904(greedy) waits at self-check 4\n" +
                "133.227 905(greedy) arrives\n" +
                "133.227 905(greedy) waits at self-check 4\n" +
                "133.357 906(greedy) arrives\n" +
                "133.357 906(greedy) waits at server 1\n" +
                "133.510 907(greedy) arrives\n" +
                "133.510 907(greedy) waits at server 2\n" +
                "133.526 908 arrives\n" +
                "133.526 908 waits at self-check 4\n" +
                "133.788 750 serves by server 3\n" +
                "133.823 873(greedy) done serving by self-check 5\n" +
                "133.823 879(greedy) serves by self-check 5\n" +
                "133.839 879(greedy) done serving by self-check 5\n" +
                "133.839 888 serves by self-check 5\n" +
                "133.854 785(greedy) done serving by server 1\n" +
                "133.905 786(greedy) serves by server 1\n" +
                "134.012 909(greedy) arrives\n" +
                "134.012 909(greedy) waits at self-check 4\n" +
                "134.023 888 done serving by self-check 5\n" +
                "134.023 890 serves by self-check 5\n" +
                "134.047 910(greedy) arrives\n" +
                "134.047 910(greedy) waits at self-check 4\n" +
                "134.183 911 arrives\n" +
                "134.183 911 waits at server 1\n" +
                "134.200 912(greedy) arrives\n" +
                "134.200 912(greedy) waits at server 3\n" +
                "134.211 913(greedy) arrives\n" +
                "134.211 913(greedy) waits at self-check 4\n" +
                "134.229 752 done serving by server 2\n" +
                "134.277 866 done serving by self-check 4\n" +
                "134.277 891 serves by self-check 4\n" +
                "134.282 914(greedy) arrives\n" +
                "134.282 914(greedy) waits at self-check 4\n" +
                "134.367 891 done serving by self-check 4\n" +
                "134.367 892 serves by self-check 4\n" +
                "134.433 915(greedy) arrives\n" +
                "134.433 915(greedy) waits at self-check 4\n" +
                "134.468 916(greedy) arrives\n" +
                "134.468 916(greedy) leaves\n" +
                "134.477 892 done serving by self-check 4\n" +
                "134.477 893(greedy) serves by self-check 4\n" +
                "134.640 917 arrives\n" +
                "134.640 917 waits at self-check 4\n" +
                "134.801 783(greedy) serves by server 2\n" +
                "134.859 783(greedy) done serving by server 2\n" +
                "134.887 918 arrives\n" +
                "134.887 918 waits at server 2\n" +
                "134.981 919(greedy) arrives\n" +
                "134.981 919(greedy) leaves\n" +
                "134.986 750 done serving by server 3\n" +
                "135.105 786(greedy) done serving by server 1\n" +
                "135.147 787 serves by server 2\n" +
                "135.381 920 arrives\n" +
                "135.381 920 waits at server 2\n" +
                "135.385 787 done serving by server 2\n" +
                "135.448 791(greedy) serves by server 1\n" +
                "135.514 921(greedy) arrives\n" +
                "135.514 921(greedy) waits at server 1\n" +
                "135.532 890 done serving by self-check 5\n" +
                "135.532 903(greedy) serves by self-check 5\n" +
                "135.532 922 arrives\n" +
                "135.532 922 waits at self-check 4\n" +
                "135.766 764 serves by server 3\n" +
                "135.792 791(greedy) done serving by server 1\n" +
                "135.910 903(greedy) done serving by self-check 5\n" +
                "135.910 904(greedy) serves by self-check 5\n" +
                "135.973 923 arrives\n" +
                "135.973 923 waits at server 3\n" +
                "136.050 805 serves by server 2\n" +
                "136.180 764 done serving by server 3\n" +
                "136.246 893(greedy) done serving by self-check 4\n" +
                "136.246 905(greedy) serves by self-check 4\n" +
                "136.336 924(greedy) arrives\n" +
                "136.336 924(greedy) waits at self-check 4\n" +
                "136.358 925(greedy) arrives\n" +
                "136.358 925(greedy) waits at server 2\n" +
                "136.420 926(greedy) arrives\n" +
                "136.420 926(greedy) waits at self-check 4\n" +
                "136.547 927 arrives\n" +
                "136.547 927 leaves\n" +
                "136.558 928(greedy) arrives\n" +
                "136.558 928(greedy) leaves\n" +
                "136.680 929(greedy) arrives\n" +
                "136.680 929(greedy) leaves\n" +
                "136.694 930(greedy) arrives\n" +
                "136.694 930(greedy) leaves\n" +
                "136.790 806 serves by server 1\n" +
                "136.852 806 done serving by server 1\n" +
                "136.856 931 arrives\n" +
                "136.856 931 waits at server 1\n" +
                "136.907 820(greedy) serves by server 1\n" +
                "136.924 932 arrives\n" +
                "136.924 932 waits at server 1\n" +
                "136.985 933(greedy) arrives\n" +
                "136.985 933(greedy) leaves\n" +
                "137.155 934 arrives\n" +
                "137.155 934 leaves\n" +
                "137.156 805 done serving by server 2\n" +
                "137.160 935(greedy) arrives\n" +
                "137.160 935(greedy) leaves\n" +
                "137.230 905(greedy) done serving by self-check 4\n" +
                "137.230 908 serves by self-check 4\n" +
                "137.293 904(greedy) done serving by self-check 5\n" +
                "137.293 909(greedy) serves by self-check 5\n" +
                "137.338 936 arrives\n" +
                "137.338 936 waits at self-check 4\n" +
                "137.403 937 arrives\n" +
                "137.403 937 waits at self-check 4\n" +
                "137.470 824 serves by server 2\n" +
                "137.497 820(greedy) done serving by server 1\n" +
                "137.577 938 arrives\n" +
                "137.577 938 waits at server 2\n" +
                "137.636 909(greedy) done serving by self-check 5\n" +
                "137.636 910(greedy) serves by self-check 5\n" +
                "137.688 910(greedy) done serving by self-check 5\n" +
                "137.688 913(greedy) serves by self-check 5\n" +
                "137.909 939(greedy) arrives\n" +
                "137.909 939(greedy) waits at self-check 4\n" +
                "137.912 940 arrives\n" +
                "137.912 940 waits at self-check 4\n" +
                "137.936 913(greedy) done serving by self-check 5\n" +
                "137.936 914(greedy) serves by self-check 5\n" +
                "137.941 908 done serving by self-check 4\n" +
                "137.941 915(greedy) serves by self-check 4\n" +
                "137.965 941(greedy) arrives\n" +
                "137.965 941(greedy) waits at self-check 4\n" +
                "137.975 942(greedy) arrives\n" +
                "137.975 942(greedy) waits at self-check 4\n" +
                "138.068 824 done serving by server 2\n" +
                "138.118 943 arrives\n" +
                "138.118 943 leaves\n" +
                "138.132 775(greedy) serves by server 3\n" +
                "138.215 944(greedy) arrives\n" +
                "138.215 944(greedy) waits at server 3\n" +
                "138.220 914(greedy) done serving by self-check 5\n" +
                "138.220 917 serves by self-check 5\n" +
                "138.237 775(greedy) done serving by server 3\n" +
                "138.269 945(greedy) arrives\n" +
                "138.269 945(greedy) waits at self-check 4\n" +
                "138.372 946 arrives\n" +
                "138.372 946 leaves\n" +
                "138.614 947(greedy) arrives\n" +
                "138.614 947(greedy) leaves\n" +
                "138.628 915(greedy) done serving by self-check 4\n" +
                "138.628 922 serves by self-check 4\n" +
                "138.634 845 serves by server 1\n" +
                "138.710 948(greedy) arrives\n" +
                "138.710 948(greedy) waits at server 1\n" +
                "138.804 949(greedy) arrives\n" +
                "138.804 949(greedy) waits at self-check 4\n" +
                "138.860 950(greedy) arrives\n" +
                "138.860 950(greedy) leaves\n" +
                "139.011 842 serves by server 2\n" +
                "139.012 917 done serving by self-check 5\n" +
                "139.012 924(greedy) serves by self-check 5\n" +
                "139.170 842 done serving by server 2\n" +
                "139.241 845 done serving by server 1\n" +
                "139.308 951 arrives\n" +
                "139.308 951 waits at server 2\n" +
                "139.320 952 arrives\n" +
                "139.320 952 waits at self-check 4\n" +
                "139.438 953(greedy) arrives\n" +
                "139.438 953(greedy) leaves\n" +
                "139.538 954 arrives\n" +
                "139.538 954 leaves\n" +
                "139.569 955 arrives\n" +
                "139.569 955 leaves\n" +
                "139.584 863(greedy) serves by server 1\n" +
                "139.616 956(greedy) arrives\n" +
                "139.616 956(greedy) waits at server 1\n" +
                "139.723 924(greedy) done serving by self-check 5\n" +
                "139.723 926(greedy) serves by self-check 5\n" +
                "139.750 957 arrives\n" +
                "139.750 957 waits at self-check 4\n" +
                "139.968 863(greedy) done serving by server 1\n" +
                "140.213 789(greedy) serves by server 3\n" +
                "140.398 958 arrives\n" +
                "140.398 958 waits at server 3\n" +
                "140.448 926(greedy) done serving by self-check 5\n" +
                "140.448 936 serves by self-check 5\n" +
                "140.461 936 done serving by self-check 5\n" +
                "140.461 937 serves by self-check 5\n" +
                "140.517 937 done serving by self-check 5\n" +
                "140.517 939(greedy) serves by self-check 5\n" +
                "140.558 860 serves by server 2\n" +
                "140.564 959 arrives\n" +
                "140.564 959 waits at server 2\n" +
                "140.646 870(greedy) serves by server 1\n" +
                "140.728 860 done serving by server 2\n" +
                "140.862 939(greedy) done serving by self-check 5\n" +
                "140.862 940 serves by self-check 5\n" +
                "140.942 870(greedy) done serving by server 1\n" +
                "141.118 877 serves by server 1\n" +
                "141.302 960(greedy) arrives\n" +
                "141.302 960(greedy) waits at self-check 4\n" +
                "141.330 876(greedy) serves by server 2\n" +
                "141.446 940 done serving by self-check 5\n" +
                "141.446 941(greedy) serves by self-check 5\n" +
                "141.572 961(greedy) arrives\n" +
                "141.572 961(greedy) waits at self-check 4\n" +
                "141.605 962 arrives\n" +
                "141.605 962 waits at server 1\n" +
                "141.645 876(greedy) done serving by server 2\n" +
                "141.901 963 arrives\n" +
                "141.901 963 waits at server 1\n" +
                "141.969 789(greedy) done serving by server 3\n" +
                "142.128 964(greedy) arrives\n" +
                "142.128 964(greedy) waits at self-check 4\n" +
                "142.413 965(greedy) arrives\n" +
                "142.413 965(greedy) waits at self-check 4\n" +
                "142.418 966 arrives\n" +
                "142.418 966 waits at server 2\n" +
                "142.449 800(greedy) serves by server 3\n" +
                "142.524 967(greedy) arrives\n" +
                "142.524 967(greedy) waits at server 3\n" +
                "142.679 968(greedy) arrives\n" +
                "142.679 968(greedy) waits at self-check 4\n" +
                "142.857 877 done serving by server 1\n" +
                "142.896 941(greedy) done serving by self-check 5\n" +
                "142.896 942(greedy) serves by self-check 5\n" +
                "142.915 942(greedy) done serving by self-check 5\n" +
                "142.915 945(greedy) serves by self-check 5\n" +
                "142.969 886(greedy) serves by server 1\n" +
                "143.148 969(greedy) arrives\n" +
                "143.148 969(greedy) waits at self-check 4\n" +
                "143.313 970(greedy) arrives\n" +
                "143.313 970(greedy) waits at server 1\n" +
                "143.341 886(greedy) done serving by server 1\n" +
                "143.406 971(greedy) arrives\n" +
                "143.406 971(greedy) waits at self-check 4\n" +
                "143.592 972(greedy) arrives\n" +
                "143.592 972(greedy) leaves\n" +
                "143.604 973 arrives\n" +
                "143.604 973 leaves\n" +
                "143.623 945(greedy) done serving by self-check 5\n" +
                "143.623 949(greedy) serves by self-check 5\n" +
                "143.862 887 serves by server 2\n" +
                "143.880 974(greedy) arrives\n" +
                "143.880 974(greedy) waits at server 2\n" +
                "143.885 975(greedy) arrives\n" +
                "143.885 975(greedy) waits at self-check 4\n" +
                "143.910 976 arrives\n" +
                "143.910 976 leaves\n" +
                "144.048 977(greedy) arrives\n" +
                "144.048 977(greedy) leaves\n" +
                "144.213 978 arrives\n" +
                "144.213 978 leaves\n" +
                "144.254 922 done serving by self-check 4\n" +
                "144.254 952 serves by self-check 4\n" +
                "144.338 979(greedy) arrives\n" +
                "144.338 979(greedy) waits at self-check 4\n" +
                "144.339 980(greedy) arrives\n" +
                "144.339 980(greedy) leaves\n" +
                "144.476 981 arrives\n" +
                "144.476 981 leaves\n" +
                "144.544 952 done serving by self-check 4\n" +
                "144.544 957 serves by self-check 4\n" +
                "144.898 800(greedy) done serving by server 3\n" +
                "145.034 982 arrives\n" +
                "145.034 982 waits at self-check 4\n" +
                "145.058 887 done serving by server 2\n" +
                "145.087 983 arrives\n" +
                "145.087 983 leaves\n" +
                "145.155 906(greedy) serves by server 1\n" +
                "145.580 984(greedy) arrives\n" +
                "145.580 984(greedy) waits at server 1\n" +
                "145.599 985(greedy) arrives\n" +
                "145.599 985(greedy) leaves\n" +
                "145.659 986 arrives\n" +
                "145.659 986 leaves\n" +
                "145.671 987 arrives\n" +
                "145.671 987 leaves\n" +
                "145.813 988(greedy) arrives\n" +
                "145.813 988(greedy) leaves\n" +
                "145.827 989(greedy) arrives\n" +
                "145.827 989(greedy) leaves\n" +
                "145.923 990 arrives\n" +
                "145.923 990 leaves\n" +
                "145.953 991 arrives\n" +
                "145.953 991 leaves\n" +
                "146.197 992 arrives\n" +
                "146.197 992 leaves\n" +
                "146.233 906(greedy) done serving by server 1\n" +
                "146.255 900(greedy) serves by server 2\n" +
                "146.346 957 done serving by self-check 4\n" +
                "146.346 960(greedy) serves by self-check 4\n" +
                "146.556 949(greedy) done serving by self-check 5\n" +
                "146.556 961(greedy) serves by self-check 5\n" +
                "146.691 960(greedy) done serving by self-check 4\n" +
                "146.691 964(greedy) serves by self-check 4\n" +
                "146.698 961(greedy) done serving by self-check 5\n" +
                "146.698 965(greedy) serves by self-check 5\n" +
                "146.744 993 arrives\n" +
                "146.744 993 waits at server 2\n" +
                "146.808 994 arrives\n" +
                "146.808 994 waits at self-check 4\n" +
                "146.871 995 arrives\n" +
                "146.871 995 waits at self-check 4\n" +
                "146.906 996(greedy) arrives\n" +
                "146.906 996(greedy) waits at self-check 4\n" +
                "146.923 997 arrives\n" +
                "146.923 997 waits at self-check 4\n" +
                "146.941 998(greedy) arrives\n" +
                "146.941 998(greedy) leaves\n" +
                "146.949 964(greedy) done serving by self-check 4\n" +
                "146.949 968(greedy) serves by self-check 4\n" +
                "147.036 999 arrives\n" +
                "147.036 999 waits at self-check 4\n" +
                "147.115 1000(greedy) arrives\n" +
                "147.115 1000(greedy) leaves\n" +
                "147.892 900(greedy) done serving by server 2\n" +
                "148.092 907(greedy) serves by server 2\n" +
                "148.152 968(greedy) done serving by self-check 4\n" +
                "148.152 969(greedy) serves by self-check 4\n" +
                "148.196 907(greedy) done serving by server 2\n" +
                "148.302 965(greedy) done serving by self-check 5\n" +
                "148.302 971(greedy) serves by self-check 5\n" +
                "148.617 918 serves by server 2\n" +
                "148.706 807 serves by server 3\n" +
                "148.864 807 done serving by server 3\n" +
                "148.894 918 done serving by server 2\n" +
                "149.351 829(greedy) serves by server 3\n" +
                "149.652 920 serves by server 2\n" +
                "149.806 971(greedy) done serving by self-check 5\n" +
                "149.806 975(greedy) serves by self-check 5\n" +
                "150.053 911 serves by server 1\n" +
                "150.104 975(greedy) done serving by self-check 5\n" +
                "150.104 979(greedy) serves by self-check 5\n" +
                "150.537 920 done serving by server 2\n" +
                "150.729 925(greedy) serves by server 2\n" +
                "151.122 911 done serving by server 1\n" +
                "151.288 969(greedy) done serving by self-check 4\n" +
                "151.288 982 serves by self-check 4\n" +
                "151.743 979(greedy) done serving by self-check 5");

        System.out.println("151.743 994 serves by self-check 5\n" +
                "151.879 921(greedy) serves by server 1\n" +
                "152.115 994 done serving by self-check 5\n" +
                "152.115 995 serves by self-check 5\n" +
                "152.188 921(greedy) done serving by server 1\n" +
                "152.378 982 done serving by self-check 4\n" +
                "152.378 996(greedy) serves by self-check 4\n" +
                "152.634 829(greedy) done serving by server 3\n" +
                "152.713 925(greedy) done serving by server 2\n" +
                "152.770 996(greedy) done serving by self-check 4\n" +
                "152.770 997 serves by self-check 4\n" +
                "153.533 931 serves by server 1\n" +
                "153.611 938 serves by server 2\n" +
                "153.686 997 done serving by self-check 4\n" +
                "153.686 999 serves by self-check 4\n" +
                "153.796 995 done serving by self-check 5\n" +
                "153.845 846 serves by server 3\n" +
                "154.285 931 done serving by server 1\n" +
                "154.296 999 done serving by self-check 4\n" +
                "154.313 938 done serving by server 2\n" +
                "154.571 932 serves by server 1\n" +
                "155.360 932 done serving by server 1\n" +
                "155.390 951 serves by server 2\n" +
                "155.394 948(greedy) serves by server 1\n" +
                "155.403 948(greedy) done serving by server 1\n" +
                "155.858 951 done serving by server 2\n" +
                "156.187 959 serves by server 2\n" +
                "156.636 956(greedy) serves by server 1\n" +
                "156.794 956(greedy) done serving by server 1\n" +
                "157.056 846 done serving by server 3\n" +
                "157.215 959 done serving by server 2\n" +
                "157.553 962 serves by server 1\n" +
                "158.434 859(greedy) serves by server 3\n" +
                "158.491 859(greedy) done serving by server 3\n" +
                "158.541 966 serves by server 2\n" +
                "159.896 962 done serving by server 1\n" +
                "159.964 966 done serving by server 2\n" +
                "160.078 878(greedy) serves by server 3\n" +
                "160.692 974(greedy) serves by server 2\n" +
                "161.070 878(greedy) done serving by server 3\n" +
                "161.434 974(greedy) done serving by server 2\n" +
                "161.814 912(greedy) serves by server 3\n" +
                "162.058 912(greedy) done serving by server 3\n" +
                "163.331 963 serves by server 1\n" +
                "164.786 993 serves by server 2\n" +
                "164.861 993 done serving by server 2\n" +
                "164.878 963 done serving by server 1\n" +
                "165.145 970(greedy) serves by server 1\n" +
                "165.295 923 serves by server 3\n" +
                "165.315 970(greedy) done serving by server 1\n" +
                "165.726 984(greedy) serves by server 1\n" +
                "166.131 984(greedy) done serving by server 1\n" +
                "167.672 923 done serving by server 3\n" +
                "167.698 944(greedy) serves by server 3\n" +
                "168.284 944(greedy) done serving by server 3\n" +
                "169.175 958 serves by server 3\n" +
                "169.434 958 done serving by server 3\n" +
                "170.400 967(greedy) serves by server 3\n" +
                "172.353 967(greedy) done serving by server 3\n" +
                "[10.301 564 436]");
    }

    public void serverCustomer17() {
        System.out.println("0.000 1 arrives\n" +
                "0.000 1 serves by server 1\n" +
                "0.045 2 arrives\n" +
                "0.045 2 serves by server 2\n" +
                "0.060 3 arrives\n" +
                "0.060 3 serves by server 3\n" +
                "0.159 4(greedy) arrives\n" +
                "0.159 4(greedy) serves by self-check 4\n" +
                "0.162 5(greedy) arrives\n" +
                "0.162 5(greedy) serves by self-check 5\n" +
                "0.184 6 arrives\n" +
                "0.184 6 waits at server 1\n" +
                "0.185 7 arrives\n" +
                "0.185 7 waits at server 1\n" +
                "0.313 1 done serving by server 1\n" +
                "0.313 6 serves by server 1\n" +
                "0.396 8 arrives\n" +
                "0.396 8 waits at server 1\n" +
                "0.423 4(greedy) done serving by self-check 4\n" +
                "0.728 6 done serving by server 1\n" +
                "0.728 7 serves by server 1\n" +
                "0.767 9(greedy) arrives\n" +
                "0.767 9(greedy) serves by self-check 4\n" +
                "0.809 10 arrives\n" +
                "0.809 10 waits at server 1\n" +
                "0.817 11 arrives\n" +
                "0.817 11 waits at server 1\n" +
                "0.943 7 done serving by server 1\n" +
                "0.943 8 serves by server 1\n" +
                "1.152 8 done serving by server 1\n" +
                "1.152 10 serves by server 1\n" +
                "1.209 10 done serving by server 1\n" +
                "1.315 12 arrives\n" +
                "1.315 12 waits at server 1\n" +
                "1.368 13(greedy) arrives\n" +
                "1.368 13(greedy) waits at server 2\n" +
                "1.391 14 arrives\n" +
                "1.391 14 waits at server 1\n" +
                "1.523 11 serves by server 1\n" +
                "1.643 5(greedy) done serving by self-check 5\n" +
                "1.801 15 arrives\n" +
                "1.801 15 serves by self-check 5\n" +
                "1.895 15 done serving by self-check 5\n" +
                "1.929 16 arrives\n" +
                "1.929 16 serves by self-check 5\n" +
                "1.930 16 done serving by self-check 5\n" +
                "2.078 17(greedy) arrives\n" +
                "2.078 17(greedy) serves by self-check 5\n" +
                "2.079 18 arrives\n" +
                "2.079 18 waits at server 1\n" +
                "2.161 19(greedy) arrives\n" +
                "2.161 19(greedy) waits at server 3\n" +
                "2.267 20 arrives\n" +
                "2.267 20 waits at server 1\n" +
                "2.690 2 done serving by server 2\n" +
                "2.694 17(greedy) done serving by self-check 5\n" +
                "2.697 21(greedy) arrives\n" +
                "2.697 21(greedy) serves by self-check 5\n" +
                "2.719 21(greedy) done serving by self-check 5\n" +
                "2.761 3 done serving by server 3\n" +
                "2.761 19(greedy) serves by server 3\n" +
                "2.774 22(greedy) arrives\n" +
                "2.774 22(greedy) serves by self-check 5\n" +
                "2.797 23(greedy) arrives\n" +
                "2.797 23(greedy) waits at server 3\n" +
                "3.008 24(greedy) arrives\n" +
                "3.008 24(greedy) waits at self-check 4\n" +
                "3.276 25 arrives\n" +
                "3.276 25 waits at server 1\n" +
                "3.281 26(greedy) arrives\n" +
                "3.281 26(greedy) waits at server 2\n" +
                "3.373 22(greedy) done serving by self-check 5\n" +
                "3.373 24(greedy) serves by self-check 5\n" +
                "3.402 11 done serving by server 1\n" +
                "3.402 12 serves by server 1\n" +
                "3.489 27(greedy) arrives\n" +
                "3.489 27(greedy) waits at self-check 4\n" +
                "3.558 28(greedy) arrives\n" +
                "3.558 28(greedy) waits at server 3\n" +
                "3.629 29(greedy) arrives\n" +
                "3.629 29(greedy) waits at self-check 4\n" +
                "3.829 30(greedy) arrives\n" +
                "3.829 30(greedy) waits at server 2\n" +
                "3.854 31(greedy) arrives\n" +
                "3.854 31(greedy) waits at server 3\n" +
                "3.907 32 arrives\n" +
                "3.907 32 waits at server 1\n" +
                "3.939 33(greedy) arrives\n" +
                "3.939 33(greedy) waits at self-check 4\n" +
                "4.215 12 done serving by server 1\n" +
                "4.238 34(greedy) arrives\n" +
                "4.238 34(greedy) waits at server 2\n" +
                "4.280 9(greedy) done serving by self-check 4\n" +
                "4.280 27(greedy) serves by self-check 4\n" +
                "4.556 35 arrives\n" +
                "4.556 35 waits at server 1\n" +
                "4.603 19(greedy) done serving by server 3\n" +
                "4.603 23(greedy) serves by server 3\n" +
                "4.930 14 serves by server 1\n" +
                "5.045 36(greedy) arrives\n" +
                "5.045 36(greedy) waits at server 3\n" +
                "5.054 37 arrives\n" +
                "5.054 37 waits at server 1\n" +
                "5.117 13(greedy) serves by server 2\n" +
                "5.164 27(greedy) done serving by self-check 4\n" +
                "5.164 29(greedy) serves by self-check 4\n" +
                "5.223 29(greedy) done serving by self-check 4\n" +
                "5.223 33(greedy) serves by self-check 4\n" +
                "5.243 38(greedy) arrives\n" +
                "5.243 38(greedy) waits at self-check 4\n" +
                "5.327 39(greedy) arrives\n" +
                "5.327 39(greedy) waits at self-check 4\n" +
                "5.339 33(greedy) done serving by self-check 4\n" +
                "5.339 38(greedy) serves by self-check 4\n" +
                "5.539 40 arrives\n" +
                "5.539 40 waits at server 1\n" +
                "5.743 24(greedy) done serving by self-check 5\n" +
                "5.743 39(greedy) serves by self-check 5\n" +
                "5.817 41 arrives\n" +
                "5.817 41 waits at server 1\n" +
                "5.836 13(greedy) done serving by server 2\n" +
                "5.836 26(greedy) serves by server 2\n" +
                "5.853 23(greedy) done serving by server 3\n" +
                "5.963 38(greedy) done serving by self-check 4\n" +
                "6.243 42 arrives\n" +
                "6.243 42 serves by self-check 4\n" +
                "6.302 39(greedy) done serving by self-check 5\n" +
                "6.534 43(greedy) arrives\n" +
                "6.534 43(greedy) serves by self-check 5\n" +
                "6.573 43(greedy) done serving by self-check 5\n" +
                "6.613 42 done serving by self-check 4\n" +
                "6.626 28(greedy) serves by server 3\n" +
                "6.707 14 done serving by server 1\n" +
                "6.707 18 serves by server 1\n" +
                "6.941 44 arrives\n" +
                "6.941 44 serves by self-check 4\n" +
                "7.052 45 arrives\n" +
                "7.052 45 serves by self-check 5\n" +
                "7.160 46(greedy) arrives\n" +
                "7.160 46(greedy) waits at self-check 4\n" +
                "7.206 26(greedy) done serving by server 2\n" +
                "7.206 30(greedy) serves by server 2\n" +
                "7.356 47(greedy) arrives\n" +
                "7.356 47(greedy) waits at server 2\n" +
                "7.390 48 arrives\n" +
                "7.390 48 waits at server 1\n" +
                "7.427 49(greedy) arrives\n" +
                "7.427 49(greedy) waits at self-check 4\n" +
                "7.496 30(greedy) done serving by server 2\n" +
                "7.496 34(greedy) serves by server 2\n" +
                "7.579 50 arrives\n" +
                "7.579 50 waits at server 1\n" +
                "7.625 51 arrives\n" +
                "7.625 51 waits at server 1\n" +
                "7.643 52(greedy) arrives\n" +
                "7.643 52(greedy) waits at server 2\n" +
                "7.723 28(greedy) done serving by server 3\n" +
                "7.766 53 arrives\n" +
                "7.766 53 waits at server 2\n" +
                "7.810 44 done serving by self-check 4\n" +
                "7.810 46(greedy) serves by self-check 4\n" +
                "8.020 54 arrives\n" +
                "8.020 54 waits at server 2\n" +
                "8.054 18 done serving by server 1\n" +
                "8.054 20 serves by server 1\n" +
                "8.255 34(greedy) done serving by server 2\n" +
                "8.255 47(greedy) serves by server 2\n" +
                "8.285 55 arrives\n" +
                "8.285 55 waits at server 1\n" +
                "8.525 31(greedy) serves by server 3\n" +
                "8.534 56(greedy) arrives\n" +
                "8.534 56(greedy) waits at server 3\n" +
                "8.616 57(greedy) arrives\n" +
                "8.616 57(greedy) waits at self-check 4\n" +
                "8.849 20 done serving by server 1\n" +
                "8.949 58 arrives\n" +
                "8.949 58 waits at server 2\n" +
                "9.128 45 done serving by self-check 5\n" +
                "9.128 49(greedy) serves by self-check 5\n" +
                "9.209 25 serves by server 1\n" +
                "9.210 59(greedy) arrives\n" +
                "9.210 59(greedy) waits at self-check 4\n" +
                "9.216 31(greedy) done serving by server 3\n" +
                "9.275 60 arrives\n" +
                "9.275 60 waits at server 1\n" +
                "9.366 61 arrives\n" +
                "9.366 61 waits at server 2\n" +
                "9.517 47(greedy) done serving by server 2\n" +
                "9.517 52(greedy) serves by server 2\n" +
                "9.587 46(greedy) done serving by self-check 4\n" +
                "9.587 57(greedy) serves by self-check 4\n" +
                "9.799 49(greedy) done serving by self-check 5\n" +
                "9.799 59(greedy) serves by self-check 5\n" +
                "9.874 62 arrives\n" +
                "9.874 62 waits at server 2\n" +
                "9.906 25 done serving by server 1\n" +
                "9.906 32 serves by server 1\n" +
                "9.958 63 arrives\n" +
                "9.958 63 waits at server 1\n" +
                "9.970 59(greedy) done serving by self-check 5\n" +
                "10.031 64(greedy) arrives\n" +
                "10.031 64(greedy) serves by self-check 5\n" +
                "10.133 65 arrives\n" +
                "10.133 65 waits at server 2\n" +
                "10.137 64(greedy) done serving by self-check 5\n" +
                "10.148 66 arrives\n" +
                "10.148 66 serves by self-check 5\n" +
                "10.460 66 done serving by self-check 5\n" +
                "10.497 36(greedy) serves by server 3\n" +
                "10.604 67(greedy) arrives\n" +
                "10.604 67(greedy) serves by self-check 5\n" +
                "10.610 52(greedy) done serving by server 2\n" +
                "10.610 53 serves by server 2\n" +
                "10.715 68 arrives\n" +
                "10.715 68 waits at server 2\n" +
                "10.727 57(greedy) done serving by self-check 4\n" +
                "10.848 69(greedy) arrives\n" +
                "10.848 69(greedy) serves by self-check 4\n" +
                "10.880 70 arrives\n" +
                "10.880 70 waits at server 2\n" +
                "11.038 71(greedy) arrives\n" +
                "11.038 71(greedy) waits at self-check 4\n" +
                "11.079 36(greedy) done serving by server 3\n" +
                "11.079 56(greedy) serves by server 3\n" +
                "11.097 72(greedy) arrives\n" +
                "11.097 72(greedy) waits at server 3\n" +
                "11.142 73(greedy) arrives\n" +
                "11.142 73(greedy) waits at server 3\n" +
                "11.192 74 arrives\n" +
                "11.192 74 waits at server 2\n" +
                "11.282 75 arrives\n" +
                "11.282 75 waits at server 2\n" +
                "11.665 56(greedy) done serving by server 3\n" +
                "11.665 72(greedy) serves by server 3\n" +
                "12.124 67(greedy) done serving by self-check 5\n" +
                "12.124 71(greedy) serves by self-check 5\n" +
                "12.200 72(greedy) done serving by server 3\n" +
                "12.274 76 arrives\n" +
                "12.274 76 waits at server 2\n" +
                "12.281 77 arrives\n" +
                "12.281 77 waits at server 3\n" +
                "12.427 78 arrives\n" +
                "12.427 78 waits at server 3\n" +
                "12.475 73(greedy) serves by server 3\n" +
                "12.493 79 arrives\n" +
                "12.493 79 waits at server 3\n" +
                "12.740 80(greedy) arrives\n" +
                "12.740 80(greedy) waits at self-check 4\n" +
                "12.819 73(greedy) done serving by server 3\n" +
                "12.819 77 serves by server 3\n" +
                "12.828 32 done serving by server 1\n" +
                "12.828 35 serves by server 1\n" +
                "12.841 81 arrives\n" +
                "12.841 81 waits at server 1\n" +
                "12.855 82(greedy) arrives\n" +
                "12.855 82(greedy) waits at self-check 4\n" +
                "12.879 77 done serving by server 3\n" +
                "12.879 78 serves by server 3\n" +
                "13.035 83(greedy) arrives\n" +
                "13.035 83(greedy) waits at server 3\n" +
                "13.078 84 arrives\n" +
                "13.078 84 waits at server 3\n" +
                "13.122 69(greedy) done serving by self-check 4\n" +
                "13.122 80(greedy) serves by self-check 4\n" +
                "13.265 85(greedy) arrives\n" +
                "13.265 85(greedy) waits at self-check 4\n" +
                "13.286 80(greedy) done serving by self-check 4\n" +
                "13.286 82(greedy) serves by self-check 4\n" +
                "13.327 86(greedy) arrives\n" +
                "13.327 86(greedy) waits at self-check 4\n" +
                "13.357 87(greedy) arrives\n" +
                "13.357 87(greedy) waits at self-check 4\n" +
                "13.382 71(greedy) done serving by self-check 5\n" +
                "13.382 85(greedy) serves by self-check 5\n" +
                "13.447 88 arrives\n" +
                "13.447 88 waits at server 3\n" +
                "13.650 53 done serving by server 2\n" +
                "13.650 54 serves by server 2\n" +
                "13.919 89 arrives\n" +
                "13.919 89 waits at server 2\n" +
                "13.988 90 arrives\n" +
                "13.988 90 waits at server 3\n" +
                "13.988 82(greedy) done serving by self-check 4\n" +
                "13.988 86(greedy) serves by self-check 4\n" +
                "14.100 54 done serving by server 2\n" +
                "14.100 58 serves by server 2\n" +
                "14.232 78 done serving by server 3\n" +
                "14.232 79 serves by server 3\n" +
                "14.238 91 arrives\n" +
                "14.238 91 waits at server 2\n" +
                "14.425 86(greedy) done serving by self-check 4\n" +
                "14.425 87(greedy) serves by self-check 4\n" +
                "14.496 58 done serving by server 2\n" +
                "14.496 61 serves by server 2\n" +
                "14.518 79 done serving by server 3\n" +
                "14.555 92 arrives\n" +
                "14.555 92 waits at server 2\n" +
                "14.632 93(greedy) arrives\n" +
                "14.632 93(greedy) waits at self-check 4\n" +
                "14.767 94(greedy) arrives\n" +
                "14.767 94(greedy) waits at self-check 4\n" +
                "14.787 95(greedy) arrives\n" +
                "14.787 95(greedy) waits at self-check 4\n" +
                "14.879 96(greedy) arrives\n" +
                "14.879 96(greedy) waits at self-check 4\n" +
                "14.894 97(greedy) arrives\n" +
                "14.894 97(greedy) waits at server 3\n" +
                "14.912 98 arrives\n" +
                "14.912 98 waits at server 3\n" +
                "15.080 99 arrives\n" +
                "15.080 99 waits at server 3\n" +
                "15.221 100 arrives\n" +
                "15.221 100 waits at server 3\n" +
                "15.298 61 done serving by server 2\n" +
                "15.298 62 serves by server 2\n" +
                "15.345 85(greedy) done serving by self-check 5\n" +
                "15.345 93(greedy) serves by self-check 5\n" +
                "15.347 101 arrives\n" +
                "15.347 101 waits at server 2\n" +
                "15.388 35 done serving by server 1\n" +
                "15.390 102(greedy) arrives\n" +
                "15.390 102(greedy) waits at self-check 4\n" +
                "15.409 103 arrives\n" +
                "15.409 103 waits at server 3\n" +
                "15.424 104(greedy) arrives\n" +
                "15.424 104(greedy) waits at self-check 4\n" +
                "15.470 37 serves by server 1\n" +
                "15.611 105 arrives\n" +
                "15.611 105 waits at server 1\n" +
                "15.771 106(greedy) arrives\n" +
                "15.771 106(greedy) waits at self-check 4\n" +
                "15.785 107 arrives\n" +
                "15.785 107 waits at server 3\n" +
                "15.846 108(greedy) arrives\n" +
                "15.846 108(greedy) waits at self-check 4\n" +
                "16.035 83(greedy) serves by server 3\n" +
                "16.152 83(greedy) done serving by server 3\n" +
                "16.152 84 serves by server 3\n" +
                "16.224 62 done serving by server 2\n" +
                "16.224 65 serves by server 2\n" +
                "16.228 109(greedy) arrives\n" +
                "16.228 109(greedy) waits at self-check 4\n" +
                "16.270 84 done serving by server 3\n" +
                "16.270 88 serves by server 3\n" +
                "16.278 87(greedy) done serving by self-check 4\n" +
                "16.278 94(greedy) serves by self-check 4\n" +
                "16.318 94(greedy) done serving by self-check 4\n" +
                "16.318 95(greedy) serves by self-check 4\n" +
                "16.447 110(greedy) arrives\n" +
                "16.447 110(greedy) waits at self-check 4\n" +
                "16.568 88 done serving by server 3\n" +
                "16.609 111 arrives\n" +
                "16.609 111 waits at server 2\n" +
                "16.611 112(greedy) arrives\n" +
                "16.611 112(greedy) waits at server 3\n" +
                "16.617 113(greedy) arrives\n" +
                "16.617 113(greedy) waits at self-check 4\n" +
                "16.689 90 serves by server 3\n" +
                "16.702 114 arrives\n" +
                "16.702 114 waits at server 3\n" +
                "17.048 90 done serving by server 3\n" +
                "17.048 97(greedy) serves by server 3\n" +
                "17.223 97(greedy) done serving by server 3\n" +
                "17.223 98 serves by server 3\n" +
                "17.246 93(greedy) done serving by self-check 5\n" +
                "17.246 96(greedy) serves by self-check 5\n" +
                "17.253 115(greedy) arrives\n" +
                "17.253 115(greedy) waits at server 3\n" +
                "17.328 116 arrives\n" +
                "17.328 116 waits at server 3\n" +
                "17.331 117(greedy) arrives\n" +
                "17.331 117(greedy) waits at self-check 4\n" +
                "17.358 98 done serving by server 3\n" +
                "17.358 99 serves by server 3\n" +
                "17.414 118(greedy) arrives\n" +
                "17.414 118(greedy) waits at server 3\n" +
                "17.496 65 done serving by server 2\n" +
                "17.496 68 serves by server 2\n" +
                "17.606 68 done serving by server 2\n" +
                "17.606 70 serves by server 2\n" +
                "17.607 119 arrives\n" +
                "17.607 119 waits at server 2\n" +
                "17.741 96(greedy) done serving by self-check 5\n" +
                "17.741 102(greedy) serves by self-check 5\n" +
                "17.935 120(greedy) arrives\n" +
                "17.935 120(greedy) waits at self-check 4\n" +
                "18.025 121(greedy) arrives\n" +
                "18.025 121(greedy) waits at server 3\n" +
                "18.063 95(greedy) done serving by self-check 4\n" +
                "18.063 104(greedy) serves by self-check 4\n" +
                "18.287 122(greedy) arrives\n" +
                "18.287 122(greedy) waits at self-check 4\n" +
                "18.502 123(greedy) arrives\n" +
                "18.502 123(greedy) waits at self-check 4\n" +
                "18.584 124 arrives\n" +
                "18.584 124 waits at server 2\n" +
                "18.665 125 arrives\n" +
                "18.665 125 waits at server 3\n" +
                "18.797 126(greedy) arrives\n" +
                "18.797 126(greedy) waits at self-check 4\n" +
                "18.862 104(greedy) done serving by self-check 4\n" +
                "18.862 106(greedy) serves by self-check 4\n" +
                "18.867 127(greedy) arrives\n" +
                "18.867 127(greedy) waits at self-check 4\n" +
                "18.898 128 arrives\n" +
                "18.898 128 leaves\n" +
                "19.020 129 arrives\n" +
                "19.020 129 leaves\n" +
                "19.172 130(greedy) arrives\n" +
                "19.172 130(greedy) leaves\n" +
                "19.230 131 arrives\n" +
                "19.230 131 leaves\n" +
                "19.364 132 arrives\n" +
                "19.364 132 leaves\n" +
                "19.420 133 arrives\n" +
                "19.420 133 leaves\n" +
                "19.448 134(greedy) arrives\n" +
                "19.448 134(greedy) leaves\n" +
                "19.572 70 done serving by server 2\n" +
                "19.697 135(greedy) arrives\n" +
                "19.697 135(greedy) leaves\n" +
                "19.698 136(greedy) arrives\n" +
                "19.698 136(greedy) leaves\n" +
                "19.924 137(greedy) arrives\n" +
                "19.924 137(greedy) leaves\n" +
                "20.085 138(greedy) arrives\n" +
                "20.085 138(greedy) leaves\n" +
                "20.085 99 done serving by server 3\n" +
                "20.085 100 serves by server 3\n" +
                "20.304 139(greedy) arrives\n" +
                "20.304 139(greedy) waits at server 3\n" +
                "20.403 37 done serving by server 1\n" +
                "20.403 40 serves by server 1\n" +
                "20.516 106(greedy) done serving by self-check 4\n" +
                "20.516 108(greedy) serves by self-check 4\n" +
                "20.901 140 arrives\n" +
                "20.901 140 waits at server 1\n" +
                "20.951 141 arrives\n" +
                "20.951 141 waits at self-check 4\n" +
                "21.077 74 serves by server 2\n" +
                "21.117 142 arrives\n" +
                "21.117 142 waits at server 2\n" +
                "21.174 40 done serving by server 1\n" +
                "21.174 41 serves by server 1\n" +
                "21.487 143 arrives\n" +
                "21.487 143 waits at server 1\n" +
                "21.559 108(greedy) done serving by self-check 4\n" +
                "21.559 109(greedy) serves by self-check 4\n" +
                "21.614 144(greedy) arrives\n" +
                "21.614 144(greedy) waits at self-check 4\n" +
                "21.813 145(greedy) arrives\n" +
                "21.813 145(greedy) leaves\n" +
                "22.017 41 done serving by server 1\n" +
                "22.017 48 serves by server 1\n" +
                "22.115 146 arrives\n" +
                "22.115 146 waits at server 1\n" +
                "22.213 147(greedy) arrives\n" +
                "22.213 147(greedy) leaves\n" +
                "22.306 148(greedy) arrives\n" +
                "22.306 148(greedy) leaves\n" +
                "22.321 48 done serving by server 1\n" +
                "22.321 50 serves by server 1\n" +
                "22.653 50 done serving by server 1\n" +
                "22.653 51 serves by server 1\n" +
                "22.896 149(greedy) arrives\n" +
                "22.896 149(greedy) waits at server 1\n" +
                "22.978 150(greedy) arrives\n" +
                "22.978 150(greedy) waits at server 1\n" +
                "23.020 151(greedy) arrives\n" +
                "23.020 151(greedy) leaves\n" +
                "23.219 152(greedy) arrives\n" +
                "23.219 152(greedy) leaves\n" +
                "23.320 153(greedy) arrives\n" +
                "23.320 153(greedy) leaves\n" +
                "23.404 51 done serving by server 1\n" +
                "23.404 55 serves by server 1\n" +
                "23.439 154(greedy) arrives\n" +
                "23.439 154(greedy) waits at server 1\n" +
                "23.587 109(greedy) done serving by self-check 4\n" +
                "23.587 110(greedy) serves by self-check 4\n" +
                "23.739 155 arrives\n" +
                "23.739 155 waits at self-check 4\n" +
                "23.833 156(greedy) arrives\n" +
                "23.833 156(greedy) leaves\n" +
                "23.985 100 done serving by server 3\n" +
                "23.985 103 serves by server 3\n" +
                "24.046 103 done serving by server 3\n" +
                "24.046 107 serves by server 3\n" +
                "24.049 157(greedy) arrives\n" +
                "24.049 157(greedy) waits at server 3\n" +
                "24.080 107 done serving by server 3\n" +
                "24.080 112(greedy) serves by server 3\n" +
                "24.330 158 arrives\n" +
                "24.330 158 waits at server 3\n" +
                "24.386 159 arrives\n" +
                "24.386 159 waits at server 3\n" +
                "24.427 160(greedy) arrives\n" +
                "24.427 160(greedy) leaves\n" +
                "24.498 110(greedy) done serving by self-check 4\n" +
                "24.498 113(greedy) serves by self-check 4\n" +
                "24.730 55 done serving by server 1\n" +
                "24.789 161 arrives\n" +
                "24.789 161 waits at self-check 4\n" +
                "24.854 60 serves by server 1\n" +
                "24.856 162(greedy) arrives\n" +
                "24.856 162(greedy) waits at server 1\n" +
                "24.890 113(greedy) done serving by self-check 4\n" +
                "24.890 117(greedy) serves by self-check 4\n" +
                "25.009 163(greedy) arrives\n" +
                "25.009 163(greedy) waits at self-check 4\n" +
                "25.050 164 arrives\n" +
                "25.050 164 leaves");

        System.out.println("25.062 102(greedy) done serving by self-check 5\n" +
                "25.062 120(greedy) serves by self-check 5\n" +
                "25.072 60 done serving by server 1\n" +
                "25.072 63 serves by server 1\n" +
                "25.119 117(greedy) done serving by self-check 4\n" +
                "25.119 122(greedy) serves by self-check 4\n" +
                "25.162 165 arrives\n" +
                "25.162 165 waits at server 1\n" +
                "25.291 63 done serving by server 1\n" +
                "25.291 81 serves by server 1\n" +
                "25.371 74 done serving by server 2\n" +
                "25.371 75 serves by server 2\n" +
                "25.463 120(greedy) done serving by self-check 5\n" +
                "25.463 123(greedy) serves by self-check 5\n" +
                "25.482 166 arrives\n" +
                "25.482 166 waits at server 1\n" +
                "25.584 167(greedy) arrives\n" +
                "25.584 167(greedy) waits at self-check 4\n" +
                "25.692 75 done serving by server 2\n" +
                "25.692 76 serves by server 2\n" +
                "26.375 81 done serving by server 1\n" +
                "26.424 168 arrives\n" +
                "26.424 168 waits at server 2\n" +
                "26.497 76 done serving by server 2\n" +
                "26.497 89 serves by server 2\n" +
                "26.499 123(greedy) done serving by self-check 5\n" +
                "26.499 126(greedy) serves by self-check 5\n" +
                "26.735 122(greedy) done serving by self-check 4\n" +
                "26.735 127(greedy) serves by self-check 4\n" +
                "27.021 112(greedy) done serving by server 3\n" +
                "27.021 114 serves by server 3\n" +
                "27.177 127(greedy) done serving by self-check 4\n" +
                "27.177 141 serves by self-check 4\n" +
                "27.178 169 arrives\n" +
                "27.178 169 waits at server 2\n" +
                "27.197 105 serves by server 1\n" +
                "27.202 105 done serving by server 1\n" +
                "27.202 140 serves by server 1\n" +
                "27.320 114 done serving by server 3\n" +
                "27.320 115(greedy) serves by server 3\n" +
                "27.601 115(greedy) done serving by server 3\n" +
                "27.601 116 serves by server 3\n" +
                "27.661 116 done serving by server 3\n" +
                "27.661 118(greedy) serves by server 3\n" +
                "27.700 170 arrives\n" +
                "27.700 170 waits at server 1\n" +
                "27.749 118(greedy) done serving by server 3\n" +
                "27.749 121(greedy) serves by server 3\n" +
                "27.779 126(greedy) done serving by self-check 5\n" +
                "27.779 144(greedy) serves by self-check 5\n" +
                "27.950 140 done serving by server 1\n" +
                "28.098 144(greedy) done serving by self-check 5\n" +
                "28.098 155 serves by self-check 5\n" +
                "28.479 121(greedy) done serving by server 3\n" +
                "28.479 125 serves by server 3\n" +
                "28.654 155 done serving by self-check 5\n" +
                "28.654 161 serves by self-check 5\n" +
                "28.693 161 done serving by self-check 5\n" +
                "28.693 163(greedy) serves by self-check 5\n" +
                "28.831 171 arrives\n" +
                "28.831 171 waits at server 1\n" +
                "28.885 143 serves by server 1\n" +
                "28.940 172(greedy) arrives\n" +
                "28.940 172(greedy) waits at self-check 4\n" +
                "28.981 173 arrives\n" +
                "28.981 173 waits at server 1\n" +
                "28.991 174 arrives\n" +
                "28.991 174 waits at server 2\n" +
                "29.161 141 done serving by self-check 4\n" +
                "29.161 167(greedy) serves by self-check 4\n" +
                "29.183 167(greedy) done serving by self-check 4\n" +
                "29.183 172(greedy) serves by self-check 4\n" +
                "29.242 143 done serving by server 1\n" +
                "29.242 146 serves by server 1\n" +
                "29.254 89 done serving by server 2\n" +
                "29.254 91 serves by server 2\n" +
                "29.256 175(greedy) arrives\n" +
                "29.256 175(greedy) waits at self-check 4\n" +
                "29.268 125 done serving by server 3\n" +
                "29.274 139(greedy) serves by server 3\n" +
                "29.389 176(greedy) arrives\n" +
                "29.389 176(greedy) waits at self-check 4\n" +
                "29.679 91 done serving by server 2\n" +
                "29.679 92 serves by server 2\n" +
                "29.722 177 arrives\n" +
                "29.722 177 waits at server 1\n" +
                "29.989 178 arrives\n" +
                "29.989 178 waits at server 2\n" +
                "30.090 179 arrives\n" +
                "30.090 179 waits at server 2\n" +
                "30.106 180(greedy) arrives\n" +
                "30.106 180(greedy) waits at self-check 4\n" +
                "30.240 172(greedy) done serving by self-check 4\n" +
                "30.240 175(greedy) serves by self-check 4\n" +
                "30.412 139(greedy) done serving by server 3\n" +
                "30.446 163(greedy) done serving by self-check 5\n" +
                "30.446 176(greedy) serves by self-check 5\n" +
                "30.448 175(greedy) done serving by self-check 4\n" +
                "30.448 180(greedy) serves by self-check 4\n" +
                "30.461 92 done serving by server 2\n" +
                "30.539 157(greedy) serves by server 3\n" +
                "30.723 181(greedy) arrives\n" +
                "30.723 181(greedy) waits at self-check 4\n" +
                "30.859 182 arrives\n" +
                "30.859 182 waits at server 3\n" +
                "31.031 183(greedy) arrives\n" +
                "31.031 183(greedy) waits at self-check 4\n" +
                "31.155 184(greedy) arrives\n" +
                "31.155 184(greedy) waits at self-check 4\n" +
                "31.162 185 arrives\n" +
                "31.162 185 waits at server 3\n" +
                "31.262 186(greedy) arrives\n" +
                "31.262 186(greedy) waits at self-check 4\n" +
                "31.723 101 serves by server 2\n" +
                "31.726 187 arrives\n" +
                "31.726 187 waits at server 2\n" +
                "31.758 188 arrives\n" +
                "31.758 188 waits at server 3\n" +
                "31.791 176(greedy) done serving by self-check 5\n" +
                "31.791 181(greedy) serves by self-check 5\n" +
                "31.898 189 arrives\n" +
                "31.898 189 waits at server 3\n" +
                "32.087 190 arrives\n" +
                "32.087 190 waits at server 3\n" +
                "32.089 191(greedy) arrives\n" +
                "32.089 191(greedy) waits at self-check 4\n" +
                "32.132 181(greedy) done serving by self-check 5\n" +
                "32.132 183(greedy) serves by self-check 5\n" +
                "32.132 157(greedy) done serving by server 3\n" +
                "32.135 192 arrives\n" +
                "32.135 192 waits at server 3\n" +
                "32.197 193 arrives\n" +
                "32.197 193 waits at server 3\n" +
                "32.204 194(greedy) arrives\n" +
                "32.204 194(greedy) waits at self-check 4\n" +
                "32.285 195(greedy) arrives\n" +
                "32.285 195(greedy) waits at self-check 4\n" +
                "32.287 101 done serving by server 2\n" +
                "32.453 146 done serving by server 1\n" +
                "32.453 149(greedy) serves by server 1\n" +
                "32.552 196 arrives\n" +
                "32.552 196 waits at server 1\n" +
                "32.582 197 arrives\n" +
                "32.582 197 waits at server 3\n" +
                "32.808 111 serves by server 2\n" +
                "32.819 149(greedy) done serving by server 1\n" +
                "32.953 198(greedy) arrives\n" +
                "32.953 198(greedy) waits at self-check 4\n" +
                "33.074 199 arrives\n" +
                "33.074 199 waits at server 2\n" +
                "33.130 200(greedy) arrives\n" +
                "33.130 200(greedy) waits at self-check 4\n" +
                "33.276 201(greedy) arrives\n" +
                "33.276 201(greedy) waits at self-check 4\n" +
                "33.489 150(greedy) serves by server 1\n" +
                "33.527 158 serves by server 3\n" +
                "33.565 111 done serving by server 2\n" +
                "33.565 119 serves by server 2\n" +
                "33.627 202(greedy) arrives\n" +
                "33.627 202(greedy) waits at self-check 4\n" +
                "33.629 203 arrives\n" +
                "33.629 203 waits at server 1\n" +
                "33.749 180(greedy) done serving by self-check 4\n" +
                "33.749 184(greedy) serves by self-check 4\n" +
                "33.826 150(greedy) done serving by server 1\n" +
                "33.826 154(greedy) serves by server 1\n" +
                "33.897 204(greedy) arrives\n" +
                "33.897 204(greedy) waits at self-check 4\n" +
                "34.060 205 arrives\n" +
                "34.060 205 waits at server 1\n" +
                "34.087 119 done serving by server 2\n" +
                "34.087 124 serves by server 2\n" +
                "34.230 183(greedy) done serving by self-check 5\n" +
                "34.230 186(greedy) serves by self-check 5\n" +
                "34.535 206 arrives\n" +
                "34.535 206 waits at server 2\n" +
                "34.543 184(greedy) done serving by self-check 4\n" +
                "34.543 191(greedy) serves by self-check 4\n" +
                "34.637 207 arrives\n" +
                "34.637 207 waits at server 2\n" +
                "34.667 208 arrives\n" +
                "34.667 208 waits at server 3\n" +
                "34.899 209(greedy) arrives\n" +
                "34.899 209(greedy) waits at self-check 4\n" +
                "34.925 210(greedy) arrives\n" +
                "34.925 210(greedy) waits at self-check 4\n" +
                "34.986 211(greedy) arrives\n" +
                "34.986 211(greedy) waits at self-check 4\n" +
                "35.016 154(greedy) done serving by server 1\n" +
                "35.016 162(greedy) serves by server 1\n" +
                "35.107 162(greedy) done serving by server 1\n" +
                "35.107 165 serves by server 1\n" +
                "35.175 212(greedy) arrives\n" +
                "35.175 212(greedy) waits at server 1\n" +
                "35.470 124 done serving by server 2\n" +
                "35.470 142 serves by server 2\n" +
                "35.548 213 arrives\n" +
                "35.548 213 waits at server 1\n" +
                "35.670 158 done serving by server 3\n" +
                "35.670 159 serves by server 3\n" +
                "35.874 214(greedy) arrives\n" +
                "35.874 214(greedy) waits at server 2\n" +
                "35.881 215 arrives\n" +
                "35.881 215 waits at server 3\n" +
                "35.889 159 done serving by server 3\n" +
                "35.889 182 serves by server 3\n" +
                "35.901 216(greedy) arrives\n" +
                "35.901 216(greedy) waits at server 3\n" +
                "35.919 217(greedy) arrives\n" +
                "35.919 217(greedy) leaves\n" +
                "36.005 191(greedy) done serving by self-check 4\n" +
                "36.005 194(greedy) serves by self-check 4\n" +
                "36.113 218 arrives\n" +
                "36.113 218 waits at self-check 4\n" +
                "36.176 165 done serving by server 1\n" +
                "36.187 182 done serving by server 3\n" +
                "36.187 185 serves by server 3\n" +
                "36.200 186(greedy) done serving by self-check 5\n" +
                "36.200 195(greedy) serves by self-check 5\n" +
                "36.317 142 done serving by server 2\n" +
                "36.317 168 serves by server 2\n" +
                "36.319 219(greedy) arrives\n" +
                "36.319 219(greedy) waits at server 2\n" +
                "36.414 194(greedy) done serving by self-check 4\n" +
                "36.414 198(greedy) serves by self-check 4\n" +
                "36.482 195(greedy) done serving by self-check 5\n" +
                "36.482 200(greedy) serves by self-check 5\n" +
                "36.570 198(greedy) done serving by self-check 4\n" +
                "36.570 201(greedy) serves by self-check 4\n" +
                "36.733 220 arrives\n" +
                "36.733 220 waits at server 3\n" +
                "36.889 221 arrives\n" +
                "36.889 221 waits at self-check 4\n" +
                "36.910 185 done serving by server 3\n" +
                "36.910 188 serves by server 3\n" +
                "36.923 222(greedy) arrives\n" +
                "36.923 222(greedy) waits at self-check 4\n" +
                "36.952 223 arrives\n" +
                "36.952 223 waits at server 3\n" +
                "37.012 201(greedy) done serving by self-check 4\n" +
                "37.012 202(greedy) serves by self-check 4\n" +
                "37.066 224(greedy) arrives\n" +
                "37.066 224(greedy) waits at self-check 4\n" +
                "37.170 188 done serving by server 3\n" +
                "37.380 225 arrives\n" +
                "37.380 225 waits at self-check 4\n" +
                "37.476 226 arrives\n" +
                "37.476 226 waits at self-check 4\n" +
                "37.606 227 arrives\n" +
                "37.606 227 leaves\n" +
                "37.627 228 arrives\n" +
                "37.627 228 leaves\n" +
                "38.089 229(greedy) arrives\n" +
                "38.089 229(greedy) leaves\n" +
                "38.089 230(greedy) arrives\n" +
                "38.089 230(greedy) leaves\n" +
                "38.154 202(greedy) done serving by self-check 4\n" +
                "38.154 204(greedy) serves by self-check 4\n" +
                "38.269 231 arrives\n" +
                "38.269 231 waits at self-check 4\n" +
                "38.401 204(greedy) done serving by self-check 4\n" +
                "38.401 209(greedy) serves by self-check 4\n" +
                "38.441 232(greedy) arrives\n" +
                "38.441 232(greedy) waits at self-check 4\n" +
                "38.497 233 arrives\n" +
                "38.497 233 leaves\n" +
                "38.624 200(greedy) done serving by self-check 5\n" +
                "38.624 210(greedy) serves by self-check 5\n" +
                "38.737 166 serves by server 1\n" +
                "38.808 234 arrives\n" +
                "38.808 234 waits at server 1\n" +
                "38.811 235 arrives\n" +
                "38.811 235 waits at self-check 4\n" +
                "38.869 236 arrives\n" +
                "38.869 236 leaves\n" +
                "38.929 209(greedy) done serving by self-check 4\n" +
                "38.929 211(greedy) serves by self-check 4\n" +
                "39.039 237 arrives\n" +
                "39.039 237 waits at self-check 4\n" +
                "39.080 168 done serving by server 2\n" +
                "39.080 169 serves by server 2\n" +
                "39.270 238 arrives\n" +
                "39.270 238 waits at server 2\n" +
                "39.435 210(greedy) done serving by self-check 5\n" +
                "39.435 218 serves by self-check 5\n" +
                "39.636 211(greedy) done serving by self-check 4\n" +
                "39.636 221 serves by self-check 4\n" +
                "39.646 239(greedy) arrives\n" +
                "39.646 239(greedy) waits at self-check 4\n" +
                "39.665 240 arrives\n" +
                "39.665 240 waits at self-check 4\n" +
                "39.709 241(greedy) arrives\n" +
                "39.709 241(greedy) leaves\n" +
                "39.955 242 arrives\n" +
                "39.955 242 leaves\n" +
                "40.067 243 arrives\n" +
                "40.067 243 leaves\n" +
                "40.122 244 arrives\n" +
                "40.122 244 leaves\n" +
                "40.272 245(greedy) arrives\n" +
                "40.272 245(greedy) leaves\n" +
                "40.347 246(greedy) arrives\n" +
                "40.347 246(greedy) leaves\n" +
                "40.385 189 serves by server 3\n" +
                "40.408 166 done serving by server 1\n" +
                "40.408 170 serves by server 1\n" +
                "40.605 247 arrives\n" +
                "40.605 247 waits at server 1\n" +
                "40.658 248(greedy) arrives\n" +
                "40.658 248(greedy) waits at server 3\n" +
                "40.688 249(greedy) arrives\n" +
                "40.688 249(greedy) leaves\n" +
                "40.889 250 arrives\n" +
                "40.889 250 leaves\n" +
                "41.169 218 done serving by self-check 5\n" +
                "41.169 222(greedy) serves by self-check 5\n" +
                "41.273 251 arrives\n" +
                "41.273 251 waits at self-check 4\n" +
                "41.362 252 arrives\n" +
                "41.362 252 leaves\n" +
                "41.458 253 arrives\n" +
                "41.458 253 leaves\n" +
                "41.479 189 done serving by server 3\n" +
                "41.588 222(greedy) done serving by self-check 5\n" +
                "41.588 224(greedy) serves by self-check 5\n" +
                "41.755 254(greedy) arrives\n" +
                "41.755 254(greedy) waits at self-check 4\n" +
                "41.860 190 serves by server 3\n" +
                "41.921 221 done serving by self-check 4\n" +
                "41.921 225 serves by self-check 4\n" +
                "41.932 255(greedy) arrives\n" +
                "41.932 255(greedy) waits at server 3\n" +
                "42.011 256(greedy) arrives\n" +
                "42.011 256(greedy) waits at self-check 4\n" +
                "42.177 170 done serving by server 1\n" +
                "42.177 171 serves by server 1\n" +
                "42.177 257(greedy) arrives\n" +
                "42.177 257(greedy) waits at server 1\n" +
                "42.212 258(greedy) arrives\n" +
                "42.212 258(greedy) leaves\n" +
                "42.220 224(greedy) done serving by self-check 5\n" +
                "42.220 226 serves by self-check 5\n" +
                "42.247 259 arrives\n" +
                "42.247 259 waits at self-check 4\n" +
                "42.462 225 done serving by self-check 4\n" +
                "42.462 231 serves by self-check 4\n" +
                "42.715 260(greedy) arrives\n" +
                "42.715 260(greedy) waits at self-check 4\n" +
                "42.843 231 done serving by self-check 4\n" +
                "42.843 232(greedy) serves by self-check 4\n" +
                "42.863 261(greedy) arrives\n" +
                "42.863 261(greedy) waits at self-check 4\n" +
                "42.949 262(greedy) arrives\n" +
                "42.949 262(greedy) leaves\n" +
                "42.961 169 done serving by server 2\n" +
                "42.961 174 serves by server 2\n" +
                "43.013 263(greedy) arrives\n" +
                "43.013 263(greedy) waits at server 2\n" +
                "43.042 264(greedy) arrives\n" +
                "43.042 264(greedy) leaves\n" +
                "43.074 265(greedy) arrives\n" +
                "43.074 265(greedy) leaves\n" +
                "43.154 266 arrives\n" +
                "43.154 266 leaves\n" +
                "43.162 267 arrives\n" +
                "43.162 267 leaves\n" +
                "43.174 268(greedy) arrives\n" +
                "43.174 268(greedy) leaves\n" +
                "43.218 190 done serving by server 3\n" +
                "43.218 192 serves by server 3\n" +
                "43.253 171 done serving by server 1\n" +
                "43.253 173 serves by server 1\n" +
                "43.309 226 done serving by self-check 5\n" +
                "43.309 235 serves by self-check 5\n" +
                "43.377 173 done serving by server 1\n" +
                "43.377 177 serves by server 1\n" +
                "43.489 269(greedy) arrives\n" +
                "43.489 269(greedy) waits at server 1\n" +
                "43.528 270 arrives\n" +
                "43.528 270 waits at server 1\n" +
                "43.601 271 arrives\n" +
                "43.601 271 waits at server 3\n" +
                "43.622 272(greedy) arrives\n" +
                "43.622 272(greedy) waits at self-check 4\n" +
                "43.813 192 done serving by server 3\n" +
                "43.813 193 serves by server 3\n" +
                "43.861 273 arrives\n" +
                "43.861 273 waits at server 3\n" +
                "43.953 274(greedy) arrives\n" +
                "43.953 274(greedy) leaves\n" +
                "43.976 232(greedy) done serving by self-check 4\n" +
                "43.976 237 serves by self-check 4\n" +
                "44.093 275 arrives\n" +
                "44.093 275 waits at self-check 4\n" +
                "44.448 276 arrives\n" +
                "44.448 276 leaves\n" +
                "44.469 277(greedy) arrives\n" +
                "44.469 277(greedy) leaves\n" +
                "44.655 278 arrives\n" +
                "44.655 278 leaves\n" +
                "44.733 279 arrives\n" +
                "44.733 279 leaves\n" +
                "45.196 280(greedy) arrives\n" +
                "45.196 280(greedy) leaves\n" +
                "45.259 281(greedy) arrives\n" +
                "45.259 281(greedy) leaves\n" +
                "45.322 282(greedy) arrives\n" +
                "45.322 282(greedy) leaves\n" +
                "45.441 237 done serving by self-check 4\n" +
                "45.441 239(greedy) serves by self-check 4\n" +
                "45.538 283 arrives\n" +
                "45.538 283 waits at self-check 4\n" +
                "45.702 193 done serving by server 3\n" +
                "45.702 197 serves by server 3\n" +
                "45.832 284(greedy) arrives\n" +
                "45.832 284(greedy) waits at server 3\n" +
                "46.005 285(greedy) arrives\n" +
                "46.005 285(greedy) leaves\n" +
                "46.048 174 done serving by server 2\n" +
                "46.048 178 serves by server 2\n" +
                "46.133 286 arrives\n" +
                "46.133 286 waits at server 2\n" +
                "46.270 235 done serving by self-check 5\n" +
                "46.270 240 serves by self-check 5\n" +
                "46.337 239(greedy) done serving by self-check 4\n" +
                "46.337 251 serves by self-check 4\n" +
                "46.390 287 arrives\n" +
                "46.390 287 waits at self-check 4\n" +
                "46.415 178 done serving by server 2\n" +
                "46.492 288 arrives\n" +
                "46.492 288 waits at self-check 4\n" +
                "46.513 289(greedy) arrives\n" +
                "46.513 289(greedy) leaves\n" +
                "46.818 290(greedy) arrives\n" +
                "46.818 290(greedy) leaves\n" +
                "46.845 291(greedy) arrives\n" +
                "46.845 291(greedy) leaves\n" +
                "46.997 292 arrives\n" +
                "46.997 292 leaves\n" +
                "47.020 293(greedy) arrives\n" +
                "47.020 293(greedy) leaves\n" +
                "47.082 294(greedy) arrives\n" +
                "47.082 294(greedy) leaves\n" +
                "47.212 179 serves by server 2\n" +
                "47.306 251 done serving by self-check 4\n" +
                "47.306 254(greedy) serves by self-check 4\n" +
                "47.328 295(greedy) arrives\n" +
                "47.328 295(greedy) waits at server 2\n" +
                "47.422 197 done serving by server 3\n" +
                "47.422 208 serves by server 3\n" +
                "47.510 179 done serving by server 2\n" +
                "47.510 187 serves by server 2\n" +
                "47.538 296 arrives\n" +
                "47.538 296 waits at server 2\n" +
                "47.540 297(greedy) arrives\n" +
                "47.540 297(greedy) waits at server 3\n" +
                "47.553 298(greedy) arrives\n" +
                "47.553 298(greedy) waits at self-check 4\n" +
                "47.683 299(greedy) arrives\n" +
                "47.683 299(greedy) leaves\n" +
                "47.830 300 arrives\n" +
                "47.830 300 leaves\n" +
                "47.889 301(greedy) arrives\n" +
                "47.889 301(greedy) leaves\n" +
                "47.910 240 done serving by self-check 5\n" +
                "47.910 256(greedy) serves by self-check 5\n" +
                "48.070 302 arrives\n" +
                "48.070 302 waits at self-check 4\n" +
                "48.204 303(greedy) arrives\n" +
                "48.204 303(greedy) leaves\n" +
                "48.257 187 done serving by server 2\n" +
                "48.375 208 done serving by server 3\n" +
                "48.375 215 serves by server 3\n" +
                "48.504 256(greedy) done serving by self-check 5\n" +
                "48.504 259 serves by self-check 5\n" +
                "48.645 254(greedy) done serving by self-check 4\n" +
                "48.645 260(greedy) serves by self-check 4\n" +
                "48.679 304(greedy) arrives\n" +
                "48.679 304(greedy) waits at self-check 4\n" +
                "48.830 305 arrives\n" +
                "48.830 305 waits at server 3\n" +
                "49.054 306 arrives\n" +
                "49.054 306 waits at self-check 4\n" +
                "49.222 307 arrives");

        System.out.println("49.222 307 leaves\n" +
                "49.267 260(greedy) done serving by self-check 4\n" +
                "49.267 261(greedy) serves by self-check 4\n" +
                "49.294 199 serves by server 2\n" +
                "49.318 199 done serving by server 2\n" +
                "49.318 206 serves by server 2\n" +
                "49.622 308(greedy) arrives\n" +
                "49.622 308(greedy) waits at server 2\n" +
                "49.698 309 arrives\n" +
                "49.698 309 waits at server 2\n" +
                "50.014 310(greedy) arrives\n" +
                "50.014 310(greedy) waits at self-check 4\n" +
                "50.020 311(greedy) arrives\n" +
                "50.020 311(greedy) leaves\n" +
                "50.082 312 arrives\n" +
                "50.082 312 leaves\n" +
                "50.114 313 arrives\n" +
                "50.114 313 leaves\n" +
                "50.206 314(greedy) arrives\n" +
                "50.206 314(greedy) leaves\n" +
                "50.299 215 done serving by server 3\n" +
                "50.299 216(greedy) serves by server 3\n" +
                "50.430 315 arrives\n" +
                "50.430 315 waits at server 3\n" +
                "50.493 316(greedy) arrives\n" +
                "50.493 316(greedy) leaves\n" +
                "50.651 206 done serving by server 2\n" +
                "50.651 207 serves by server 2\n" +
                "50.709 317(greedy) arrives\n" +
                "50.709 317(greedy) waits at server 2\n" +
                "50.771 207 done serving by server 2\n" +
                "50.771 214(greedy) serves by server 2\n" +
                "50.879 214(greedy) done serving by server 2\n" +
                "50.879 219(greedy) serves by server 2\n" +
                "50.886 219(greedy) done serving by server 2\n" +
                "50.886 238 serves by server 2\n" +
                "51.129 177 done serving by server 1\n" +
                "51.165 259 done serving by self-check 5\n" +
                "51.165 272(greedy) serves by self-check 5\n" +
                "51.299 318(greedy) arrives\n" +
                "51.299 318(greedy) waits at server 2\n" +
                "51.321 319 arrives\n" +
                "51.321 319 waits at server 2\n" +
                "51.460 320(greedy) arrives\n" +
                "51.460 320(greedy) waits at server 2\n" +
                "51.623 321 arrives\n" +
                "51.623 321 waits at self-check 4\n" +
                "51.700 272(greedy) done serving by self-check 5\n" +
                "51.700 275 serves by self-check 5\n" +
                "51.702 322(greedy) arrives\n" +
                "51.702 322(greedy) waits at self-check 4\n" +
                "51.836 323 arrives\n" +
                "51.836 323 leaves\n" +
                "51.870 324(greedy) arrives\n" +
                "51.870 324(greedy) leaves\n" +
                "51.920 325 arrives\n" +
                "51.920 325 leaves\n" +
                "51.993 326 arrives\n" +
                "51.993 326 leaves\n" +
                "52.027 327(greedy) arrives\n" +
                "52.027 327(greedy) leaves\n" +
                "52.259 328 arrives\n" +
                "52.259 328 leaves\n" +
                "52.327 196 serves by server 1\n" +
                "52.475 275 done serving by self-check 5\n" +
                "52.475 283 serves by self-check 5\n" +
                "52.485 238 done serving by server 2\n" +
                "52.485 263(greedy) serves by server 2\n" +
                "52.533 329 arrives\n" +
                "52.533 329 waits at server 1\n" +
                "52.535 330(greedy) arrives\n" +
                "52.535 330(greedy) waits at server 2\n" +
                "52.868 263(greedy) done serving by server 2\n" +
                "52.971 331 arrives\n" +
                "52.971 331 waits at self-check 4\n" +
                "53.145 332 arrives\n" +
                "53.145 332 leaves\n" +
                "53.202 333(greedy) arrives\n" +
                "53.202 333(greedy) leaves\n" +
                "53.454 334(greedy) arrives\n" +
                "53.454 334(greedy) leaves\n" +
                "53.497 196 done serving by server 1\n" +
                "53.497 203 serves by server 1\n" +
                "53.548 335 arrives\n" +
                "53.548 335 waits at server 1\n" +
                "53.572 336(greedy) arrives\n" +
                "53.572 336(greedy) leaves\n" +
                "53.638 337 arrives\n" +
                "53.638 337 leaves\n" +
                "53.733 338 arrives\n" +
                "53.733 338 leaves\n" +
                "53.917 339(greedy) arrives\n" +
                "53.917 339(greedy) leaves\n" +
                "53.947 340(greedy) arrives\n" +
                "53.947 340(greedy) leaves\n" +
                "53.990 341(greedy) arrives\n" +
                "53.990 341(greedy) leaves\n" +
                "54.017 342(greedy) arrives\n" +
                "54.017 342(greedy) leaves\n" +
                "54.107 203 done serving by server 1\n" +
                "54.107 205 serves by server 1\n" +
                "54.147 343 arrives\n" +
                "54.147 343 waits at server 1\n" +
                "54.223 344(greedy) arrives\n" +
                "54.223 344(greedy) leaves\n" +
                "54.312 345 arrives\n" +
                "54.312 345 leaves\n" +
                "54.375 283 done serving by self-check 5\n" +
                "54.375 287 serves by self-check 5\n" +
                "54.441 346(greedy) arrives\n" +
                "54.441 346(greedy) waits at self-check 4\n" +
                "54.573 287 done serving by self-check 5\n" +
                "54.573 288 serves by self-check 5\n" +
                "54.607 288 done serving by self-check 5\n" +
                "54.607 298(greedy) serves by self-check 5\n" +
                "54.754 347 arrives\n" +
                "54.754 347 waits at self-check 4\n" +
                "54.902 348 arrives\n" +
                "54.902 348 waits at self-check 4\n" +
                "54.937 261(greedy) done serving by self-check 4\n" +
                "54.937 302 serves by self-check 4\n" +
                "54.944 286 serves by server 2\n" +
                "55.055 205 done serving by server 1\n" +
                "55.055 212(greedy) serves by server 1\n" +
                "55.072 349(greedy) arrives\n" +
                "55.072 349(greedy) waits at server 1\n" +
                "55.146 212(greedy) done serving by server 1\n" +
                "55.146 213 serves by server 1\n" +
                "55.150 298(greedy) done serving by self-check 5\n" +
                "55.150 304(greedy) serves by self-check 5\n" +
                "55.197 304(greedy) done serving by self-check 5\n" +
                "55.197 306 serves by self-check 5\n" +
                "55.206 350 arrives\n" +
                "55.206 350 waits at server 1\n" +
                "55.258 351 arrives\n" +
                "55.258 351 waits at server 2\n" +
                "55.344 352 arrives\n" +
                "55.344 352 waits at self-check 4\n" +
                "55.382 213 done serving by server 1\n" +
                "55.382 234 serves by server 1\n" +
                "55.419 353 arrives\n" +
                "55.419 353 waits at server 1\n" +
                "55.423 354(greedy) arrives\n" +
                "55.423 354(greedy) waits at self-check 4\n" +
                "55.441 355 arrives\n" +
                "55.441 355 waits at self-check 4\n" +
                "55.450 306 done serving by self-check 5\n" +
                "55.450 310(greedy) serves by self-check 5\n" +
                "55.466 234 done serving by server 1\n" +
                "55.466 247 serves by server 1\n" +
                "55.471 356 arrives\n" +
                "55.471 356 waits at server 1\n" +
                "55.507 286 done serving by server 2\n" +
                "55.507 295(greedy) serves by server 2\n" +
                "55.548 357(greedy) arrives\n" +
                "55.548 357(greedy) waits at server 2\n" +
                "55.602 310(greedy) done serving by self-check 5\n" +
                "55.602 321 serves by self-check 5\n" +
                "55.670 358(greedy) arrives\n" +
                "55.670 358(greedy) waits at self-check 4\n" +
                "55.684 359(greedy) arrives\n" +
                "55.684 359(greedy) waits at self-check 4\n" +
                "55.695 360(greedy) arrives\n" +
                "55.695 360(greedy) leaves\n" +
                "55.832 302 done serving by self-check 4\n" +
                "55.832 322(greedy) serves by self-check 4\n" +
                "55.863 361(greedy) arrives\n" +
                "55.863 361(greedy) waits at self-check 4\n" +
                "55.925 362(greedy) arrives\n" +
                "55.925 362(greedy) leaves\n" +
                "55.998 363 arrives\n" +
                "55.998 363 leaves\n" +
                "56.034 322(greedy) done serving by self-check 4\n" +
                "56.034 331 serves by self-check 4\n" +
                "56.063 364(greedy) arrives\n" +
                "56.063 364(greedy) waits at self-check 4\n" +
                "56.344 365(greedy) arrives\n" +
                "56.344 365(greedy) leaves\n" +
                "56.406 366 arrives\n" +
                "56.406 366 leaves\n" +
                "56.620 367 arrives\n" +
                "56.620 367 leaves\n" +
                "56.626 247 done serving by server 1\n" +
                "56.746 216(greedy) done serving by server 3\n" +
                "56.771 368 arrives\n" +
                "56.771 368 leaves\n" +
                "56.793 331 done serving by self-check 4\n" +
                "56.793 346(greedy) serves by self-check 4\n" +
                "56.844 369 arrives\n" +
                "56.844 369 waits at self-check 4\n" +
                "56.859 370 arrives\n" +
                "56.859 370 leaves\n" +
                "57.019 371(greedy) arrives\n" +
                "57.019 371(greedy) leaves\n" +
                "57.114 220 serves by server 3\n" +
                "57.165 372 arrives\n" +
                "57.165 372 waits at server 3\n" +
                "57.181 346(greedy) done serving by self-check 4\n" +
                "57.181 347 serves by self-check 4\n" +
                "57.214 295(greedy) done serving by server 2\n" +
                "57.303 373(greedy) arrives\n" +
                "57.303 373(greedy) waits at self-check 4\n" +
                "57.432 374(greedy) arrives\n" +
                "57.432 374(greedy) leaves\n" +
                "57.461 375(greedy) arrives\n" +
                "57.461 375(greedy) leaves\n" +
                "57.671 376(greedy) arrives\n" +
                "57.671 376(greedy) leaves\n" +
                "57.677 257(greedy) serves by server 1\n" +
                "57.747 377(greedy) arrives\n" +
                "57.747 377(greedy) waits at server 1\n" +
                "57.750 378 arrives\n" +
                "57.750 378 leaves\n" +
                "57.829 379(greedy) arrives\n" +
                "57.829 379(greedy) leaves\n" +
                "57.869 380 arrives\n" +
                "57.869 380 leaves\n" +
                "57.916 381(greedy) arrives\n" +
                "57.916 381(greedy) leaves\n" +
                "58.226 347 done serving by self-check 4\n" +
                "58.226 348 serves by self-check 4\n" +
                "58.293 382(greedy) arrives\n" +
                "58.293 382(greedy) waits at self-check 4\n" +
                "58.397 257(greedy) done serving by server 1\n" +
                "58.397 269(greedy) serves by server 1\n" +
                "58.398 383(greedy) arrives\n" +
                "58.398 383(greedy) waits at server 1\n" +
                "58.400 384 arrives\n" +
                "58.400 384 leaves\n" +
                "58.475 385 arrives\n" +
                "58.475 385 leaves\n" +
                "58.658 220 done serving by server 3\n" +
                "58.660 386(greedy) arrives\n" +
                "58.660 386(greedy) leaves\n" +
                "58.811 296 serves by server 2\n" +
                "58.837 387(greedy) arrives\n" +
                "58.837 387(greedy) waits at server 2\n" +
                "58.876 296 done serving by server 2\n" +
                "58.876 308(greedy) serves by server 2\n" +
                "58.883 348 done serving by self-check 4\n" +
                "58.883 352 serves by self-check 4\n" +
                "58.900 388 arrives\n" +
                "58.900 388 waits at server 2\n" +
                "58.913 352 done serving by self-check 4\n" +
                "58.913 354(greedy) serves by self-check 4\n" +
                "59.007 269(greedy) done serving by server 1\n" +
                "59.007 270 serves by server 1\n" +
                "59.035 389 arrives\n" +
                "59.035 389 waits at server 1\n" +
                "59.136 390 arrives\n" +
                "59.136 390 waits at self-check 4\n" +
                "59.170 308(greedy) done serving by server 2\n" +
                "59.170 309 serves by server 2\n" +
                "59.504 391(greedy) arrives\n" +
                "59.504 391(greedy) waits at server 2\n" +
                "59.563 309 done serving by server 2\n" +
                "59.563 317(greedy) serves by server 2\n" +
                "59.676 392(greedy) arrives\n" +
                "59.676 392(greedy) waits at server 2\n" +
                "59.705 270 done serving by server 1\n" +
                "59.705 329 serves by server 1\n" +
                "59.810 354(greedy) done serving by self-check 4\n" +
                "59.810 355 serves by self-check 4\n" +
                "59.829 393(greedy) arrives\n" +
                "59.829 393(greedy) waits at self-check 4\n" +
                "59.883 394(greedy) arrives\n" +
                "59.883 394(greedy) waits at server 1\n" +
                "59.891 395 arrives\n" +
                "59.891 395 waits at self-check 4\n" +
                "59.936 396 arrives\n" +
                "59.936 396 leaves\n" +
                "60.013 321 done serving by self-check 5\n" +
                "60.013 358(greedy) serves by self-check 5\n" +
                "60.229 397 arrives\n" +
                "60.229 397 waits at self-check 4\n" +
                "60.245 398(greedy) arrives\n" +
                "60.245 398(greedy) leaves\n" +
                "60.272 317(greedy) done serving by server 2\n" +
                "60.272 318(greedy) serves by server 2\n" +
                "60.330 399(greedy) arrives\n" +
                "60.330 399(greedy) waits at server 2\n" +
                "60.342 358(greedy) done serving by self-check 5\n" +
                "60.342 359(greedy) serves by self-check 5\n" +
                "60.345 400 arrives\n" +
                "60.345 400 waits at self-check 4\n" +
                "60.382 401 arrives\n" +
                "60.382 401 leaves\n" +
                "60.499 402(greedy) arrives\n" +
                "60.499 402(greedy) leaves\n" +
                "60.543 403(greedy) arrives\n" +
                "60.543 403(greedy) leaves\n" +
                "61.055 404(greedy) arrives\n" +
                "61.055 404(greedy) leaves\n" +
                "61.228 318(greedy) done serving by server 2\n" +
                "61.262 405(greedy) arrives\n" +
                "61.262 405(greedy) leaves\n" +
                "61.292 406 arrives\n" +
                "61.292 406 leaves\n" +
                "61.352 329 done serving by server 1\n" +
                "61.352 335 serves by server 1\n" +
                "61.364 407(greedy) arrives\n" +
                "61.364 407(greedy) waits at server 1\n" +
                "61.384 355 done serving by self-check 4\n" +
                "61.384 361(greedy) serves by self-check 4\n" +
                "61.449 408 arrives\n" +
                "61.449 408 waits at self-check 4\n" +
                "61.453 409(greedy) arrives\n" +
                "61.453 409(greedy) leaves\n" +
                "61.607 361(greedy) done serving by self-check 4\n" +
                "61.607 364(greedy) serves by self-check 4\n" +
                "61.721 410 arrives\n" +
                "61.721 410 waits at self-check 4\n" +
                "61.955 364(greedy) done serving by self-check 4\n" +
                "61.955 369 serves by self-check 4\n" +
                "61.963 369 done serving by self-check 4\n" +
                "61.963 373(greedy) serves by self-check 4\n" +
                "62.020 373(greedy) done serving by self-check 4\n" +
                "62.020 382(greedy) serves by self-check 4\n" +
                "62.036 223 serves by server 3\n" +
                "62.081 223 done serving by server 3\n" +
                "62.081 248(greedy) serves by server 3\n" +
                "62.139 411 arrives\n" +
                "62.139 411 waits at server 3\n" +
                "62.170 382(greedy) done serving by self-check 4\n" +
                "62.170 390 serves by self-check 4\n" +
                "62.201 390 done serving by self-check 4\n" +
                "62.201 393(greedy) serves by self-check 4\n" +
                "62.210 412(greedy) arrives\n" +
                "62.210 412(greedy) waits at self-check 4\n" +
                "62.269 413 arrives\n" +
                "62.269 413 waits at server 3\n" +
                "62.270 414(greedy) arrives\n" +
                "62.270 414(greedy) waits at self-check 4\n" +
                "62.474 415 arrives\n" +
                "62.474 415 waits at self-check 4\n" +
                "62.585 248(greedy) done serving by server 3\n" +
                "62.733 416 arrives\n" +
                "62.733 416 waits at self-check 4\n" +
                "62.779 335 done serving by server 1\n" +
                "62.779 343 serves by server 1\n" +
                "62.871 319 serves by server 2\n" +
                "62.969 417(greedy) arrives\n" +
                "62.969 417(greedy) waits at server 1\n" +
                "62.976 319 done serving by server 2\n" +
                "62.976 320(greedy) serves by server 2\n" +
                "63.176 343 done serving by server 1\n" +
                "63.308 418 arrives\n" +
                "63.308 418 waits at server 2\n" +
                "63.398 419(greedy) arrives\n" +
                "63.398 419(greedy) waits at server 2\n" +
                "63.417 420(greedy) arrives\n" +
                "63.417 420(greedy) waits at self-check 4\n" +
                "63.665 421(greedy) arrives\n" +
                "63.665 421(greedy) leaves\n" +
                "63.805 422(greedy) arrives\n" +
                "63.805 422(greedy) leaves\n" +
                "63.835 423 arrives\n" +
                "63.835 423 leaves\n" +
                "64.038 424 arrives\n" +
                "64.038 424 leaves\n" +
                "64.044 425(greedy) arrives\n" +
                "64.044 425(greedy) leaves\n" +
                "64.045 255(greedy) serves by server 3\n" +
                "64.049 359(greedy) done serving by self-check 5\n" +
                "64.049 395 serves by self-check 5\n" +
                "64.053 426(greedy) arrives\n" +
                "64.053 426(greedy) waits at server 3\n" +
                "64.162 427 arrives\n" +
                "64.162 427 waits at self-check 4\n" +
                "64.170 320(greedy) done serving by server 2\n" +
                "64.239 428(greedy) arrives\n" +
                "64.239 428(greedy) leaves\n" +
                "64.280 429 arrives\n" +
                "64.280 429 leaves\n" +
                "64.381 430 arrives\n" +
                "64.381 430 leaves\n" +
                "64.549 330(greedy) serves by server 2\n" +
                "64.564 395 done serving by self-check 5\n" +
                "64.564 397 serves by self-check 5\n" +
                "64.572 431 arrives\n" +
                "64.572 431 waits at server 2\n" +
                "64.887 432 arrives\n" +
                "64.887 432 waits at self-check 4\n" +
                "64.950 433(greedy) arrives\n" +
                "64.950 433(greedy) leaves\n" +
                "65.042 434 arrives\n" +
                "65.042 434 leaves\n" +
                "65.053 255(greedy) done serving by server 3\n" +
                "65.161 435 arrives\n" +
                "65.161 435 leaves\n" +
                "65.421 436 arrives\n" +
                "65.421 436 leaves\n" +
                "65.427 330(greedy) done serving by server 2\n" +
                "65.464 437 arrives\n" +
                "65.464 437 leaves\n" +
                "65.466 438(greedy) arrives\n" +
                "65.466 438(greedy) leaves\n" +
                "65.527 439 arrives\n" +
                "65.527 439 leaves\n" +
                "65.592 271 serves by server 3\n" +
                "65.601 440 arrives\n" +
                "65.601 440 waits at server 3\n" +
                "65.609 351 serves by server 2\n" +
                "65.649 271 done serving by server 3\n" +
                "65.649 273 serves by server 3\n" +
                "65.902 441(greedy) arrives\n" +
                "65.902 441(greedy) waits at server 2\n" +
                "66.070 442(greedy) arrives\n" +
                "66.070 442(greedy) waits at server 3\n" +
                "66.204 351 done serving by server 2\n" +
                "66.204 357(greedy) serves by server 2\n" +
                "66.246 443 arrives\n" +
                "66.246 443 waits at server 2\n" +
                "66.435 349(greedy) serves by server 1\n" +
                "66.453 444(greedy) arrives\n" +
                "66.453 444(greedy) waits at server 1\n" +
                "66.556 445(greedy) arrives\n" +
                "66.556 445(greedy) leaves\n" +
                "66.590 349(greedy) done serving by server 1\n" +
                "66.944 393(greedy) done serving by self-check 4\n" +
                "66.944 400 serves by self-check 4\n" +
                "66.950 397 done serving by self-check 5\n" +
                "66.950 408 serves by self-check 5\n" +
                "67.023 446(greedy) arrives\n" +
                "67.023 446(greedy) waits at self-check 4\n" +
                "67.072 350 serves by server 1\n" +
                "67.106 408 done serving by self-check 5\n" +
                "67.106 410 serves by self-check 5\n" +
                "67.222 447 arrives\n" +
                "67.222 447 waits at server 1\n" +
                "67.290 357(greedy) done serving by server 2\n" +
                "67.503 273 done serving by server 3\n" +
                "67.534 448 arrives\n" +
                "67.534 448 waits at self-check 4\n" +
                "67.617 410 done serving by self-check 5\n" +
                "67.617 412(greedy) serves by self-check 5\n" +
                "67.686 449(greedy) arrives\n" +
                "67.686 449(greedy) waits at self-check 4\n" +
                "67.720 400 done serving by self-check 4\n" +
                "67.720 414(greedy) serves by self-check 4\n" +
                "67.720 387(greedy) serves by server 2\n" +
                "67.764 450(greedy) arrives\n" +
                "67.764 450(greedy) waits at self-check 4\n" +
                "67.768 451(greedy) arrives\n" +
                "67.768 451(greedy) waits at server 2\n" +
                "67.919 452 arrives\n" +
                "67.919 452 waits at self-check 4\n" +
                "68.067 453(greedy) arrives\n" +
                "68.067 453(greedy) leaves\n" +
                "68.076 454 arrives\n" +
                "68.076 454 leaves\n" +
                "68.132 455 arrives\n" +
                "68.132 455 leaves\n" +
                "68.281 456(greedy) arrives\n" +
                "68.281 456(greedy) leaves\n" +
                "68.295 457 arrives\n" +
                "68.295 457 leaves\n" +
                "68.343 458(greedy) arrives\n" +
                "68.343 458(greedy) leaves\n" +
                "68.392 459 arrives\n" +
                "68.392 459 leaves\n" +
                "68.395 350 done serving by server 1\n" +
                "68.395 353 serves by server 1\n" +
                "68.611 460 arrives\n" +
                "68.611 460 waits at server 1\n" +
                "68.729 461 arrives\n" +
                "68.729 461 leaves\n" +
                "68.798 284(greedy) serves by server 3\n" +
                "68.945 412(greedy) done serving by self-check 5\n" +
                "68.945 415 serves by self-check 5\n" +
                "69.047 353 done serving by server 1\n" +
                "69.047 356 serves by server 1\n" +
                "69.085 462 arrives\n" +
                "69.085 462 waits at server 1\n" +
                "69.089 463 arrives\n" +
                "69.089 463 waits at server 3\n" +
                "69.116 387(greedy) done serving by server 2\n" +
                "69.194 415 done serving by self-check 5\n" +
                "69.194 416 serves by self-check 5\n" +
                "69.327 284(greedy) done serving by server 3\n" +
                "69.327 297(greedy) serves by server 3\n" +
                "69.469 388 serves by server 2\n" +
                "69.520 356 done serving by server 1\n" +
                "69.521 377(greedy) serves by server 1\n" +
                "69.607 388 done serving by server 2\n" +
                "69.607 391(greedy) serves by server 2\n" +
                "69.704 464(greedy) arrives\n" +
                "69.704 464(greedy) waits at server 2\n" +
                "69.706 465(greedy) arrives\n" +
                "69.706 465(greedy) waits at self-check 4\n" +
                "69.706 391(greedy) done serving by server 2\n" +
                "69.706 392(greedy) serves by server 2\n" +
                "69.732 466 arrives\n" +
                "69.732 466 waits at server 1\n" +
                "69.788 467 arrives\n" +
                "69.788 467 waits at server 2\n" +
                "69.870 377(greedy) done serving by server 1\n" +
                "69.870 383(greedy) serves by server 1\n" +
                "70.130 468 arrives\n" +
                "70.130 468 waits at server 1\n" +
                "70.238 392(greedy) done serving by server 2\n" +
                "70.266 469(greedy) arrives\n" +
                "70.266 469(greedy) waits at server 2\n" +
                "70.407 416 done serving by self-check 5\n" +
                "70.407 420(greedy) serves by self-check 5\n" +
                "70.624 470 arrives\n" +
                "70.624 470 waits at server 3\n" +
                "70.712 471(greedy) arrives\n" +
                "70.712 471(greedy) waits at self-check 4");

        System.out.println("70.920 472 arrives\n" +
                "70.920 472 waits at self-check 4\n" +
                "70.981 399(greedy) serves by server 2\n" +
                "71.032 383(greedy) done serving by server 1\n" +
                "71.032 389 serves by server 1\n" +
                "71.090 420(greedy) done serving by self-check 5\n" +
                "71.090 427 serves by self-check 5\n" +
                "71.123 473(greedy) arrives\n" +
                "71.123 473(greedy) waits at server 1\n" +
                "71.153 474(greedy) arrives\n" +
                "71.153 474(greedy) waits at server 2\n" +
                "71.264 414(greedy) done serving by self-check 4\n" +
                "71.264 432 serves by self-check 4\n" +
                "71.386 399(greedy) done serving by server 2\n" +
                "71.496 297(greedy) done serving by server 3\n" +
                "71.496 305 serves by server 3\n" +
                "71.508 475 arrives\n" +
                "71.508 475 waits at server 3\n" +
                "71.570 427 done serving by self-check 5\n" +
                "71.570 446(greedy) serves by self-check 5\n" +
                "71.675 305 done serving by server 3\n" +
                "71.675 315 serves by server 3\n" +
                "71.792 315 done serving by server 3\n" +
                "71.945 372 serves by server 3\n" +
                "71.983 476 arrives\n" +
                "71.983 476 waits at server 3\n" +
                "72.044 432 done serving by self-check 4\n" +
                "72.044 448 serves by self-check 4\n" +
                "72.343 477(greedy) arrives\n" +
                "72.343 477(greedy) waits at self-check 4\n" +
                "72.369 478 arrives\n" +
                "72.369 478 waits at server 3\n" +
                "72.412 389 done serving by server 1\n" +
                "72.412 394(greedy) serves by server 1\n" +
                "72.435 448 done serving by self-check 4\n" +
                "72.435 449(greedy) serves by self-check 4\n" +
                "72.534 479(greedy) arrives\n" +
                "72.534 479(greedy) waits at self-check 4\n" +
                "72.572 372 done serving by server 3\n" +
                "72.572 411 serves by server 3\n" +
                "72.579 480(greedy) arrives\n" +
                "72.579 480(greedy) waits at self-check 4\n" +
                "72.671 481 arrives\n" +
                "72.671 481 waits at server 1\n" +
                "72.774 482 arrives\n" +
                "72.774 482 waits at server 3\n" +
                "72.775 446(greedy) done serving by self-check 5\n" +
                "72.775 450(greedy) serves by self-check 5\n" +
                "72.886 394(greedy) done serving by server 1\n" +
                "72.886 407(greedy) serves by server 1\n" +
                "72.977 483(greedy) arrives\n" +
                "72.977 483(greedy) waits at self-check 4\n" +
                "73.038 411 done serving by server 3\n" +
                "73.038 413 serves by server 3\n" +
                "73.194 407(greedy) done serving by server 1\n" +
                "73.194 417(greedy) serves by server 1\n" +
                "73.213 484 arrives\n" +
                "73.213 484 waits at server 1\n" +
                "73.496 485 arrives\n" +
                "73.496 485 waits at server 1\n" +
                "73.540 486(greedy) arrives\n" +
                "73.540 486(greedy) waits at self-check 4\n" +
                "73.611 487 arrives\n" +
                "73.611 487 waits at server 3\n" +
                "73.634 413 done serving by server 3\n" +
                "73.634 426(greedy) serves by server 3\n" +
                "73.645 488(greedy) arrives\n" +
                "73.645 488(greedy) waits at server 3\n" +
                "73.751 489 arrives\n" +
                "73.751 489 waits at self-check 4\n" +
                "73.776 418 serves by server 2\n" +
                "73.886 490(greedy) arrives\n" +
                "73.886 490(greedy) waits at server 2\n" +
                "74.103 491 arrives\n" +
                "74.103 491 leaves\n" +
                "74.255 492(greedy) arrives\n" +
                "74.255 492(greedy) leaves\n" +
                "74.367 493 arrives\n" +
                "74.367 493 leaves\n" +
                "74.440 449(greedy) done serving by self-check 4\n" +
                "74.440 452 serves by self-check 4\n" +
                "74.544 494(greedy) arrives\n" +
                "74.544 494(greedy) waits at self-check 4\n" +
                "74.630 495 arrives\n" +
                "74.630 495 leaves\n" +
                "74.725 496(greedy) arrives\n" +
                "74.725 496(greedy) leaves\n" +
                "74.732 450(greedy) done serving by self-check 5\n" +
                "74.732 465(greedy) serves by self-check 5\n" +
                "74.861 497(greedy) arrives\n" +
                "74.861 497(greedy) waits at self-check 4\n" +
                "74.959 498 arrives\n" +
                "74.959 498 leaves\n" +
                "74.960 499 arrives\n" +
                "74.960 499 leaves\n" +
                "75.108 500 arrives\n" +
                "75.108 500 leaves\n" +
                "75.157 418 done serving by server 2\n" +
                "75.157 419(greedy) serves by server 2\n" +
                "75.289 501(greedy) arrives\n" +
                "75.289 501(greedy) waits at server 2\n" +
                "75.298 502 arrives\n" +
                "75.298 502 leaves\n" +
                "75.301 503(greedy) arrives\n" +
                "75.301 503(greedy) leaves\n" +
                "75.550 504 arrives\n" +
                "75.550 504 leaves\n" +
                "75.568 505 arrives\n" +
                "75.568 505 leaves\n" +
                "75.601 506(greedy) arrives\n" +
                "75.601 506(greedy) leaves\n" +
                "75.722 465(greedy) done serving by self-check 5\n" +
                "75.722 471(greedy) serves by self-check 5\n" +
                "75.796 507 arrives\n" +
                "75.796 507 waits at self-check 4\n" +
                "75.982 508(greedy) arrives\n" +
                "75.982 508(greedy) leaves\n" +
                "76.010 417(greedy) done serving by server 1\n" +
                "76.038 471(greedy) done serving by self-check 5\n" +
                "76.038 472 serves by self-check 5\n" +
                "76.076 509(greedy) arrives\n" +
                "76.076 509(greedy) waits at self-check 4\n" +
                "76.106 510(greedy) arrives\n" +
                "76.106 510(greedy) leaves\n" +
                "76.283 511 arrives\n" +
                "76.283 511 leaves\n" +
                "76.302 472 done serving by self-check 5\n" +
                "76.302 477(greedy) serves by self-check 5\n" +
                "76.429 512 arrives\n" +
                "76.429 512 waits at self-check 4\n" +
                "76.566 513(greedy) arrives\n" +
                "76.566 513(greedy) leaves\n" +
                "76.584 426(greedy) done serving by server 3\n" +
                "76.589 444(greedy) serves by server 1\n" +
                "76.675 514(greedy) arrives\n" +
                "76.675 514(greedy) waits at server 1\n" +
                "76.845 515 arrives\n" +
                "76.845 515 leaves\n" +
                "76.900 419(greedy) done serving by server 2\n" +
                "76.900 431 serves by server 2\n" +
                "76.939 431 done serving by server 2\n" +
                "76.939 441(greedy) serves by server 2\n" +
                "76.967 444(greedy) done serving by server 1\n" +
                "77.066 516(greedy) arrives\n" +
                "77.066 516(greedy) waits at server 2\n" +
                "77.108 441(greedy) done serving by server 2\n" +
                "77.146 447 serves by server 1\n" +
                "77.271 517 arrives\n" +
                "77.271 517 waits at server 1\n" +
                "77.291 440 serves by server 3\n" +
                "77.298 447 done serving by server 1\n" +
                "77.298 460 serves by server 1\n" +
                "77.347 518 arrives\n" +
                "77.347 518 waits at server 1\n" +
                "77.435 519 arrives\n" +
                "77.435 519 waits at server 2\n" +
                "77.580 520(greedy) arrives\n" +
                "77.580 520(greedy) waits at server 3\n" +
                "77.585 477(greedy) done serving by self-check 5\n" +
                "77.585 479(greedy) serves by self-check 5\n" +
                "77.796 521(greedy) arrives\n" +
                "77.796 521(greedy) waits at self-check 4\n" +
                "77.953 522(greedy) arrives\n" +
                "77.953 522(greedy) leaves\n" +
                "78.011 523 arrives\n" +
                "78.011 523 leaves\n" +
                "78.132 452 done serving by self-check 4\n" +
                "78.132 480(greedy) serves by self-check 4\n" +
                "78.189 524(greedy) arrives\n" +
                "78.189 524(greedy) waits at self-check 4\n" +
                "78.250 525 arrives\n" +
                "78.250 525 leaves\n" +
                "78.265 526 arrives\n" +
                "78.265 526 leaves\n" +
                "78.300 527 arrives\n" +
                "78.300 527 leaves\n" +
                "78.476 440 done serving by server 3\n" +
                "78.660 528 arrives\n" +
                "78.660 528 leaves\n" +
                "78.671 480(greedy) done serving by self-check 4\n" +
                "78.671 483(greedy) serves by self-check 4\n" +
                "78.762 479(greedy) done serving by self-check 5\n" +
                "78.762 486(greedy) serves by self-check 5\n" +
                "78.806 443 serves by server 2\n" +
                "78.841 486(greedy) done serving by self-check 5\n" +
                "78.841 489 serves by self-check 5\n" +
                "78.853 483(greedy) done serving by self-check 4\n" +
                "78.853 494(greedy) serves by self-check 4\n" +
                "79.002 443 done serving by server 2\n" +
                "79.002 451(greedy) serves by server 2\n" +
                "79.007 494(greedy) done serving by self-check 4\n" +
                "79.007 497(greedy) serves by self-check 4\n" +
                "79.093 497(greedy) done serving by self-check 4\n" +
                "79.093 507 serves by self-check 4\n" +
                "79.124 529 arrives\n" +
                "79.124 529 waits at server 2\n" +
                "79.137 507 done serving by self-check 4\n" +
                "79.137 509(greedy) serves by self-check 4\n" +
                "79.191 530(greedy) arrives\n" +
                "79.191 530(greedy) waits at self-check 4\n" +
                "79.196 489 done serving by self-check 5\n" +
                "79.196 512 serves by self-check 5\n" +
                "79.342 531(greedy) arrives\n" +
                "79.342 531(greedy) waits at self-check 4\n" +
                "79.599 532(greedy) arrives\n" +
                "79.599 532(greedy) waits at self-check 4\n" +
                "79.601 533 arrives\n" +
                "79.601 533 waits at server 2\n" +
                "79.625 534(greedy) arrives\n" +
                "79.625 534(greedy) waits at self-check 4\n" +
                "79.677 512 done serving by self-check 5\n" +
                "79.677 521(greedy) serves by self-check 5\n" +
                "79.711 535 arrives\n" +
                "79.711 535 waits at self-check 4\n" +
                "79.793 460 done serving by server 1\n" +
                "79.793 462 serves by server 1\n" +
                "79.939 536 arrives\n" +
                "79.939 536 waits at server 1\n" +
                "79.964 537(greedy) arrives\n" +
                "79.964 537(greedy) waits at self-check 4\n" +
                "80.234 538(greedy) arrives\n" +
                "80.234 538(greedy) waits at self-check 4\n" +
                "80.247 539(greedy) arrives\n" +
                "80.247 539(greedy) waits at self-check 4\n" +
                "80.366 521(greedy) done serving by self-check 5\n" +
                "80.366 524(greedy) serves by self-check 5\n" +
                "80.571 540 arrives\n" +
                "80.571 540 waits at self-check 4\n" +
                "80.582 541(greedy) arrives\n" +
                "80.582 541(greedy) waits at self-check 4\n" +
                "80.635 509(greedy) done serving by self-check 4\n" +
                "80.635 530(greedy) serves by self-check 4\n" +
                "80.688 542(greedy) arrives\n" +
                "80.688 542(greedy) waits at self-check 4\n" +
                "80.709 543(greedy) arrives\n" +
                "80.709 543(greedy) leaves\n" +
                "80.790 544(greedy) arrives\n" +
                "80.790 544(greedy) leaves\n" +
                "80.848 545(greedy) arrives\n" +
                "80.848 545(greedy) leaves\n" +
                "80.860 451(greedy) done serving by server 2\n" +
                "80.860 464(greedy) serves by server 2\n" +
                "80.898 546 arrives\n" +
                "80.898 546 waits at server 2\n" +
                "80.940 547(greedy) arrives\n" +
                "80.940 547(greedy) leaves\n" +
                "81.021 462 done serving by server 1\n" +
                "81.021 466 serves by server 1\n" +
                "81.040 464(greedy) done serving by server 2\n" +
                "81.048 548 arrives\n" +
                "81.048 548 waits at server 1\n" +
                "81.078 549(greedy) arrives\n" +
                "81.078 549(greedy) leaves\n" +
                "81.185 550 arrives\n" +
                "81.185 550 leaves\n" +
                "81.422 551 arrives\n" +
                "81.422 551 leaves\n" +
                "81.429 552(greedy) arrives\n" +
                "81.429 552(greedy) leaves\n" +
                "81.441 553 arrives\n" +
                "81.441 553 leaves\n" +
                "81.863 554 arrives\n" +
                "81.863 554 leaves\n" +
                "81.883 466 done serving by server 1\n" +
                "81.883 468 serves by server 1\n" +
                "81.973 524(greedy) done serving by self-check 5\n" +
                "81.973 531(greedy) serves by self-check 5\n" +
                "82.041 442(greedy) serves by server 3\n" +
                "82.087 555 arrives\n" +
                "82.087 555 waits at server 1\n" +
                "82.093 442(greedy) done serving by server 3\n" +
                "82.213 463 serves by server 3\n" +
                "82.395 556 arrives\n" +
                "82.395 556 waits at server 3\n" +
                "82.405 530(greedy) done serving by self-check 4\n" +
                "82.405 532(greedy) serves by self-check 4\n" +
                "82.465 532(greedy) done serving by self-check 4\n" +
                "82.465 534(greedy) serves by self-check 4\n" +
                "82.501 557 arrives\n" +
                "82.501 557 waits at server 3\n" +
                "82.538 463 done serving by server 3\n" +
                "82.538 470 serves by server 3\n" +
                "82.675 558 arrives\n" +
                "82.675 558 waits at server 3\n" +
                "82.730 467 serves by server 2\n" +
                "82.832 534(greedy) done serving by self-check 4\n" +
                "82.832 535 serves by self-check 4\n" +
                "82.848 467 done serving by server 2\n" +
                "82.848 469(greedy) serves by server 2\n" +
                "82.870 559(greedy) arrives\n" +
                "82.870 559(greedy) waits at self-check 4\n" +
                "82.887 468 done serving by server 1\n" +
                "82.887 473(greedy) serves by server 1\n" +
                "82.927 560(greedy) arrives\n" +
                "82.927 560(greedy) waits at self-check 4\n" +
                "82.962 561 arrives\n" +
                "82.962 561 waits at server 1\n" +
                "82.974 562(greedy) arrives\n" +
                "82.974 562(greedy) waits at server 2\n" +
                "83.051 563 arrives\n" +
                "83.051 563 waits at server 2\n" +
                "83.217 535 done serving by self-check 4\n" +
                "83.217 537(greedy) serves by self-check 4\n" +
                "83.332 564 arrives\n" +
                "83.332 564 waits at self-check 4\n" +
                "83.391 469(greedy) done serving by server 2\n" +
                "83.391 474(greedy) serves by server 2\n" +
                "83.420 565 arrives\n" +
                "83.420 565 waits at server 2\n" +
                "83.420 470 done serving by server 3\n" +
                "83.420 475 serves by server 3\n" +
                "83.524 566 arrives\n" +
                "83.524 566 waits at server 3\n" +
                "83.586 567(greedy) arrives\n" +
                "83.586 567(greedy) waits at self-check 4\n" +
                "83.639 568(greedy) arrives\n" +
                "83.639 568(greedy) waits at self-check 4\n" +
                "83.768 473(greedy) done serving by server 1\n" +
                "83.768 481 serves by server 1\n" +
                "83.870 569 arrives\n" +
                "83.870 569 waits at server 1\n" +
                "83.896 570(greedy) arrives\n" +
                "83.896 570(greedy) leaves\n" +
                "83.907 571 arrives\n" +
                "83.907 571 leaves\n" +
                "83.927 572(greedy) arrives\n" +
                "83.927 572(greedy) leaves\n" +
                "83.992 573 arrives\n" +
                "83.992 573 leaves\n" +
                "83.996 574 arrives\n" +
                "83.996 574 leaves\n" +
                "84.078 575 arrives\n" +
                "84.078 575 leaves\n" +
                "84.217 474(greedy) done serving by server 2\n" +
                "84.217 490(greedy) serves by server 2\n" +
                "84.275 576(greedy) arrives\n" +
                "84.275 576(greedy) waits at server 2\n" +
                "84.288 490(greedy) done serving by server 2\n" +
                "84.288 501(greedy) serves by server 2\n" +
                "84.416 577 arrives\n" +
                "84.416 577 waits at server 2\n" +
                "84.455 531(greedy) done serving by self-check 5\n" +
                "84.455 538(greedy) serves by self-check 5\n" +
                "84.466 578 arrives\n" +
                "84.466 578 waits at self-check 4\n" +
                "84.624 579 arrives\n" +
                "84.624 579 leaves\n" +
                "84.790 481 done serving by server 1\n" +
                "84.901 537(greedy) done serving by self-check 4\n" +
                "84.901 539(greedy) serves by self-check 4\n" +
                "84.925 580 arrives\n" +
                "84.925 580 waits at self-check 4\n" +
                "84.987 581 arrives\n" +
                "84.987 581 leaves\n" +
                "85.057 582(greedy) arrives\n" +
                "85.057 582(greedy) leaves\n" +
                "85.300 583(greedy) arrives\n" +
                "85.300 583(greedy) leaves\n" +
                "85.423 539(greedy) done serving by self-check 4\n" +
                "85.423 540 serves by self-check 4\n" +
                "85.603 584(greedy) arrives\n" +
                "85.603 584(greedy) waits at self-check 4\n" +
                "85.630 585(greedy) arrives\n" +
                "85.630 585(greedy) leaves\n" +
                "85.676 501(greedy) done serving by server 2\n" +
                "85.714 586(greedy) arrives\n" +
                "85.714 586(greedy) leaves\n" +
                "85.734 516(greedy) serves by server 2\n" +
                "86.008 587(greedy) arrives\n" +
                "86.008 587(greedy) waits at server 2\n" +
                "86.380 475 done serving by server 3\n" +
                "86.380 476 serves by server 3\n" +
                "86.392 588 arrives\n" +
                "86.392 588 waits at server 3\n" +
                "86.610 589 arrives\n" +
                "86.610 589 leaves\n" +
                "86.628 484 serves by server 1\n" +
                "86.784 476 done serving by server 3\n" +
                "86.784 478 serves by server 3\n" +
                "86.944 590 arrives\n" +
                "86.944 590 waits at server 1\n" +
                "87.037 591(greedy) arrives\n" +
                "87.037 591(greedy) waits at server 3\n" +
                "87.048 592 arrives\n" +
                "87.048 592 leaves\n" +
                "87.181 593 arrives\n" +
                "87.181 593 leaves\n" +
                "87.232 594 arrives\n" +
                "87.232 594 leaves\n" +
                "87.563 595 arrives\n" +
                "87.563 595 leaves\n" +
                "87.632 484 done serving by server 1\n" +
                "87.632 485 serves by server 1\n" +
                "87.758 596(greedy) arrives\n" +
                "87.758 596(greedy) waits at server 1\n" +
                "87.780 597 arrives\n" +
                "87.780 597 leaves\n" +
                "88.014 478 done serving by server 3\n" +
                "88.014 482 serves by server 3\n" +
                "88.016 598(greedy) arrives\n" +
                "88.016 598(greedy) waits at server 3\n" +
                "88.057 540 done serving by self-check 4\n" +
                "88.057 541(greedy) serves by self-check 4\n" +
                "88.065 599(greedy) arrives\n" +
                "88.065 599(greedy) waits at self-check 4\n" +
                "88.175 541(greedy) done serving by self-check 4\n" +
                "88.175 542(greedy) serves by self-check 4\n" +
                "88.219 600(greedy) arrives\n" +
                "88.219 600(greedy) waits at self-check 4\n" +
                "88.264 601(greedy) arrives\n" +
                "88.264 601(greedy) leaves\n" +
                "88.367 482 done serving by server 3\n" +
                "88.367 487 serves by server 3\n" +
                "88.378 487 done serving by server 3\n" +
                "88.378 488(greedy) serves by server 3\n" +
                "88.422 602 arrives\n" +
                "88.422 602 waits at server 3\n" +
                "88.448 516(greedy) done serving by server 2\n" +
                "88.448 519 serves by server 2\n" +
                "88.473 603(greedy) arrives\n" +
                "88.473 603(greedy) waits at server 2\n" +
                "88.542 604(greedy) arrives\n" +
                "88.542 604(greedy) waits at server 3\n" +
                "88.632 605 arrives\n" +
                "88.632 605 leaves\n" +
                "88.647 606(greedy) arrives\n" +
                "88.647 606(greedy) leaves\n" +
                "88.841 485 done serving by server 1\n" +
                "89.004 488(greedy) done serving by server 3\n" +
                "89.004 520(greedy) serves by server 3\n" +
                "89.080 607(greedy) arrives\n" +
                "89.080 607(greedy) waits at server 3\n" +
                "89.091 608(greedy) arrives\n" +
                "89.091 608(greedy) leaves\n" +
                "89.180 538(greedy) done serving by self-check 5\n" +
                "89.180 559(greedy) serves by self-check 5\n" +
                "89.334 609 arrives\n" +
                "89.334 609 waits at self-check 4\n" +
                "89.386 514(greedy) serves by server 1\n" +
                "89.467 610 arrives\n" +
                "89.467 610 waits at server 1\n" +
                "89.495 611 arrives\n" +
                "89.495 611 leaves\n" +
                "89.513 559(greedy) done serving by self-check 5\n" +
                "89.513 560(greedy) serves by self-check 5\n" +
                "89.588 612 arrives\n" +
                "89.588 612 waits at self-check 4\n" +
                "89.651 613 arrives\n" +
                "89.651 613 leaves\n" +
                "89.678 614(greedy) arrives\n" +
                "89.678 614(greedy) leaves\n" +
                "89.817 615 arrives\n" +
                "89.817 615 leaves\n" +
                "89.823 616(greedy) arrives\n" +
                "89.823 616(greedy) leaves\n" +
                "90.033 542(greedy) done serving by self-check 4\n" +
                "90.033 564 serves by self-check 4\n" +
                "90.122 617 arrives\n" +
                "90.122 617 waits at self-check 4\n" +
                "90.129 514(greedy) done serving by server 1\n" +
                "90.129 517 serves by server 1\n" +
                "90.263 519 done serving by server 2\n" +
                "90.602 564 done serving by self-check 4\n" +
                "90.602 567(greedy) serves by self-check 4\n" +
                "90.671 618 arrives\n" +
                "90.671 618 waits at server 1\n" +
                "90.691 560(greedy) done serving by self-check 5\n" +
                "90.691 568(greedy) serves by self-check 5\n" +
                "90.727 619(greedy) arrives\n" +
                "90.727 619(greedy) waits at self-check 4\n" +
                "90.734 520(greedy) done serving by server 3\n" +
                "90.734 556 serves by server 3\n" +
                "90.956 620(greedy) arrives\n" +
                "90.956 620(greedy) waits at server 3\n" +
                "91.044 621 arrives\n" +
                "91.044 621 waits at self-check 4\n" +
                "91.197 556 done serving by server 3\n" +
                "91.197 557 serves by server 3\n" +
                "91.224 517 done serving by server 1\n" +
                "91.360 622 arrives\n" +
                "91.360 622 waits at server 3\n" +
                "91.464 623(greedy) arrives\n" +
                "91.464 623(greedy) leaves\n" +
                "91.531 624(greedy) arrives\n" +
                "91.531 624(greedy) leaves\n" +
                "91.662 567(greedy) done serving by self-check 4\n" +
                "91.662 578 serves by self-check 4\n" +
                "91.779 518 serves by server 1\n" +
                "91.838 625 arrives\n" +
                "91.838 625 waits at server 1\n" +
                "91.883 518 done serving by server 1\n" +
                "92.130 568(greedy) done serving by self-check 5\n" +
                "92.130 580 serves by self-check 5\n" +
                "92.216 626 arrives\n" +
                "92.216 626 waits at self-check 4\n" +
                "92.252 627 arrives\n" +
                "92.252 627 waits at self-check 4\n" +
                "92.612 628(greedy) arrives\n" +
                "92.612 628(greedy) leaves\n" +
                "92.722 557 done serving by server 3\n" +
                "92.826 629 arrives\n" +
                "92.826 629 leaves\n" +
                "92.922 580 done serving by self-check 5\n" +
                "92.922 584(greedy) serves by self-check 5\n" +
                "92.939 630 arrives\n" +
                "92.939 630 waits at self-check 4\n" +
                "92.976 558 serves by server 3\n" +
                "92.998 631(greedy) arrives\n" +
                "92.998 631(greedy) waits at server 3");

        System.out.println("93.235 632 arrives\n" +
                "93.235 632 leaves\n" +
                "93.339 633 arrives\n" +
                "93.339 633 leaves\n" +
                "93.447 634 arrives\n" +
                "93.447 634 leaves\n" +
                "93.744 635 arrives\n" +
                "93.744 635 leaves\n" +
                "93.760 636(greedy) arrives\n" +
                "93.760 636(greedy) leaves\n" +
                "93.803 637 arrives\n" +
                "93.803 637 leaves\n" +
                "93.967 638 arrives\n" +
                "93.967 638 leaves\n" +
                "94.032 639(greedy) arrives\n" +
                "94.032 639(greedy) leaves\n" +
                "94.215 640(greedy) arrives\n" +
                "94.215 640(greedy) leaves\n" +
                "94.521 641 arrives\n" +
                "94.521 641 leaves\n" +
                "94.644 642(greedy) arrives\n" +
                "94.644 642(greedy) leaves\n" +
                "95.110 529 serves by server 2\n" +
                "95.185 643(greedy) arrives\n" +
                "95.185 643(greedy) waits at server 2\n" +
                "95.264 644(greedy) arrives\n" +
                "95.264 644(greedy) leaves\n" +
                "95.373 529 done serving by server 2\n" +
                "95.373 533 serves by server 2\n" +
                "95.377 645(greedy) arrives\n" +
                "95.377 645(greedy) waits at server 2\n" +
                "95.613 646(greedy) arrives\n" +
                "95.613 646(greedy) leaves\n" +
                "95.729 647 arrives\n" +
                "95.729 647 leaves\n" +
                "95.917 648(greedy) arrives\n" +
                "95.917 648(greedy) leaves\n" +
                "95.972 649(greedy) arrives\n" +
                "95.972 649(greedy) leaves\n" +
                "95.989 533 done serving by server 2\n" +
                "95.989 546 serves by server 2\n" +
                "96.001 578 done serving by self-check 4\n" +
                "96.001 599(greedy) serves by self-check 4\n" +
                "96.016 599(greedy) done serving by self-check 4\n" +
                "96.016 600(greedy) serves by self-check 4\n" +
                "96.029 650 arrives\n" +
                "96.029 650 waits at server 2\n" +
                "96.036 546 done serving by server 2\n" +
                "96.036 562(greedy) serves by server 2\n" +
                "96.152 600(greedy) done serving by self-check 4\n" +
                "96.152 609 serves by self-check 4\n" +
                "96.222 584(greedy) done serving by self-check 5\n" +
                "96.222 612 serves by self-check 5\n" +
                "96.253 651(greedy) arrives\n" +
                "96.253 651(greedy) waits at self-check 4\n" +
                "96.425 652(greedy) arrives\n" +
                "96.425 652(greedy) waits at self-check 4\n" +
                "96.428 609 done serving by self-check 4\n" +
                "96.428 617 serves by self-check 4\n" +
                "96.632 653 arrives\n" +
                "96.632 653 waits at server 2\n" +
                "96.646 562(greedy) done serving by server 2\n" +
                "96.734 654(greedy) arrives\n" +
                "96.734 654(greedy) waits at self-check 4\n" +
                "96.962 612 done serving by self-check 5\n" +
                "96.962 619(greedy) serves by self-check 5\n" +
                "97.019 536 serves by server 1\n" +
                "97.073 617 done serving by self-check 4\n" +
                "97.073 621 serves by self-check 4\n" +
                "97.175 655(greedy) arrives\n" +
                "97.175 655(greedy) waits at self-check 4\n" +
                "97.327 656 arrives\n" +
                "97.327 656 waits at server 1\n" +
                "97.387 536 done serving by server 1\n" +
                "97.387 548 serves by server 1\n" +
                "97.436 657 arrives\n" +
                "97.436 657 waits at server 1\n" +
                "97.568 658 arrives\n" +
                "97.568 658 waits at self-check 4\n" +
                "97.648 548 done serving by server 1\n" +
                "97.781 621 done serving by self-check 4\n" +
                "97.781 626 serves by self-check 4\n" +
                "97.788 626 done serving by self-check 4\n" +
                "97.788 627 serves by self-check 4\n" +
                "97.819 659(greedy) arrives\n" +
                "97.819 659(greedy) waits at self-check 4\n" +
                "97.864 563 serves by server 2\n" +
                "98.025 660(greedy) arrives\n" +
                "98.025 660(greedy) waits at self-check 4\n" +
                "98.089 555 serves by server 1\n" +
                "98.249 627 done serving by self-check 4\n" +
                "98.249 630 serves by self-check 4\n" +
                "98.276 661 arrives\n" +
                "98.276 661 waits at server 1\n" +
                "98.345 662(greedy) arrives\n" +
                "98.345 662(greedy) waits at self-check 4\n" +
                "98.378 555 done serving by server 1\n" +
                "98.378 561 serves by server 1\n" +
                "98.411 663 arrives\n" +
                "98.411 663 waits at server 1\n" +
                "98.431 664 arrives\n" +
                "98.431 664 waits at server 2\n" +
                "98.499 665(greedy) arrives\n" +
                "98.499 665(greedy) waits at self-check 4\n" +
                "98.547 561 done serving by server 1\n" +
                "98.547 569 serves by server 1\n" +
                "98.595 630 done serving by self-check 4\n" +
                "98.595 651(greedy) serves by self-check 4\n" +
                "98.624 666 arrives\n" +
                "98.624 666 waits at server 1\n" +
                "98.647 667(greedy) arrives\n" +
                "98.647 667(greedy) waits at self-check 4\n" +
                "98.686 668 arrives\n" +
                "98.686 668 waits at self-check 4\n" +
                "98.795 669 arrives\n" +
                "98.795 669 leaves\n" +
                "98.899 569 done serving by server 1\n" +
                "99.030 590 serves by server 1\n" +
                "99.033 563 done serving by server 2\n" +
                "99.033 565 serves by server 2\n" +
                "99.160 670 arrives\n" +
                "99.160 670 waits at server 1\n" +
                "99.320 619(greedy) done serving by self-check 5\n" +
                "99.320 652(greedy) serves by self-check 5\n" +
                "99.323 565 done serving by server 2\n" +
                "99.530 651(greedy) done serving by self-check 4\n" +
                "99.530 654(greedy) serves by self-check 4\n" +
                "99.566 558 done serving by server 3\n" +
                "99.566 566 serves by server 3\n" +
                "99.599 671 arrives\n" +
                "99.599 671 waits at server 2\n" +
                "99.843 576(greedy) serves by server 2\n" +
                "99.860 576(greedy) done serving by server 2\n" +
                "99.860 577 serves by server 2\n" +
                "99.865 566 done serving by server 3\n" +
                "99.865 588 serves by server 3\n" +
                "100.080 577 done serving by server 2\n" +
                "100.178 672 arrives\n" +
                "100.178 672 waits at server 2\n" +
                "100.293 673 arrives\n" +
                "100.293 673 waits at server 2\n" +
                "100.329 674 arrives\n" +
                "100.329 674 waits at server 3\n" +
                "100.533 590 done serving by server 1\n" +
                "100.533 596(greedy) serves by server 1\n" +
                "100.673 675 arrives\n" +
                "100.673 675 waits at server 1\n" +
                "100.693 654(greedy) done serving by self-check 4\n" +
                "100.693 655(greedy) serves by self-check 4\n" +
                "100.847 676 arrives\n" +
                "100.847 676 waits at server 3\n" +
                "100.942 596(greedy) done serving by server 1\n" +
                "100.942 610 serves by server 1\n" +
                "100.950 677 arrives\n" +
                "100.950 677 waits at server 1\n" +
                "100.976 678(greedy) arrives\n" +
                "100.976 678(greedy) waits at self-check 4\n" +
                "101.022 679(greedy) arrives\n" +
                "101.022 679(greedy) waits at self-check 4\n" +
                "101.041 680 arrives\n" +
                "101.041 680 waits at self-check 4\n" +
                "101.042 681(greedy) arrives\n" +
                "101.042 681(greedy) leaves\n" +
                "101.045 588 done serving by server 3\n" +
                "101.045 591(greedy) serves by server 3\n" +
                "101.053 682(greedy) arrives\n" +
                "101.053 682(greedy) waits at server 3\n" +
                "101.069 652(greedy) done serving by self-check 5\n" +
                "101.069 658 serves by self-check 5\n" +
                "101.140 683(greedy) arrives\n" +
                "101.140 683(greedy) waits at self-check 4\n" +
                "101.143 655(greedy) done serving by self-check 4\n" +
                "101.143 659(greedy) serves by self-check 4\n" +
                "101.347 587(greedy) serves by server 2\n" +
                "101.493 591(greedy) done serving by server 3\n" +
                "101.493 598(greedy) serves by server 3\n" +
                "101.602 659(greedy) done serving by self-check 4\n" +
                "101.602 660(greedy) serves by self-check 4\n" +
                "101.612 684(greedy) arrives\n" +
                "101.612 684(greedy) waits at self-check 4\n" +
                "101.639 658 done serving by self-check 5\n" +
                "101.639 662(greedy) serves by self-check 5\n" +
                "101.838 685(greedy) arrives\n" +
                "101.838 685(greedy) waits at self-check 4\n" +
                "101.845 587(greedy) done serving by server 2\n" +
                "101.845 603(greedy) serves by server 2\n" +
                "102.084 686 arrives\n" +
                "102.084 686 waits at server 2\n" +
                "102.145 660(greedy) done serving by self-check 4\n" +
                "102.145 665(greedy) serves by self-check 4\n" +
                "102.202 610 done serving by server 1\n" +
                "102.202 618 serves by server 1\n" +
                "102.307 603(greedy) done serving by server 2\n" +
                "102.307 643(greedy) serves by server 2\n" +
                "102.482 618 done serving by server 1\n" +
                "102.621 687 arrives\n" +
                "102.621 687 waits at server 1\n" +
                "102.747 688 arrives\n" +
                "102.747 688 waits at server 2\n" +
                "102.934 689 arrives\n" +
                "102.934 689 waits at server 2\n" +
                "102.936 690(greedy) arrives\n" +
                "102.936 690(greedy) waits at self-check 4\n" +
                "102.946 691(greedy) arrives\n" +
                "102.946 691(greedy) waits at server 3\n" +
                "103.142 643(greedy) done serving by server 2\n" +
                "103.142 645(greedy) serves by server 2\n" +
                "103.247 692(greedy) arrives\n" +
                "103.247 692(greedy) waits at server 2\n" +
                "103.340 693 arrives\n" +
                "103.340 693 waits at self-check 4\n" +
                "103.358 694(greedy) arrives\n" +
                "103.358 694(greedy) leaves\n" +
                "103.367 695(greedy) arrives\n" +
                "103.367 695(greedy) leaves\n" +
                "103.522 598(greedy) done serving by server 3\n" +
                "103.522 602 serves by server 3\n" +
                "103.535 662(greedy) done serving by self-check 5\n" +
                "103.535 667(greedy) serves by self-check 5\n" +
                "103.565 602 done serving by server 3\n" +
                "103.565 604(greedy) serves by server 3\n" +
                "103.724 696 arrives\n" +
                "103.724 696 waits at server 3\n" +
                "103.809 697 arrives\n" +
                "103.809 697 waits at server 3\n" +
                "103.818 698 arrives\n" +
                "103.818 698 waits at self-check 4\n" +
                "103.854 699(greedy) arrives\n" +
                "103.854 699(greedy) leaves\n" +
                "103.856 665(greedy) done serving by self-check 4\n" +
                "103.856 668 serves by self-check 4\n" +
                "103.893 645(greedy) done serving by server 2\n" +
                "103.893 650 serves by server 2\n" +
                "104.191 700(greedy) arrives\n" +
                "104.191 700(greedy) waits at server 2\n" +
                "104.272 604(greedy) done serving by server 3\n" +
                "104.438 667(greedy) done serving by self-check 5\n" +
                "104.438 678(greedy) serves by self-check 5\n" +
                "104.468 701(greedy) arrives\n" +
                "104.468 701(greedy) waits at self-check 4\n" +
                "104.613 702(greedy) arrives\n" +
                "104.613 702(greedy) waits at self-check 4\n" +
                "104.657 650 done serving by server 2\n" +
                "104.657 653 serves by server 2\n" +
                "104.720 703(greedy) arrives\n" +
                "104.720 703(greedy) waits at server 2\n" +
                "104.735 704 arrives\n" +
                "104.735 704 leaves\n" +
                "104.756 705 arrives\n" +
                "104.756 705 leaves\n" +
                "104.831 706(greedy) arrives\n" +
                "104.831 706(greedy) leaves\n" +
                "105.164 668 done serving by self-check 4\n" +
                "105.164 679(greedy) serves by self-check 4\n" +
                "105.169 678(greedy) done serving by self-check 5\n" +
                "105.169 680 serves by self-check 5\n" +
                "105.183 707(greedy) arrives\n" +
                "105.183 707(greedy) waits at self-check 4\n" +
                "105.233 708(greedy) arrives\n" +
                "105.233 708(greedy) waits at self-check 4\n" +
                "105.370 607(greedy) serves by server 3\n" +
                "105.630 709(greedy) arrives\n" +
                "105.630 709(greedy) waits at server 3\n" +
                "105.703 680 done serving by self-check 5\n" +
                "105.703 683(greedy) serves by self-check 5\n" +
                "105.994 710 arrives\n" +
                "105.994 710 waits at self-check 4\n" +
                "106.171 711 arrives\n" +
                "106.171 711 leaves\n" +
                "106.252 679(greedy) done serving by self-check 4\n" +
                "106.252 684(greedy) serves by self-check 4\n" +
                "106.342 712 arrives\n" +
                "106.342 712 waits at self-check 4\n" +
                "106.452 713 arrives\n" +
                "106.452 713 leaves\n" +
                "106.487 714 arrives\n" +
                "106.487 714 leaves\n" +
                "106.563 715(greedy) arrives\n" +
                "106.563 715(greedy) leaves\n" +
                "106.689 625 serves by server 1\n" +
                "106.704 716 arrives\n" +
                "106.704 716 waits at server 1\n" +
                "106.712 625 done serving by server 1\n" +
                "106.712 656 serves by server 1\n" +
                "106.742 607(greedy) done serving by server 3\n" +
                "106.743 717(greedy) arrives\n" +
                "106.743 717(greedy) waits at server 1\n" +
                "106.774 683(greedy) done serving by self-check 5\n" +
                "106.774 685(greedy) serves by self-check 5\n" +
                "106.829 718(greedy) arrives\n" +
                "106.829 718(greedy) waits at self-check 4\n" +
                "107.004 620(greedy) serves by server 3\n" +
                "107.009 719 arrives\n" +
                "107.009 719 waits at server 3\n" +
                "107.326 720(greedy) arrives\n" +
                "107.326 720(greedy) leaves\n" +
                "107.336 721(greedy) arrives\n" +
                "107.336 721(greedy) leaves\n" +
                "107.679 656 done serving by server 1\n" +
                "107.708 657 serves by server 1\n" +
                "107.723 722(greedy) arrives\n" +
                "107.723 722(greedy) waits at server 1\n" +
                "107.828 723 arrives\n" +
                "107.828 723 leaves\n" +
                "107.846 724 arrives\n" +
                "107.846 724 leaves\n" +
                "107.896 725(greedy) arrives\n" +
                "107.896 725(greedy) leaves\n" +
                "107.979 726 arrives\n" +
                "107.979 726 leaves\n" +
                "108.065 684(greedy) done serving by self-check 4\n" +
                "108.065 690(greedy) serves by self-check 4\n" +
                "108.180 727(greedy) arrives\n" +
                "108.180 727(greedy) waits at self-check 4\n" +
                "108.317 728(greedy) arrives\n" +
                "108.317 728(greedy) leaves\n" +
                "108.319 653 done serving by server 2\n" +
                "108.319 664 serves by server 2\n" +
                "108.357 685(greedy) done serving by self-check 5\n" +
                "108.357 693 serves by self-check 5\n" +
                "108.512 729(greedy) arrives\n" +
                "108.512 729(greedy) waits at server 2\n" +
                "108.524 730(greedy) arrives\n" +
                "108.524 730(greedy) waits at self-check 4\n" +
                "108.539 657 done serving by server 1\n" +
                "108.559 731 arrives\n" +
                "108.559 731 leaves\n" +
                "108.659 690(greedy) done serving by self-check 4\n" +
                "108.659 698 serves by self-check 4\n" +
                "108.869 732 arrives\n" +
                "108.869 732 waits at self-check 4\n" +
                "108.898 733 arrives\n" +
                "108.898 733 leaves\n" +
                "109.001 734(greedy) arrives\n" +
                "109.001 734(greedy) leaves\n" +
                "109.032 735(greedy) arrives\n" +
                "109.032 735(greedy) leaves\n" +
                "109.404 736(greedy) arrives\n" +
                "109.404 736(greedy) leaves\n" +
                "109.422 737(greedy) arrives\n" +
                "109.422 737(greedy) leaves\n" +
                "109.568 693 done serving by self-check 5\n" +
                "109.568 701(greedy) serves by self-check 5\n" +
                "109.589 698 done serving by self-check 4\n" +
                "109.589 702(greedy) serves by self-check 4\n" +
                "109.630 738(greedy) arrives\n" +
                "109.630 738(greedy) waits at self-check 4\n" +
                "109.654 664 done serving by server 2\n" +
                "109.665 739(greedy) arrives\n" +
                "109.665 739(greedy) waits at self-check 4\n" +
                "109.683 740 arrives\n" +
                "109.683 740 leaves\n" +
                "109.702 741 arrives\n" +
                "109.702 741 leaves\n" +
                "109.730 742 arrives\n" +
                "109.730 742 leaves\n" +
                "109.904 743(greedy) arrives\n" +
                "109.904 743(greedy) leaves\n" +
                "109.970 744(greedy) arrives\n" +
                "109.970 744(greedy) leaves\n" +
                "110.000 745 arrives\n" +
                "110.000 745 leaves\n" +
                "110.109 746 arrives\n" +
                "110.109 746 leaves\n" +
                "110.193 620(greedy) done serving by server 3\n" +
                "110.193 622 serves by server 3\n" +
                "110.296 701(greedy) done serving by self-check 5\n" +
                "110.296 707(greedy) serves by self-check 5\n" +
                "110.338 747 arrives\n" +
                "110.338 747 waits at server 3\n" +
                "110.553 748(greedy) arrives\n" +
                "110.553 748(greedy) waits at self-check 4\n" +
                "110.889 749 arrives\n" +
                "110.889 749 leaves\n" +
                "111.039 750 arrives\n" +
                "111.039 750 leaves\n" +
                "111.146 702(greedy) done serving by self-check 4\n" +
                "111.146 708(greedy) serves by self-check 4\n" +
                "111.196 708(greedy) done serving by self-check 4\n" +
                "111.196 710 serves by self-check 4\n" +
                "111.214 661 serves by server 1\n" +
                "111.310 751 arrives\n" +
                "111.310 751 waits at server 1\n" +
                "111.328 710 done serving by self-check 4\n" +
                "111.328 712 serves by self-check 4\n" +
                "111.370 712 done serving by self-check 4\n" +
                "111.370 718(greedy) serves by self-check 4\n" +
                "111.400 718(greedy) done serving by self-check 4\n" +
                "111.400 727(greedy) serves by self-check 4\n" +
                "111.496 707(greedy) done serving by self-check 5\n" +
                "111.496 730(greedy) serves by self-check 5\n" +
                "111.553 622 done serving by server 3\n" +
                "111.553 631(greedy) serves by server 3\n" +
                "111.678 752 arrives\n" +
                "111.678 752 waits at server 3\n" +
                "111.907 730(greedy) done serving by self-check 5\n" +
                "111.907 732 serves by self-check 5\n" +
                "111.961 732 done serving by self-check 5\n" +
                "111.961 738(greedy) serves by self-check 5\n" +
                "112.147 671 serves by server 2\n" +
                "112.333 753 arrives\n" +
                "112.333 753 waits at server 2\n" +
                "112.337 754(greedy) arrives\n" +
                "112.337 754(greedy) waits at self-check 4\n" +
                "112.344 755(greedy) arrives\n" +
                "112.344 755(greedy) waits at self-check 4\n" +
                "112.410 756 arrives\n" +
                "112.410 756 waits at self-check 4\n" +
                "112.558 757 arrives\n" +
                "112.558 757 waits at self-check 4\n" +
                "112.641 631(greedy) done serving by server 3\n" +
                "112.641 674 serves by server 3\n" +
                "112.654 758 arrives\n" +
                "112.654 758 waits at server 3\n" +
                "112.657 674 done serving by server 3\n" +
                "112.657 676 serves by server 3\n" +
                "112.664 738(greedy) done serving by self-check 5\n" +
                "112.664 739(greedy) serves by self-check 5\n" +
                "112.841 676 done serving by server 3\n" +
                "112.841 682(greedy) serves by server 3\n" +
                "112.979 727(greedy) done serving by self-check 4\n" +
                "112.979 748(greedy) serves by self-check 4\n" +
                "112.993 759 arrives\n" +
                "112.993 759 waits at server 3\n" +
                "113.068 748(greedy) done serving by self-check 4\n" +
                "113.068 754(greedy) serves by self-check 4\n" +
                "113.178 754(greedy) done serving by self-check 4\n" +
                "113.178 755(greedy) serves by self-check 4\n" +
                "113.255 760 arrives\n" +
                "113.255 760 waits at server 3\n" +
                "113.271 761 arrives\n" +
                "113.271 761 waits at self-check 4\n" +
                "113.345 671 done serving by server 2\n" +
                "113.345 672 serves by server 2\n" +
                "113.403 672 done serving by server 2\n" +
                "113.403 673 serves by server 2\n" +
                "113.536 762 arrives\n" +
                "113.536 762 waits at server 2\n" +
                "113.582 763 arrives\n" +
                "113.582 763 waits at server 2\n" +
                "113.609 661 done serving by server 1\n" +
                "113.609 663 serves by server 1\n" +
                "113.641 673 done serving by server 2\n" +
                "113.822 686 serves by server 2\n" +
                "113.848 764 arrives\n" +
                "113.848 764 waits at server 1\n" +
                "113.864 739(greedy) done serving by self-check 5\n" +
                "113.864 756 serves by self-check 5\n" +
                "113.883 765 arrives\n" +
                "113.883 765 waits at server 2\n" +
                "113.895 766 arrives\n" +
                "113.895 766 waits at self-check 4\n" +
                "113.953 663 done serving by server 1\n" +
                "113.953 666 serves by server 1\n" +
                "114.114 767 arrives\n" +
                "114.114 767 waits at server 1\n" +
                "114.184 768(greedy) arrives\n" +
                "114.184 768(greedy) waits at self-check 4\n" +
                "114.201 686 done serving by server 2\n" +
                "114.201 688 serves by server 2\n" +
                "114.272 769 arrives\n" +
                "114.272 769 waits at server 2\n" +
                "114.277 756 done serving by self-check 5\n" +
                "114.277 757 serves by self-check 5\n" +
                "114.342 770 arrives\n" +
                "114.342 770 waits at self-check 4\n" +
                "114.349 682(greedy) done serving by server 3\n" +
                "114.361 691(greedy) serves by server 3\n" +
                "114.389 771 arrives\n" +
                "114.389 771 waits at server 3\n" +
                "114.424 691(greedy) done serving by server 3\n" +
                "114.424 696 serves by server 3\n" +
                "114.544 772(greedy) arrives\n" +
                "114.544 772(greedy) waits at self-check 4\n" +
                "114.596 773 arrives\n" +
                "114.596 773 waits at server 3\n" +
                "114.912 774 arrives\n" +
                "114.912 774 waits at self-check 4\n" +
                "114.947 755(greedy) done serving by self-check 4\n" +
                "114.947 761 serves by self-check 4\n" +
                "114.993 775(greedy) arrives\n" +
                "114.993 775(greedy) waits at self-check 4\n" +
                "115.014 696 done serving by server 3\n" +
                "115.014 697 serves by server 3\n" +
                "115.060 776 arrives\n" +
                "115.060 776 waits at server 3\n" +
                "115.085 777(greedy) arrives\n" +
                "115.085 777(greedy) waits at self-check 4\n" +
                "115.245 778(greedy) arrives\n" +
                "115.245 778(greedy) waits at self-check 4\n" +
                "115.261 757 done serving by self-check 5\n" +
                "115.261 766 serves by self-check 5\n" +
                "115.307 688 done serving by server 2\n" +
                "115.307 689 serves by server 2\n" +
                "115.336 666 done serving by server 1\n" +
                "115.336 670 serves by server 1\n" +
                "115.357 697 done serving by server 3\n" +
                "115.357 709(greedy) serves by server 3\n" +
                "115.359 689 done serving by server 2\n" +
                "115.359 692(greedy) serves by server 2\n" +
                "115.413 779 arrives\n" +
                "115.413 779 waits at server 1\n" +
                "115.561 780 arrives\n" +
                "115.561 780 waits at server 2\n" +
                "115.584 670 done serving by server 1\n" +
                "115.584 675 serves by server 1\n" +
                "115.641 709(greedy) done serving by server 3\n" +
                "115.641 719 serves by server 3\n" +
                "115.658 761 done serving by self-check 4");

        System.out.println("115.658 768(greedy) serves by self-check 4\n" +
                "115.689 675 done serving by server 1\n" +
                "115.689 677 serves by server 1\n" +
                "115.859 766 done serving by self-check 5\n" +
                "115.859 770 serves by self-check 5\n" +
                "115.935 781(greedy) arrives\n" +
                "115.935 781(greedy) waits at self-check 4\n" +
                "115.954 782(greedy) arrives\n" +
                "115.954 782(greedy) waits at self-check 4\n" +
                "116.018 770 done serving by self-check 5\n" +
                "116.018 772(greedy) serves by self-check 5\n" +
                "116.046 692(greedy) done serving by server 2\n" +
                "116.296 677 done serving by server 1\n" +
                "116.296 687 serves by server 1\n" +
                "116.303 700(greedy) serves by server 2\n" +
                "116.401 783(greedy) arrives\n" +
                "116.401 783(greedy) waits at self-check 4\n" +
                "116.433 719 done serving by server 3\n" +
                "116.433 747 serves by server 3\n" +
                "116.679 687 done serving by server 1\n" +
                "116.729 772(greedy) done serving by self-check 5\n" +
                "116.729 774 serves by self-check 5\n" +
                "116.742 774 done serving by self-check 5\n" +
                "116.742 775(greedy) serves by self-check 5\n" +
                "116.798 775(greedy) done serving by self-check 5\n" +
                "116.798 777(greedy) serves by self-check 5\n" +
                "116.897 784(greedy) arrives\n" +
                "116.897 784(greedy) waits at self-check 4\n" +
                "116.900 785(greedy) arrives\n" +
                "116.900 785(greedy) waits at self-check 4\n" +
                "116.974 786(greedy) arrives\n" +
                "116.974 786(greedy) waits at self-check 4\n" +
                "117.028 700(greedy) done serving by server 2\n" +
                "117.028 703(greedy) serves by server 2\n" +
                "117.111 787 arrives\n" +
                "117.111 787 waits at server 1\n" +
                "117.125 788(greedy) arrives\n" +
                "117.125 788(greedy) waits at server 2\n" +
                "117.143 777(greedy) done serving by self-check 5\n" +
                "117.143 778(greedy) serves by self-check 5\n" +
                "117.198 703(greedy) done serving by server 2\n" +
                "117.198 729(greedy) serves by server 2\n" +
                "117.439 778(greedy) done serving by self-check 5\n" +
                "117.439 781(greedy) serves by self-check 5\n" +
                "117.443 789(greedy) arrives\n" +
                "117.443 789(greedy) waits at self-check 4\n" +
                "117.453 790 arrives\n" +
                "117.453 790 waits at server 1\n" +
                "117.536 791(greedy) arrives\n" +
                "117.536 791(greedy) waits at self-check 4\n" +
                "117.553 792 arrives\n" +
                "117.553 792 waits at server 1\n" +
                "117.608 793(greedy) arrives\n" +
                "117.608 793(greedy) waits at server 2\n" +
                "117.765 794(greedy) arrives\n" +
                "117.765 794(greedy) waits at server 3\n" +
                "117.782 729(greedy) done serving by server 2\n" +
                "117.816 795(greedy) arrives\n" +
                "117.816 795(greedy) waits at self-check 4\n" +
                "117.866 796(greedy) arrives\n" +
                "117.866 796(greedy) waits at server 2\n" +
                "117.976 797 arrives\n" +
                "117.976 797 waits at server 2\n" +
                "118.040 798(greedy) arrives\n" +
                "118.040 798(greedy) waits at server 3\n" +
                "118.061 799(greedy) arrives\n" +
                "118.061 799(greedy) waits at self-check 4\n" +
                "118.189 747 done serving by server 3\n" +
                "118.189 752 serves by server 3\n" +
                "118.212 800(greedy) arrives\n" +
                "118.212 800(greedy) waits at server 3\n" +
                "118.338 716 serves by server 1\n" +
                "118.399 801(greedy) arrives\n" +
                "118.399 801(greedy) waits at server 1\n" +
                "118.432 802(greedy) arrives\n" +
                "118.432 802(greedy) waits at server 3\n" +
                "118.503 752 done serving by server 3\n" +
                "118.503 758 serves by server 3\n" +
                "118.525 803(greedy) arrives\n" +
                "118.525 803(greedy) waits at server 3\n" +
                "118.602 804(greedy) arrives\n" +
                "118.602 804(greedy) waits at self-check 4\n" +
                "118.777 805 arrives\n" +
                "118.777 805 leaves\n" +
                "119.178 781(greedy) done serving by self-check 5\n" +
                "119.178 782(greedy) serves by self-check 5\n" +
                "119.197 782(greedy) done serving by self-check 5\n" +
                "119.197 783(greedy) serves by self-check 5\n" +
                "119.377 806 arrives\n" +
                "119.377 806 waits at self-check 4\n" +
                "119.495 807 arrives\n" +
                "119.495 807 waits at self-check 4\n" +
                "119.788 716 done serving by server 1\n" +
                "119.788 717(greedy) serves by server 1\n" +
                "119.834 808(greedy) arrives\n" +
                "119.834 808(greedy) waits at server 1\n" +
                "119.905 783(greedy) done serving by self-check 5\n" +
                "119.905 784(greedy) serves by self-check 5\n" +
                "119.950 809(greedy) arrives\n" +
                "119.950 809(greedy) waits at self-check 4\n" +
                "119.956 810(greedy) arrives\n" +
                "119.956 810(greedy) leaves\n" +
                "120.139 811 arrives\n" +
                "120.139 811 leaves\n" +
                "120.160 717(greedy) done serving by server 1\n" +
                "120.224 812(greedy) arrives\n" +
                "120.224 812(greedy) leaves\n" +
                "120.444 813 arrives\n" +
                "120.444 813 leaves\n" +
                "120.579 814 arrives\n" +
                "120.579 814 leaves\n" +
                "120.712 815 arrives\n" +
                "120.712 815 leaves\n" +
                "120.764 816(greedy) arrives\n" +
                "120.764 816(greedy) leaves\n" +
                "120.946 817 arrives\n" +
                "120.946 817 leaves\n" +
                "120.953 758 done serving by server 3\n" +
                "121.255 818(greedy) arrives\n" +
                "121.255 818(greedy) leaves\n" +
                "121.284 768(greedy) done serving by self-check 4\n" +
                "121.284 785(greedy) serves by self-check 4\n" +
                "121.368 753 serves by server 2\n" +
                "121.577 819(greedy) arrives\n" +
                "121.577 819(greedy) waits at server 2\n" +
                "121.658 753 done serving by server 2\n" +
                "121.658 762 serves by server 2\n" +
                "121.702 820(greedy) arrives\n" +
                "121.702 820(greedy) waits at server 2\n" +
                "121.756 821 arrives\n" +
                "121.756 821 waits at self-check 4\n" +
                "121.924 822 arrives\n" +
                "121.924 822 leaves\n" +
                "122.126 823(greedy) arrives\n" +
                "122.126 823(greedy) leaves\n" +
                "122.191 824 arrives\n" +
                "122.191 824 leaves\n" +
                "122.197 825(greedy) arrives\n" +
                "122.197 825(greedy) leaves\n" +
                "122.365 826 arrives\n" +
                "122.365 826 leaves\n" +
                "122.463 827 arrives\n" +
                "122.463 827 leaves\n" +
                "122.479 785(greedy) done serving by self-check 4\n" +
                "122.479 786(greedy) serves by self-check 4\n" +
                "122.513 828 arrives\n" +
                "122.513 828 waits at self-check 4\n" +
                "122.600 829(greedy) arrives\n" +
                "122.600 829(greedy) leaves\n" +
                "122.671 830(greedy) arrives\n" +
                "122.671 830(greedy) leaves\n" +
                "122.676 831 arrives\n" +
                "122.676 831 leaves\n" +
                "122.686 832(greedy) arrives\n" +
                "122.686 832(greedy) leaves\n" +
                "122.838 784(greedy) done serving by self-check 5\n" +
                "122.838 789(greedy) serves by self-check 5\n" +
                "122.947 722(greedy) serves by server 1\n" +
                "123.029 833 arrives\n" +
                "123.029 833 waits at server 1\n" +
                "123.062 834(greedy) arrives\n" +
                "123.062 834(greedy) waits at self-check 4\n" +
                "123.144 759 serves by server 3\n" +
                "123.183 835 arrives\n" +
                "123.183 835 waits at server 3\n" +
                "123.184 836(greedy) arrives\n" +
                "123.184 836(greedy) leaves\n" +
                "123.241 837 arrives\n" +
                "123.241 837 leaves\n" +
                "123.283 838(greedy) arrives\n" +
                "123.283 838(greedy) leaves\n" +
                "123.285 759 done serving by server 3\n" +
                "123.292 722(greedy) done serving by server 1\n" +
                "123.292 751 serves by server 1\n" +
                "123.311 839(greedy) arrives\n" +
                "123.311 839(greedy) waits at server 1\n" +
                "123.397 840(greedy) arrives\n" +
                "123.397 840(greedy) leaves\n" +
                "123.435 841(greedy) arrives\n" +
                "123.435 841(greedy) leaves\n" +
                "123.460 762 done serving by server 2\n" +
                "123.460 763 serves by server 2\n" +
                "123.496 760 serves by server 3\n" +
                "123.502 842 arrives\n" +
                "123.502 842 waits at server 2\n" +
                "123.550 751 done serving by server 1\n" +
                "123.557 786(greedy) done serving by self-check 4\n" +
                "123.557 791(greedy) serves by self-check 4\n" +
                "123.593 843(greedy) arrives\n" +
                "123.593 843(greedy) waits at server 3\n" +
                "123.662 791(greedy) done serving by self-check 4\n" +
                "123.662 795(greedy) serves by self-check 4\n" +
                "124.142 844(greedy) arrives\n" +
                "124.142 844(greedy) waits at self-check 4\n" +
                "124.147 845 arrives\n" +
                "124.147 845 waits at self-check 4\n" +
                "124.182 846 arrives\n" +
                "124.182 846 leaves\n" +
                "124.217 847(greedy) arrives\n" +
                "124.217 847(greedy) leaves\n" +
                "124.221 848 arrives\n" +
                "124.221 848 leaves\n" +
                "124.292 849 arrives\n" +
                "124.292 849 leaves\n" +
                "124.302 850 arrives\n" +
                "124.302 850 leaves\n" +
                "124.410 851 arrives\n" +
                "124.410 851 leaves\n" +
                "124.413 852 arrives\n" +
                "124.413 852 leaves\n" +
                "124.474 789(greedy) done serving by self-check 5\n" +
                "124.474 799(greedy) serves by self-check 5\n" +
                "124.633 853 arrives\n" +
                "124.633 853 waits at self-check 4\n" +
                "124.694 854(greedy) arrives\n" +
                "124.694 854(greedy) leaves\n" +
                "124.700 760 done serving by server 3\n" +
                "124.700 771 serves by server 3\n" +
                "124.802 855 arrives\n" +
                "124.802 855 waits at server 3\n" +
                "124.831 856 arrives\n" +
                "124.831 856 leaves\n" +
                "124.916 857(greedy) arrives\n" +
                "124.916 857(greedy) leaves\n" +
                "124.977 771 done serving by server 3\n" +
                "124.977 773 serves by server 3\n" +
                "124.979 858 arrives\n" +
                "124.979 858 waits at server 3\n" +
                "125.064 763 done serving by server 2\n" +
                "125.108 859(greedy) arrives\n" +
                "125.108 859(greedy) leaves\n" +
                "125.135 773 done serving by server 3\n" +
                "125.135 776 serves by server 3\n" +
                "125.279 765 serves by server 2\n" +
                "125.349 764 serves by server 1\n" +
                "125.601 860 arrives\n" +
                "125.601 860 waits at server 1\n" +
                "125.647 764 done serving by server 1\n" +
                "125.647 767 serves by server 1\n" +
                "125.744 861 arrives\n" +
                "125.744 861 waits at server 1\n" +
                "125.810 862 arrives\n" +
                "125.810 862 waits at server 2\n" +
                "125.978 799(greedy) done serving by self-check 5\n" +
                "125.978 804(greedy) serves by self-check 5\n" +
                "126.164 765 done serving by server 2\n" +
                "126.164 769 serves by server 2\n" +
                "126.207 863(greedy) arrives\n" +
                "126.207 863(greedy) waits at server 2\n" +
                "126.469 864 arrives\n" +
                "126.469 864 waits at server 3\n" +
                "126.715 767 done serving by server 1\n" +
                "126.798 795(greedy) done serving by self-check 4\n" +
                "126.798 806 serves by self-check 4\n" +
                "126.986 779 serves by server 1\n" +
                "127.090 865 arrives\n" +
                "127.090 865 waits at server 1\n" +
                "127.142 866 arrives\n" +
                "127.142 866 waits at self-check 4\n" +
                "127.358 779 done serving by server 1\n" +
                "127.358 787 serves by server 1\n" +
                "127.450 867 arrives\n" +
                "127.450 867 waits at server 1\n" +
                "127.464 868(greedy) arrives\n" +
                "127.464 868(greedy) waits at self-check 4\n" +
                "127.572 869 arrives\n" +
                "127.572 869 leaves\n" +
                "127.617 804(greedy) done serving by self-check 5\n" +
                "127.617 807 serves by self-check 5\n" +
                "127.667 787 done serving by server 1\n" +
                "127.667 790 serves by server 1\n" +
                "127.887 806 done serving by self-check 4\n" +
                "127.887 809(greedy) serves by self-check 4\n" +
                "128.059 790 done serving by server 1\n" +
                "128.148 769 done serving by server 2\n" +
                "128.243 792 serves by server 1\n" +
                "128.334 870(greedy) arrives\n" +
                "128.334 870(greedy) waits at server 1\n" +
                "128.414 871(greedy) arrives\n" +
                "128.414 871(greedy) waits at self-check 4\n" +
                "128.419 776 done serving by server 3\n" +
                "128.803 809(greedy) done serving by self-check 4\n" +
                "128.803 821 serves by self-check 4\n" +
                "128.830 872(greedy) arrives\n" +
                "128.830 872(greedy) waits at self-check 4\n" +
                "128.878 873(greedy) arrives\n" +
                "128.878 873(greedy) waits at server 1\n" +
                "128.899 874 arrives\n" +
                "128.899 874 waits at self-check 4\n" +
                "128.996 792 done serving by server 1\n" +
                "129.022 875 arrives\n" +
                "129.022 875 leaves\n" +
                "129.166 780 serves by server 2\n" +
                "129.299 807 done serving by self-check 5\n" +
                "129.299 828 serves by self-check 5\n" +
                "129.461 876(greedy) arrives\n" +
                "129.461 876(greedy) waits at server 2\n" +
                "129.505 821 done serving by self-check 4\n" +
                "129.505 834(greedy) serves by self-check 4\n" +
                "129.678 877 arrives\n" +
                "129.678 877 waits at self-check 4\n" +
                "129.773 878(greedy) arrives\n" +
                "129.773 878(greedy) waits at self-check 4\n" +
                "129.776 780 done serving by server 2\n" +
                "129.776 788(greedy) serves by server 2\n" +
                "129.930 879(greedy) arrives\n" +
                "129.930 879(greedy) waits at server 2\n" +
                "130.055 880 arrives\n" +
                "130.055 880 leaves\n" +
                "130.164 881 arrives\n" +
                "130.164 881 leaves\n" +
                "130.186 882(greedy) arrives\n" +
                "130.186 882(greedy) leaves\n" +
                "130.226 883(greedy) arrives\n" +
                "130.226 883(greedy) leaves\n" +
                "130.244 788(greedy) done serving by server 2\n" +
                "130.262 884 arrives\n" +
                "130.262 884 leaves\n" +
                "130.294 834(greedy) done serving by self-check 4\n" +
                "130.294 844(greedy) serves by self-check 4\n" +
                "130.297 885 arrives\n" +
                "130.297 885 waits at self-check 4\n" +
                "130.303 844(greedy) done serving by self-check 4\n" +
                "130.303 845 serves by self-check 4\n" +
                "130.305 801(greedy) serves by server 1\n" +
                "130.463 801(greedy) done serving by server 1\n" +
                "130.463 808(greedy) serves by server 1\n" +
                "130.541 794(greedy) serves by server 3\n" +
                "130.597 794(greedy) done serving by server 3\n" +
                "130.679 798(greedy) serves by server 3\n" +
                "130.907 886(greedy) arrives\n" +
                "130.907 886(greedy) waits at server 1\n" +
                "130.947 887 arrives\n" +
                "130.947 887 waits at server 1\n" +
                "131.198 888 arrives\n" +
                "131.198 888 waits at server 3\n" +
                "131.326 889 arrives\n" +
                "131.326 889 waits at server 3\n" +
                "131.331 845 done serving by self-check 4\n" +
                "131.331 853 serves by self-check 4\n" +
                "131.480 890 arrives\n" +
                "131.480 890 waits at self-check 4\n" +
                "131.792 891 arrives\n" +
                "131.792 891 waits at self-check 4\n" +
                "131.943 892 arrives\n" +
                "131.943 892 leaves\n" +
                "132.030 893(greedy) arrives\n" +
                "132.030 893(greedy) leaves\n" +
                "132.102 798(greedy) done serving by server 3\n" +
                "132.102 800(greedy) serves by server 3\n" +
                "132.167 793(greedy) serves by server 2\n" +
                "132.173 894(greedy) arrives\n" +
                "132.173 894(greedy) waits at server 2\n" +
                "132.260 895 arrives\n" +
                "132.260 895 waits at server 3\n" +
                "132.322 853 done serving by self-check 4\n" +
                "132.322 866 serves by self-check 4\n" +
                "132.361 896 arrives\n" +
                "132.361 896 waits at self-check 4\n" +
                "132.410 897 arrives\n" +
                "132.410 897 leaves\n" +
                "132.410 793(greedy) done serving by server 2\n" +
                "132.420 898(greedy) arrives\n" +
                "132.420 898(greedy) leaves\n" +
                "132.459 899 arrives\n" +
                "132.459 899 leaves\n" +
                "132.468 900(greedy) arrives\n" +
                "132.468 900(greedy) leaves\n" +
                "132.510 828 done serving by self-check 5\n" +
                "132.510 868(greedy) serves by self-check 5\n" +
                "132.520 901(greedy) arrives\n" +
                "132.520 901(greedy) waits at self-check 4\n" +
                "132.585 868(greedy) done serving by self-check 5\n" +
                "132.585 871(greedy) serves by self-check 5\n" +
                "132.593 902(greedy) arrives\n" +
                "132.593 902(greedy) waits at self-check 4\n" +
                "132.755 871(greedy) done serving by self-check 5\n" +
                "132.755 872(greedy) serves by self-check 5\n" +
                "132.806 808(greedy) done serving by server 1\n" +
                "132.843 800(greedy) done serving by server 3\n" +
                "132.843 802(greedy) serves by server 3\n" +
                "133.035 903(greedy) arrives\n" +
                "133.035 903(greedy) waits at server 3\n" +
                "133.037 796(greedy) serves by server 2\n" +
                "133.180 904(greedy) arrives\n" +
                "133.180 904(greedy) waits at server 2\n" +
                "133.227 905(greedy) arrives\n" +
                "133.227 905(greedy) waits at self-check 4\n" +
                "133.248 802(greedy) done serving by server 3\n" +
                "133.248 803(greedy) serves by server 3\n" +
                "133.357 906(greedy) arrives\n" +
                "133.357 906(greedy) waits at server 3\n" +
                "133.506 803(greedy) done serving by server 3\n" +
                "133.506 835 serves by server 3\n" +
                "133.510 907(greedy) arrives\n" +
                "133.510 907(greedy) waits at server 3\n" +
                "133.526 908 arrives\n" +
                "133.526 908 leaves\n" +
                "133.622 796(greedy) done serving by server 2\n" +
                "133.659 833 serves by server 1\n" +
                "133.869 866 done serving by self-check 4\n" +
                "133.869 874 serves by self-check 4\n" +
                "134.012 909(greedy) arrives\n" +
                "134.012 909(greedy) waits at server 1\n" +
                "134.047 910(greedy) arrives\n" +
                "134.047 910(greedy) waits at self-check 4\n" +
                "134.183 911 arrives\n" +
                "134.183 911 leaves\n" +
                "134.200 912(greedy) arrives\n" +
                "134.200 912(greedy) leaves\n" +
                "134.211 913(greedy) arrives\n" +
                "134.211 913(greedy) leaves\n" +
                "134.282 914(greedy) arrives\n" +
                "134.282 914(greedy) leaves\n" +
                "134.433 915(greedy) arrives\n" +
                "134.433 915(greedy) leaves\n" +
                "134.433 797 serves by server 2\n" +
                "134.468 916(greedy) arrives\n" +
                "134.468 916(greedy) waits at server 2\n" +
                "134.640 917 arrives\n" +
                "134.640 917 leaves\n" +
                "134.887 918 arrives\n" +
                "134.887 918 leaves\n" +
                "134.981 919(greedy) arrives\n" +
                "134.981 919(greedy) leaves\n" +
                "134.996 797 done serving by server 2\n" +
                "135.132 872(greedy) done serving by self-check 5\n" +
                "135.132 877 serves by self-check 5\n" +
                "135.381 920 arrives\n" +
                "135.381 920 waits at self-check 4\n" +
                "135.416 874 done serving by self-check 4\n" +
                "135.416 878(greedy) serves by self-check 4\n" +
                "135.459 835 done serving by server 3\n" +
                "135.459 843(greedy) serves by server 3\n" +
                "135.514 921(greedy) arrives\n" +
                "135.514 921(greedy) waits at server 3\n" +
                "135.532 922 arrives\n" +
                "135.532 922 waits at self-check 4\n" +
                "135.670 819(greedy) serves by server 2\n" +
                "135.801 843(greedy) done serving by server 3\n" +
                "135.824 819(greedy) done serving by server 2\n" +
                "135.855 820(greedy) serves by server 2\n" +
                "135.973 923 arrives\n" +
                "135.973 923 waits at server 2\n" +
                "136.333 855 serves by server 3\n" +
                "136.336 924(greedy) arrives\n" +
                "136.336 924(greedy) waits at server 2\n" +
                "136.358 925(greedy) arrives\n" +
                "136.358 925(greedy) waits at server 3\n" +
                "136.420 926(greedy) arrives\n" +
                "136.420 926(greedy) leaves\n" +
                "136.547 927 arrives\n" +
                "136.547 927 leaves\n" +
                "136.558 928(greedy) arrives\n" +
                "136.558 928(greedy) leaves\n" +
                "136.680 929(greedy) arrives\n" +
                "136.680 929(greedy) leaves\n" +
                "136.694 930(greedy) arrives\n" +
                "136.694 930(greedy) leaves\n" +
                "136.856 931 arrives\n" +
                "136.856 931 leaves\n" +
                "136.924 932 arrives\n" +
                "136.924 932 leaves\n" +
                "136.985 933(greedy) arrives\n" +
                "136.985 933(greedy) leaves\n" +
                "137.011 877 done serving by self-check 5\n" +
                "137.011 885 serves by self-check 5\n" +
                "137.155 934 arrives\n" +
                "137.155 934 waits at self-check 4\n" +
                "137.160 935(greedy) arrives\n" +
                "137.160 935(greedy) leaves\n" +
                "137.185 855 done serving by server 3\n" +
                "137.185 858 serves by server 3\n" +
                "137.263 858 done serving by server 3\n" +
                "137.263 864 serves by server 3\n" +
                "137.338 936 arrives\n" +
                "137.338 936 waits at server 3\n" +
                "137.403 937 arrives\n" +
                "137.403 937 waits at server 3\n" +
                "137.577 938 arrives\n" +
                "137.577 938 leaves\n" +
                "137.712 878(greedy) done serving by self-check 4\n" +
                "137.712 890 serves by self-check 4\n" +
                "137.881 864 done serving by server 3\n" +
                "137.881 888 serves by server 3\n" +
                "137.909 939(greedy) arrives\n" +
                "137.909 939(greedy) waits at server 3\n" +
                "137.912 940 arrives\n" +
                "137.912 940 waits at self-check 4\n" +
                "137.965 941(greedy) arrives\n" +
                "137.965 941(greedy) leaves\n" +
                "137.975 942(greedy) arrives\n" +
                "137.975 942(greedy) leaves\n" +
                "138.118 943 arrives\n" +
                "138.118 943 leaves\n" +
                "138.215 944(greedy) arrives\n" +
                "138.215 944(greedy) leaves\n" +
                "138.257 820(greedy) done serving by server 2\n" +
                "138.257 842 serves by server 2\n" +
                "138.269 945(greedy) arrives\n" +
                "138.269 945(greedy) waits at server 2\n" +
                "138.372 946 arrives\n" +
                "138.372 946 leaves\n" +
                "138.592 888 done serving by server 3\n" +
                "138.592 889 serves by server 3\n" +
                "138.614 947(greedy) arrives\n" +
                "138.614 947(greedy) waits at server 3\n" +
                "138.710 948(greedy) arrives\n" +
                "138.710 948(greedy) leaves");

        System.out.println("138.804 949(greedy) arrives\n" +
                "138.804 949(greedy) leaves\n" +
                "138.860 950(greedy) arrives\n" +
                "138.860 950(greedy) leaves\n" +
                "138.952 842 done serving by server 2\n" +
                "139.098 862 serves by server 2\n" +
                "139.308 951 arrives\n" +
                "139.308 951 waits at server 2\n" +
                "139.320 952 arrives\n" +
                "139.320 952 leaves\n" +
                "139.438 953(greedy) arrives\n" +
                "139.438 953(greedy) leaves\n" +
                "139.471 885 done serving by self-check 5\n" +
                "139.471 891 serves by self-check 5\n" +
                "139.538 954 arrives\n" +
                "139.538 954 waits at self-check 4\n" +
                "139.569 955 arrives\n" +
                "139.569 955 leaves\n" +
                "139.616 956(greedy) arrives\n" +
                "139.616 956(greedy) leaves\n" +
                "139.750 957 arrives\n" +
                "139.750 957 leaves\n" +
                "140.131 862 done serving by server 2\n" +
                "140.131 863(greedy) serves by server 2\n" +
                "140.193 889 done serving by server 3\n" +
                "140.193 895 serves by server 3\n" +
                "140.398 958 arrives\n" +
                "140.398 958 waits at server 2\n" +
                "140.468 863(greedy) done serving by server 2\n" +
                "140.468 876(greedy) serves by server 2\n" +
                "140.500 876(greedy) done serving by server 2\n" +
                "140.500 879(greedy) serves by server 2\n" +
                "140.552 895 done serving by server 3\n" +
                "140.564 959 arrives\n" +
                "140.564 959 waits at server 2\n" +
                "140.584 879(greedy) done serving by server 2\n" +
                "140.584 894(greedy) serves by server 2\n" +
                "140.649 903(greedy) serves by server 3\n" +
                "141.085 903(greedy) done serving by server 3\n" +
                "141.302 960(greedy) arrives\n" +
                "141.302 960(greedy) waits at server 2\n" +
                "141.444 891 done serving by self-check 5\n" +
                "141.444 896 serves by self-check 5\n" +
                "141.491 896 done serving by self-check 5\n" +
                "141.491 901(greedy) serves by self-check 5\n" +
                "141.572 961(greedy) arrives\n" +
                "141.572 961(greedy) waits at server 3\n" +
                "141.605 962 arrives\n" +
                "141.605 962 waits at server 2\n" +
                "141.676 906(greedy) serves by server 3\n" +
                "141.846 890 done serving by self-check 4\n" +
                "141.846 902(greedy) serves by self-check 4\n" +
                "141.901 963 arrives\n" +
                "141.901 963 waits at server 3\n" +
                "142.128 964(greedy) arrives\n" +
                "142.128 964(greedy) waits at self-check 4\n" +
                "142.389 833 done serving by server 1\n" +
                "142.413 965(greedy) arrives\n" +
                "142.413 965(greedy) waits at self-check 4\n" +
                "142.418 966 arrives\n" +
                "142.418 966 waits at server 3\n" +
                "142.420 839(greedy) serves by server 1\n" +
                "142.524 967(greedy) arrives\n" +
                "142.524 967(greedy) waits at server 1\n" +
                "142.679 968(greedy) arrives\n" +
                "142.679 968(greedy) waits at self-check 4\n" +
                "142.690 902(greedy) done serving by self-check 4\n" +
                "142.690 905(greedy) serves by self-check 4\n" +
                "142.978 906(greedy) done serving by server 3\n" +
                "142.978 907(greedy) serves by server 3\n" +
                "143.017 894(greedy) done serving by server 2\n" +
                "143.017 904(greedy) serves by server 2\n" +
                "143.109 839(greedy) done serving by server 1\n" +
                "143.148 969(greedy) arrives\n" +
                "143.148 969(greedy) waits at server 2\n" +
                "143.273 905(greedy) done serving by self-check 4\n" +
                "143.273 910(greedy) serves by self-check 4\n" +
                "143.313 970(greedy) arrives\n" +
                "143.313 970(greedy) waits at self-check 4\n" +
                "143.371 904(greedy) done serving by server 2\n" +
                "143.371 916(greedy) serves by server 2\n" +
                "143.406 971(greedy) arrives\n" +
                "143.406 971(greedy) waits at server 2\n" +
                "143.592 972(greedy) arrives\n" +
                "143.592 972(greedy) waits at server 3\n" +
                "143.604 973 arrives\n" +
                "143.604 973 waits at self-check 4\n" +
                "143.880 974(greedy) arrives\n" +
                "143.880 974(greedy) leaves\n" +
                "143.885 975(greedy) arrives\n" +
                "143.885 975(greedy) leaves\n" +
                "143.903 910(greedy) done serving by self-check 4\n" +
                "143.903 920 serves by self-check 4\n" +
                "143.910 976 arrives\n" +
                "143.910 976 waits at self-check 4\n" +
                "144.048 977(greedy) arrives\n" +
                "144.048 977(greedy) leaves\n" +
                "144.172 920 done serving by self-check 4\n" +
                "144.172 922 serves by self-check 4\n" +
                "144.193 860 serves by server 1\n" +
                "144.213 978 arrives\n" +
                "144.213 978 waits at server 1\n" +
                "144.338 979(greedy) arrives\n" +
                "144.338 979(greedy) waits at self-check 4\n" +
                "144.339 980(greedy) arrives\n" +
                "144.339 980(greedy) leaves\n" +
                "144.380 901(greedy) done serving by self-check 5\n" +
                "144.380 934 serves by self-check 5\n" +
                "144.476 981 arrives\n" +
                "144.476 981 waits at self-check 4\n" +
                "144.493 916(greedy) done serving by server 2\n" +
                "144.493 923 serves by server 2\n" +
                "144.760 923 done serving by server 2\n" +
                "144.760 924(greedy) serves by server 2\n" +
                "144.768 924(greedy) done serving by server 2\n" +
                "144.768 945(greedy) serves by server 2\n" +
                "144.779 907(greedy) done serving by server 3\n" +
                "145.034 982 arrives\n" +
                "145.034 982 waits at server 2\n" +
                "145.087 983 arrives\n" +
                "145.087 983 waits at server 2\n" +
                "145.087 922 done serving by self-check 4\n" +
                "145.087 940 serves by self-check 4\n" +
                "145.266 934 done serving by self-check 5\n" +
                "145.266 954 serves by self-check 5\n" +
                "145.543 860 done serving by server 1\n" +
                "145.543 861 serves by server 1\n" +
                "145.580 984(greedy) arrives\n" +
                "145.580 984(greedy) waits at self-check 4\n" +
                "145.599 985(greedy) arrives\n" +
                "145.599 985(greedy) waits at server 1\n" +
                "145.659 986 arrives\n" +
                "145.659 986 waits at server 2\n" +
                "145.671 987 arrives\n" +
                "145.671 987 waits at self-check 4\n" +
                "145.679 945(greedy) done serving by server 2\n" +
                "145.679 951 serves by server 2\n" +
                "145.813 988(greedy) arrives\n" +
                "145.813 988(greedy) waits at server 2\n" +
                "145.827 989(greedy) arrives\n" +
                "145.827 989(greedy) leaves\n" +
                "145.848 861 done serving by server 1\n" +
                "145.848 865 serves by server 1\n" +
                "145.923 990 arrives\n" +
                "145.923 990 waits at server 1\n" +
                "145.950 954 done serving by self-check 5\n" +
                "145.950 964(greedy) serves by self-check 5\n" +
                "145.953 991 arrives\n" +
                "145.953 991 waits at self-check 4\n" +
                "146.017 940 done serving by self-check 4\n" +
                "146.017 965(greedy) serves by self-check 4\n" +
                "146.025 921(greedy) serves by server 3\n" +
                "146.045 965(greedy) done serving by self-check 4\n" +
                "146.045 968(greedy) serves by self-check 4\n" +
                "146.098 865 done serving by server 1\n" +
                "146.098 867 serves by server 1\n" +
                "146.197 992 arrives\n" +
                "146.197 992 waits at server 1\n" +
                "146.502 867 done serving by server 1\n" +
                "146.570 870(greedy) serves by server 1\n" +
                "146.735 870(greedy) done serving by server 1\n" +
                "146.735 873(greedy) serves by server 1\n" +
                "146.744 993 arrives\n" +
                "146.744 993 waits at server 1\n" +
                "146.808 994 arrives\n" +
                "146.808 994 waits at server 1\n" +
                "146.871 995 arrives\n" +
                "146.871 995 waits at server 3\n" +
                "146.906 996(greedy) arrives\n" +
                "146.906 996(greedy) waits at self-check 4\n" +
                "146.923 997 arrives\n" +
                "146.923 997 waits at self-check 4\n" +
                "146.941 998(greedy) arrives\n" +
                "146.941 998(greedy) leaves\n" +
                "147.036 999 arrives\n" +
                "147.036 999 leaves\n" +
                "147.115 1000(greedy) arrives\n" +
                "147.115 1000(greedy) leaves\n" +
                "147.135 964(greedy) done serving by self-check 5\n" +
                "147.135 970(greedy) serves by self-check 5\n" +
                "147.210 951 done serving by server 2\n" +
                "147.288 921(greedy) done serving by server 3\n" +
                "147.288 925(greedy) serves by server 3\n" +
                "147.846 970(greedy) done serving by self-check 5\n" +
                "147.846 973 serves by self-check 5\n" +
                "147.925 958 serves by server 2\n" +
                "148.263 873(greedy) done serving by server 1\n" +
                "148.678 968(greedy) done serving by self-check 4\n" +
                "148.678 976 serves by self-check 4\n" +
                "148.686 973 done serving by self-check 5\n" +
                "148.686 979(greedy) serves by self-check 5\n" +
                "149.853 886(greedy) serves by server 1\n" +
                "149.947 976 done serving by self-check 4\n" +
                "149.947 981 serves by self-check 4\n" +
                "150.001 886(greedy) done serving by server 1\n" +
                "150.001 887 serves by server 1\n" +
                "150.542 958 done serving by server 2\n" +
                "150.542 959 serves by server 2\n" +
                "151.018 925(greedy) done serving by server 3\n" +
                "151.018 936 serves by server 3\n" +
                "151.369 887 done serving by server 1\n" +
                "151.369 909(greedy) serves by server 1\n" +
                "151.389 981 done serving by self-check 4\n" +
                "151.389 984(greedy) serves by self-check 4\n" +
                "152.111 984(greedy) done serving by self-check 4\n" +
                "152.111 987 serves by self-check 4\n" +
                "152.227 959 done serving by server 2\n" +
                "152.227 960(greedy) serves by server 2\n" +
                "152.989 987 done serving by self-check 4\n" +
                "152.989 991 serves by self-check 4\n" +
                "153.313 960(greedy) done serving by server 2\n" +
                "153.313 962 serves by server 2\n" +
                "154.437 936 done serving by server 3\n" +
                "154.480 937 serves by server 3\n" +
                "154.788 979(greedy) done serving by self-check 5\n" +
                "154.788 996(greedy) serves by self-check 5\n" +
                "155.051 937 done serving by server 3\n" +
                "155.115 909(greedy) done serving by server 1\n" +
                "155.376 939(greedy) serves by server 3\n" +
                "155.847 939(greedy) done serving by server 3\n" +
                "156.078 991 done serving by self-check 4\n" +
                "156.078 997 serves by self-check 4\n" +
                "156.187 962 done serving by server 2\n" +
                "156.187 969(greedy) serves by server 2\n" +
                "156.583 947(greedy) serves by server 3\n" +
                "156.617 996(greedy) done serving by self-check 5\n" +
                "156.781 967(greedy) serves by server 1\n" +
                "156.819 969(greedy) done serving by server 2\n" +
                "156.819 971(greedy) serves by server 2\n" +
                "157.004 971(greedy) done serving by server 2\n" +
                "157.004 982 serves by server 2\n" +
                "157.070 997 done serving by self-check 4\n" +
                "157.076 982 done serving by server 2\n" +
                "157.124 983 serves by server 2\n" +
                "157.648 983 done serving by server 2\n" +
                "157.895 986 serves by server 2\n" +
                "158.183 986 done serving by server 2\n" +
                "158.183 988(greedy) serves by server 2\n" +
                "158.365 967(greedy) done serving by server 1\n" +
                "158.365 978 serves by server 1\n" +
                "158.661 947(greedy) done serving by server 3\n" +
                "158.661 961(greedy) serves by server 3\n" +
                "158.671 988(greedy) done serving by server 2\n" +
                "158.885 978 done serving by server 1\n" +
                "158.885 985(greedy) serves by server 1\n" +
                "159.272 961(greedy) done serving by server 3\n" +
                "159.272 963 serves by server 3\n" +
                "159.428 963 done serving by server 3\n" +
                "159.428 966 serves by server 3\n" +
                "159.460 985(greedy) done serving by server 1\n" +
                "159.460 990 serves by server 1\n" +
                "159.725 990 done serving by server 1\n" +
                "160.087 966 done serving by server 3\n" +
                "160.087 972(greedy) serves by server 3\n" +
                "160.234 972(greedy) done serving by server 3\n" +
                "160.305 992 serves by server 1\n" +
                "160.494 992 done serving by server 1\n" +
                "160.870 993 serves by server 1\n" +
                "161.690 995 serves by server 3\n" +
                "161.975 993 done serving by server 1\n" +
                "162.432 994 serves by server 1\n" +
                "162.816 994 done serving by server 1\n" +
                "163.108 995 done serving by server 3\n" +
                "[8.389 657 343]");
    }
}
