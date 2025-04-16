package overRide.internal;

public class Fan {
    boolean remoteControl;
    String brand;
    public Fan() {
        System.out.println("no arg constructor of Fan");
    }
    public Fan(boolean remoteControl,String brand){
        this.brand=brand;
        this.remoteControl=remoteControl;
    }
    public void show() {
        System.out.println("show running in Fan");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Remote Control:"+remoteControl;
    }
}


