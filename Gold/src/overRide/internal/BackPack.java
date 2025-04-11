package overRide.internal;

public class BackPack extends Bag{

    public BackPack(){
        System.out.println("no arg constructor of BackPack");
    }

    @Override
    public void store(){
        System.out.println("store running in BackPack");
    }

    public void type(){
        System.out.println("type running in Backpack");
    }


}
