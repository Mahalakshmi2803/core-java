package overRide.internal;

public class Ambulance {
    int number;
    String color;
    public Ambulance() {
        System.out.println("no arg constructor of Ambulance");
    }
    public Ambulance(int number,String color){
        this.color=color;
        this.number=number;

    }
    public void show() {
        System.out.println("show running in Ambulance");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Number:"+number +"  Color:"+color;
    }
}


