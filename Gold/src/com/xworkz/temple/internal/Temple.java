package com.xworkz.temple.internal;

public class Temple {

    public Temple(){
        System.out.println("No-Args constructor of Temple");
    }

    public void Prasadam(){
        System.out.println("Running Prasadam in class Temple");
    }
    void Darshan(){
        System.out.println("Running Darshan in class Temple");
        ticket();
    }
    private void ticket(){
        System.out.println("Running ticket in class Temple");
    }



}
