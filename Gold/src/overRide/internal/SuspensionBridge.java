package overRide.internal;

public class SuspensionBridge extends Bridge {
    public SuspensionBridge() {
        System.out.println("no arg constructor of SuspensionBridge");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SuspensionBridge");
    }
    public void bridgeType() {
        System.out.println("bridgeType running in SuspensionBridge");
    }
}

