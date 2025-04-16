package overRide.internal;

public class Loan {
    String name;
    int amount;

    public Loan() {
        System.out.println("no arg constructor of Loan");
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("show running in Loan");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name:"+name +"  Amount:"+amount;
    }
}


