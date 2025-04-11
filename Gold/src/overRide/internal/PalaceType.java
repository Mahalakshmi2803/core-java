package overRide.internal;

public class PalaceType extends Palace {
    public PalaceType() {
        System.out.println("no arg constructor of PalaceType");
    }
    @Override
    public void show() {
        System.out.println("show() overridden in PalaceType");
    }
    public void palaceName() {
        System.out.println("palaceName running in PalaceType");
    }
}

