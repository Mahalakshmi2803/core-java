package com.xworkz.abstractProb.internal;

public abstract class Type extends AbstractPaint{
    public Type(){
        System.out.println("no arg const of Type");
    }
    @Override
    public void paintBrush(){
        System.out.println("paintBrush running in Type");
    }
}
