import cs2030.simulator.Customer;
import cs2030.simulator.EventManager;
import cs2030.simulator.Server;
import cs2030.simulator.State;
import cs2030.simulator.CustomerComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfServers = sc.nextInt();
        int numOfSelfServers = sc.nextInt();
        int maxQueue = sc.nextInt();
        int numOfCustomers = sc.nextInt();
        int id = 0;

        List<Customer> custs = new ArrayList<>();
        while (id < numOfCustomers) {
            double arrivalTime = sc.nextDouble();
            double serviceTime = sc.nextDouble();
            id++;
            custs.add(new Customer(id, arrivalTime, serviceTime, State.ARRIVES));
        }

        List<Server> servers = new ArrayList<>();
        int count = 0;
        while (count < numOfServers) {
            count++;
            servers.add(new Server(count, 0.0, maxQueue, false));
        }

        if (numOfSelfServers > 0) {
            int countSelf = 0;
            count++;
            countSelf++;
            PriorityQueue<Customer> queue = new PriorityQueue<Customer>(maxQueue,
                    new CustomerComparator());
            Server selfOfServer1 = new Server(count, 0.0, maxQueue, queue,true);
            servers.add(selfOfServer1);
            while (countSelf < numOfSelfServers) {
                count++;
                countSelf++;
                servers.add(new Server(count, 0.0, maxQueue, queue,true));
            }
        }

        count = 0;
        List<Double> restTimes = new ArrayList<Double>();
        while (count < numOfCustomers) {
            double restTime = sc.nextDouble();
            restTimes.add(restTime);
            count++;
        }

        EventManager simulator = new EventManager(servers, custs, restTimes);
        simulator.run();
    }
}
