package com.project.interfaces.runner;

import com.project.interfaces.external.LunchBox;
import com.project.interfaces.internal.Box;

public class BoxRunner {
    public static void main(String[] args) {
        Box box=new LunchBox();
        box.chambered();
        box.shape();
        box.stores();
        LunchBox lunchBox=new LunchBox();
        lunchBox.chambered();
        lunchBox.shape();
        lunchBox.stores();
    }
}
