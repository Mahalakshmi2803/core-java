package overRide.internal;

public class CityPark extends Park {
    public CityPark() {
        System.out.println("no arg constructor of CityPark");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in CityPark");
    }
    public void parkType() {
        System.out.println("parkType running in CityPark");
    }
}

