package overRide.internal;

public class Elevator {
    int noOfPassenger;
    String name;
    public Elevator() {
        System.out.println("no arg constructor of Elevator");
    }
    public Elevator(int noOfPassenger,String name){
        this.name=name;
        this.noOfPassenger=noOfPassenger;
    }
    public void show() {
        System.out.println("show running in Elevator");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Capacity:"+noOfPassenger +"  Name:"+name;
    }
}


