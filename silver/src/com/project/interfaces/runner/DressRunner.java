package com.project.interfaces.runner;

import com.project.interfaces.external.Formal;
import com.project.interfaces.internal.Dress;

public class DressRunner {
    public static void main(String[] args) {
        Dress dress=new Formal();
        dress.code();
        dress.color();
        dress.wear();
        Formal formal=new Formal();
        formal.code();
        formal.wear();
        formal.color();
    }
}
