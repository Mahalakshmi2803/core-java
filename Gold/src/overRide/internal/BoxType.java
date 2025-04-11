package overRide.internal;

public class BoxType extends Box {
    public BoxType() {
        System.out.println("no arg constructor of BoxType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in BoxType");
    }
    public void boxName() {
        System.out.println("boxName running in BoxType");
    }
}
