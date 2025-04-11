package overRide.internal;

public class SoftToy extends Toy {
    public SoftToy() {
        System.out.println("no arg constructor of SoftToy");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SoftToy");
    }
    public void toyName() {
        System.out.println("toyName running in SoftToy");
    }
}
