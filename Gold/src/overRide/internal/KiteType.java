package overRide.internal;

public class KiteType extends Kite {
    public KiteType() {
        System.out.println("no arg constructor of KiteType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in KiteType");
    }
    public void kiteName() {
        System.out.println("kiteName running in KiteType");
    }
}
