package overRide.internal;

public class CupType extends Cup {
    public CupType() {
        System.out.println("no arg constructor of CupType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in CupType");
    }
    public void cupName() {
        System.out.println("cupName running in CupType");
    }
}
