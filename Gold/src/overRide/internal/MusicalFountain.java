package overRide.internal;

public class MusicalFountain extends Fountain {
    public MusicalFountain() {
        System.out.println("no arg constructor of MusicalFountain");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in MusicalFountain");
    }
    public void fountainType() {
        System.out.println("fountainType running in MusicalFountain");
    }
}


