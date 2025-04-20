package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Bird {
    private String name;
    private double wingspan;
    private boolean canFly;
    private int age;

    public Bird(String name, double wingspan, boolean canFly, int age) {
        this.name = name;
        this.wingspan = wingspan;
        this.canFly = canFly;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" + "name='" + name + "', wingspan=" + wingspan + ", canFly=" + canFly + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bird) {
            Bird other = (Bird) obj;
            if (Objects.equals(this.name, other.name) && Objects.equals(this.wingspan, other.wingspan)) {
                System.out.println("Bird is matching..");
                return true;
            }
        }
        return false;
    }
}

