package cs2030.simulator;

import java.util.LinkedList;
import java.util.Queue;

public class Server5 {
    private final double[] timeAvailable = new double[]{0.0};
    protected final int idNo;
    private static final RandomGenerator5[] myRG =
            new RandomGenerator5[]{new RandomGenerator5(-1,-1,-1,-1)};
    private static final int[] maxQueueLength = new int[]{1};
    private final Queue<Customer5> queue;
    private static final double[] restChance = new double[]{0.0};
    protected static final boolean[] isSelf  = new boolean[]{false};

    protected static final int ARRIVES = 1;
    protected static final int SERVED = 2;
    protected static final int LEAVES = 3;
    protected static final int DONE = 4;
    protected static final int WAITS = 5;
    protected static final int SERVER_REST = 6;
    protected static final int SERVER_BACK = 7;

    public boolean getSelf() {
        return isSelf[0];
    }

    public RandomGenerator5[] getmyRG() {
        return myRG;
    }

    public double[] getTimeAvailable() {
        return timeAvailable;
    }

    public double[] getRestChance() {
        return restChance;
    }


    
    /**
    * Sets the RandomGenerator for all Servers.
    */
    public static void setSeed(int seedValue, double arrivalRate, 
                                double serviceRate, double restRate) {
        myRG[0] = new RandomGenerator5(seedValue, arrivalRate, serviceRate, restRate);
    }
    
    /**
    * Set the maxQueueLength for all Servers.
    */
    public static void setMaxQueue(int max) {
        maxQueueLength[0] = max;
    }
    
    /**
    * Set the restChance for all Servers.
    */
    public static void setRestChance(double chance) {
        restChance[0] = chance;
    }
    
    /**
    * Constructs a new Server. Available to serve right away.
    */
    public Server5(int id) {
        idNo = id;
        timeAvailable[0] = 0.0;
        queue = new LinkedList<>();
    }

    public Queue<Customer5> getQueue() {
        return queue;
    }
    

    
    public int getID() {
        return idNo;
    }
    
    public boolean isAvailable(double time) {
        return time >= timeAvailable[0];
    }
    
    public boolean queueIsAvailable() {
        return queue.size() < maxQueueLength[0];
    }
    
    public boolean hasCustomersWaiting() {
        return !queue.isEmpty();
    }
    
    public int getQueueSize() {
        return queue.size();
    }
    
    public void addToQueue(Customer5 customer5) {
        queue.add(customer5);
    }
    
    public boolean isTired() {
        return myRG[0].genRandomRest() < restChance[0];
    }
    
    @Override
    public String toString() {
        return "server " +  idNo;
    }

}
