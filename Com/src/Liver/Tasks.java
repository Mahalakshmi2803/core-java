package Liver;

import java.util.Objects;

public class Tasks {
    public void helps(Liver liver){
        if(Objects.nonNull(liver)){
            System.out.println("Liver is an organ, tasks better to help");
            liver.organ();
        }
        else{
            System.out.println("Doesn't help ");
        }
    }
}
