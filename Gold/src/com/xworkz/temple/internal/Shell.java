package com.xworkz.temple.internal;

public class Shell {
    public Shell() {
        System.out.println("no-args constructor of Shell");
    }

    public void protect() {
        System.out.println("protect  running in Shell");

        origin();
    }

    void texture() {
        System.out.println("texture running in Shell");
    }

    private void origin() {
        System.out.println("origin running in Shell");
    }
}

