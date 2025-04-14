package com.xworkz.temple.overRiding.internal;

public class AnchorUser {
    public AnchorUser() {
        System.out.println("AnchorUser constructor");
    }

    public void show(Anchor anchor) {
        if (anchor != null) {
            anchor.hold();
            if (anchor instanceof BoatAnchor) {
                BoatAnchor boatAnchor = (BoatAnchor) anchor;
                boatAnchor.drop();
            } else {
                System.out.println("Anchor is not BoatAnchor");
            }
        } else {
            System.out.println("Anchor is null");
        }
    }
}
