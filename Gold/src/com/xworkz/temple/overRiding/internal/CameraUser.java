package com.xworkz.temple.overRiding.internal;

public class CameraUser {
    public CameraUser() {
        System.out.println("CameraUser constructor");
    }
    public void show(Camera camera) {
        if (camera != null) {
            camera.click();
            if (camera instanceof DigitalCamera) {
                DigitalCamera dc = (DigitalCamera) camera;
                dc.record();
            } else {
                System.out.println("Camera is not DigitalCamera");
            }
        } else {
            System.out.println("Camera is null");
        }
    }
}
