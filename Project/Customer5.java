package cs2030.simulator;

public class Customer5 {
    private final double[] arrivalTime = new double[]{0.0};
    protected final int idNo;
    private static final RandomGenerator5[] myRG =
            new RandomGenerator5[]{new RandomGenerator5(-1,-1,-1,-1)};
    private static final double[] timeStamp = new double[]{0.0};
    private static final double[] greedyChance = new double[]{0.0};
    protected static final boolean[] isgreedy  = new boolean[]{false};

    protected static final int ARRIVES = 1;
    protected static final int SERVED = 2;
    protected static final int LEAVES = 3;
    protected static final int DONE = 4;
    protected static final int WAITS = 5;
    protected static final int SERVER_REST = 6;
    protected static final int SERVER_BACK = 7;
    
    //==Constructors=============================================================================\\

    /**
    * Sets the RandomGenerator for all Customers.
    */
    public static void setSeed(int seedValue, double arrivalRate,
                                    double serviceRate, double restRate) {
        myRG[0] = new RandomGenerator5(seedValue, arrivalRate, serviceRate, restRate);
    }

    public boolean getIsgreedy() {
        return isgreedy[0];
    }

    /**
    * Set the greedChance for all Servers.
    */
    public static void setGreedyChance(double chance) {
        greedyChance[0] = chance;
    }
    
    public static boolean genCustomerGreediness() {
        return myRG[0].genCustomerType() < greedyChance[0];
    }
    
    /**
    * Constructs a new Customer using the set RandomGenerator.
    */
    public Customer5(int id) {
        this.arrivalTime[0] = timeStamp[0];
        timeStamp[0] += myRG[0].genInterArrivalTime();
        
        idNo = id;
    }


    
    //==Operations===============================================================================\\

    //==Miscellaneous============================================================================\\

    public int getID() {
        return idNo;
    }

    public double getArrival() {
        return arrivalTime[0];
    }
    
    @Override
    public String toString() {
        return "" + idNo;
    }
}
