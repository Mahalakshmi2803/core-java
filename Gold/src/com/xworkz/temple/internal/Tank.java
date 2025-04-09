package com.xworkz.temple.internal;
public class Tank {
    private String name = "Tiger";
    private String type = "Heavy";
    private String fuel = "Diesel";
    private int age = 50;
    private String weapon = "Cannon";

    public Tank() {
        System.out.println("no-args Tank constructor of Tank");
    }

    void setName(String name) {
        this.name = name;
    }

    void setType(String type) {
        this.type = type;
    }

    void setFuel(String fuel) {
        this.fuel = fuel;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public int getAge() {
        return age;
    }

    public String getWeapon() {
        return weapon;
    }
}
