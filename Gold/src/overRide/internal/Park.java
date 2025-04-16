package overRide.internal;

public class Park {
    String name;
    boolean isBeautiful;
    public Park() {
        System.out.println("no arg constructor of Park");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeautiful(boolean beautiful) {
        isBeautiful = beautiful;
    }

    public void show() {
        System.out.println("show running in Park");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Is Beautiful:"+isBeautiful;
    }
}


