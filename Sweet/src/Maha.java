import java.util.Objects;

public class Maha {
    public void eats(Sweet sweet){
        if(Objects.nonNull(sweet)){
            System.out.println("Maha eats Sweet");
            sweet.taste();
        }
        else{
            System.out.println("No sweets to taste");
        }
    }
}
