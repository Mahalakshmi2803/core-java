package overRide.internal;

public class Shoe {
    String brand;
    int size;
    public Shoe() {
        System.out.println("no arg constructor of Shoe");
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void show() {
        System.out.println("show running in Shoe");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Size:"+size;
    }
}


