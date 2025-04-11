package overRide.internal;

public class FishType extends Fish {
    public FishType() {
        System.out.println("no arg constructor of FishType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in FishType");
    }
    public void fishName() {
        System.out.println("fishName running in FishType");
    }
}
