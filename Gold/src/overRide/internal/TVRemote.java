package overRide.internal;

public class TVRemote extends Remote {
    public TVRemote() {
        System.out.println("no arg constructor of TVRemote");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in TVRemote");
    }
    public void remoteName() {
        System.out.println("remoteName running in TVRemote");
    }
}
