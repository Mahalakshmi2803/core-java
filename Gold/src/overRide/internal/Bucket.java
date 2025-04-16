package overRide.internal;

public class Bucket {
    int litres;
    String color;
    public Bucket() {
        System.out.println("no arg constructor of Bucket");
    }
    public Bucket(int litres,String color){
        this.color=color;
        this.litres=litres;
    }
    public void show() {
        System.out.println("show running in Bucket");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Litres:"+litres +"  Color:"+color;
    }
}


