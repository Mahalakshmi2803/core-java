package overRide.internal;

public class HomeLoan extends Loan {
    public HomeLoan() {
        System.out.println("no arg constructor of HomeLoan");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in HomeLoan");
    }
    public void loanType() {
        System.out.println("loanType running in HomeLoan");
    }
}


