package overRide.internal;

public class Bag {
    String brand;
    int modelNo;
    public Bag(){
        System.out.println("no arg constructor of Bag");
    }
    public Bag(String brand,int modelNo){
        this.brand=brand;
        this.modelNo=modelNo;
    }

    public void store(){
        System.out.println("store running Bag");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  ModelNo:"+modelNo;
    }
}
