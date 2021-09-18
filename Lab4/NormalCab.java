public class NormalCab extends Driver {  
    public NormalCab(String license, int waittime) {
        super(license, waittime,new Service[]{new JustRide(),new TakeACab()});
    }

    @Override
    public String toString() {
        return String.format("%s (%d mins away) %s",super.getLicense(),super.getWaittime(),"NormalCab");
    }
}
