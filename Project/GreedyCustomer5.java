package cs2030.simulator;

public class GreedyCustomer5 extends Customer5 {

    public GreedyCustomer5(int id) {
        super(id);
        isgreedy[0] = true;
    }

    @Override
    public String toString() {
        return idNo + "(greedy)";
    }
}