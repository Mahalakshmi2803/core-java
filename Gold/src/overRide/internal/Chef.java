package overRide.internal;

public class Chef {
    String name;
    boolean cooksGood;
public Chef() {
    System.out.println("no arg constructor of Chef");
}
public Chef(String name, boolean cooksGood){
    this.cooksGood=cooksGood;
    this.name=name;
}
public void show() {
    System.out.println("show running in Chef");
}
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name of Chef:"+name +"  Cooks Good:"+cooksGood;
    }
}




