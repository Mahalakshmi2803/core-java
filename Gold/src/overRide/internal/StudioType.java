package overRide.internal;

public
class StudioType extends Studio {
    public StudioType() {
        System.out.println("no arg constructor of StudioType");
    }
    @Override
    public void show() {
        System.out.println("show() overridden in StudioType");
    }
    public void studioName() {
        System.out.println("studioName running in StudioType");
    }
}
