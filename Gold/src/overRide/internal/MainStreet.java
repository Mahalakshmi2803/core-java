package overRide.internal;

public class MainStreet extends Street {
    public MainStreet() {
        System.out.println("no arg constructor of MainStreet");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in MainStreet");
    }
    public void streetType() {
        System.out.println("streetType running in MainStreet");
    }
}


