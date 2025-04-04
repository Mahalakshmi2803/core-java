package Cigarette;

import java.util.Objects;

public class Affects {
    public void health(Cigarette cigarette){
        if(Objects.nonNull(cigarette)) {
            System.out.println("Cigarette affects the health ");
            cigarette.injuries();
        }
            else{
            System.out.println("Doesn't affect");

        }
    }
}
