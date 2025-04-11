package overRide.internal;

public class HomeType extends Home {
    public HomeType() {
        System.out.println("no arg constructor of HomeType");
    }
    @Override
    public void base(){
        System.out.println("base running in HomeType");
    }
    public void homeName() {
        System.out.println("homeName running in HomeType");
    }
}
