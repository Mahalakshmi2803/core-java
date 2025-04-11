package overRide.internal;

public class TreeType extends Tree {
    public TreeType() {
        System.out.println("no arg constructor of TreeType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in TreeType");
    }
    public void treeName() {
        System.out.println("treeName running in TreeType");
    }
}
