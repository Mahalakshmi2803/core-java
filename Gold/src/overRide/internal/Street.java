package overRide.internal;

public class Street {
    String name;
    boolean isNice;
    public Street() {
        System.out.println("no arg constructor of Street");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNice(boolean nice) {
        isNice = nice;
    }

    public void show() {
        System.out.println("show running in Street");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Is Nice:"+isNice;
    }
}


