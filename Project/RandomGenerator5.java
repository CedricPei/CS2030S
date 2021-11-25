package cs2030.simulator;

import java.util.Random;

public class RandomGenerator5 {
    private final Random rngArrival;

    private final Random rngService;

    private final Random rngRest;

    private final Random rngRestPeriod;

    private final Random rngTimeoutPeriod;

    private final Random rngCustomerType;

    private final double customerArrivalRate;

    private final double customerServiceRate;

    private final double serverRestingRate;

    private final int number1 = 1;
    private final int number2 = 2;
    private final int number3 = 3;
    private final int number4 = 4;
    private final int number5 = 5;

    RandomGenerator5(int paramInt, double paramDouble1, double paramDouble2,
                     double paramDouble3) {
        this.rngArrival = new Random(paramInt);
        this.rngService = new Random((paramInt + number1));
        this.rngRest = new Random((paramInt + number2));
        this.rngRestPeriod = new Random((paramInt + number3));
        this.rngCustomerType = new Random((paramInt + number4));
        this.rngTimeoutPeriod = new Random((paramInt + number5));
        this.customerArrivalRate = paramDouble1;
        this.customerServiceRate = paramDouble2;
        this.serverRestingRate = paramDouble3;
    }

    double genInterArrivalTime() {
        return -Math.log(this.rngArrival.nextDouble()) / this.customerArrivalRate;
    }

    public double genServiceTime() {
        return -Math.log(this.rngService.nextDouble()) / this.customerServiceRate;
    }

    public double genRandomRest() {
        return this.rngRest.nextDouble();
    }

    public double genRestPeriod() {
        return -Math.log(this.rngRestPeriod.nextDouble()) / this.serverRestingRate;
    }

    double genCustomerType() {
        return this.rngCustomerType.nextDouble();
    }
}

