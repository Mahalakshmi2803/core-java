package overRide.internal;

public class Hat {
    String color;
    String brand;
    public Hat() {
        System.out.println("no arg constructor of Hat");
    }
    public Hat(String color, String brand){
        this.brand=brand;
        this.color=color;
    }
    public void show() {
        System.out.println("show running in Hat");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Color:"+color;
    }
}


