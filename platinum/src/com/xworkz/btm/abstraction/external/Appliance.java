package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Mart;

public class Appliance implements Mart {

    @Override
    public void buy() {
        System.out.println("buy running in Appliance");
    }
}
