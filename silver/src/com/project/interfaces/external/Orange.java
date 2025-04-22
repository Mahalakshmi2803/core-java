package com.project.interfaces.external;

import com.project.interfaces.internal.Plant;

public class Orange implements Plant {
    @Override
    public void givesFlower() {
        System.out.println("givesFlower running in Orange");
    }

    @Override
    public void grows() {
        System.out.println("grows running in Orange");
    }

    @Override
    public void givesFruit() {
        System.out.println("givesFruit running in Orange");
    }
}
