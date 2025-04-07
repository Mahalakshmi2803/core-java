package com.xworkz.temple.internal;

public class Details {

    public Details(){
        System.out.println("no-args constructor of Details");
    }

    public void Operations(){
        System.out.println("Operations running in Details");
        Card card=new Card();
        card.bankBalance();
        card.credit();
    }

}
