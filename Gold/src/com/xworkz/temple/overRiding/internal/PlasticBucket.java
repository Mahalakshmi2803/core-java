package com.xworkz.temple.overRiding.internal;

public
class PlasticBucket extends Bucket {
    public PlasticBucket() {
        System.out.println("PlasticBucket constructor");
    }

    @Override
    public void fill() {
        System.out.println("Filling PlasticBucket");
    }

    public void carry() {
        System.out.println("Carrying the PlasticBucket");
    }
}



