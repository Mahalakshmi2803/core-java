package overRide.internal;

public class BoatType extends Boat {
    public BoatType() {
        System.out.println("no arg constructor of BoatType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in BoatType");
    }
    public void boatName() {
        System.out.println("boatName running in BoatType");
    }
}
