package overRide.internal;

public  class DrumType extends Drum {
    public DrumType() {
        System.out.println("no arg constructor of DrumType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in DrumType");
    }
    public void drumName() {
        System.out.println("drumName running in DrumType");
    }
}
