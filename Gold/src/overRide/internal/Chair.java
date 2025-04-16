package overRide.internal;

public class Chair {
    String material;
    boolean goodQuality;
    public Chair() {
        System.out.println("no arg constructor of Chair");
    }
    public Chair(String material,boolean goodQuality){
        this.goodQuality=goodQuality;
        this.material=material;
    }
    public void show() {
        System.out.println("show running in Chair");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Quality is Good:"+goodQuality +"  Material:"+material;
    }
}


