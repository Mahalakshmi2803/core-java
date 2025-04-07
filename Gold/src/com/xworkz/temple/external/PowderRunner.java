package com.xworkz.temple.external;

import com.xworkz.temple.internal.PowderBox;

public class PowderRunner {
    public static void main(String[] args) {
        PowderBox powderBox = new PowderBox();
        powderBox.store();

        PowderTest powderTest = new PowderTest();
        powderTest.test();
    }
}

