package overRide.internal;

public class WallClock extends Clock {
    public WallClock() {
        System.out.println("no arg constructor of WallClock");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in WallClock");
    }
    public void clockName() {
        System.out.println("clockName running in WallClock");
    }
}
