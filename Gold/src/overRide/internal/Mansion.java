package overRide.internal;

public class Mansion {
    int noOfFlats;
    boolean isBig;
public Mansion() {
    System.out.println("no arg constructor of Mansion");
}

    public void setBig(boolean big) {
        isBig = big;
    }

    public void setNoOfFlats(int noOfFlats) {
        this.noOfFlats = noOfFlats;
    }

    public void show() {
    System.out.println("show() running in Mansion");
}@Override
    public String toString(){
        System.out.println("running toString");
        return "No of Flats:"+noOfFlats +"  Is Big:"+isBig;
    }
}
