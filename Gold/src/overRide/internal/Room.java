package overRide.internal;

public class Room {
    int size;
    int noOfRooms;
    public Room(){
        System.out.println("no arg constructor of Room");
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public void living(){
        System.out.println("living running in Room");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Size:"+size +"  No of Rooms:"+noOfRooms;
    }
}
