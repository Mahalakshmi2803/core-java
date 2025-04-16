package overRide.internal;

public class Vehicle {
    String brand;
    boolean isElectric;
    public Vehicle() {
        System.out.println("no arg constructor of Vehicle");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void show() {
        System.out.println("show running in Vehicle");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Is Electric:"+isElectric;
    }
}


