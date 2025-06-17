package com.xworkz.sunday.internal;

public class SmartPhone implements MusicPlayer,Camera{

    @Override
    public void playsMusic() {
        System.out.println("playsMusic in SmartPhone");
    }

    @Override
    public void takesPhoto() {
        System.out.println("takesPhotos in smartPhone");
    }
}
