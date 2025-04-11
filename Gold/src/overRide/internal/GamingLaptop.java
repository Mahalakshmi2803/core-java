package overRide.internal;

public class GamingLaptop extends Laptop {
    public GamingLaptop() {
        System.out.println("no arg constructor of GamingLaptop");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in GamingLaptop");
    }
    public void laptopName() {
        System.out.println("laptopName running in GamingLaptop");
    }
}