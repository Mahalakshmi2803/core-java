package com.xworkz.instanceMatching.internal;

public class Draw {
    private String type;
    private int size;
    private double price;
    private boolean isColoringAvailable;

    public Draw() {
        System.out.println("no argument constructor of Draw...");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsColoringAvailable(boolean isColoringAvailable) {
        this.isColoringAvailable = isColoringAvailable;
    }

    @Override
    public String toString() {
        return "Draw{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", isColoringAvailable=" + isColoringAvailable +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Draw) {
            Draw other = (Draw) obj;
            return this.type.equals(other.type) && this.size == other.size;
        }
        return false;
    }
}

