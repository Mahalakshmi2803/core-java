package overRide.internal;

public class LampType extends Lamp {
    public LampType() {
        System.out.println("no arg constructor of LampType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in LampType");
    }
    public void lampName() {
        System.out.println("lampName running in LampType");
    }
}
