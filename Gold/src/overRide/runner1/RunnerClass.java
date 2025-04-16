package overRide.runner1;

import com.xworkz.temple.overRiding.internal.Tea;
import overRide.internal.*;

public class RunnerClass {
    public static void main(String[] args) {


        Account account= new Account(1000, "Joint");
        System.out.println(account);
        Ambulance ambulance=new Ambulance(108,"White");
        System.out.println(ambulance);
        Animal animal=new Animal("Cat","Mammal");
        System.out.println(animal);
        Anthem anthem=new Anthem("National","India");
        System.out.println(anthem);
        Apartment apartment=new Apartment(4,"BTM");
        System.out.println(apartment);
        Bag bag=new Bag("Puma",2031);
        System.out.println(bag);
        Ball ball=new Ball("Plastic",false);
        System.out.println(ball);
        Bank bank=new Bank("ICICI","Challakere");
        System.out.println(bank);
        Bell bell=new Bell("SVVN",true);
        System.out.println(bell);
        Bike bike=new Bike("Sharanya","Hunter");
        System.out.println(bike);
        BlackBoard blackBoard=new BlackBoard("School",true);
        System.out.println(blackBoard);
        Boat boat=new Boat("Kayak","Yellow");
        System.out.println(boat);
        Bottle bottle=new Bottle(2,"Steel");
        System.out.println(bottle);
        Box box=new Box(4,"TupperWare");
        System.out.println(box);
        Branch branch=new Branch("AIML",4);
        System.out.println(branch);
        Bridge bridge=new Bridge("London",true);
        System.out.println(bridge);
        Brush brush=new Brush("ToothBrush",true);
        System.out.println(brush);
        Bucket bucket=new Bucket(10,"Pink");
        System.out.println(bucket);
        Building building=new Building("Cement","Nippon");
        System.out.println(building);
        Bungalow bungalow=new Bungalow(10000000,false);
        System.out.println(bungalow);
        Camera camera=new Camera("Nikon",100000);
        System.out.println(camera);
        Capital capital=new Capital("Goa",1580000);
        System.out.println(capital);
        Car car=new Car("Toyota",5);
        System.out.println(car);
        Card card=new Card("DebitCard",2000);
        System.out.println(card);
        Cat cat=new Cat("Persian","Black");
        System.out.println(cat);
        Chair chair=new Chair("Wooden",true);
        System.out.println(chair);
        Chef chef=new Chef("Akash",true);
        System.out.println(chef);
        Classroom classroom=new Classroom("E-Classroom",60);
        System.out.println(classroom);
        Clock clock=new Clock("Wall","Circle");
        System.out.println(clock);
        Cloud cloud=new Cloud(true,false);
        System.out.println(cloud);
        Cottage cottage=new Cottage("Wooden",2);
        System.out.println(cottage);
        Cup cup=new Cup("RCB",true);
        System.out.println(cup);
        Currency currency=new Currency(1000,"India");
        System.out.println(currency);
        Desk desk=new Desk("Wooden",2);
        System.out.println(desk);
        Doctor doctor=new Doctor("Dr.Jyothi","Dentist");
        System.out.println(doctor);
        Door door=new Door("Glass",2);
        System.out.println(door);
        Dress dress=new Dress(2,"LongSkirt");
        System.out.println(dress);
        Drum drum=new Drum("Bass",5);
        System.out.println(drum);
        Elevator elevator=new Elevator(10,"Passenger");
        System.out.println(elevator);
        Exam exam=new Exam("Science",100);
        System.out.println(exam);
        Eye eye=new Eye("Blue",true);
        System.out.println(eye);
        Fan fan=new Fan(true,"AtomBurg");
        System.out.println(fan);
        Fish fish=new Fish("Sucker Cat",3);
        System.out.println(fish);
        Flag flag=new Flag("India",4);
        System.out.println(flag);
        Flat flat=new Flat(1200,true);
        System.out.println(flat);
        FoodCourt foodCourt=new FoodCourt("Orion",30);
        System.out.println(foodCourt);
        Fountain fountain=new Fountain(50,false);
        System.out.println(fountain);
        Fruit fruit=new Fruit("Watermelon",true);
        System.out.println(fruit);
        Hair hair=new Hair("Straight","Black");
        System.out.println(hair);
        Hat hat=new Hat("White","Nike");
        System.out.println(hat);
        System.out.println("=======================================================");
        Home h=new Home();
        h.setArea("BTM");
        h.setSize(2400);
        System.out.println(h);
        Hospital h1=new Hospital();
        h1.setName("Fortis");
        h1.setNoOfBranches(4);
        System.out.println(h1);
        Instrument i=new Instrument();
        i.setCost(20000);
        i.setType("string");
        System.out.println(i);
        Key k=new Key();
        k.setGoodQuality(true);
        k.setNoOfKeys(6);
        System.out.println(k);
        Keyboard keyboard=new Keyboard();
        keyboard.setAnInstrument(true);
        keyboard.setBrand("Corsair");
        Kite kite=new Kite();
        kite.setColor("Yellow");
        kite.setSize(40);
        System.out.println(kite);
        Lamp l=new Lamp();
        l.setColor("Gold");
        l.setLength(20);
        System.out.println(l);
        Laptop l1=new Laptop();
        l1.setCost(900000);
        l1.setBrand("HP");
        System.out.println(l1);
        Library l2=new Library();
        l2.setMaintainsSilence(true);
        l2.setNoOfBooks(100000);
        System.out.println(l2);
        Lid lid=new Lid();
        lid.setType("Plastic");
        lid.setStrong(false);
        System.out.println(lid);
        Loan loan=new Loan();
        loan.setAmount(2500000);
        loan.setName("StudentLoan");
        System.out.println(loan);
        Mansion m=new Mansion();
        m.setBig(true);
        m.setNoOfFlats(20);
        System.out.println(m);
        Mirror m1=new Mirror();
        m1.setLength(200);
        m1.setShape("Rectangle");
        System.out.println(m1);
        Monument m2=new Monument();
        m2.setName("Red Fort");
        m2.setOld(true);
        System.out.println(m2);
        Mouse m3=new MouseType();
        m3.setBrand("Dell");
        m3.setGamingMouse(false);
        System.out.println(m3);
        Nurse n=new Nurse();
        n.setAge(60);
        n.setName("Sashi");
        System.out.println(n);
        Palace p=new Palace();
        p.setGrand(true);
        p.setName("Mysore Palace");
        System.out.println(p);
        Paper paper=new Paper();
        paper.setLength("a4");
        paper.setColor("White");
        System.out.println(paper);
        Park park=new Park();
        park.setBeautiful(true);
        park.setName("CityPark");
        System.out.println(park);
        Pen pen=new Pen();
        pen.setColor("Black");
        pen.setCost(5);
        System.out.println(pen);
        Pencil pencil=new Pencil();
        pencil.setColorPencil(true);
        pencil.setCost(50);
        System.out.println(pencil);
        Phone phone=new Phone();
        phone.setCost(50000);
        phone.setBrand("Samsung");
        System.out.println(phone);
        Planet planet=new Planet();
        planet.setLivingPlanet("Earth");
        planet.setNoOfPlanets(8);
        System.out.println(planet);
        Plate plate=new Plate();
        plate.setMaterial("Steel");
        plate.setShape("Circle");
        System.out.println(plate);
        President president=new President();
        president.setCountry("India");
        president.setName("Droupadi Murmu");
        System.out.println(president);
        Principal principal=new Principal();
        principal.setCollege("GEC,Challakere");
        principal.setName("M.M Benal");
        System.out.println(principal);
        Remote remote=new Remote();
        remote.setIsSmartRemote("true");
        remote.setType("TV");
        System.out.println(remote);
        Room room=new Room();
        room.setNoOfRooms(4);
        room.setSize(800);
        System.out.println(room);
        Shelf shelf=new Shelf();
        shelf.setRows(6);
        shelf.setMaterial("Iron");
        System.out.println(shelf);
        Shoe shoe=new Shoe();
        shoe.setBrand("Puma");
        shoe.setSize(6);
        System.out.println(shoe);
        Shop shop=new Shop();
        shop.setOpen(true);
        shop.setType("Grocery");
        System.out.println(shop);
        Snake snake=new Snake();
        snake.setSpecies("Serpent");
        snake.setLength(6.95);
        System.out.println(snake);
        Speaker speaker=new Speaker();
        speaker.setVolumeHigh(true);
        speaker.setBrand("Boat");
        System.out.println(speaker);
        Spoon spoon=new Spoon();
        spoon.setLength(10);
        spoon.setMaterial("Silver");
        System.out.println(spoon);
        Stone stone=new Stone();
        stone.setHard(false);
        stone.setWeight(2.5);
        System.out.println(stone);
        Store store=new Store();
        store.setName("Puma Outlet");
        store.setSize(2400.33);
        System.out.println(store);
        Street street=new Street();
        street.setName("Church Street");
        street.setNice(true);
        System.out.println(street);
        Student student=new Student();
        student.setName("Mahalakshmi");
        student.setUsn("abc123");
        System.out.println(student);
        Studio studio=new Studio();
        studio.setRecording(false);
        studio.setType("voice");
        System.out.println(studio);
        Table table=new Table();
        table.setName("Study Table");
        table.setNoOfPeopleCanSit(2);
        System.out.println(table);
        Teacher teacher=new Teacher();
        teacher.setName("John");
        teacher.setSchool("SVVN");
        System.out.println(teacher);
        Toy toy=new Toy();
        toy.setAnimalToy(true);
        toy.setMaterial("Soft");
        System.out.println(toy);
        TrafficLight trafficLight=new TrafficLight();
        trafficLight.setLightToStop("Red");
        trafficLight.setNoOfLights(3);
        System.out.println(trafficLight);
        Tree tree=new Tree();
        tree.setAge(50);
        tree.setName("Banyan");
        System.out.println(tree);
        Uniform uniform=new Uniform();
        uniform.setCode("Formals");
        uniform.setColors("white and Blue");
        System.out.println(uniform);
        Vehicle vehicle=new Vehicle();
        vehicle.setBrand("Ola");
        vehicle.setElectric(true);
        System.out.println(vehicle);
        Villa villa=new Villa();
        villa.setBig(true);
        villa.setIndependent(true);
        System.out.println(villa);
        Window window=new Window();
        window.setMaterial("Glass");
        window.setType("Sliding Window");
        System.out.println(window);
        Wire wire=new Wire();
        wire.setType("Aluminum");
        wire.setLength(20);
        System.out.println(wire);

    }
}
