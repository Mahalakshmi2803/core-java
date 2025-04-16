package overRide.internal;

public class Card {
    String cardType;
    int amount;
    public Card() {
        System.out.println("no arg constructor of Card");
    }
    public Card(String cardType, int amount){
        this.amount=amount;
        this.cardType=cardType;
    }
    public void show() {
        System.out.println("show running in Card");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Card_Type:"+cardType +"  Amount:"+amount;
    }
}


