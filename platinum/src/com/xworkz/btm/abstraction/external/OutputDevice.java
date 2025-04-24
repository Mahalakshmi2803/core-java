package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Computer;

public class OutputDevice implements Computer {

    @Override
    public void interconnects() {
        System.out.println("interconnects running in OutputDevice");
    }
}
