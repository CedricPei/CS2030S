public class PrivateCar extends CarDriver {

    public PrivateCar(String license, int waitTime) {
        super(license, waitTime);
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), "PrivateCar");
    }

}
