package overRide.internal;

public class Shop {
    String type;
    boolean isOpen;
    public Shop() {
        System.out.println("no arg constructor of Shop");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void show() {
        System.out.println("show running in Shop");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  Is Open:"+isOpen;
    }
}


