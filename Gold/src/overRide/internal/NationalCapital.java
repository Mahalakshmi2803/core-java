package overRide.internal;

public class NationalCapital extends Capital {
    public NationalCapital() {
        System.out.println("no arg constructor of NationalCapital");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in NationalCapital");
    }
    public void capitalName() {
        System.out.println("capitalName running in NationalCapital");
    }
}


