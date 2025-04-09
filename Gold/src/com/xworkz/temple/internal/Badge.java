package com.xworkz.temple.internal;

public class Badge {
    private String name = "Employee Badge";
    private String color = "Blue";
    private String shape = "Rectangle";
    private int idNumber = 1001;
    private String holder = "Plastic";

    public Badge() {
        System.out.println("no-args constructor of Badge");
    }

    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setShape(String shape) {
        this.shape = shape;
    }

    void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    void setHolder(String holder) {
        this.holder = holder;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getShape() {
        return shape;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getHolder() {
        return holder;
    }
}

