package com.xworkz.abstractProb.runner;

import com.xworkz.abstractProb.internal.*;

public class Runner {
    public static void main(String[] args) {
        AbstractMango abstractMango=new Fruit();
        abstractMango.color();
        abstractMango.taste();
        AbstractGame abstractGame=new Players();
        abstractGame.cricket();
        AbstractGadget abstractGadget=new Portable();
        abstractGadget.laptop();
        abstractGadget.smartWatch();
        AbstractDress abstractDress=new Pattern();
        abstractDress.skirt();
        AbstractPaint abstractPaint=new Acrylic();
        abstractPaint.noOfColors();
        abstractPaint.palette();
        abstractPaint.paintBrush();
        abstractPaint.texture();


    }
}
