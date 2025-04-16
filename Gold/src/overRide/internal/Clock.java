package overRide.internal;

public class Clock {
    String type;
    String Shape;
    public Clock() {
        System.out.println("no arg constructor of Clock");
    }
    public Clock(String type, String shape){
        this.Shape=shape;
        this.type=type;
    }
    public void show() {
        System.out.println("show running in Clock");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Shape:"+Shape +"  Type:"+type;
    }
}


