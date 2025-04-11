package overRide.internal;

public class MansionType extends Mansion {
    public MansionType() {
        System.out.println("no arg constructor of MansionType");
    }
    @Override
    public void show() {
        System.out.println("show() overridden in MansionType");
    }
    public void mansionName() {
        System.out.println("mansionName running in MansionType");
    }
}
