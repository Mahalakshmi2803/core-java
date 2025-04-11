package overRide.internal;

public class DigitalCamera extends Camera {
    public DigitalCamera() {
        System.out.println("no arg constructor of DigitalCamera");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in DigitalCamera");
    }
    public void cameraName() {
        System.out.println("cameraName running in DigitalCamera");
    }
}
