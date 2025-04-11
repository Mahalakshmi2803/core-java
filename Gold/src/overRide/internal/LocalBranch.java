package overRide.internal;

public class LocalBranch extends Branch {
    public LocalBranch() {
        System.out.println("no arg constructor of LocalBranch");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in LocalBranch");
    }
    public void branchType() {
        System.out.println("branchType running in LocalBranch");
    }
}


