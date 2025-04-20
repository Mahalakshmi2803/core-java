package com.xworkz.instanceMatching.internal;

public class File {
    private String type;
    private int pages;
    private double price;
    private boolean isA4Size;

    public File() {
        System.out.println("no argument constructor of File...");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsA4Size(boolean isA4Size) {
        this.isA4Size = isA4Size;
    }

    @Override
    public String toString() {
        return "File{" +
                "type='" + type + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", isA4Size=" + isA4Size +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof File) {
            File other = (File) obj;
            return this.type.equals(other.type) && this.pages == other.pages;
        }
        return false;
    }
}

