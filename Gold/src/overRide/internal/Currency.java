package overRide.internal;

public class Currency {
    int amount;
    String country;
    public Currency() {
        System.out.println("no arg constructor of Currency");
    }
    public Currency(int amount,String country){
        this.amount=amount;
        this.country=country;
    }
    public void show() {
        System.out.println("show running in Currency");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Amount:"+amount +"  Country:"+country;
    }
}


