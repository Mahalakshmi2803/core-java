package overRide.internal;

public class CreditCard extends Card {
    public CreditCard() {
        System.out.println("no arg constructor of CreditCard");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in CreditCard");
    }
    public void cardType() {
        System.out.println("cardType running in CreditCard");
    }
}


