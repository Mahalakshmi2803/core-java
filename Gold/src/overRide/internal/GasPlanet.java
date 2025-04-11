package overRide.internal;

public class GasPlanet extends Planet {
    public GasPlanet() {
        System.out.println("no arg constructor of GasPlanet");
    }

    @Override
    public void show() {
        System.out.println("show overridden running in GasPlanet");
    }

    public void planetName() {
        System.out.println("planetName running in GasPlanet");
    }
}