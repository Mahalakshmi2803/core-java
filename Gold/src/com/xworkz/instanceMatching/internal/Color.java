package com.xworkz.instanceMatching.internal;

public class Color {
    private String name;
    private String shade;
    private int quantity;
    private boolean isOpaque;

    public Color() {
        System.out.println("no argument constructor of Color...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShade(String shade) {
        this.shade = shade;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setIsOpaque(boolean isOpaque) {
        this.isOpaque = isOpaque;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", shade='" + shade + '\'' +
                ", quantity=" + quantity +
                ", isOpaque=" + isOpaque +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Color) {
            Color other = (Color) obj;
            if (this.name.equals(other.name) && this.shade.equals(other.shade)) {
                return true;
            }
        }
        return false;
    }
}

