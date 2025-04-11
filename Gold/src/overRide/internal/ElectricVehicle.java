package overRide.internal;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle() {
        System.out.println("no arg constructor of ElectricVehicle");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in ElectricVehicle");
    }
    public void vehicleName() {
        System.out.println("vehicleName running in ElectricVehicle");
    }
}
