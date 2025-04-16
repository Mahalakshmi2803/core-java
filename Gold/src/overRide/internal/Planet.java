package overRide.internal;

public class Planet {
    int noOfPlanets;
    String livingPlanet;
    public Planet() {
        System.out.println("no arg constructor of Planet");
    }

    public void setLivingPlanet(String livingPlanet) {
        this.livingPlanet = livingPlanet;
    }

    public void setNoOfPlanets(int noOfPlanets) {
        this.noOfPlanets = noOfPlanets;
    }

    public void show() {
        System.out.println("show running in Planet");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "No of Planets:"+noOfPlanets +"  Living Planet is:"+livingPlanet;
    }
}


