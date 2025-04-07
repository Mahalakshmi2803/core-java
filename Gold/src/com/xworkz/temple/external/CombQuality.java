package com.xworkz.temple.external;

import com.xworkz.temple.internal.Comb;

public class CombQuality {
    public CombQuality() {
        System.out.println("no-args constructor of CombTest");
    }

    public void checkComb() {
        System.out.println("checkComb method running in CombTest");
        Comb comb = new Comb();
        comb.straighten();
    }
}

