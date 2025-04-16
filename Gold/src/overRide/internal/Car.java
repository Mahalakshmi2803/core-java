package overRide.internal;

public class Car {
    String brand;
    int noOfSeats;

    public Car(){
        System.out.println("no arg constructor of Car");
    }
    public Car(String brand, int noOfSeats){
        this.brand=brand;
        this.noOfSeats=noOfSeats;
    }

    public void drive(){
        System.out.println("drive running in Car");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  No of Seats:"+noOfSeats;
    }
}
