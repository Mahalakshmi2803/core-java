package overRide.internal;

public class SnakeType extends Snake {
    public SnakeType() {
        System.out.println("no arg constructor of SnakeType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SnakeType");
    }
    public void snakeName() {
        System.out.println("snakeName running in SnakeType");
    }
}
