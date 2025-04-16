package overRide.internal;

public class Monument {
    String name;
    boolean isOld;
    public Monument() {
        System.out.println("no arg constructor of Monument");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOld(boolean old) {
        isOld = old;
    }

    public void show() {
        System.out.println("show running in Monument");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Is Old:"+isOld;
    }
}


