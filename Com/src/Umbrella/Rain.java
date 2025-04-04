package Umbrella;

import java.util.Objects;

public class Rain {
    public void rains(Umbrella umbrella){

        if(Objects.nonNull(umbrella)){
            System.out.println("Umbrella is used whenever it rains");
            umbrella.protects();
        }
        else{
            System.out.println("Umbrella is null");
        }
    }
}
