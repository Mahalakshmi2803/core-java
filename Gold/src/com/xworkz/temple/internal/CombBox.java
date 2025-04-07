package com.xworkz.temple.internal;

public class CombBox {
    public CombBox() {
        System.out.println("no-args constructor of CombBox");
    }

    public void storeComb() {
        System.out.println("storeComb running in CombBox");
        Comb comb = new Comb();
        comb.straighten();
        comb.material();
    }
}

