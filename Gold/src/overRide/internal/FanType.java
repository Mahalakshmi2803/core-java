package overRide.internal;

public class FanType extends Fan {
    public FanType() {
        System.out.println("no arg constructor of FanType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in FanType");
    }
    public void fanName() {
        System.out.println("fanName running in FanType");
    }
}
