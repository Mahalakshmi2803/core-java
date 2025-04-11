package overRide.internal;

public class WireType extends Wire {
    public WireType() {
        System.out.println("no arg constructor of WireType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in WireType");
    }
    public void wireName() {
        System.out.println("wireName running in WireType");
    }
}
