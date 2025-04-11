package overRide.internal;

public class ColorPencil extends Pencil {
    public ColorPencil() {
        System.out.println("no arg constructor of ColorPencil");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in ColorPencil");
    }
    public void pencilName() {
        System.out.println("pencilName running in ColorPencil");
    }
}
