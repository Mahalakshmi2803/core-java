package com.project.interfaces.external;

import com.project.interfaces.internal.Bag;

public class Backpack implements Bag {

    @Override
    public void pack(){
        System.out.println("pack running in Backpack");
    }
}
