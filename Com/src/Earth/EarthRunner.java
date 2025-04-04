package Earth;

import E.Ss;

public class EarthRunner {
    public static void main(String[] args) {
        SolarSystem solarSystem=new SolarSystem();
        solarSystem.planet(null);
        Earth earth=new Earth();
        solarSystem.planet(earth);
Ss ss=new Ss();
ss.as(null);
    }
}
