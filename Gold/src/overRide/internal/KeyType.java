package overRide.internal;

public class KeyType extends Key {
    public KeyType() {
        System.out.println("no arg constructor of KeyType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in KeyType");
    }
    public void keyName() {
        System.out.println("keyName running in KeyType");
    }
}
