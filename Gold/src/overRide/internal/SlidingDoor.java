package overRide.internal;

public class SlidingDoor extends Door {
    public SlidingDoor() {
        System.out.println("no arg constructor of SlidingDoor");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SlidingDoor");
    }
    public void doorName() {
        System.out.println("doorName running in SlidingDoor");
    }
}
