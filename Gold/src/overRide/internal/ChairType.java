package overRide.internal;

public class ChairType extends Chair {
    public ChairType() {
        System.out.println("no arg constructor of ChairType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in ChairType");
    }
    public void chairName() {
        System.out.println("chairName running in ChairType");
    }
}
