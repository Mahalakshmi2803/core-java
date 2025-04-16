package overRide.internal;

public class Camera {
    String brand;
    int cost;
    public Camera() {
        System.out.println("no arg constructor of Camera");
    }
    public  Camera(String brand,int cost){
        this.brand=brand;
        this.cost=cost;
    }
    public void show() {
        System.out.println("show running in Camera");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Cost:"+cost;
    }
}


