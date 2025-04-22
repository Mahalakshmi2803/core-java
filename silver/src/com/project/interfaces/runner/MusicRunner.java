package com.project.interfaces.runner;

import com.project.interfaces.external.CarnaticMusic;
import com.project.interfaces.internal.Music;

public class MusicRunner {
    public static void main(String[] args) {
        Music music=new CarnaticMusic();
        music.charana();
        music.raga();
        music.pallavi();
        music.shaitya();
        music.shruthi();
        music.thala();
        music.swara();
        CarnaticMusic carnaticMusic=new CarnaticMusic();
        carnaticMusic.charana();
        carnaticMusic.raga();
        carnaticMusic.pallavi();
        carnaticMusic.shaitya();
        carnaticMusic.shruthi();
        carnaticMusic.thala();
        carnaticMusic.swara();
    }
}
