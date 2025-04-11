package overRide.internal;

public class CityHospital extends Hospital {
    public CityHospital() {
        System.out.println("no arg constructor of CityHospital");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in CityHospital");
    }
    public void hospitalType() {
        System.out.println("hospitalType running in CityHospital");
    }
}


