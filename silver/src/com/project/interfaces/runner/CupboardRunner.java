package com.project.interfaces.runner;

import com.project.interfaces.external.CupboardDesign;
import com.project.interfaces.internal.Cupboard;

public class CupboardRunner {
    public static void main(String[] args) {


        Cupboard cupboard = new CupboardDesign();
        cupboard.attachedMirror();
        cupboard.handle();
        cupboard.hangers();
        cupboard.length();
        cupboard.lock();
        cupboard.material();
        cupboard.slots();
        cupboard.shelf();
        cupboard.width();
        CupboardDesign cupboardDesign=new CupboardDesign();
        cupboardDesign.attachedMirror();
        cupboardDesign.handle();
        cupboardDesign.hangers();
        cupboardDesign.length();
        cupboardDesign.lock();
        cupboardDesign.material();
        cupboardDesign.slots();
        cupboardDesign.shelf();
        cupboardDesign.width();

    }
}
