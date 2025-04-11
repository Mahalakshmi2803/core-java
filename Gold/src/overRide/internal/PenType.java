package overRide.internal;

public class PenType extends Pen {
    public PenType() {
        System.out.println("no arg constructor of PenType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in PenType");
    }
    public void penName() {
        System.out.println("penName running in PenType");
    }
}
