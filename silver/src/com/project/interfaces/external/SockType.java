package com.project.interfaces.external;

import com.project.interfaces.internal.Sock;

public class SockType implements Sock {

    @Override
    public void pair(){
        System.out.println("pair is running in SockType");
    }
}
