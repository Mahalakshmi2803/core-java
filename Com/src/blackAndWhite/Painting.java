package blackAndWhite;

import java.util.Objects;

public class Painting {
    BlackAndWhite blackAndWhite;
    public Painting(BlackAndWhite blackAndWhite){
        this.blackAndWhite=blackAndWhite;
        if(Objects.nonNull((blackAndWhite))){
            System.out.println("BlackAndWhite is not Null");
            blackAndWhite.colors();
        }
        else{
            System.out.println("Is Null");
        }
    }
}
