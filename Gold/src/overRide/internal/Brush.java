package overRide.internal;

public class Brush {
    String type;
    boolean goodQuality;
    public Brush() {
        System.out.println("no arg constructor of Brush");
    }
    public Brush(String type,boolean goodQuality){
        this.goodQuality=goodQuality;
        this.type=type;
    }
    public void show() {
        System.out.println("show running in Brush");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  Is it a good quality:"+goodQuality;
    }
}


