package overRide.internal;

public class HatType extends Hat {
    public HatType() {
        System.out.println("no arg constructor of HatType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in HatType");
    }
    public void hatName() {
        System.out.println("hatName running in HatType");
    }
}
