package EarBud;

import java.util.Objects;

public class User {
    public void wear(EarBud earBud){
        if(Objects.nonNull(earBud)){
            System.out.println("User wears Earbud");
            earBud.sound();
        }
        else{
            System.out.println("Doesn't wear");
        }

    }
}
