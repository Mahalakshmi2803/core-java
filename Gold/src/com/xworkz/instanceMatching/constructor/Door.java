package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Door {
    private String material;
    private int height;
    private boolean hasGlass;
    private double width;

    public Door(String material, int height, boolean hasGlass, double width) {
        this.material = material;
        this.height = height;
        this.hasGlass = hasGlass;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Door{" + "material='" + material + '\'' + ", height=" + height + ", hasGlass=" + hasGlass + ", width=" + width + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Door) {
            Door other = (Door) obj;
            if (Objects.equals(this.material, other.material) && this.height == other.height) {
                System.out.println("Door is matching..");
                return true;
            }
        }
        return false;
    }
}

