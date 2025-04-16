package overRide.internal;

public class Store {
    String name;
    double size;
    public Store() {
        System.out.println("no arg constructor of Store");
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("show running in Store");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Size:"+size;
    }
}


