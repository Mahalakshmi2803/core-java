package overRide.internal;

public class SmartBoard extends BlackBoard {
    public SmartBoard() {
        System.out.println("no arg constructor of SmartBoard");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SmartBoard");
    }
    public void boardType() {
        System.out.println("boardType running in SmartBoard");
    }
}


