package overRide.internal;

public class Door {
    String type;
    int noOfDoors;
    public Door() {
        System.out.println("no arg constructor of Door");
    }
    public Door(String type,int noOfDoors ){
       this.noOfDoors=noOfDoors;
       this.type=type;
    }
    public void show() {
        System.out.println("show running in Door");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  No of Doors:"+noOfDoors;
    }
}


