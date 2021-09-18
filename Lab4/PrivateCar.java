public class PrivateCar extends Driver {
    public PrivateCar(String license, int waittime) {
        super(license,waittime,new Service[]{new JustRide(),new ShareARide()});
    }

    @Override
    public String toString() {
        return String.format("%s (%d mins away) %s",super.getLicense(),super.getWaittime(),"PrivateCar");
    }
}
