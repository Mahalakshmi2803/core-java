package overRide.internal;

public class Apartment {
    int floor;
    String area;
    public Apartment() {
        System.out.println("no arg constructor of Apartment");
    }
    public Apartment(int floor, String area){
        this.area=area;
        this.floor=floor;
    }
    public void show() {
        System.out.println("show() running in Apartment");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Floor:"+floor +"  Area:"+area;
    }
}
