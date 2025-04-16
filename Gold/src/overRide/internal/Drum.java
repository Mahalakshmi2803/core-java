package overRide.internal;

public class Drum {
    String name;
    int noOfDrum;
    public Drum() {
        System.out.println("no arg constructor of Drum");
    }
    public Drum(String name,int noOfDrum){
        this.name=name;
        this.noOfDrum=noOfDrum;
    }
    public void show() {
        System.out.println("show running in Drum");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  No of Drums:"+noOfDrum;
    }
}


