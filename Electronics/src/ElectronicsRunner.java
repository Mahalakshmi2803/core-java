public class ElectronicsRunner {
    public static void main(String[] args) {
        Electronics e1=new Electronics();
        e1.display();
        Electronics e2=new Electronics(101,"Smartphone");
        e2.display();
        Electronics e3=new Electronics(102,"Laptop","Dell",75000);
        e3.display();
        Electronics e4=new Electronics(103,"Smart TV","Samsung",55000,"Entertainment",3);
        e4.display();
        Electronics e5=new Electronics(104,"Refrigerator","LG",40000,"Home Appliance",5,"Electric","Active");
        e5.display();
        Electronics e6=new Electronics(105,"Air Conditioner","Daikin",60000,"Cooling",4,"Electric","Active",1800123456L,"Daikin Industries");
        e6.display();
    }
}
