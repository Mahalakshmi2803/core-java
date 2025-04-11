package overRide.internal;

public class BungalowType extends Bungalow {
    public BungalowType() {
        System.out.println("no arg constructor of BungalowType");
    }
    @Override
    public void show() {
        System.out.println("show() overridden in BungalowType");
    }
    public void bungalowName() {
        System.out.println("bungalowName running in BungalowType");
    }
}
