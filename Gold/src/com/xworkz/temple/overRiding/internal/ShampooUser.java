package com.xworkz.temple.overRiding.internal;

public class ShampooUser {
public ShampooUser() {
    System.out.println("ShampooUser constructor");
}
public void show(Shampoo shampoo) {
    if (shampoo != null) {
        shampoo.clean();
        if (shampoo instanceof HerbalShampoo) {
            HerbalShampoo hs = (HerbalShampoo) shampoo;
            hs.fragrance();
        } else {
            System.out.println("Shampoo is not HerbalShampoo");
        }
    } else {
        System.out.println("Shampoo is null");
    }
}
}
