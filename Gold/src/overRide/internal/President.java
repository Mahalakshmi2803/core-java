package overRide.internal;

public class President {
    String name;
    String country;
    public President() {
        System.out.println("no arg constructor of President");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void show() {
        System.out.println("show running in President");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Country:"+country;
    }
}

