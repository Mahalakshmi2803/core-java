package com.xworkz.temple.overRiding.internal;

public class MatteLipstick extends Lipstick {
    public MatteLipstick() {
        System.out.println("MatteLipstick constructor");
    }
    @Override
    public void apply() {
        System.out.println("Applying Matte Lipstick");
    }
    public void setLongLasting() {
        System.out.println("MatteLipstick is long-lasting");
    }
}


