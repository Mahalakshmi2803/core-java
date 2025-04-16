package overRide.internal;

public class Stone {
    double weight;
    boolean isHard;
    public Stone(){
        System.out.println("no arg constructor of Stone");
    }

    public void setHard(boolean hard) {
        isHard = hard;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println("show running in Stone");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Weight:"+weight +"  Is Hard:"+isHard;
    }
}


