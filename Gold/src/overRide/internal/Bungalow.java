package overRide.internal;

public class Bungalow {
    int cost;
    boolean isBig;
    public Bungalow() {
        System.out.println("no arg constructor of Bungalow");
    }
    public Bungalow(int cost,boolean isBig){
        this.cost=cost;
        this.isBig=isBig;
    }
    public void show() {
        System.out.println("show() running in Bungalow");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Is Big:"+isBig +"  Cost:"+cost;
    }
}
