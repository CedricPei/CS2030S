import cs2030.simulator.Customer5;
import cs2030.simulator.Eventmanger5;
import cs2030.simulator.SelfServer5;
import cs2030.simulator.Server5;
import cs2030.simulator.GreedyCustomer5;

import java.util.List;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;


public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Customer5> customer5s = new LinkedList<>();
        List<Server5> server5s = new LinkedList<>();

        int seedValue = scanner.nextInt();
        int numOfServers = scanner.nextInt();
        int numOfSelfCheck = scanner.nextInt();
        int maxQueueLength = scanner.nextInt();
        int numOfCustomers = scanner.nextInt();
        double arrivalRate = scanner.nextDouble();
        double serviceRate = scanner.nextDouble();
        double restRate = scanner.nextDouble();
        double restChance = scanner.nextDouble();
        double greedyChance = scanner.nextDouble();
        
        Customer5.setSeed(seedValue, arrivalRate, serviceRate, restRate);
        Customer5.setGreedyChance(greedyChance);
        Server5.setSeed(seedValue, arrivalRate, serviceRate, restRate);
        Server5.setMaxQueue(maxQueueLength);
        Server5.setRestChance(restChance);

        int count = 0;
        for (int i = 0; i < numOfServers; i++) {
            count++;
            server5s.add(new Server5(count));
        }
        for (int i = 0; i < numOfSelfCheck; i++) {
            count++;
            server5s.add(new SelfServer5(count));
        }
        
        for (int i = 0; i < numOfCustomers; i++) {
            if (!Customer5.genCustomerGreediness()) {
                customer5s.add(new Customer5(i + 1));
            } else {
                customer5s.add(new GreedyCustomer5(i + 1));
            }
        }
        
        // Main juice of everything that is happening
        Eventmanger5 eventmanger5 = new Eventmanger5();
        eventmanger5.serveCustomers(server5s, customer5s, seedValue,
                numOfServers,numOfSelfCheck,maxQueueLength,
                numOfCustomers,arrivalRate,serviceRate,restRate,restChance,greedyChance);
    }
}
