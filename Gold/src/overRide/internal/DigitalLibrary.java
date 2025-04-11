package overRide.internal;

public class DigitalLibrary extends Library {
    public DigitalLibrary() {
        System.out.println("no arg constructor of DigitalLibrary");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in DigitalLibrary");
    }
    public void libraryType() {
        System.out.println("libraryType running in DigitalLibrary");
    }
}


