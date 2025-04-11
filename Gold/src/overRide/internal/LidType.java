package overRide.internal;

public class LidType extends Lid {
    public LidType() {
        System.out.println("no arg constructor of LidType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in LidType");
    }
    public void lidName() {
        System.out.println("lidName running in LidType");
    }
}
