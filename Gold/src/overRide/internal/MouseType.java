package overRide.internal;

public class MouseType extends Mouse {
    public MouseType() {
        System.out.println("no arg constructor of MouseType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in MouseType");
    }
    public void mouseName() {
        System.out.println("mouseName running in MouseType");
    }
}
