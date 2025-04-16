package overRide.internal;

public class Flag {
    String country;
    int noOfColors;

    public Flag() {
        System.out.println("no arg constructor of Flag");
    }
    public Flag(String country,int noOfColors){
        this.country=country;
        this.noOfColors=noOfColors;
    }
    public void show() {
        System.out.println("show running in Flag");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Country:"+country +"  No of Colors:"+noOfColors;
    }
}


