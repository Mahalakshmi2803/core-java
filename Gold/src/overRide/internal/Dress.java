package overRide.internal;

public class Dress {
    int noOfDress;
    String type;

    public Dress(){
        System.out.println("no arg constructor of Dress");
    }

    public Dress(int noOfDress,String type){
        this.noOfDress=noOfDress;
        this.type=type;
    }

    public void code(){
        System.out.println("code running in Dress");
    }
    @Override
    public String toString(){
        System.out.println("running toString");
        return "No of Dresses:"+noOfDress +"  Type:"+type;
    }

}
