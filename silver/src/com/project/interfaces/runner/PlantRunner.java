package com.project.interfaces.runner;

import com.project.interfaces.external.Orange;
import com.project.interfaces.internal.Plant;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant=new Orange();
        plant.givesFlower();
        plant.givesFruit();
        plant.grows();
        Orange orange=new Orange();
        orange.givesFlower();
        orange.givesFruit();
        orange.grows();
    }
}
