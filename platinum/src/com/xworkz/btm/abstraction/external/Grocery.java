package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Mart;

public class Grocery implements Mart {

    @Override
    public void buy() {
        System.out.println("buy running in Grocery");
    }
}
