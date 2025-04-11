package overRide.internal;

public class SmartElevator extends Elevator {
    public SmartElevator() {
        System.out.println("no arg constructor of SmartElevator");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SmartElevator");
    }
    public void elevatorFeature() {
        System.out.println("elevatorFeature running in SmartElevator");
    }
}


