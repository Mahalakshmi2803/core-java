package com.xworkz.temple.internal;

public class Army {


        public Army() {
            System.out.println("No-arg constructor of Army.");
        }

        public void showTankDetails() {
            System.out.println("showTankDetails running in Army");
            Tank tank = new Tank();

            System.out.println("Tank Name: " + tank.getName());
            System.out.println("Tank Type: " + tank.getType());
            System.out.println("Tank Age: " + tank.getAge());
            System.out.println("Tank Fuel: " + tank.getFuel());
            System.out.println("Tank Weapon: " + tank.getWeapon());


            tank.setName("Panther");
            tank.setType("Medium");
            tank.setFuel("Electric");
            tank.setAge(10);
            tank.setWeapon("Laser");

            System.out.println("Updated Tank Name: " + tank.getName());
            System.out.println("Updated Tank Type: " + tank.getType());
            System.out.println("Updated Tank Age: " + tank.getAge());
            System.out.println("Updated Tank Fuel: " + tank.getFuel());
            System.out.println("Updated Tank Weapon: " + tank.getWeapon());
        }
    }






