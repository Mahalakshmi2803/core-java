package com.xworkz.temple.overRiding.internal;

public class MirrorUser {
    public MirrorUser() {
        System.out.println("MirrorUser constructor");
    }
    public void show(Mirror mirror) {
        if (mirror != null) {
            mirror.reflect();
            if (mirror instanceof DecorativeMirror) {
                DecorativeMirror dm = (DecorativeMirror) mirror;
                dm.shine();
            } else {
                System.out.println("Mirror is not a DecorativeMirror");
            }
        } else {
            System.out.println("Mirror is null");
        }
    }
}
