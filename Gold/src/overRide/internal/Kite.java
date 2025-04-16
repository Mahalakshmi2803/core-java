package overRide.internal;

public class Kite {
    String color;
    int size;

    public Kite() {
        System.out.println("no arg constructor of Kite");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void show() {
        System.out.println("show running in Kite");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Color:"+color +"  Size:"+size;
    }
}


