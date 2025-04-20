package com.xworkz.instanceMatching.constructor;

import java.util.Objects;

public class Window {
    private int panes;
    private double height;
    private boolean isOpen;
    private String frameColor;

    public Window(int panes, double height, boolean isOpen, String frameColor) {
        this.panes = panes;
        this.height = height;
        this.isOpen = isOpen;
        this.frameColor = frameColor;
    }

    @Override
    public String toString() {
        return "Window{" + "panes=" + panes + ", height=" + height + ", isOpen=" + isOpen + ", frameColor='" + frameColor + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Window) {
            Window other = (Window) obj;
            if (this.panes == other.panes && Objects.equals(this.frameColor, other.frameColor)) {
                System.out.println("Window is matching..");
                return true;
            }
        }
        return false;
    }
}

