package overRide.internal;

public class Fish {
    String name;
    int noOfFishes;
    public Fish() {
        System.out.println("no arg constructor of Fish");
    }
    public Fish(String name,int noOfFishes){
        this.name=name;
        this.noOfFishes=noOfFishes;
    }
    public void show() {
        System.out.println("show running in Fish");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  No of Fishes:"+noOfFishes;
    }
}


