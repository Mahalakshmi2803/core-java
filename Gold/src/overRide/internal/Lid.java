package overRide.internal;

public class Lid {
    String type;
    boolean isStrong;
    public Lid() {
        System.out.println("no arg constructor of Lid");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStrong(boolean strong) {
        isStrong = strong;
    }

    public void show() {
        System.out.println("show running in Lid");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  Is Strong:"+isStrong;
    }
}


