package overRide.internal;

public class BikeType extends Bike {
    public BikeType() {
        System.out.println("no arg constructor of BikeType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in BikeType");
    }
    public void bikeName() {
        System.out.println("bikeName running in BikeType");
    }
}