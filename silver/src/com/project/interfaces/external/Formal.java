package com.project.interfaces.external;

import com.project.interfaces.internal.Dress;

public class Formal implements Dress {

    @Override
    public void wear() {
        System.out.println("wear running in Formal");
    }

    @Override
    public void code() {
        System.out.println("code running in Formal");
    }

    @Override
    public void color() {
        System.out.println("color running in Formal");
    }
}
