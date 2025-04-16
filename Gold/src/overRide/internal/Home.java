package overRide.internal;

public class Home {
    private int size;
    private String area;
    public Home() {
        System.out.println("no arg constructor of Home");
    }
    public void setSize(int size){
        this.size=size;

    }
    public void setArea(String area){
        this.area=area;
    }

    public void base() {
        System.out.println("base running in Home");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Size:"+size +"  Area:"+area;
    }
}
