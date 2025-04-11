package overRide.internal;

public class VillaType extends Villa {
    public VillaType() {
        System.out.println("no arg constructor of VillaType");
    }
    @Override
    public void show() {
        System.out.println("show() overridden in VillaType");
    }
    public void villaName() {
        System.out.println("villaName running in VillaType");
    }
}
