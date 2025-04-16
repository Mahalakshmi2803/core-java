package overRide.internal;

public class Desk {
    String material;
    int noOfSeats;
    public Desk() {
        System.out.println("no arg constructor of Desk");
    }
    public Desk(String material,int noOfSeats){
        this.material=material;
        this.noOfSeats=noOfSeats;
    }
    public void show() {
        System.out.println("show running in Desk");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Material:"+material +"  No of Seats:"+noOfSeats;
    }
}


