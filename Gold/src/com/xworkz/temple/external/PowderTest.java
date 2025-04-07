package com.xworkz.temple.external;

import com.xworkz.temple.internal.Powder;

public class PowderTest {
    public PowderTest() {
        System.out.println("no-args constructor of PowderTest");
    }

    public void test() {
        System.out.println("test method running in PowderTest");
        Powder powder = new Powder();
        powder.dissolve();
    }
}

