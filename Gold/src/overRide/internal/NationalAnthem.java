package overRide.internal;

public class NationalAnthem extends Anthem {
    public NationalAnthem() {
        System.out.println("no arg constructor of NationalAnthem");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in NationalAnthem");
    }
    public void anthemName() {
        System.out.println("anthemName running in NationalAnthem");
    }
}


