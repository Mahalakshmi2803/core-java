package Earth;

import java.util.Objects;

public class SolarSystem {
    public void planet(Earth earth){
        if(Objects.nonNull(earth)){
            System.out.println("Earth is a planet in solar system ");
            earth.nature();
        }
        else{
            System.out.println("Earth is null in solar system");
        }
    }
}
