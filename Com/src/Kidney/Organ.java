package Kidney;

import java.util.Objects;

public class Organ {
    public void pures(Kidney kidney){
        if(Objects.nonNull(kidney)){
            System.out.println("purifying organ");
            kidney.filters();
        }
        else{
            System.out.println("Null purification");
        }
    }
}
