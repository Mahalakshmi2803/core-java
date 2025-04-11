package overRide.internal;

public class KitchenShelf extends Shelf {
    public KitchenShelf() {
        System.out.println("no arg constructor of KitchenShelf");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in KitchenShelf");
    }
    public void shelfName() {
        System.out.println("shelfName running in KitchenShelf");
    }
}
