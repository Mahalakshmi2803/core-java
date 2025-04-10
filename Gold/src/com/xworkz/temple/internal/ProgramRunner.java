package com.xworkz.temple.internal;

public class ProgramRunner {

    public static void main(String[] args) {


        GoodDayBiscuit goodDayBiscuit = new GoodDayBiscuit();
        goodDayBiscuit.eatGoodDayBiscuit();

        Tap tap = new Tap();
        tap.runTap();

        Omlet omlet=new Omlet();
        omlet.eatOmlet();

        Actor actor = new Actor();
        actor.act();

        Revolver revolver = new Revolver();
        revolver.useRevolver();

        Thread thread = new Thread();
        thread.weavingThread();

        Sneakers sneakers = new Sneakers();
        sneakers.wearSneakers();

        Cactus cactus = new Cactus();
        cactus.storeWater();

        Sofa sofa = new Sofa();
        sofa.sitOnSofa();

        Lock lock = new Lock();
        lock.lockDoor();

        LED led = new LED();
        led.glowLED();


    }
}