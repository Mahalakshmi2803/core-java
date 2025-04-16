package overRide.internal;

public class Box {
    int noOfBoxes;
    String brand;
    public Box() {
        System.out.println("no arg constructor of Box");
    }
    public Box(int noOfBoxes,String brand){
        this.brand=brand;
        this.noOfBoxes=noOfBoxes;
    }
    public void show() {
        System.out.println("show running in Box");
    }

    @Override
    public String toString(){
        System.out.println("running toString");
        return "Brand:"+brand +"  No of Boxes:"+noOfBoxes;
    }
}


