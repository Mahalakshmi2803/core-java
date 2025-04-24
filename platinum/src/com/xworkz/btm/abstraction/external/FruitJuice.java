package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Juice;

public class FruitJuice implements Juice {

    @Override
    public void making() {
        System.out.println("making is running in FruitJuice");
    }
}
