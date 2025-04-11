package overRide.internal;

public class FlatType extends Flat {
    public FlatType() {
        System.out.println("no arg constructor of FlatType");
    }
    @Override
    public void show() {
        System.out.println("show running in FlatType");
    }
    public void flatName() {
        System.out.println("flatName running in FlatType");
    }
}
