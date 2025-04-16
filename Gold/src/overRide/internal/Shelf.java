package overRide.internal;

public class Shelf {
    int rows;
    String material;

    public Shelf() {
        System.out.println("no arg constructor of Shelf");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void show() {
        System.out.println("show running in Shelf");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Rows:"+rows +"  Material:"+material;
    }
}


