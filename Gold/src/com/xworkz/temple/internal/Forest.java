package com.xworkz.temple.internal;

public class Forest {

    public Forest(){
        System.out.println("no-args constructor of Forest");
    }

    public void trees(){
        System.out.println("trees running in Forest");
    }

    void animals(){
        System.out.println("animals running in Forest");
        birds();
    }

    private void birds(){
        System.out.println("birds running in Forest");
    }
}
