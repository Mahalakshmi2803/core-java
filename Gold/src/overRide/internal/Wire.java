package overRide.internal;

public class Wire {
    int length;
    String type;
    public Wire() {
        System.out.println("no arg constructor of Wire");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void show() {
        System.out.println("show running in Wire");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Length:"+length +"  Type:"+type;
    }
}


