package com.xworkz.temple.external;

import com.xworkz.temple.internal.Card;

public class Transaction {

    public Transaction(){
        System.out.println("no-args constructor of Transaction");
    }

    public void transactionHistory(){
        System.out.println("transactionHistory running in Transaction");
        Card card=new Card();
        card.bankBalance();

    }

}
