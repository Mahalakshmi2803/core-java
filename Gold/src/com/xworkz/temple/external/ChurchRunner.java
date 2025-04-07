package com.xworkz.temple.external;

import com.xworkz.temple.internal.Christmas;

public class ChurchRunner {
    public static void main(String[] args) {
        Christmas christmas=new Christmas();
        christmas.celebrations();
        Chapel chapel=new Chapel();
        chapel.prays();
    }
}
