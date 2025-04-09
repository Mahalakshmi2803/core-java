package com.xworkz.temple.internal;

public class KeyChain {
    private String color = "Silver";
    private String shape = "Round";
    private String material = "Metal";
    private int size = 5;
    private String brand = "KeyMaster";

    public KeyChain() {
        System.out.println("no-args constructor of KeyChain");
    }

    void setColor(String color) {
        this.color = color;
    }

    void setShape(String shape) {
        this.shape = shape;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    void setSize(int size) {
        this.size = size;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }
}

