package overRide.internal;

public class NationalCurrency extends Currency {
    public NationalCurrency() {
        System.out.println("no arg constructor of NationalCurrency");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in NationalCurrency");
    }
    public void currencyType() {
        System.out.println("currencyType running in NationalCurrency");
    }
}


