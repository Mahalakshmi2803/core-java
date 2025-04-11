package overRide.internal;

public class FastFood extends FoodCourt {
    public FastFood() {
        System.out.println("no arg constructor of FastFood");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in FastFood");
    }
    public void foodType() {
        System.out.println("foodType running in FastFood");
    }
}


