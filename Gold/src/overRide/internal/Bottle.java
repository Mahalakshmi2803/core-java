package overRide.internal;

public class Bottle {
    int litres;
    String material;
    public Bottle(){
        System.out.println("no arg constructor of Bottle");
    }
    public Bottle(int litres,String material){
        this.litres=litres;
        this.material=material;
    }

    public void container(){
        System.out.println("container running in Bottle");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Litres:"+litres +"  Material:"+material;
    }
}
