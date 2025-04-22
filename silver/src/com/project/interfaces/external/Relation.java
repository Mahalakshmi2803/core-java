package com.project.interfaces.external;

import com.project.interfaces.internal.Friend;

public class Relation implements Friend {

    @Override
    public void talk(){
        System.out.println("talk running in Relation");
    }
}
