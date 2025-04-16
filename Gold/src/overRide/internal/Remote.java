package overRide.internal;

public class Remote {
    String type;
    String isSmartRemote;
    public Remote() {
        System.out.println("no arg constructor of Remote");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsSmartRemote(String isSmartRemote) {
        this.isSmartRemote = isSmartRemote;
    }

    public void show() {
        System.out.println("show running in Remote");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  Is a smart remote:"+isSmartRemote;
    }
}


