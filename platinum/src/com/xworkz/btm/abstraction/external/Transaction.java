package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Bank;

public class Transaction {

    private Bank bank;

    public Transaction(Bank bank){
        this.bank=bank;
    }

    public void draw(){
        System.out.println("draw running in Transaction");
        if(bank!=null){
            this.bank.operations();
        }
        else{
            System.out.println("Bank is null");
        }
    }
}
