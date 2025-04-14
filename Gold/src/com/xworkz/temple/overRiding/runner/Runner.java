package com.xworkz.temple.overRiding.runner;

import com.xworkz.temple.overRiding.internal.*;

public class Runner {

    public static void main(String[] args) {

        TV tv = new TV();
        tv.usetv();
        TV ptv = new ProTv();
        ptv.usetv();
        ProTv proTv = new ProTv();
        proTv.usetv();
        proTv.maintaintv();
        SonyTV sonyTV = new SonyTV();
        sonyTV.show(tv);
        sonyTV.show(proTv);
        System.out.println("===============================================================");
        Cream c = new Cream();
        c.useCream();
        Cream cc = new ChocolateCream();
        cc.useCream();
        ChocolateCream chocolate = new ChocolateCream();
        chocolate.useCream();
        chocolate.flavorInfo();
        Dessert dessert = new Dessert();
        dessert.serve(c);
        dessert.serve(chocolate);
        System.out.println("===============================================================");
        Seat s = new Seat();
        s.use();
        Seat ch = new Chair();
        ch.use();
        Chair chair = new Chair();
        chair.use();
        chair.maintain();
        ChairUser user = new ChairUser();
        user.show(s);
        user.show(chair);
        System.out.println("===============================================================");
        Cat c1 = new Cat();
        c1.use();
        Cat pc = new PersianCat();
        pc.use();
        PersianCat persian = new PersianCat();
        persian.use();
        persian.purr();
        Pet pet = new Pet();
        pet.show(c1);
        pet.show(persian);
        System.out.println("===============================================================");
        Rat r = new Rat();
        r.use();
        Rat lr = new LabRat();
        lr.use();
        LabRat lab = new LabRat();
        lab.use();
        lab.test();
        Research research = new Research();
        research.show(r);
        research.show(lab);
        System.out.println("===============================================================");
        Mat m = new Mat();
        m.use();
        Mat ym = new YogaMat();
        ym.use();
        YogaMat yoga = new YogaMat();
        yoga.use();
        yoga.rollUp();
        Workout workout = new Workout();
        workout.show(m);
        workout.show(yoga);
        System.out.println("===============================================================");
        Bottle b = new Bottle();
        b.use();
        Bottle wb = new WaterBottle();
        wb.use();
        WaterBottle water = new WaterBottle();
        water.use();
        water.fill();
        Container container = new Container();
        container.show(b);
        container.show(water);
        System.out.println("===============================================================");
        Bed bed = new Bed();
        bed.use();
        Bed db = new DoubleBed();
        db.use();
        DoubleBed doubleBed = new DoubleBed();
        doubleBed.use();
        doubleBed.spreadSheet();
        Bedroom bedroom = new Bedroom();
        bedroom.show(bed);
        bedroom.show(doubleBed);
        System.out.println("===============================================================");
        Key k = new Key();
        k.use();
        Key ck = new CarKey();
        ck.use();
        CarKey car = new CarKey();
        car.use();
        car.unlock();
        Security security = new Security();
        security.show(k);
        security.show(car);
        System.out.println("===============================================================");
        Desk d = new Desk();
        d.use();
        Desk od = new OfficeDesk();
        od.use();
        OfficeDesk office = new OfficeDesk();
        office.use();
        office.lockDrawer();
        Workplace workplace = new Workplace();
        workplace.show(d);
        workplace.show(office);
        System.out.println("===============================================================");
        Fan f = new Fan();
        f.use();
        Fan cf = new CeilingFan();
        cf.use();
        CeilingFan ceiling = new CeilingFan();
        ceiling.use();
        ceiling.rotate();
        Appliance appliance = new Appliance();
        appliance.show(f);
        appliance.show(ceiling);
        System.out.println("===============================================================");
        Table t = new Table();
        t.use();
        Table wt = new WoodenTable();
        wt.use();
        WoodenTable wooden = new WoodenTable();
        wooden.use();
        wooden.polish();
        Furniture furniture = new Furniture();
        furniture.show(t);
        furniture.show(wooden);
        System.out.println("===============================================================");
        Door d1 = new Door();
        d1.use();
        Door d2 = new SmartDoor();
        d2.use();
        SmartDoor sd = new SmartDoor();
        sd.use();
        sd.autoLock();
        DoorUser du = new DoorUser();
        du.show(d1);
        du.show(sd);
        System.out.println("===============================================================");
        Jet j1 = new Jet();
        j1.fly();
        Jet j2 = new FighterJet();
        j2.fly();
        FighterJet fj = new FighterJet();
        fj.fly();
        fj.attack();
        JetOperator jo = new JetOperator();
        jo.show(j1);
        jo.show(fj);
        System.out.println("===============================================================");
        Aeroplane a1 = new Aeroplane();
        a1.fly();
        Aeroplane a2 = new PassengerPlane();
        a2.fly();
        PassengerPlane pp = new PassengerPlane();
        pp.fly();
        pp.serveFood();
        AeroplaneUser au = new AeroplaneUser();
        au.show(a1);
        au.show(pp);
        System.out.println("===============================================================");
        Doctor doc1 = new Doctor();
        doc1.diagnose();
        Doctor doc2 = new Surgeon();
        doc2.diagnose();
        Surgeon surg = new Surgeon();
        surg.diagnose();
        surg.performSurgery();
        DoctorAssistant da = new DoctorAssistant();
        da.show(doc1);
        da.show(surg);

        System.out.println("===============================");
        Engineer e1 = new Engineer();
        e1.design();
        Engineer e2 = new SoftwareEngineer();
        e2.design();
        SoftwareEngineer se = new SoftwareEngineer();
        se.design();
        se.writeCode();
        EngineerManager em = new EngineerManager();
        em.show(e1);
        em.show(se);

        System.out.println("=================================");
        Lawyer l1 = new Lawyer();
        l1.defend();
        Lawyer l2 = new CriminalLawyer();
        l2.defend();
        CriminalLawyer cl = new CriminalLawyer();
        cl.defend();
        cl.crossExamine();
        LawyerAssistant la = new LawyerAssistant();
        la.show(l1);
        la.show(cl);

        System.out.println("===============================");
        FlipFlop f1 = new FlipFlop();
        f1.wear();
        FlipFlop f2 = new RubberFlipFlop();
        f2.wear();
        RubberFlipFlop rf = new RubberFlipFlop();
        rf.wear();
        rf.stretch();
        FlipFlopUser fu = new FlipFlopUser();
        fu.show(f1);
        fu.show(rf);
        System.out.println("=================================");
        Mirror m1 = new Mirror();
        m1.reflect();
        Mirror m2 = new DecorativeMirror();
        m2.reflect();
        DecorativeMirror dm1 = new DecorativeMirror();
        dm1.reflect();
        dm1.shine();
        MirrorUser mu = new MirrorUser();
        mu.show(m1);
        mu.show(dm1);
        System.out.println("====================================");
        Car car1 = new Car();
        car1.drive();
        Car car2 = new SportsCar();
        car2.drive();
        SportsCar sc = new SportsCar();
        sc.drive();
        sc.turboBoost();
        CarDriver cd = new CarDriver();
        cd.show(car1);
        cd.show(sc);

        System.out.println("====================================");
        Bus b1 = new Bus();
        b1.drive();
        Bus b2 = new DoubleDeckerBus();
        b2.drive();
        DoubleDeckerBus ddb = new DoubleDeckerBus();
        ddb.drive();
        ddb.openTopDeck();
        BusDriver bd = new BusDriver();
        bd.show(b1);
        bd.show(ddb);

        System.out.println("=================================");
        Driver driver1 = new Driver();
        driver1.drive();
        Driver driver2 = new TaxiDriver();
        driver2.drive();
        TaxiDriver td = new TaxiDriver();
        td.drive();
        td.pickUpPassenger();
        DriverManager dm = new DriverManager();
        dm.show(driver1);
        dm.show(td);
        System.out.println("=================================");

        Window w1 = new Window();
        w1.open();
        Window w2 = new SlidingWindow();
        w2.open();
        SlidingWindow sw = new SlidingWindow();
        sw.open();
        sw.lock();
        WindowUser wu = new WindowUser();
        wu.show(w1);
        wu.show(sw);
        System.out.println("===============================================================");

        Scooty s1 = new Scooty();
        s1.ride();
        Scooty s2 = new ElectricScooty();
        s2.ride();
        ElectricScooty es = new ElectricScooty();
        es.ride();
        es.charge();
        ScootyUser su = new ScootyUser();
        su.show(s1);
        su.show(es);
        System.out.println("===============================================================");


        Hotel h1 = new Hotel();
        h1.serve();
        Hotel h2 = new FiveStarHotel();
        h2.serve();
        FiveStarHotel fh = new FiveStarHotel();
        fh.serve();
        fh.spa();
        HotelUser hu = new HotelUser();
        hu.show(h1);
        hu.show(fh);
        System.out.println("===============================================================");


        Hospital ho1 = new Hospital();
        ho1.treat();
        Hospital ho2 = new MultiSpecialityHospital();
        ho2.treat();
        MultiSpecialityHospital mh = new MultiSpecialityHospital();
        mh.treat();
        mh.emergency();
        HospitalUser hpu = new HospitalUser();
        hpu.show(ho1);
        hpu.show(mh);
        System.out.println("===============================================================");


        School sc1 = new School();
        sc1.educate();
        School sc2 = new HighSchool();
        sc2.educate();
        HighSchool hs = new HighSchool();
        hs.educate();
        hs.sportsDay();
        SchoolUser scu = new SchoolUser();
        scu.show(sc1);
        scu.show(hs);
        System.out.println("===============================================================");


        College college1 = new College();
        college1.lecture();
        College c2 = new EngineeringCollege();
        c2.lecture();
        EngineeringCollege ec = new EngineeringCollege();
        ec.lecture();
        ec.labSession();
        CollegeUser cu = new CollegeUser();
        cu.show(college1);
        cu.show(ec);
        System.out.println("===============================================================");


        Principal p1 = new Principal();
        p1.manage();
        Principal p2 = new SchoolPrincipal();
        p2.manage();
        SchoolPrincipal sp = new SchoolPrincipal();
        sp.manage();
        sp.supervise();
        PrincipalUser pu = new PrincipalUser();
        pu.show(p1);
        pu.show(sp);
        System.out.println("===============================================================");


        Coat co1 = new Coat();
        co1.wear();
        Coat co2 = new WinterCoat();
        co2.wear();
        WinterCoat wc = new WinterCoat();
        wc.wear();
        wc.zipUp();
        CoatUser cou = new CoatUser();
        cou.show(co1);
        cou.show(wc);
        System.out.println("===============================================================");


        Tshirt t1 = new Tshirt();
        t1.wear();
        Tshirt t2 = new PrintedTshirt();
        t2.wear();
        PrintedTshirt pt = new PrintedTshirt();
        pt.wear();
        pt.showDesign();
        TshirtUser tu = new TshirtUser();
        tu.show(t1);
        tu.show(pt);
        System.out.println("===============================================================");


        Pant pa1 = new Pant();
        pa1.wear();
        Pant pa2 = new Jeans();
        pa2.wear();
        Jeans j = new Jeans();
        j.wear();
        j.matchShirt();
        PantUser pu2 = new PantUser();
        pu2.show(pa1);
        pu2.show(j);
        System.out.println("===============================================================");


        Bag bag = new Bag();
        bag.use();
        Bag schoolBag = new SchoolBag();
        schoolBag.use();
        SchoolBag sb = new SchoolBag();
        sb.use();
        sb.carrySnacks();
        BagUser bagUser = new BagUser();
        bagUser.show(bag);
        bagUser.show(sb);
        System.out.println("===============================================================");


        Cover cover = new Cover();
        cover.protect();
        Cover mobileCover = new MobileCover();
        mobileCover.protect();
        MobileCover mc = new MobileCover();
        mc.protect();
        mc.personalize();
        CoverUser coverUser = new CoverUser();
        coverUser.show(cover);
        coverUser.show(mc);
        System.out.println("===============================================================");


        Sheet sheet = new Sheet();
        sheet.place();
        Sheet bedSheet = new BedSheet();
        bedSheet.place();
        BedSheet bs = new BedSheet();
        bs.place();
        bs.iron();
        SheetUser sheetUser = new SheetUser();
        sheetUser.show(sheet);
        sheetUser.show(bs);
        System.out.println("===============================================================");


        Book book = new Book();
        book.open();
        Book novel = new Novel();
        novel.open();
        Novel nvl = new Novel();
        nvl.open();
        nvl.readChapter();
        BookUser bookUser = new BookUser();
        bookUser.show(book);
        bookUser.show(nvl);
        System.out.println("===============================================================");


        Paper paper = new Paper();
        paper.scribble();
        Paper ruledPaper = new RuledPaper();
        ruledPaper.scribble();
        RuledPaper rp = new RuledPaper();
        rp.scribble();
        rp.erase();
        PaperUser paperUser = new PaperUser();
        paperUser.show(paper);
        paperUser.show(rp);
        System.out.println("===============================================================");


        Pen pen = new Pen();
        pen.draw();
        Pen ballPen = new BallPen();
        ballPen.draw();
        BallPen bp = new BallPen();
        bp.draw();
        bp.inkCheck();
        PenUser penUser = new PenUser();
        penUser.show(pen);
        penUser.show(bp);
        System.out.println("===============================================================");


        Pencil pencil = new Pencil();
        pencil.draw();
        Pencil hbPencil = new HBPencil();
        hbPencil.draw();
        HBPencil hb = new HBPencil();
        hb.draw();
        hb.sharpen();
        PencilUser pencilUser = new PencilUser();
        pencilUser.show(pencil);
        pencilUser.show(hb);
        System.out.println("===============================================================");


        Sharpener sharpener = new Sharpener();
        sharpener.sharpenPencil();
        Sharpener metalSharpener = new MetalSharpener();
        metalSharpener.sharpenPencil();
        MetalSharpener ms = new MetalSharpener();
        ms.sharpenPencil();
        ms.oilBlades();
        SharpenerUser sharpenerUser = new SharpenerUser();
        sharpenerUser.show(sharpener);
        sharpenerUser.show(ms);
        System.out.println("===============================================================");


        Bill bill = new Bill();
        bill.generate();
        Bill groceryBill = new GroceryBill();
        groceryBill.generate();
        GroceryBill gb = new GroceryBill();
        gb.generate();
        gb.applyDiscounts();
        BillUser billUser = new BillUser();
        billUser.show(bill);
        billUser.show(gb);
        System.out.println("===============================================================");


        Mall mall = new Mall();
        mall.visit();
        Mall megaMall = new MegaMall();
        megaMall.visit();
        MegaMall mm = new MegaMall();
        mm.visit();
        mm.movieTheater();
        MallUser mallUser = new MallUser();
        mallUser.show(mall);
        mallUser.show(mm);
        System.out.println("===============================================================");


        Lock lock1 = new Lock();
        lock1.secure();
        Lock lock2 = new DigitalLock();
        lock2.secure();
        DigitalLock digitalLock = new DigitalLock();
        digitalLock.secure();
        digitalLock.scanFingerprint();
        LockUser lockUser = new LockUser();
        lockUser.show(lock1);
        lockUser.show(digitalLock);
        System.out.println("===============================================================");

        Towel towel1 = new Towel();
        towel1.wipe();
        Towel towel2 = new BathTowel();
        towel2.wipe();
        BathTowel bathTowel = new BathTowel();
        bathTowel.wipe();
        bathTowel.absorbWater();
        TowelUser towelUser = new TowelUser();
        towelUser.show(towel1);
        towelUser.show(bathTowel);
        System.out.println("===============================================================");

        Lipstick lipstick1 = new Lipstick();
        lipstick1.apply();
        Lipstick lipstick2 = new MatteLipstick();
        lipstick2.apply();
        MatteLipstick matteLipstick = new MatteLipstick();
        matteLipstick.apply();
        matteLipstick.setLongLasting();
        LipstickUser lipstickUser = new LipstickUser();
        lipstickUser.show(lipstick1);
        lipstickUser.show(matteLipstick);
        System.out.println("===============================================================");

        Kit kit1 = new Kit();
        kit1.use();
        Kit kit2 = new FirstAidKit();
        kit2.use();
        FirstAidKit firstAidKit = new FirstAidKit();
        firstAidKit.use();
        firstAidKit.applyBandage();
        KitUser kitUser = new KitUser();
        kitUser.show(kit1);
        kitUser.show(firstAidKit);
        System.out.println("===============================================================");

        Charger charger1 = new Charger();
        charger1.charge();
        Charger charger2 = new FastCharger();
        charger2.charge();
        FastCharger fastCharger = new FastCharger();
        fastCharger.charge();
        fastCharger.quickCharge();
        ChargerUser chargerUser = new ChargerUser();
        chargerUser.show(charger1);
        chargerUser.show(fastCharger);
        System.out.println("===============================================================");

        Sunglasses sg1 = new Sunglasses();
        sg1.wear();
        Sunglasses sg2 = new PolarizedSunglasses();
        sg2.wear();
        PolarizedSunglasses polarized = new PolarizedSunglasses();
        polarized.wear();
        polarized.reduceGlare();
        SunglassesUser sunglassesUser = new SunglassesUser();
        sunglassesUser.show(sg1);
        sunglassesUser.show(polarized);
        System.out.println("===============================================================");

        Sun sun1 = new Sun();
        sun1.shine();
        Sun sun2 = new RedGiantSun();
        sun2.shine();
        RedGiantSun redGiant = new RedGiantSun();
        redGiant.shine();
        redGiant.expand();
        SunUser sunUser = new SunUser();
        sunUser.show(sun1);
        sunUser.show(redGiant);
        System.out.println("===============================================================");

        Moon moon1 = new Moon();
        moon1.glow();
        Moon moon2 = new FullMoon();
        moon2.glow();
        FullMoon fullMoon = new FullMoon();
        fullMoon.glow();
        fullMoon.shineBrightly();
        MoonUser moonUser = new MoonUser();
        moonUser.show(moon1);
        moonUser.show(fullMoon);
        System.out.println("===============================================================");

        Star star1 = new Star();
        star1.twinkle();
        Star star2 = new ShootingStar();
        star2.twinkle();
        ShootingStar shootingStar = new ShootingStar();
        shootingStar.twinkle();
        shootingStar.shootAcrossSky();
        StarUser starUser = new StarUser();
        starUser.show(star1);
        starUser.show(shootingStar);
        System.out.println("===============================================================");

        Toy toy1 = new Toy();
        toy1.play();
        Toy toy2 = new SoftToy();
        toy2.play();
        SoftToy softToy = new SoftToy();
        softToy.play();
        softToy.cuddle();
        ToyUser toyUser = new ToyUser();
        toyUser.show(toy1);
        toyUser.show(softToy);
        System.out.println("===============================================================");

        Hanger hanger1 = new Hanger();
        hanger1.hangClothes();
        Hanger hanger2 = new WoodenHanger();
        hanger2.hangClothes();
        WoodenHanger clothesHanger = new WoodenHanger();
        clothesHanger.hangClothes();
        clothesHanger.polish();
        HangerUser hangerUser = new HangerUser();
        hangerUser.show(hanger1);
        hangerUser.show(clothesHanger);
        System.out.println("===============================================================");

                Sticker sticker1 = new Sticker();
                sticker1.stick();
                Sticker sticker2 = new WallSticker();
                sticker2.stick();
                WallSticker wallSticker = new WallSticker();
                wallSticker.stick();
                wallSticker.decorate();
                StickerUser stickerUser = new StickerUser();
                stickerUser.show(sticker1);
                stickerUser.show(wallSticker);
                System.out.println("===============================================================");

                Color color1 = new Color();
                color1.fill();
                Color color2 = new WaterColor();
                color2.fill();
                WaterColor waterColor = new WaterColor();
                waterColor.fill();
                waterColor.spread();
                ColorUser colorUser = new ColorUser();
                colorUser.show(color1);
                colorUser.show(waterColor);
                System.out.println("===============================================================");

                Paint paint1 = new Paint();
                paint1.apply();
                Paint paint2 = new SprayPaint();
                paint2.apply();
                SprayPaint sprayPaint = new SprayPaint();
                sprayPaint.apply();
                sprayPaint.spray();
                PaintUser paintUser = new PaintUser();
                paintUser.show(paint1);
                paintUser.show(sprayPaint);
                System.out.println("===============================================================");

                Brush brush1 = new Brush();
                brush1.brush();
                Brush brush2 = new ToothBrush();
                brush2.brush();
                ToothBrush toothBrush = new ToothBrush();
                toothBrush.brush();
                toothBrush.cleanTeeth();
                BrushUser brushUser = new BrushUser();
                brushUser.show(brush1);
                brushUser.show(toothBrush);
                System.out.println("===============================================================");

                Teeth teeth1 = new Teeth();
                teeth1.chew();
                Teeth teeth2 = new WisdomTeeth();
                teeth2.chew();
                WisdomTeeth wisdomTeeth = new WisdomTeeth();
                wisdomTeeth.chew();
                wisdomTeeth.hurt();
                TeethUser teethUser = new TeethUser();
                teethUser.show(teeth1);
                teethUser.show(wisdomTeeth);
                System.out.println("===============================================================");

                Hair hair1 = new Hair();
                hair1.grow();
                Hair hair2 = new CurlyHair();
                hair2.grow();
                CurlyHair curlyHair = new CurlyHair();
                curlyHair.grow();
                curlyHair.bounce();
                HairUser hairUser = new HairUser();
                hairUser.show(hair1);
                hairUser.show(curlyHair);
                System.out.println("===============================================================");

                Dentist dentist1 = new Dentist();
                dentist1.treat();
                Dentist dentist2 = new PediatricDentist();
                dentist2.treat();
                PediatricDentist pediatric = new PediatricDentist();
                pediatric.treat();
                pediatric.treatChildren();
                DentistUser dentistUser = new DentistUser();
                dentistUser.show(dentist1);
                dentistUser.show(pediatric);
                System.out.println("===============================================================");

                Cricket cricket1 = new Cricket();
                cricket1.play();
                Cricket cricket2 = new StreetCricket();
                cricket2.play();
                StreetCricket streetCricket = new StreetCricket();
                streetCricket.play();
                streetCricket.shout();
                CricketUser cricketUser = new CricketUser();
                cricketUser.show(cricket1);
                cricketUser.show(streetCricket);
                System.out.println("===============================================================");

                Threads thread1 = new Threads();
                thread1.bind();
                Threads thread2 = new CottonThread();
                thread2.bind();
                CottonThread cottonThread = new CottonThread();
                cottonThread.bind();
                cottonThread.stretch();
                ThreadUser threadUser = new ThreadUser();
                threadUser.show(thread1);
                threadUser.show(cottonThread);
                System.out.println("===============================================================");

                Road road1 = new Road();
                road1.drive();
                Road road2 = new Highway();
                road2.drive();
                Highway highway = new Highway();
                highway.drive();
                highway.speedLimit();
                RoadUser roadUser = new RoadUser();
                roadUser.show(road1);
                roadUser.show(highway);
                System.out.println("===============================================================");
                Cloth cloth1 = new Cloth();
                cloth1.wear();
                Cloth cloth2 = new SilkCloth();
                 cloth2.wear();
                 SilkCloth silkCloth = new SilkCloth();
                 silkCloth.wear();
                 silkCloth.shine();
                 ClothUser clothUser = new ClothUser();
                 clothUser.show(cloth1);
                 clothUser.show(silkCloth);
        System.out.println("===============================================================");

        Computer computer1 = new Computer();
        computer1.work();
        Computer computer2 = new Laptop();
        computer2.work();
        Laptop laptop = new Laptop();
        laptop.work();
        laptop.portable();
        ComputerUser computerUser = new ComputerUser();
        computerUser.show(computer1);
        computerUser.show(laptop);
        System.out.println("===============================================================");
        Mobile mobile1 = new Mobile();
        mobile1.call();
        Mobile mobile2 = new Smartphone();
        mobile2.call();
        Smartphone smartPhone = new Smartphone();
        smartPhone.call();
        smartPhone.browse();
        MobileUser mobileUser = new MobileUser();
        mobileUser.show(mobile1);
        mobileUser.show(smartPhone);
        System.out.println("===============================================================");
        Earphones earphones1 = new Earphones();
        earphones1.listen();
        Earphones earphones2 = new WirelessEarphones();
        earphones2.listen();
        WirelessEarphones wirelessEarphones = new WirelessEarphones();
        wirelessEarphones.listen();
        wirelessEarphones.connect();
        EarphonesUser earphonesUser = new EarphonesUser();
        earphonesUser.show(earphones1);
        earphonesUser.show(wirelessEarphones);
        System.out.println("===============================================================");
        Tablet tablet1 = new Tablet();
        tablet1.browse();
        Tablet tablet2 = new Ipad();
        tablet2.browse();
        Ipad ipad = new Ipad();
        ipad.browse();
        ipad.touch();
        TabletUser tabletUser = new TabletUser();
        tabletUser.show(tablet1);
        tabletUser.show(ipad);
        System.out.println("===============================================================");
        Camera camera1 = new Camera();
        camera1.click();
        Camera camera2 = new DigitalCamera();
        camera2.click();
        DigitalCamera digitalCamera = new DigitalCamera();
        digitalCamera.click();
        digitalCamera.record();
        CameraUser cameraUser = new CameraUser();
        cameraUser.show(camera1);
        cameraUser.show(digitalCamera);
        System.out.println("===============================================================");
        Shirt shirt1 = new Shirt();
        shirt1.wear();
        Shirt shirt2 = new T_shirt();
        shirt2.wear();
        T_shirt tShirt = new T_shirt();
        tShirt.wear();
        tShirt.style();
        ShirtUser shirtUser = new ShirtUser();
        shirtUser.show(shirt1);
        shirtUser.show(tShirt);
        System.out.println("===============================================================");
        Cupboard cupboard1 = new Cupboard();
        cupboard1.open();
        Cupboard cupboard2 = new Wardrobe();
        cupboard2.open();
        Wardrobe wardrobe = new Wardrobe();
        wardrobe.open();
        wardrobe.store();
        CupboardUser cupboardUser = new CupboardUser();
        cupboardUser.show(cupboard1);
        cupboardUser.show(wardrobe);
        System.out.println("===============================================================");
        Ball ball1 = new Ball();
        ball1.bounce();
        Ball ball2 = new Football();
        ball2.bounce();
        Football football = new Football();
        football.bounce();
        football.kick();
        BallUser ballUser = new BallUser();
        ballUser.show(ball1);
        ballUser.show(football);
        System.out.println("===============================================================");
        Bat bat1 = new Bat();
        bat1.hit();
        Bat bat2 = new CricketBat();
        bat2.hit();
        CricketBat cricketBat = new CricketBat();
        cricketBat.hit();
        cricketBat.swing();
        BatUser batUser = new BatUser();
        batUser.show(bat1);
        batUser.show(cricketBat);
        System.out.println("===============================================================");
        Eye eye1 = new Eye();
        eye1.see();
        Eye eye2 = new HumanEye();
        eye2.see();
        HumanEye humanEye = new HumanEye();
        humanEye.see();
        humanEye.blink();
        EyeUser eyeUser = new EyeUser();
        eyeUser.show(eye1);
        eyeUser.show(humanEye);
        System.out.println("===============================================================");
        Coffee coffee1 = new Coffee();
        coffee1.brew();
        Coffee coffee2 = new Espresso();
        coffee2.brew();
        Espresso coldCoffee = new Espresso();
        coldCoffee.brew();
        coldCoffee.addSugar();
        CoffeeUser coffeeUser = new CoffeeUser();
        coffeeUser.show(coffee1);
        coffeeUser.show(coldCoffee);
        System.out.println("===============================================================");

        Tea tea1 = new Tea();
        tea1.brew();
        Tea tea2 = new GreenTea();
        tea2.brew();
        GreenTea greenTea = new GreenTea();
        greenTea.brew();
        greenTea.addLemon();
        TeaUser teaUser = new TeaUser();
        teaUser.show(tea1);
        teaUser.show(greenTea);
        System.out.println("===============================================================");

        Milk milk1 = new Milk();
        milk1.pour();
        Milk milk2 = new AlmondMilk();
        milk2.pour();
        AlmondMilk almondMilk = new AlmondMilk();
        almondMilk.pour();
        almondMilk.addSweetener();
        MilkUser milkUser = new MilkUser();
        milkUser.show(milk1);
        milkUser.show(almondMilk);
        System.out.println("===============================================================");

        Curd curd1 = new Curd();
        curd1.prepare();
        Curd curd2 = new Yogurt();
        curd2.prepare();
        Yogurt sweetCurd = new Yogurt();
        sweetCurd.prepare();
        sweetCurd.addFruit();
        CurdUser curdUser = new CurdUser();
        curdUser.show(curd1);
        curdUser.show(sweetCurd);
        System.out.println("===============================================================");

        Food food1 = new Food();
        food1.cook();
        Food food2 = new Pizza();
        food2.cook();
        Pizza junkFood = new Pizza();
        junkFood.cook();
        junkFood.addToppings();
        FoodUser foodUser = new FoodUser();
        foodUser.show(food1);
        foodUser.show(junkFood);
        System.out.println("===============================================================");

        Snack snack1 = new Snack();
        snack1.eat();
        Snack snack2 = new Chips();
        snack2.eat();
        Chips eveningSnack = new Chips();
        eveningSnack.eat();
        eveningSnack.addFlavor();
        SnackUser snackUser = new SnackUser();
        snackUser.show(snack1);
        snackUser.show(eveningSnack);
        System.out.println("===============================================================");

        Snake snake1 = new Snake();
        snake1.slither();
        Snake snake2 = new Cobra();
        snake2.slither();
        Cobra pythonSnake = new Cobra();
        pythonSnake.slither();
        pythonSnake.bite();
        SnakeUser snakeUser = new SnakeUser();
        snakeUser.show(snake1);
        snakeUser.show(pythonSnake);
        System.out.println("===============================================================");

        Venom venom1 = new Venom();
        venom1.poison();
        Venom venom2 = new CobraVenom();
        venom2.poison();
        CobraVenom cobraVenom = new CobraVenom();
        cobraVenom.poison();
        cobraVenom.kill();
        VenomUser venomUser = new VenomUser();
        venomUser.show(venom1);
        venomUser.show(cobraVenom);
        System.out.println("===============================================================");

        Anchor anchor1 = new Anchor();
        anchor1.hold();
        Anchor anchor2 = new BoatAnchor();
        anchor2.hold();
        BoatAnchor boatAnchor = new BoatAnchor();
        boatAnchor.hold();
        boatAnchor.drop();
        AnchorUser anchorUser = new AnchorUser();
        anchorUser.show(anchor1);
        anchorUser.show(boatAnchor);
        System.out.println("===============================================================");

        Bucket bucket1 = new Bucket();
        bucket1.fill();
        Bucket bucket2 = new PlasticBucket();
        bucket2.fill();
        PlasticBucket plasticBucket = new PlasticBucket();
        plasticBucket.fill();
        plasticBucket.carry();
        BucketUser bucketUser = new BucketUser();
        bucketUser.show(bucket1);
        bucketUser.show(plasticBucket);
        System.out.println("===============================================================");

        Jug jug1 = new Jug();
        jug1.pour();

        Jug jug2 = new SteelJug();
        jug2.pour();

        SteelJug steelJug = new SteelJug();
        steelJug.pour();
        steelJug.shine();

        JugUser jugUser = new JugUser();
        jugUser.show(jug1);
        jugUser.show(steelJug);

        System.out.println("===============================================================");

        Mug mug1 = new Mug();
        mug1.sip();

        Mug mug2 = new CeramicMug();
        mug2.sip();

        CeramicMug ceramicMug = new CeramicMug();
        ceramicMug.sip();
        ceramicMug.heatResistant();

        MugUser mugUser = new MugUser();
        mugUser.show(mug1);
        mugUser.show(ceramicMug);

        System.out.println("===============================================================");

        Shampoo shampoo1 = new Shampoo();
        shampoo1.clean();

        Shampoo shampoo2 = new HerbalShampoo();
        shampoo2.clean();

        HerbalShampoo herbalShampoo = new HerbalShampoo();
        herbalShampoo.clean();
        herbalShampoo.fragrance();

        ShampooUser shampooUser = new ShampooUser();
        shampooUser.show(shampoo1);
        shampooUser.show(herbalShampoo);
        System.out.println("===============================================================");
        Gel gel1 = new Gel();
        gel1.apply();
        Gel gel2 = new HairGel();
        gel2.apply();
        HairGel hairGel = new HairGel();
        hairGel.apply();
        hairGel.style();
        GelUser gelUser = new GelUser();
        gelUser.show(gel1);
        gelUser.show(hairGel);
        System.out.println("===============================================================");
        Paste paste1 = new Paste();
        paste1.squeeze();
        Paste paste2 = new ToothPaste();
        paste2.squeeze();
        ToothPaste toothPaste = new ToothPaste();
        toothPaste.squeeze();
        toothPaste.whitenTeeth();
        PasteUser pasteUser = new PasteUser();
        pasteUser.show(paste1);
        pasteUser.show(toothPaste);
        System.out.println("===============================================================");

                Conditioner conditioner1 = new Conditioner();
                conditioner1.soften();

                Conditioner conditioner2 = new ProteinConditioner();
                conditioner2.soften();

                ProteinConditioner proteinConditioner = new ProteinConditioner();
                proteinConditioner.soften();
                proteinConditioner.strengthen();

                ConditionerUser conditionerUser = new ConditionerUser();
                conditionerUser.show(conditioner1);
                conditionerUser.show(proteinConditioner);

                System.out.println("===============================================================");

                Cap cap1 = new Cap();
                cap1.wear();

                Cap cap2 = new BaseballCap();
                cap2.wear();

                BaseballCap baseballCap = new BaseballCap();
                baseballCap.wear();
                baseballCap.shadeEyes();

                CapUser capUser = new CapUser();
                capUser.show(cap1);
                capUser.show(baseballCap);

                System.out.println("===============================================================");

                Tap tap1 = new Tap();
                tap1.flow();

                Tap tap2 = new KitchenTap();
                tap2.flow();

                KitchenTap kitchenTap = new KitchenTap();
                kitchenTap.flow();
                kitchenTap.filter();

                TapUser tapUser = new TapUser();
                tapUser.show(tap1);
                tapUser.show(kitchenTap);

                System.out.println("===============================================================");

                Wrap wrap1 = new Wrap();
                wrap1.cover();

                Wrap wrap2 = new FoodWrap();
                wrap2.cover();

                FoodWrap foodWrap = new FoodWrap();
                foodWrap.cover();
                foodWrap.preserve();

                WrapUser wrapUser = new WrapUser();
                wrapUser.show(wrap1);
                wrapUser.show(foodWrap);

                System.out.println("===============================================================");

                Mouse mouse1 = new Mouse();
                mouse1.click();

                Mouse mouse2 = new WirelessMouse();
                mouse2.click();

                WirelessMouse wirelessMouse = new WirelessMouse();
                wirelessMouse.click();
                wirelessMouse.connect();

                MouseUser mouseUser = new MouseUser();
                mouseUser.show(mouse1);
                mouseUser.show(wirelessMouse);

                System.out.println("===============================================================");

                Switch switch1 = new Switch();
                switch1.toggle();

                Switch switch2 = new SmartSwitch();
                switch2.toggle();

                SmartSwitch smartSwitch = new SmartSwitch();
                smartSwitch.toggle();
                smartSwitch.connectApp();

                SwitchUser switchUser = new SwitchUser();
                switchUser.show(switch1);
                switchUser.show(smartSwitch);

                System.out.println("===============================================================");

                Logo logo1 = new Logo();
                logo1.display();

                Logo logo2 = new AnimatedLogo();
                logo2.display();

                AnimatedLogo animatedLogo = new AnimatedLogo();
                animatedLogo.display();
                animatedLogo.animate();

                LogoUser logoUser = new LogoUser();
                logoUser.show(logo1);
                logoUser.show(animatedLogo);

                System.out.println("===============================================================");

                Glass glass1 = new Glass();
                glass1.fill();

                Glass glass2 = new WineGlass();
                glass2.fill();

                WineGlass wineGlass = new WineGlass();
                wineGlass.fill();
                wineGlass.swirl();

                GlassUser glassUser = new GlassUser();
                glassUser.show(glass1);
                glassUser.show(wineGlass);

                System.out.println("===============================================================");

        Spoon spoon1 = new Spoon();
        spoon1.scoop();

        Spoon spoon2 = new SilverSpoon();
        spoon2.scoop();

        SilverSpoon silverSpoon = new SilverSpoon();
        silverSpoon.scoop();
        silverSpoon.shine();

        SpoonUser spoonUser = new SpoonUser();
        spoonUser.show(spoon1);
        spoonUser.show(silverSpoon);

        System.out.println("===============================================================");
    }
        }









