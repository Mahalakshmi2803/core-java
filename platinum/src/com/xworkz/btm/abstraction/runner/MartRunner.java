package com.xworkz.btm.abstraction.runner;

import com.xworkz.btm.abstraction.external.Appliance;
import com.xworkz.btm.abstraction.external.Bill;
import com.xworkz.btm.abstraction.external.Grocery;
import com.xworkz.btm.abstraction.internal.Mart;

public class MartRunner {
    public static void main(String[] args) {

        Mart mart=new Grocery();
        Mart mart1=new Appliance();

        Bill bill=new Bill(mart1);
        bill.payment();
    }
}
