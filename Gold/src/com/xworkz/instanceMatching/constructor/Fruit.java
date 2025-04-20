package com.xworkz.instanceMatching.constructor;

import java.util.Objects;
       public class Fruit {
        private double weight;
        private String name;
        private boolean isSeasonal;
        private int quantity;

        public Fruit(double weight, String name, boolean isSeasonal, int quantity) {
            this.weight = weight;
            this.name = name;
            this.isSeasonal = isSeasonal;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Fruit{" + "weight=" + weight + ", name='" + name + "', isSeasonal=" + isSeasonal + ", quantity=" + quantity + '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Fruit) {
                Fruit other = (Fruit) obj;
                if (Objects.equals(this.weight, other.weight) && Objects.equals(this.name, other.name)) {
                    System.out.println("Fruit is matching..");
                    return true;
                }
            }
            return false;
        }
    }


