package overRide.internal;

public class Fountain {
    int litres;
    boolean goodLooking;
    public Fountain() {
        System.out.println("no arg constructor of Fountain");
    }
    public Fountain(int litres,boolean goodLooking){
        this.goodLooking=goodLooking;
        this.litres=litres;
    }
    public void show() {
        System.out.println("show running in Fountain");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Litres:"+litres +"  Good Looking:"+goodLooking;
    }
}


