package overRide.internal;

public class Plate {
    String material;
    String shape;
    public Plate() {
        System.out.println("no arg constructor of Plate");
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void show() {
        System.out.println("show running in Plate");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Material:"+material +"  Shape:"+shape;
    }
}


