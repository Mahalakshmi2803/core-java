package overRide.internal;

public class Eye {
    String color;
    boolean goodLooking;

    public Eye(){
        System.out.println("no arg constructor of Eye");
    }
    public Eye(String color,boolean goodLooking){
        this.color=color;
        this.goodLooking=goodLooking;
    }

    public void lids(){
        System.out.println("lids running in Eye");


    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Color:"+color +"  Good Looking:"+goodLooking;
    }
}
