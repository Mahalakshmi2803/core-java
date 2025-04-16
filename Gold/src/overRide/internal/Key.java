package overRide.internal;

public class Key {
    int noOfKeys;
    boolean goodQuality;
    public Key() {
        System.out.println("no arg constructor of Key");
    }

    public void setGoodQuality(boolean goodQuality) {
        this.goodQuality = goodQuality;
    }

    public void setNoOfKeys(int noOfKeys) {
        this.noOfKeys = noOfKeys;
    }

    public void show() {
        System.out.println("show running in Key");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "No of Keys:"+noOfKeys +"  Quality is good:"+goodQuality;
    }
}


