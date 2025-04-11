package overRide.internal;

public class Surgeon extends Doctor {
    public Surgeon() {
        System.out.println("no arg constructor of Surgeon");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in Surgeon");
    }
    public void specialization() {
        System.out.println("specialization running in Surgeon");
    }
}


