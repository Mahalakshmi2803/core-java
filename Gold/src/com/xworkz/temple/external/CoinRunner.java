package com.xworkz.temple.external;

import com.xworkz.temple.internal.Shape;

public class CoinRunner {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.round();
        CoinSides coinSides=new CoinSides();
        coinSides.HeadsTails();
    }
}
