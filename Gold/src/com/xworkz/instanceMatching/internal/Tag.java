package com.xworkz.instanceMatching.internal;

public class Tag {
    private String label;
    private int count;
    private boolean isReusable;
    private double price;

    public Tag() {
        System.out.println("no argument constructor of Tag...");
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setIsReusable(boolean isReusable) {
        this.isReusable = isReusable;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "label='" + label + '\'' +
                ", count=" + count +
                ", isReusable=" + isReusable +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tag) {
            Tag other = (Tag) obj;
            return this.label.equals(other.label) && this.count == other.count;
        }
        return false;
    }
}

