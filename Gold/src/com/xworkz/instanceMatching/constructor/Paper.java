package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Paper {
    private String type;
    private int gsm;
    private double price;
    private boolean isRecycled;

    public Paper(String type, int gsm, double price, boolean isRecycled) {
        this.type = type;
        this.gsm = gsm;
        this.price = price;
        this.isRecycled = isRecycled;
    }

    @Override
    public String toString() {
        return "Paper{" + "type='" + type + '\'' + ", gsm=" + gsm + ", price=" + price + ", isRecycled=" + isRecycled + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Paper) {
            Paper other = (Paper) obj;
            if (Objects.equals(this.type, other.type) && this.gsm == other.gsm) {
                System.out.println("Paper is matching..");
                return true;
            }
        }
        return false;
    }
}


