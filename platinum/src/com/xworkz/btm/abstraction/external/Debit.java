package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Bank;

public class Debit implements Bank {
    @Override
    public void operations() {
        System.out.println("operations running in Debit ");
    }
}
