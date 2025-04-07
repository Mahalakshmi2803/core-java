package com.xworkz.temple.external;

import com.xworkz.temple.internal.Temple;
import com.xworkz.temple.internal.Trust;

public class TempleRunner {
    public static void main(String[] args) {
        Trust trust=new Trust();
        trust.fund();
        NGO ngo=new NGO();
        ngo.maintenance();
    }
}
