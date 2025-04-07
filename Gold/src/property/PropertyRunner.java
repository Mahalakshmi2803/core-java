package property;

import village.VillageCount;

public class PropertyRunner {
    public static void main(String[] args) {
        Amenity amenity1=new Amenity(150000.9,240.4);
        Amenity amenity2=new Amenity(170000.2,300.5);
        Amenity[] amenities={amenity1,amenity2};

        Property p1=new Property("abc","clk",amenities);
        p1.display();

    }
}
