package overRide.internal;

public class SportsUniform extends Uniform {
    public SportsUniform() {
        System.out.println("no arg constructor of SportsUniform");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SportsUniform");
    }
    public void uniformType() {
        System.out.println("uniformType running in SportsUniform");
    }
}


