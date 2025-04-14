package com.xworkz.temple.overRiding.internal;

public class MegaMall extends Mall {
    public MegaMall() {
        System.out.println("MegaMall constructor");
    }
    @Override
    public void visit() {
        System.out.println("Exploring MegaMall");
    }
    public void movieTheater() {
        System.out.println("Enjoying movie in MegaMall theater");
    }
}


