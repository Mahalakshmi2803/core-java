package overRide.internal;

public class Spoon {
    String material;
    int length;
    public Spoon() {
        System.out.println("no arg constructor of Spoon");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void show() {
        System.out.println("show running in Spoon");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Material:"+material +"  Length:"+length;
    }
}


