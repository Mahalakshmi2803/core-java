package overRide.internal;

public class StoneType extends Stone {
    public StoneType() {
        System.out.println("no arg constructor of StoneType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in StoneType");
    }
    public void stoneName() {
        System.out.println("stoneName running in StoneType");
    }
}
