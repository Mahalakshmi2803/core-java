package property;

import village.VillageCount;

public class Property {
    private String Name;
    private String Area;
    private Amenity[] am;

    public Property(String Name,String Area, Amenity[] am){
        this.Name=Name;
        this.Area =Area;
        this.am=am;
    }

    public void display(){
        System.out.println("Property_Name:"+Name+"  Property_Area:"+ Area);
        for(Amenity amenities:am){
            amenities.displayinfo();
        }

    }
}
