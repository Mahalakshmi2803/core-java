package overRide.internal;

public class CarBrand extends Car{
    public CarBrand (){
        System.out.println("no arg constructor of CarBrand");
    }
    @Override
    public void drive(){
        System.out.println("drive running in CarBrand");
    }

    public void price(){
        System.out.println("price running in CarBrand");
    }
}
