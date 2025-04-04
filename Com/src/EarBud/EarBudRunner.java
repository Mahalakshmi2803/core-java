package EarBud;

public class EarBudRunner {
    public static void main(String[] args) {
        User user=new User();
        user.wear(null);
        EarBud earBud=new EarBud();
        user.wear(earBud);
    }
}
