package overRide.internal;

public class WaterBottle extends Bottle {
    public WaterBottle(){
        System.out.println("no arg constructor of WaterBottle");
    }
    @Override
    public void container(){
        System.out.println("container running in WaterBottle");
    }

    public void litre(){
        System.out.println("litre running in WaterBottle");
    }
}
