package Weather;

import java.util.Objects;

public class Condition {
    public void cool(Weather weather){
        if(Objects.nonNull(weather)){
            System.out.println("condition is cool");
            weather.rains();

        }
        else{
            System.out.println("Condition isn't cool");
        }
    }
}
