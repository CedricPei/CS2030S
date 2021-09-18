public abstract class Driver {
    private final String license;
    private final int waittime;
    private final Service[] services;

    public Driver(String license,int waittime,Service[] services) {
        this.license = license;
        this.waittime = waittime;
        this.services = services;
    }

    public int getWaittime() {
        return this.waittime;
    }

    public String getLicense() {
        return this.license;
    }

    public Service[] getServices() {
        return this.services;
    }
}
