package overRide.internal;

public class GroceryStore extends Shop {
    public GroceryStore() {
        System.out.println("no arg constructor of GroceryStore");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in GroceryStore");
    }
    public void shopType() {
        System.out.println("shopType running in GroceryStore");
    }
}


