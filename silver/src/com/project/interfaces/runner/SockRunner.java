package com.project.interfaces.runner;

import com.project.interfaces.external.SockType;
import com.project.interfaces.internal.Sock;

public class SockRunner {

    public static void main(String[] args) {
        Sock sock=new SockType();
        sock.pair();
        SockType sockType=new SockType();
        sockType.pair();
    }
}
