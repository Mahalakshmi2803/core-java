package overRide.internal;

public class HeadNurse extends Nurse {
    public HeadNurse() {
        System.out.println("no arg constructor of HeadNurse");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in HeadNurse");
    }
    public void role() {
        System.out.println("role running in HeadNurse");
    }
}


