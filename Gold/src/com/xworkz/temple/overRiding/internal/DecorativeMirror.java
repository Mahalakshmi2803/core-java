package com.xworkz.temple.overRiding.internal;

public class DecorativeMirror extends Mirror {
    public DecorativeMirror() {
        System.out.println("DecorativeMirror constructor");
    }
    @Override
    public void reflect() {
        System.out.println("DecorativeMirror is reflecting beautifully");
    }
    public void shine() {
        System.out.println("DecorativeMirror is shining");
    }
}


