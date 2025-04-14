package com.xworkz.temple.overRiding.internal;

public class BucketUser {
    public BucketUser() {
        System.out.println("BucketUser constructor");
    }

    public void show(Bucket bucket) {
        if (bucket != null) {
            bucket.fill();
            if (bucket instanceof PlasticBucket) {
                PlasticBucket pb = (PlasticBucket) bucket;
                pb.carry();
            } else {
                System.out.println("Bucket is not PlasticBucket");
            }
        } else {
            System.out.println("Bucket is null");
        }
    }
}
