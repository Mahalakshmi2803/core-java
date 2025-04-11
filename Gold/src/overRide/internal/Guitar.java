package overRide.internal;

public class Guitar extends Instrument {
    public Guitar() {
        System.out.println("no arg constructor of Guitar");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in Guitar");
    }
    public void instrumentName() {
        System.out.println("instrumentName running in Guitar");
    }
}
