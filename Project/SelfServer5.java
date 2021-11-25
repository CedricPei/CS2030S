package cs2030.simulator;

public class SelfServer5 extends Server5 {
    private static final double restChance = 0.0;

    public SelfServer5(int id) {
        super(id);
        isSelf[0] = true;
    }

    @Override
    public String toString() {
        return "self-check " +  idNo;
    }
}