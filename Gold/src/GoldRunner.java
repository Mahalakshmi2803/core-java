public class GoldRunner {
    public static void main(String[] args) {
        Ornament ornament=new Ornament();
        ornament.wear(null);
        Gold gold=new Gold();
        ornament.wear(gold);
    }
}
