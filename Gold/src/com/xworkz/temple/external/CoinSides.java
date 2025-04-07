package com.xworkz.temple.external;

import com.xworkz.temple.internal.Coin;

public class CoinSides {
    public CoinSides(){
        System.out.println("no-args constructor of CoinSides ");
    }

    public void HeadsTails(){
        System.out.println("HeadsTails running in CoinSides");
        Coin coin=new Coin();
        coin.value();
    }
}
