package com.xworkz.temple.overRiding.internal;

public class Security {
    public void show(Key key) {
        if (key != null) {
            key.use();
            if (key instanceof CarKey) {
                ((CarKey) key).unlock();
            } else {
                System.out.println("Not a CarKey");
            }
        }
    }
}
