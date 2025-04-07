package property;

public class Amenity {
    double cost;
    double size;

    public Amenity(double cost,double size){
        this.cost=cost;
        this.size=size;
    }

    public void displayinfo(){
        System.out.println("Cost"+cost+"Size"+size);
    }


}
