package com.xworkz.btm.abstraction.runner;

import com.xworkz.btm.abstraction.external.Credit;
import com.xworkz.btm.abstraction.external.Debit;
import com.xworkz.btm.abstraction.external.Transaction;
import com.xworkz.btm.abstraction.internal.Bank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank=new Credit();
        Bank bank1=new Debit();

        Transaction transaction=new Transaction(bank1);
        transaction.draw();
    }
}
