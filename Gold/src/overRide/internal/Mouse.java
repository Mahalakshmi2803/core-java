package overRide.internal;

public class Mouse {
    String brand;
    boolean isGamingMouse;

    public Mouse() {
        System.out.println("no arg constructor of Mouse");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setGamingMouse(boolean gamingMouse) {
        isGamingMouse = gamingMouse;
    }

    public void show() {
        System.out.println("show running in Mouse");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  Is Gaming mouse:"+isGamingMouse;
    }
}


