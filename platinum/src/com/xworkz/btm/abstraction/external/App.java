package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.JDBC;

public class App {

    private JDBC jdbc;

    public App(JDBC jdbc){
        this.jdbc=jdbc;
    }

    public void use(){
        System.out.println("use running in App");
        if(jdbc!=null){
            this.jdbc.save();
        }
        else {
            System.out.println("jdbc is null");
        }
    }
}
