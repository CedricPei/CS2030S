public class NormalCab extends CarDriver {

    public NormalCab(String license, int waitTime) {
        super(license, waitTime);
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), "NormalCab");
    }

}
