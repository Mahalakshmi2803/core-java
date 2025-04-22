package com.project.interfaces.runner;

import com.project.interfaces.external.Apple;
import com.project.interfaces.internal.Fruit;

public class FruitRunner {
    public static void main(String[] args) {
        Fruit fruit=new Apple();
        fruit.eat();
        Apple apple=new Apple();
        apple.eat();
    }
}
