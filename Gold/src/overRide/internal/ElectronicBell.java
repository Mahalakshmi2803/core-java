package overRide.internal;

public class ElectronicBell extends Bell {
    public ElectronicBell() {
        System.out.println("no arg constructor of ElectronicBell");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in ElectronicBell");
    }
    public void bellType() {
        System.out.println("bellType running in ElectronicBell");
    }
}


