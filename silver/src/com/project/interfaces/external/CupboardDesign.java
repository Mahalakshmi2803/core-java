package com.project.interfaces.external;

import com.project.interfaces.internal.Cupboard;

public class CupboardDesign implements Cupboard
{

    @Override
    public void width() {
        System.out.println("width running in cupboard");
    }

    @Override
    public void length() {
        System.out.println("length running in cupboard");
    }

    @Override
    public void handle() {
        System.out.println("handle running in cupboard");
    }

    @Override
    public void lock() {
        System.out.println("lock running in cupboard");
    }

    @Override
    public void material() {
        System.out.println("material running in cupboard");
    }

    @Override
    public void shelf() {
        System.out.println("shelf running in cupboard");
    }

    @Override
    public void slots() {
        System.out.println("slots running in cupboard");
    }

    @Override
    public void attachedMirror() {
        System.out.println("attachedMirror running in cupboard");
    }

    @Override
    public void hangers() {
        System.out.println("hangers running in cupboard");
    }
}
