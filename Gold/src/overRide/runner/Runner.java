package overRide.runner;


import overRide.internal.*;



public class Runner {

    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.hisses();
        Cat cat1=new CatPurrs();
        cat1.hisses();
        CatPurrs catPurrs=new CatPurrs();
        catPurrs.growls();
        catPurrs.hisses();

        Eye eye=new Eye();
        eye.lids();
        Eye eye1=new EyeLiner();
        eye1.lids();
        EyeLiner eyeLiner=new EyeLiner();
        eyeLiner.lids();
        eyeLiner.curler();

        Bag bag=new Bag();
        bag.store();
        Bag bag1=new BackPack();
        bag1.store();
        BackPack backPack=new BackPack();
        backPack.store();
        backPack.type();

        Paper paper=new Paper();
        paper.size();
        Paper paper1=new Book();
        paper1.size();
        Book book=new Book();
        book.size();
        book.use();

        Car car=new Car();
        car.drive();
        Car car1=new CarBrand();
        car1.drive();
        CarBrand carBrand=new CarBrand();
        carBrand.drive();
        carBrand.price();

        Dress dress=new Dress();
        dress.code();
        Dress dress1=new Formals();
        dress1.code();
        Formals formals=new Formals();
        formals.code();
        formals.wear();

        Bottle bottle= new Bottle();
        bottle.container();
        Bottle bottle1=new WaterBottle();
        bottle.container();
        WaterBottle waterBottle=new WaterBottle();
        waterBottle.container();
        waterBottle.litre();


        Hair hair=new Hair();
        hair.pin();
        Hair hair1=new HairStyle();
        hair1.pin();
        HairStyle hairStyle=new HairStyle();
        hairStyle.band();
        hairStyle.pin();


        Room room=new Room();
        room.living();
        Room room1=new RoomType();
        room1.living();
        RoomType roomType=new RoomType();
        roomType.roomName();
        roomType.living();


        Home home = new Home();
        home.base();
        Home home1 = new HomeType();
        home1.base();
        HomeType homeType = new HomeType();
        homeType.homeName();
        homeType.base();


        Flat flat = new Flat();
        flat.show();
        Flat flat1 = new FlatType();
        flat1.show();
        FlatType flatType = new FlatType();
        flatType.flatName();
        flatType.show();

        Villa villa = new Villa();
        villa.show();
        Villa villa1 = new VillaType();
        villa1.show();
        VillaType villaType = new VillaType();
        villaType.villaName();
        villaType.show();

        Apartment apt = new Apartment();
        apt.show();
        Apartment apt1 = new ApartmentType();
        apt1.show();
        ApartmentType aptType = new ApartmentType();
        aptType.apartmentName();
        aptType.show();

        Cottage cottage = new Cottage();
        cottage.show();
        Cottage cottage1 = new CottageType();
        cottage1.show();
        CottageType cottageType = new CottageType();
        cottageType.cottageName();
        cottageType.show();

        Studio studio = new Studio();
        studio.show();
        Studio studio1 = new StudioType();
        studio1.show();
        StudioType studioType = new StudioType();
        studioType.studioName();
        studioType.show();

        Bungalow bungalow = new Bungalow();
        bungalow.show();
        Bungalow bungalow1 = new BungalowType();
        bungalow1.show();
        BungalowType bungalowType = new BungalowType();
        bungalowType.bungalowName(); bungalowType.show();

        Mansion mansion = new Mansion();
        mansion.show();
        Mansion mansion1 = new MansionType();
        mansion1.show();
        MansionType mansionType = new MansionType();
        mansionType.mansionName();
        mansionType.show();


        Palace palace=new Palace();
        palace.show();
        Palace palace1=new PalaceType();
        palace1.show();
        PalaceType palaceType = new PalaceType();
        palaceType.show();
        palaceType.palaceName();

        Kite kite = new Kite();
        kite.show();
        Kite kite1 = new KiteType();
        kite1.show();
        KiteType kiteType = new KiteType();
        kiteType.kiteName();
        kiteType.show();

        Boat boat = new Boat();
        boat.show();
        Boat boat1 = new BoatType();
        boat1.show();
        BoatType boatType = new BoatType();
        boatType.boatName();
        boatType.show();

        Drum drum = new Drum();
        drum.show();
        Drum drum1 = new DrumType();
        drum1.show();
        DrumType drumType = new DrumType();
        drumType.drumName();
        drumType.show();

        Pen pen = new Pen();
        pen.show();
        Pen pen1 = new PenType();
        pen1.show();
        PenType penType = new PenType();
        penType.penName();
        penType.show();

        Cup cup = new Cup();
        cup.show();
        Cup cup1 = new CupType();
        cup1.show();
        CupType cupType = new CupType();
        cupType.cupName();
        cupType.show();

        Fan fan = new Fan();
        fan.show();
        Fan fan1 = new FanType();
        fan1.show();
        FanType fanType = new FanType();
        fanType.fanName();
        fanType.show();

        Chair chair = new Chair();
        chair.show();
        Chair chair1 = new ChairType();
        chair1.show();
        ChairType chairType = new ChairType();
        chairType.chairName();
        chairType.show();

        Box box = new Box();
        box.show();
        Box box1 = new BoxType();
        box1.show();
        BoxType boxType = new BoxType();
        boxType.boxName();
        boxType.show();



        Ball ball = new Ball();
        ball.show();
        Ball ball1 = new BallType();
        ball1.show();
        BallType ballType = new BallType();
        ballType.ballName();
        ballType.show();


        Tree tree = new Tree();
        tree.show();
        Tree tree1 = new TreeType();
        tree1.show();
        TreeType treeType = new TreeType();
        treeType.treeName();
        treeType.show();

        Stone stone = new Stone();
        stone.show();
        Stone stone1 = new StoneType();
        stone1.show();
        StoneType stoneType = new StoneType();
        stoneType.stoneName();
        stoneType.show();

        Cloud cloud = new Cloud();
        cloud.show();
        Cloud cloud1 = new CloudType();
        cloud1.show();
        CloudType cloudType = new CloudType();
        cloudType.cloudName();
        cloudType.show();

        Fish fish = new Fish();
        fish.show();
        Fish fish1 = new FishType();
        fish1.show();
        FishType fishType = new FishType();
        fishType.fishName();
        fishType.show();

        Shoe shoe = new Shoe();
        shoe.show();
        Shoe shoe1 = new ShoeType();
        shoe1.show();
        ShoeType shoeType = new ShoeType();
        shoeType.shoeName();
        shoeType.show();

        Lamp lamp = new Lamp();
        lamp.show();
        Lamp lamp1 = new LampType();
        lamp1.show();
        LampType lampType = new LampType();
        lampType.lampName();
        lampType.show();

        Hat hat = new Hat();
        hat.show();
        Hat hat1 = new HatType();
        hat1.show();
        HatType hatType = new HatType();
        hatType.hatName();
        hatType.show();

        Bike bike = new Bike();
        bike.show();
        Bike bike1 = new BikeType();
        bike1.show();
        BikeType bikeType = new BikeType();
        bikeType.bikeName();
        bikeType.show();

        Snake snake = new Snake();
        snake.show();
        Snake snake1 = new SnakeType();
        snake1.show();
        SnakeType snakeType = new SnakeType();
        snakeType.snakeName();
        snakeType.show();

        Key key=new Key();
        key.show();
        Key key1=new KeyType();
        key1.show();
        KeyType keyType=new KeyType();
        keyType.keyName();
        keyType.show();

        Mouse mouse=new Mouse();
        mouse.show();
        Mouse mouse1=new MouseType();
        mouse1.show();
        MouseType mouseType=new MouseType();
        mouseType.mouseName();
        mouseType.show();

        Lid lid=new Lid();
        lid.show();
        Lid lid1=new LidType();
        lid1.show();
        LidType lidType=new LidType();
        lidType.lidName();
        lidType.show();

        Wire wire=new Wire();
        wire.show();
        Wire wire1=new WireType();
        wire1.show();
        WireType wireType=new WireType();
        wireType.wireName();
        wireType.show();


        Mirror mirror = new Mirror();
        mirror.show();
        Mirror mirror1 = new DressingMirror();
        mirror1.show();
        DressingMirror dressingMirror = new DressingMirror();
        dressingMirror.mirrorName();
        dressingMirror.show();



        Remote remote = new Remote();
        remote.show();
        Remote remote1 = new TVRemote();
        remote1.show();
        TVRemote tvRemote = new TVRemote();
        tvRemote.remoteName();
        tvRemote.show();

        Door door = new Door();
        door.show();
        Door door1 = new SlidingDoor();
        door1.show();
        SlidingDoor slidingDoor = new SlidingDoor();
        slidingDoor.doorName();
        slidingDoor.show();

        Keyboard keyboard = new Keyboard();
        keyboard.show();
        Keyboard keyboard1 = new MechanicalKeyboard();
        keyboard1.show();
        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        mechanicalKeyboard.keyboardName();
        mechanicalKeyboard.show();

        Shelf shelf = new Shelf();
        shelf.show();
        Shelf shelf1 = new KitchenShelf();
        shelf1.show();
        KitchenShelf kitchenShelf = new KitchenShelf();
        kitchenShelf.shelfName();
        kitchenShelf.show();

        Speaker speaker = new Speaker();
        speaker.show();
        Speaker speaker1 = new BluetoothSpeaker();
        speaker1.show();
        BluetoothSpeaker bluetoothSpeaker = new BluetoothSpeaker();
        bluetoothSpeaker.speakerName();
        bluetoothSpeaker.show();

        Window window = new Window();
        window.show();
        Window window1 = new SlidingWindow();
        window1.show();
        SlidingWindow slidingWindow = new SlidingWindow();
        slidingWindow.windowName();
        slidingWindow.show();

        Brush brush = new Brush();
        brush.show();
        Brush brush1 = new PaintBrush();
        brush1.show();
        PaintBrush paintBrush = new PaintBrush();
        paintBrush.brushName();
        paintBrush.show();

        Clock clock = new Clock();
        clock.show();
        Clock clock1 = new WallClock();
        clock1.show();
        WallClock wallClock = new WallClock();
        wallClock.clockName();
        wallClock.show();

        Bucket bucket = new Bucket();
        bucket.show();
        Bucket bucket1 = new SteelBucket();
        bucket1.show();
        SteelBucket steelBucket = new SteelBucket();
        steelBucket.bucketName();
        steelBucket.show();

        Animal animal = new Animal();
        animal.show();
        Animal animal1 = new PetAnimal();
        animal1.show();
        PetAnimal petAnimal = new PetAnimal();
        petAnimal.animalName();
        petAnimal.show();

        Planet planet = new Planet();
        planet.show();
        Planet planet1 = new GasPlanet();
        planet1.show();
        GasPlanet gasPlanet = new GasPlanet();
        gasPlanet.planetName();
        gasPlanet.show();

        Table table = new Table();
        table.show();
        Table table1 = new DiningTable();
        table1.show();
        DiningTable diningTable = new DiningTable();
        diningTable.tableName();
        diningTable.show();

        Toy toy = new Toy();
        toy.show();
        Toy toy1 = new SoftToy();
        toy1.show();
        SoftToy softToy = new SoftToy();
        softToy.toyName();
        softToy.show();

        Vehicle vehicle = new Vehicle();
        vehicle.show();
        Vehicle vehicle1 = new ElectricVehicle();
        vehicle1.show();
        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.vehicleName();
        electricVehicle.show();

        Pencil pencil = new Pencil();
        pencil.show();
        Pencil pencil1 = new ColorPencil();
        pencil1.show();
        ColorPencil colorPencil = new ColorPencil();
        colorPencil.pencilName();
        colorPencil.show();

        Camera camera = new Camera();
        camera.show();
        Camera camera1 = new DigitalCamera();
        camera1.show();
        DigitalCamera digitalCamera = new DigitalCamera();
        digitalCamera.cameraName();
        digitalCamera.show();

        Fruit fruit=new Fruit();
        fruit.show();
        Fruit fruit1=new CitrusFruit();
        fruit1.show();
        CitrusFruit citrusFruit=new CitrusFruit();
        citrusFruit.fruitName();
        citrusFruit.show();

        Laptop laptop=new Laptop();
        laptop.show();
        Laptop laptop1=new Laptop();
        laptop1.show();
        GamingLaptop gamingLaptop=new GamingLaptop();
        gamingLaptop.laptopName();
        gamingLaptop.show();


        Instrument instrument = new Instrument();
        instrument.show();
        Instrument instrument1 = new Guitar();
        instrument1.show();
        Guitar guitar = new Guitar();
        guitar.instrumentName();
        guitar.show();



        Desk desk = new Desk();
        desk.show();
        Desk desk1 = new StandingDesk();
        desk1.show();
        StandingDesk standingDesk = new StandingDesk();
        standingDesk.deskName();
        standingDesk.show();

        Chef chef = new Chef();
        chef.show();
        Chef chef1 = new HeadChef();
        chef1.show();
        HeadChef headChef = new HeadChef();
        headChef.chefName();
        headChef.show();


        Exam exam = new Exam();
        exam.show();
        Exam exam1 = new FinalExam();
        exam1.show();
        FinalExam finalExam = new FinalExam();
        finalExam.examType();
        finalExam.show();

        RoomService rs = new RoomService();
        rs.show();
        RoomService rs1 = new LuxuryRoomService();
        rs1.show();
        LuxuryRoomService luxuryRoomService = new LuxuryRoomService();
        luxuryRoomService.serviceName();
        luxuryRoomService.show();

        Uniform uniform = new Uniform();
        uniform.show();
        Uniform uniform1 = new SportsUniform();
        uniform1.show();
        SportsUniform sportsUniform = new SportsUniform();
        sportsUniform.uniformType();
        sportsUniform.show();

        Bell bell = new Bell();
        bell.show();
        Bell bell1 = new ElectronicBell();
        bell1.show();
        ElectronicBell electronicBell = new ElectronicBell();
        electronicBell.bellType();
        electronicBell.show();

        BlackBoard blackBoard = new BlackBoard();
        blackBoard.show();
        BlackBoard blackBoard1 = new SmartBoard();
        blackBoard1.show();
        SmartBoard smartBoard = new SmartBoard();
        smartBoard.boardType();
        smartBoard.show();

        Principal principal = new Principal();
        principal.show();
        Principal principal1 = new VicePrincipal();
        principal1.show();
        VicePrincipal vicePrincipal = new VicePrincipal();
        vicePrincipal.roleName();
        vicePrincipal.show();

        Library library = new Library();
        library.show();
        Library library1 = new DigitalLibrary();
        library1.show();
        DigitalLibrary digitalLibrary = new DigitalLibrary();
        digitalLibrary.libraryType();
        digitalLibrary.show();

        Classroom classroom = new Classroom();
        classroom.show();
        Classroom classroom1 = new ScienceClassroom();
        classroom1.show();
        ScienceClassroom scienceClassroom = new ScienceClassroom();
        scienceClassroom.classroomName();
        scienceClassroom.show();


        Teacher teacher = new Teacher();
        teacher.show();
        Teacher teacher1 = new MathTeacher();
        teacher1.show();
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.subjectName();
        mathTeacher.show();

        Student student = new Student();
        student.show();
        Student student1 = new HighSchoolStudent();
        student1.show();
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
        highSchoolStudent.studentType();
        highSchoolStudent.show();

        Street street = new Street();
        street.show();
        Street street1 = new MainStreet();
        street1.show();
        MainStreet mainStreet = new MainStreet();
        mainStreet.streetType();
        mainStreet.show();

        Park park = new Park();
        park.show();
        Park park1 = new CityPark();
        park1.show();
        CityPark cityPark = new CityPark();
        cityPark.parkType();
        cityPark.show();

        Bridge bridge = new Bridge();
        bridge.show();
        Bridge bridge1 = new SuspensionBridge();
        bridge1.show();
        SuspensionBridge suspensionBridge = new SuspensionBridge();
        suspensionBridge.bridgeType();
        suspensionBridge.show();

        Shop shop = new Shop();
        shop.show();
        Shop shop1 = new GroceryStore();
        shop1.show();
        GroceryStore groceryStore = new GroceryStore();
        groceryStore.shopType();
        groceryStore.show();

        Monument monument = new Monument();
        monument.show();
        Monument monument1 = new CityMonument();
        monument1.show();
        CityMonument cityMonument = new CityMonument();
        cityMonument.monumentType();
        cityMonument.show();

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.show();
        TrafficLight trafficLight1 = new SmartTrafficLight();
        trafficLight1.show();
        SmartTrafficLight smartTrafficLight = new SmartTrafficLight();
        smartTrafficLight.lightType();
        smartTrafficLight.show();

        Fountain fountain = new Fountain();
        fountain.show();
        Fountain fountain1 = new MusicalFountain();
        fountain1.show();
        MusicalFountain musicalFountain = new MusicalFountain();
        musicalFountain.fountainType();
        musicalFountain.show();

        Hospital hospital = new Hospital();
        hospital.show();
        Hospital hospital1 = new CityHospital();
        hospital1.show();
        CityHospital cityHospital = new CityHospital();
        cityHospital.hospitalType();
        cityHospital.show();

        Building building = new Building();
        building.show();
        Building building1 = new Skyscraper();
        building1.show();
        Skyscraper skyscraper = new Skyscraper();
        skyscraper.buildingType();
        skyscraper.show();

        Flag flag = new Flag();
        flag.show();
        Flag flag1 = new NationalFlag();
        flag1.show();
        NationalFlag nationalFlag = new NationalFlag();
        nationalFlag.flagType();
        nationalFlag.show();

        President president = new President();
        president.show();
        President president1 = new CountryPresident();
        president1.show();
        CountryPresident countryPresident = new CountryPresident();
        countryPresident.role();
        countryPresident.show();

        Currency currency = new Currency();
        currency.show();
        Currency currency1 = new NationalCurrency();
        currency1.show();
        NationalCurrency nationalCurrency = new NationalCurrency();
        nationalCurrency.currencyType();
        nationalCurrency.show();

        Capital capital = new Capital();
        capital.show();
        Capital capital1 = new NationalCapital();
        capital1.show();
        NationalCapital nationalCapital = new NationalCapital();
        nationalCapital.capitalName();
        nationalCapital.show();

        Anthem anthem = new Anthem();
        anthem.show();
        Anthem anthem1 = new NationalAnthem();
        anthem1.show();
        NationalAnthem nationalAnthem = new NationalAnthem();
        nationalAnthem.anthemName();
        nationalAnthem.show();

        Card card = new Card();
        card.show();
        Card card1 = new CreditCard();
        card1.show();
        CreditCard creditCard = new CreditCard();
        creditCard.cardType();
        creditCard.show();

        Loan loan = new Loan();
        loan.show();
        Loan loan1 = new HomeLoan();
        loan1.show();
        HomeLoan homeLoan = new HomeLoan();
        homeLoan.loanType();
        homeLoan.show();

        Account account = new Account();
        account.show();
        Account account1 = new SavingsAccount();
        account1.show();
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.accountType();
        savingsAccount.show();

        Bank bank = new Bank();
        bank.show();
        Bank bank1 = new NationalBank();
        bank1.show();
        NationalBank nationalBank = new NationalBank();
        nationalBank.bankName();
        nationalBank.show();

        Branch branch = new Branch();
        branch.show();
        Branch branch1 = new LocalBranch();
        branch1.show();
        LocalBranch localBranch = new LocalBranch();
        localBranch.branchType();
        localBranch.show();

        Store store = new Store();
        store.show();
        Store store1 = new ClothingStore();
        store1.show();
        ClothingStore clothingStore = new ClothingStore();
        clothingStore.storeType();
        clothingStore.show();

        FoodCourt fc = new FoodCourt();
        fc.show();
        FoodCourt fc1 = new FastFood();
        fc1.show();
        FastFood fastFood = new FastFood();
        fastFood.foodType();
        fastFood.show();

        Elevator elevator = new Elevator();
        elevator.show();
        Elevator elevator1 = new SmartElevator();
        elevator1.show();
        SmartElevator smartElevator = new SmartElevator();
        smartElevator.elevatorFeature();
        smartElevator.show();

        Doctor doctor = new Doctor();
        doctor.show();
        Doctor doctor1 = new Surgeon();
        doctor1.show();
        Surgeon surgeon = new Surgeon();
        surgeon.specialization();
        surgeon.show();

        Nurse nurse = new Nurse();
        nurse.show();
        Nurse nurse1 = new HeadNurse();
        nurse1.show();
        HeadNurse headNurse = new HeadNurse();
        headNurse.role();
        headNurse.show();

        Ambulance ambulance = new Ambulance();
        ambulance.show();
        Ambulance ambulance1 = new EmergencyAmbulance();
        ambulance1.show();
        EmergencyAmbulance emergencyAmbulance = new EmergencyAmbulance();
        emergencyAmbulance.service();
        emergencyAmbulance.show();

        Phone phone=new Phone();
        phone.show();
        Phone phone1=new PhoneType();
        phone1.show();
        PhoneType phoneType=new PhoneType();
        phoneType.phoneName();
        phoneType.show();

        Plate plate=new Plate();
        plate.show();
        Plate plate1=new PlateType();
        plate1.show();
        PlateType plateType=new PlateType();
        plateType.plateName();
        plateType.show();

        Spoon spoon=new Spoon();
        spoon.show();
        Spoon spoon1=new SpoonType();
        spoon1.show();
        SpoonType spoonType=new SpoonType();
        spoonType.spoonName();
        spoonType.show();




    }
}
