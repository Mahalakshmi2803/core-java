package com.xworkz.temple.external;

import com.xworkz.temple.internal.CombBox;

public class CombRunner {
    public static void main(String[] args) {
        CombBox combBox = new CombBox();
        combBox.storeComb();

        CombQuality combQuality = new CombQuality();
        combQuality.checkComb();
    }
}

