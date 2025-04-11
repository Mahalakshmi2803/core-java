package overRide.internal;

public class SteelBucket extends Bucket {
    public SteelBucket() {
        System.out.println("no arg constructor of SteelBucket");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SteelBucket");
    }
    public void bucketName() {
        System.out.println("bucketName running in SteelBucket");
    }
}
