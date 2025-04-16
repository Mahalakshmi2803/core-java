package overRide.internal;

public class Anthem {
    String type;
    String country;
    public Anthem() {
        System.out.println("no arg constructor of Anthem");
    }
    public Anthem(String type,String country){
        this.type=type;
        this.country=country;
    }
    public void show() {
        System.out.println("show running in Anthem");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Type:"+type +"  Country:"+country;
    }
}


