package overRide.internal;

public class ShoeType extends Shoe {
    public ShoeType() {
        System.out.println("no arg constructor of ShoeType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in ShoeType");
    }
    public void shoeName() {
        System.out.println("shoeName running in ShoeType");
    }
}
