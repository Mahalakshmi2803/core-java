package com.xworkz.temple.external;

import com.xworkz.temple.internal.Beach;

public class Sunset {
    public  Sunset(){
        System.out.println("no-args constructor od Sunset");
    }

    public void twilight(){
        System.out.println("twilight running in Sunset");
        Beach beach=new Beach();
        beach.water();
    }

}
