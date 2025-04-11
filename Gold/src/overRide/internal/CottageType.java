package overRide.internal;

public class CottageType extends Cottage {
    public CottageType() {
        System.out.println("no arg constructor of CottageType");
    }
    @Override
    public void show() {
        System.out.println("show() overridden in CottageType");
    }
    public void cottageName() {
        System.out.println("cottageName running in CottageType");
    }
}
