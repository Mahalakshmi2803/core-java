package Kidney;

public class KidneyRunner {
    public static void main(String[] args) {
        Organ organ=new Organ();
        organ.pures(null);
        Kidney kidney=new Kidney();
        organ.pures(kidney);

    }
}
