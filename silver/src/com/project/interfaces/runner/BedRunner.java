package com.project.interfaces.runner;

import com.project.interfaces.external.BedSpread;
import com.project.interfaces.internal.Bed;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed=new BedSpread();
        bed.brand();
        bed.cost();
        bed.length();
        bed.size();
        bed.width();
        BedSpread bedSpread=new BedSpread();
        bedSpread.brand();
        bedSpread.cost();
        bedSpread.length();
        bedSpread.size();
        bedSpread.width();
    }
}
