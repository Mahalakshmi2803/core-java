package com.xworkz.instanceMatching.internal;

public class Board {
    private String material;
    private double width;
    private boolean isWritable;
    private int length;

    public Board() {
        System.out.println("no argument constructor of Board...");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setIsWritable(boolean isWritable) {
        this.isWritable = isWritable;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Board{" +
                "material='" + material + '\'' +
                ", width=" + width +
                ", isWritable=" + isWritable +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Board) {
            Board other = (Board) obj;
            return this.material.equals(other.material) && this.length == other.length;
        }
        return false;
    }
}

