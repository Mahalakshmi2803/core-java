package com.xworkz.temple.external;

import com.xworkz.temple.internal.Waves;

public class BeachRunner {
    public static void main(String[] args) {
        Waves waves=new Waves();
        waves.wind();
        Sunset sunset=new Sunset();
        sunset.twilight();
    }
}
