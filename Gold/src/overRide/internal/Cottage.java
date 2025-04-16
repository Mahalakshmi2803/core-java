package overRide.internal;

public class Cottage {
    String type;
    int noOfBeds;
    public Cottage() {
        System.out.println("no arg constructor of Cottage");
    }
    public Cottage(String type,int noOfBeds){
        this.noOfBeds=noOfBeds;
        this.type=type;
    }
    public void show() {
        System.out.println("show() running in Cottage");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  No of Beds:"+noOfBeds;
    }
}
