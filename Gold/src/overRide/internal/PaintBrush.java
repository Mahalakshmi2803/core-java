package overRide.internal;

public class PaintBrush extends Brush {
    public PaintBrush() {
        System.out.println("no arg constructor of PaintBrush");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in PaintBrush");
    }
    public void brushName() {
        System.out.println("brushName running in PaintBrush");
    }
}
