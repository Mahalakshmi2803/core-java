package overRide.internal;

public class Mirror {
    String shape;
    int length;
    public Mirror() {
        System.out.println("no arg constructor of Mirror");
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void show() {
        System.out.println("show running in Mirror");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Shape:"+shape +"  Length:"+length;
    }
}


