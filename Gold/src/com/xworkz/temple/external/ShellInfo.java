package com.xworkz.temple.external;

import com.xworkz.temple.internal.Shell;

public class ShellInfo {
    public ShellInfo() {
        System.out.println("no-args constructor of ShellInfo");
    }

    public void details() {
        System.out.println("details running in ShellInfo");
        Shell shell = new Shell();
        shell.protect();
    }
}

