package overRide.internal;

public class CloudType extends Cloud {
    public CloudType() {
        System.out.println("no arg constructor of CloudType");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in CloudType");
    }
    public void cloudName() {
        System.out.println("cloudName running in CloudType");
    }
}
