package com.project.interfaces.external;

import com.project.interfaces.internal.Charger;

public class Mobile implements Charger {

    @Override
    public void charges() {
        System.out.println("charges running in Mobile");
    }
    @Override
    public void volt() {
        System.out.println("volt running in Mobile");
    }


    @Override
    public void wireless() {
        System.out.println("wireless running in Mobile");
    }
}
