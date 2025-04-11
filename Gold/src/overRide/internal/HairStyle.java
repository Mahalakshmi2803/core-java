package overRide.internal;

public class HairStyle extends Hair {

    public HairStyle(){
        System.out.println("no arg constructor of HairStyle");
    }

    @Override
    public void pin(){
        System.out.println("pin running in HairStyle");
    }

    public void band(){
        System.out.println("band running in HairStyle");
    }
}
