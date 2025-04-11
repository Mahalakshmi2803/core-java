package overRide.internal;

public class CitrusFruit extends Fruit {
    public CitrusFruit() {
        System.out.println("no arg constructor of CitrusFruit");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in CitrusFruit");
    }
    public void fruitName() {
        System.out.println("fruitName running in CitrusFruit");
    }
}
