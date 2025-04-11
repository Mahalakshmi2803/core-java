package overRide.internal;

public class SlidingWindow extends Window {
    public SlidingWindow() {
        System.out.println("no arg constructor of SlidingWindow");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SlidingWindow");
    }
    public void windowName() {
        System.out.println("windowName running in SlidingWindow");
    }
}

