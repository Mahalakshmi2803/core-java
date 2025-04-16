package overRide.internal;

public class Lamp {
    int length;
    String color;
    public Lamp() {
        System.out.println("no arg constructor of Lamp");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public void show() {
        System.out.println("show running in Lamp");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Length:"+length +"  Color:"+color;
    }
}


