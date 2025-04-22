package com.project.interfaces.external;

import com.project.interfaces.internal.Box;

public class LunchBox implements Box {
    @Override
    public void chambered() {
        System.out.println("chambered running in LunchBox");
    }

    @Override
    public void stores() {
        System.out.println("stores running in LunchBox");
    }

    @Override
    public void shape() {
        System.out.println("shape running in LunchBox");
    }
}
