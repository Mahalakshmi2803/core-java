package overRide.internal;

public class Account {
   int amount;
   String name;

   public Account(){

   }
    public Account(int amount,String name) {
     this.amount=amount;
     this.name=name;
    }
    public void show() {
        System.out.println("show running in Account");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Amount:"+amount +"  Name:"+name;
    }

    ;
    }



