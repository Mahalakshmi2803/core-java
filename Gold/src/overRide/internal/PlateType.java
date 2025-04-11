package overRide.internal;

public class PlateType extends Plate {
    public PlateType() {
        System.out.println("no arg constructor of PlateType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in PlateType");
    }
    public void plateName() {
        System.out.println("plateName running in PlateType");
    }
}
