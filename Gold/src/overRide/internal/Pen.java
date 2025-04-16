package overRide.internal;

public class Pen {
    int cost;
    String color;
    public Pen() {
        System.out.println("no arg constructor of Pen");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void show() {
        System.out.println("show running in Pen");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Cost:"+cost +"  Color:"+color;
    }
}


