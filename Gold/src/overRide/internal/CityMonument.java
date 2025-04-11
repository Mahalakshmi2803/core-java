package overRide.internal;

public class CityMonument extends Monument {
    public CityMonument() {
        System.out.println("no arg constructor of CityMonument");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in CityMonument");
    }
    public void monumentType() {
        System.out.println("monumentType running in CityMonument");
    }
}


