public class AirlineRunner {
    public static void main(String[] args) {
        Airline airline=new Airline();
        airline.display();
        Airline airline1=new Airline(100,"airindia");
        airline1.display();
        Airline airline2=new Airline(102,"nava bharatha","delhi",20);
        airline2.display();
        Airline airline3=new Airline(103,"air india","challakere",30,"Benglore",10);
        airline3.display();
        Airline airline4=new Airline(104,"new india","chitradurga",40,"Delhi",10,10000,"active");
        airline4.display();
        Airline airline5=new Airline(105,"our india","Benglore",50,"sri lanka",30,50000,"active",8105546615L,"Pruthvi");
        airline5.display();

    }
}

