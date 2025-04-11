package overRide.internal;

public class NationalFlag extends Flag {
    public NationalFlag() {
        System.out.println("no arg constructor of NationalFlag");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in NationalFlag");
    }
    public void flagType() {
        System.out.println("flagType running in NationalFlag");
    }
}


