package overRide.internal;

public class NationalBank extends Bank {
    public NationalBank() {
        System.out.println("no arg constructor of NationalBank");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in NationalBank");
    }
    public void bankName() {
        System.out.println("bankName running in NationalBank");
    }
}


