package overRide.internal;

public class ClothingStore extends Store {
    public ClothingStore() {
        System.out.println("no arg constructor of ClothingStore");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in ClothingStore");
    }
    public void storeType() {
        System.out.println("storeType running in ClothingStore");
    }
}


