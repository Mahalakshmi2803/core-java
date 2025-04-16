package overRide.internal;

public class Phone {
    String brand;
    int cost;
    public Phone() {
        System.out.println("no arg constructor of Phone");
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void show() {
        System.out.println("show running in Phone");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Cost:"+cost;
    }
}


