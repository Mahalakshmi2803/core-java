public class Airline {
    int airline_id;
    String name;
    String base;
    int fleet_size;
    String dest;
    int no_year_active;
    float cost;
    String status;
    long support_contact;
    String owner;

    Airline(){

    }
    Airline(int airline_id,String name){
        this.airline_id=airline_id;
        this.name=name;
    }
    Airline(int airline_id,String name,String base,int fleet_size){
        this(airline_id,name);
        this.base=base;
        this.fleet_size=fleet_size;
    }
    Airline(int airline_id,String name,String base,int fleet_size,String dest,
            int no_year_active ){
        this(airline_id,name,base,fleet_size);
        this.dest=dest;
        this.no_year_active=no_year_active;
    }
    Airline(int airline_id,String name,String base,int fleet_size,String dest,
            int no_year_active,float cost,String status){
        this(airline_id,name,base,fleet_size,dest,no_year_active);
        this.cost=cost;
        this.status=status;
    }
    Airline(int airline_id,String name,String base,int fleet_size,String dest,
            int no_year_active,float cost,String status,long support_contact,
            String owner){
        this(airline_id,name,base,fleet_size,dest,no_year_active,cost,status);
        this.support_contact=support_contact;
        this.owner=owner;
    }

    public void display(){
        System.out.println("The airplane details is\n");
        System.out.println("The airline id is \t"+this.airline_id);
        System.out.println("The name is \t"+this.name);
        System.out.println("The Base is \t"+this.base);
        System.out.println("The fleet_size is \t"+this.fleet_size);
        System.out.println("The destination is \t"+this.dest);
        System.out.println("The number of year is \t"+this.no_year_active);
        System.out.println("The cost is \t"+this.cost);
        System.out.println("The Status is \t"+this.status);
        System.out.println("The support contact is \t"+this.support_contact);
        System.out.println("The owner is \t"+this.owner);
    }
}


