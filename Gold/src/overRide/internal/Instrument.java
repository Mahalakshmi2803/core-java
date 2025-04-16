package overRide.internal;

public class Instrument {
    String type;
    int cost;
    public Instrument() {
        System.out.println("no arg constructor of Instrument");
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void show() {
        System.out.println("show running in Instrument");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Cost:"+cost +"  Type:"+type;
    }
}


