package overRide.internal;

public class Fruit {
    String name;
    boolean tastesGood;
    public Fruit() {
        System.out.println("no arg constructor of Fruit");
    }
    public Fruit(String name,boolean tastesGood){
        this.name=name;
        this.tastesGood=tastesGood;
    }
    public void show() {
        System.out.println("show running in Fruit");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name  of Fruit:"+name +"  Taste is good:"+tastesGood;
    }
}


