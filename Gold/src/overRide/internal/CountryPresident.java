package overRide.internal;

public class CountryPresident extends President {
    public CountryPresident() {
        System.out.println("no arg constructor of CountryPresident");
    }
    @Override
    public void show() {
        System.out.println("show overridden running in CountryPresident");
    }
    public void role() {
        System.out.println("role running in CountryPresident");
    }
}


