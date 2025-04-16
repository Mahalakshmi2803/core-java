package overRide.internal;

public class Boat {
    String type;
    String color;
    public Boat() {
        System.out.println("no arg constructor of Boat");
    }
    public Boat(String type,String color){
        this.color=color;
        this.type=type;
    }
    public void show() {
        System.out.println("show running in Boat");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  Color:"+color;
    }
}


