package overRide.internal;

public class StandingDesk extends Desk {
    public StandingDesk() {
        System.out.println("no arg constructor of StandingDesk");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in StandingDesk");
    }
    public void deskName() {
        System.out.println("deskName running in StandingDesk");
    }
}
