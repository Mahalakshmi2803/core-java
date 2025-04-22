package com.project.interfaces.runner;

import com.project.interfaces.external.Ornament;
import com.project.interfaces.internal.Gold;

public class GoldRunner {
    public static void main(String[] args) {
        Gold gold = new Ornament();
        gold.bracelet();
        gold.chain();
        gold.pendent();
        gold.ring();
        gold.studs();
        Ornament ornament=new Ornament();
        ornament.bracelet();
        ornament.chain();
        ornament.ring();
        ornament.studs();
        ornament.pendent();
    }
}
