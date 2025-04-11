package overRide.internal;

public class DressingMirror extends Mirror {
    public DressingMirror() {
        System.out.println("no arg constructor of DressingMirror");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in DressingMirror");
    }
    public void mirrorName() {
        System.out.println("mirrorName running in DressingMirror");
    }
}
