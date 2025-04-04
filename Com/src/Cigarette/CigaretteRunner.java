package Cigarette;

public class CigaretteRunner {
    public static void main(String[] args) {
        Affects affects=new Affects();
        affects.health(null);
        Cigarette cigarette=new Cigarette();
        affects.health(cigarette);
    }
}
