package com.project.interfaces.external;

import com.project.interfaces.internal.Fruit;

public class Apple implements Fruit {

    @Override
    public void eat(){
        System.out.println("eat running Apple");
    }
}
