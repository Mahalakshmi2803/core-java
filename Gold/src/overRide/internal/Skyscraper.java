package overRide.internal;

public class Skyscraper extends Building {
    public Skyscraper() {
        System.out.println("no arg constructor of Skyscraper");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in Skyscraper");
    }
    public void buildingType() {
        System.out.println("buildingType running in Skyscraper");
    }
}


