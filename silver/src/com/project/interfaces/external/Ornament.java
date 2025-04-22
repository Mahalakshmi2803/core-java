package com.project.interfaces.external;

import com.project.interfaces.internal.Gold;

public class Ornament implements Gold {

    @Override
    public void bracelet() {
        System.out.println("bracelet running in Ornament");
    }

    @Override
    public void chain() {
        System.out.println("chain running in Ornament");
    }

    @Override
    public void pendent() {
        System.out.println("pendent running in Ornament");
    }

    @Override
    public void ring() {
        System.out.println("ring running in Ornament");
    }

    @Override
    public void studs() {
        System.out.println("studs running in Ornament");
    }
}
