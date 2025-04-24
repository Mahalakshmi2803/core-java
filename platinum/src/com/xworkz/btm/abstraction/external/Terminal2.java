package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Majestic;

public class Terminal2 implements Majestic {

    @Override
    public void connect() {
        System.out.println("connects running in Terminal2");
    }
}
