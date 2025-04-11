package overRide.internal;

public class BallType extends Ball {
    public BallType() {
        System.out.println("no arg constructor of BallType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in BallType");
    }
    public void ballName() {
        System.out.println("ballName running in BallType");
    }
}
