package overRide.internal;

public class HeadChef extends Chef {
    public HeadChef() {
        System.out.println("no arg constructor of HeadChef");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in HeadChef");
    }
    public void chefName() {
        System.out.println("chefName running in HeadChef");
    }
}
