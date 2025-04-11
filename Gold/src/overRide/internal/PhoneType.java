package overRide.internal;

public class PhoneType extends Phone {
    public PhoneType() {
        System.out.println("no arg constructor of PhoneType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in PhoneType");
    }
    public void phoneName() {
        System.out.println("phoneName running in PhoneType");
    }
}
