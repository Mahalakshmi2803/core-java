package overRide.internal;

public class Ball {
    String material;
    boolean goodQuality;
    public Ball() {
        System.out.println("no arg constructor of Ball");
    }
    public Ball(String material,boolean goodQuality){
        this.goodQuality=goodQuality;
        this.material=material;
    }
    public void show() {
        System.out.println("show running in Ball");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Material:"+material +"  Is it a Good Quality:"+goodQuality;
    }
}


