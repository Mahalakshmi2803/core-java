package overRide.internal;

public class Laptop {
    String brand;
    int cost;
    public Laptop() {
        System.out.println("no arg constructor of Laptop");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public void show() {
        System.out.println("show running in Laptop");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Cost:"+cost;
    }
}


