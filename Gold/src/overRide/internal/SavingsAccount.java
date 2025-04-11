package overRide.internal;

public class SavingsAccount extends Account {
    public SavingsAccount() {
        System.out.println("no arg constructor of SavingsAccount");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in SavingsAccount");
    }
    public void accountType() {
        System.out.println("accountType running in SavingsAccount");
    }
}


