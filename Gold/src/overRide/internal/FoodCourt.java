package overRide.internal;

public class FoodCourt {
    String mallName;
    int noOfFoodMarts;
    public FoodCourt() {
        System.out.println("no arg constructor of FoodCourt");
    }
    public FoodCourt(String mallName,int noOfFoodMarts){
        this.noOfFoodMarts=noOfFoodMarts;
        this.mallName=mallName;
    }
    public void show() {
        System.out.println("show running in FoodCourt");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "Name of Mall:"+mallName +"  No of FoodMart:"+noOfFoodMarts;
    }
}


