package com.xworkz.btm.abstraction.runner;

import com.xworkz.btm.abstraction.external.Bus;
import com.xworkz.btm.abstraction.external.Terminal1;
import com.xworkz.btm.abstraction.external.Terminal2;
import com.xworkz.btm.abstraction.internal.Majestic;

public class MajesticRunner {
    public static void main(String[] args) {
        Majestic majestic=new Terminal1();
        Majestic majestic1=new Terminal2();

        Bus bus=new Bus(majestic1);
        bus.stand();
    }
}
