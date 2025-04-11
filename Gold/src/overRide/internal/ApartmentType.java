package overRide.internal;

public class ApartmentType extends Apartment {
    public ApartmentType() {
        System.out.println("no arg constructor of ApartmentType");
    }
    @Override
    public void show() {
        System.out.println("show() overridden in ApartmentType");
    }
    public void apartmentName() {
        System.out.println("apartmentName running in ApartmentType");
    }
}
