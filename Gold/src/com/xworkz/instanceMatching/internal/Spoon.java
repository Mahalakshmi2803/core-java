package com.xworkz.instanceMatching.internal;

public class Spoon {
    private String material;
    private double length;
    private boolean isSpoonType;
    private int weight;

    public Spoon() {
        System.out.println("no argument constructor of Spoon...");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setIsSpoonType(boolean isSpoonType) {
        this.isSpoonType = isSpoonType;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Spoon{" +
                "material='" + material + '\'' +
                ", length=" + length +
                ", isSpoonType=" + isSpoonType +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Spoon) {
            Spoon other = (Spoon) obj;
            return this.material.equals(other.material) && this.length == other.length;
        }
        return false;
    }
}

