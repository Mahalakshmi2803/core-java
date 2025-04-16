package overRide.internal;

public class Flat {
    int size;
    boolean independent;
    public Flat() {
        System.out.println("no arg constructor of Flat");
    }
    public Flat(int size,boolean independent){
        this.independent=independent;
        this.size=size;
    }
    public void show() {
        System.out.println("show() running in Flat");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Size :"+size +"  Independent:"+independent;
    }
}
