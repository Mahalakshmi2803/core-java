package overRide.internal;

public class Window {
    String type;
    String material;
    public Window() {
        System.out.println("no arg constructor of Window");
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void show() {
        System.out.println("show running in Window");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  Material:"+material;
    }
}

