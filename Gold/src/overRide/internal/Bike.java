package overRide.internal;

public class Bike {
    String owner;
    String brand;
    public Bike() {
        System.out.println("no arg constructor of Bike");
    }
    public Bike(String owner,String brand){
        this.brand=brand;
        this.owner=owner;
    }
    public void show() {
        System.out.println("show running in Bike");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Owner:"+owner;
    }
}


