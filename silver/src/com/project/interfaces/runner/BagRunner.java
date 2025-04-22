package com.project.interfaces.runner;

import com.project.interfaces.external.Backpack;
import com.project.interfaces.internal.Bag;

public class BagRunner {

    public static void main(String[] args) {

        Bag bag=new Backpack();
        bag.pack();
        Backpack backpack=new Backpack();
        backpack.pack();

    }
}
