package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Nature {
    private boolean isGreen;
    private int elements;
    private String beautyLevel;
    private double importance;

    public Nature(boolean isGreen, int elements, String beautyLevel, double importance) {
        this.isGreen = isGreen;
        this.elements = elements;
        this.beautyLevel = beautyLevel;
        this.importance = importance;
    }

    @Override
    public String toString() {
        return "Nature{" + "isGreen=" + isGreen + ", elements=" + elements + ", beautyLevel='" + beautyLevel + "', importance=" + importance + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Nature) {
            Nature other = (Nature) obj;
            if (Objects.equals(this.elements, other.elements) && Objects.equals(this.beautyLevel, other.beautyLevel)) {
                System.out.println("Nature is matching..");
                return true;
            }
        }
        return false;
    }
}

