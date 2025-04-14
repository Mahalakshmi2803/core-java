package com.xworkz.temple.overRiding.internal;

public class MetalSharpener extends Sharpener {
    public MetalSharpener() {
        System.out.println("MetalSharpener constructor");
    }
    @Override
    public void sharpenPencil() {
        System.out.println("Sharpening effectively with MetalSharpener");
    }
    public void oilBlades() {
        System.out.println("Oiling blades of MetalSharpener");
    }
}


