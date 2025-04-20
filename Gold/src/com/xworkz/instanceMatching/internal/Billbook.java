package com.xworkz.instanceMatching.internal;

public class Billbook {
    private String brand;
    private int pages;
    private double price;
    private boolean isCarbonless;

    public Billbook() {
        System.out.println("no argument constructor of Billbook...");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsCarbonless(boolean isCarbonless) {
        this.isCarbonless = isCarbonless;
    }

    @Override
    public String toString() {
        return "Billbook{" +
                "brand='" + brand + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", isCarbonless=" + isCarbonless +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Billbook) {
            Billbook other = (Billbook) obj;
            return this.brand.equals(other.brand) && this.pages == other.pages;
        }
        return false;
    }
}

