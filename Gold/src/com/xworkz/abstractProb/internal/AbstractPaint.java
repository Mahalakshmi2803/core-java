package com.xworkz.abstractProb.internal;

public abstract class AbstractPaint {

    public abstract void paintBrush();
    public abstract void palette();
    public void noOfColors(){
        System.out.println("noOfColors running in AbstractPaint");
    }
    public void texture(){
        System.out.println("texture running in AbstractPaint");
    }
}
