import com.sun.xml.internal.ws.api.ha.StickyFeature;
public class Solarsystem {
    int No_panels;
    int capacity;
    int battery;
    int efficiency;
    int sunlight_hours;
    String inverter;
    String location;
    float cost;
    String status;
    int output;
    Solarsystem(){

    }
    Solarsystem(int No_panels,int capacity){
        this.No_panels=No_panels;
        this.capacity=capacity;

    }
    Solarsystem(int No_panels,int capacity,int battery,int efficiency){
        this(No_panels,capacity);
        this.battery=battery;
        this.efficiency=efficiency;
    }
    Solarsystem(int No_panels,int capacity,int battery,int efficiency,int sunlight_hours,
                String inverter){
        this(No_panels,capacity,battery,efficiency);
        this.sunlight_hours=sunlight_hours;
        this.inverter=inverter;
    }
    Solarsystem(int No_panels, int capacity, int battery, int efficiency, int sunlight_hours,
                String inverter,String location,float cost){
        this(No_panels,capacity,battery,efficiency,sunlight_hours,inverter);
        this.location=location;
        this.cost=cost;
    }
    Solarsystem(int No_panels,int capacity,int battery,int efficiency,int sunlight_hours,
                String inverter,String location,float cost,String status,int output)
    {
        this(No_panels,capacity,battery,efficiency,sunlight_hours,inverter,location,cost);
        this.status=status;
        this.output=output;
    }
    public  void display(){
        System.out.println("The solar information is \n");
        System.out.println("The Number of solar panels is"+this.No_panels);
        System.out.println("The capacity is "+this.capacity);
        System.out.println("The battery is "+this.battery);
        System.out.println("The efficiency is"+this.efficiency);
        System.out.println("The sunlingh is"+this.sunlight_hours);
        System.out.println("The inverter is "+this.inverter);
        System.out.println("The location is"+this.location);
        System.out.println("The cost is"+this.cost);
        System.out.println("The status is"+this.status);
        System.out.println("The output is"+this.output);

    }
}
