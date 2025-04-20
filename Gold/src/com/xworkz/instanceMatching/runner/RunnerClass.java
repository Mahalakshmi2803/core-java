package com.xworkz.instanceMatching.runner;

import com.xworkz.instanceMatching.constructor.*;
import com.xworkz.instanceMatching.internal.*;

public class RunnerClass {
    public static void main(String[] args) {

                Shirt s1 = new Shirt();
                s1.setSize("M");
                s1.setPrice(799.99);
                s1.setColor("Blue");
                s1.setBrand("Nike");

                Shirt s2 = new Shirt();
                s2.setSize("L");
                s2.setPrice(899.99);
                s2.setColor("Black");
                s2.setBrand("Adidas");

                Shirt s3 = new Shirt();
                s3.setSize("L");
                s3.setPrice(899.99);
                s3.setColor("Black");
                s3.setBrand("Adidas");

                System.out.println("Shirt 1: " + s1);
                System.out.println("Shirt 2: " + s2);
                System.out.println("Shirt 3: " + s3);

                boolean sMatch = s2.equals(s3);
                boolean sNotMatch = s1.equals(s2);
                System.out.println("Shirt match: " + sMatch);
                System.out.println("Shirt not match: " + sNotMatch);



                AirConditioner a1 = new AirConditioner();
                a1.setModel("CoolPro X");
                a1.setCapacity(1);
                a1.setPrice(29999.0);
                a1.setHasHeater(true);

                AirConditioner a2 = new AirConditioner();
                a2.setModel("CoolPro Max");
                a2.setCapacity(2);
                a2.setPrice(35999.0);
                a2.setHasHeater(false);

                AirConditioner a3 = new AirConditioner();
                a3.setModel("CoolPro Max");
                a3.setCapacity(2);
                a3.setPrice(35999.0);
                a3.setHasHeater(false);

                System.out.println("AC 1: " + a1);
                System.out.println("AC 2: " + a2);
                System.out.println("AC 3: " + a3);

                boolean acMatch = a2.equals(a3);
                boolean acNotMatch = a1.equals(a2);
                System.out.println("AC match: " + acMatch);
                System.out.println("AC not match: " + acNotMatch);


                Fan f1 = new Fan();
                f1.setSpeed(3);
                f1.setRemoteControlled(true);
                f1.setBrand("Usha");
                f1.setHeight(1.2);

                Fan f2 = new Fan();
                f2.setSpeed(5);
                f2.setRemoteControlled(false);
                f2.setBrand("Havells");
                f2.setHeight(1.5);

                Fan f3 = new Fan();
                f3.setSpeed(5);
                f3.setRemoteControlled(false);
                f3.setBrand("Havells");
                f3.setHeight(1.5);

                System.out.println("Fan 1: " + f1);
                System.out.println("Fan 2: " + f2);
                System.out.println("Fan 3: " + f3);
                boolean fanMatch = f2.equals(f3);
                boolean fanNotMatch = f1.equals(f2);
                System.out.println("Fan match: " + fanMatch);
                System.out.println("Fan not match: " + fanNotMatch);

        Mask m1 = new Mask();
        m1.setReusable(true);
        m1.setPrice(49.99);
        m1.setMaterial("Cotton");
        m1.setLayers(3);

        Mask m2 = new Mask();
        m2.setReusable(false);
        m2.setPrice(59.99);
        m2.setMaterial("N95");
        m2.setLayers(5);

        Mask m3 = new Mask();
        m3.setReusable(false);
        m3.setPrice(59.99);
        m3.setMaterial("N95");
        m3.setLayers(5);

        System.out.println("Mask 1: " + m1);
        System.out.println("Mask 2: " + m2);
        System.out.println("Mask 3: " + m3);

        boolean maskMatch = m2.equals(m3);
        boolean maskNotMatch = m1.equals(m2);
        System.out.println("Mask match: " + maskMatch);
        System.out.println("Mask not match: " + maskNotMatch);

        Shop ss = new Shop();
        ss.setName("GroceryMart");
        ss.setOpenOnSunday(true);
        ss.setRent(5000.0);
        ss.setEmployees(10);

        Shop sss = new Shop();
        sss.setName("ElectroWorld");
        sss.setOpenOnSunday(false);
        sss.setRent(7000.0);
        sss.setEmployees(8);

        Shop ssss = new Shop();
        ssss.setName("ElectroWorld");
        ssss.setOpenOnSunday(false);
        ssss.setRent(7000.0);
        ssss.setEmployees(8);

        System.out.println("Shop 1: " + ss);
        System.out.println("Shop 2: " + sss);
        System.out.println("Shop 3: " + ssss);

        boolean shopMatch = sss.equals(ssss);
        boolean shopNotMatch = ss.equals(sss);
        System.out.println("Shop match: " + shopMatch);
        System.out.println("Shop not match: " + shopNotMatch);

        Box b1 = new Box();
        b1.setMaterial("Cardboard");
        b1.setVolume(20);
        b1.setReusable(true);
        b1.setPrice(150.5);

        Box b2 = new Box();
        b2.setMaterial("Plastic");
        b2.setVolume(30);
        b2.setReusable(true);
        b2.setPrice(200.0);

        Box b3 = new Box();
        b3.setMaterial("Plastic");
        b3.setVolume(30);
        b3.setReusable(true);
        b3.setPrice(200.0);

        System.out.println("Box 1: " + b1);
        System.out.println("Box 2: " + b2);
        System.out.println("Box 3: " + b3);

        boolean boxMatch = b2.equals(b3);
        boolean boxNotMatch = b1.equals(b2);
        System.out.println("Box match: " + boxMatch);
        System.out.println("Box not match: " + boxNotMatch);

        Calculator cal1 = new Calculator();
        cal1.setModel("Casio");
        cal1.setScientific(true);
        cal1.setWarranty(2);
        cal1.setPrice(799.0);

        Calculator cal2 = new Calculator();
        cal2.setModel("Citizen");
        cal2.setScientific(false);
        cal2.setWarranty(1);
        cal2.setPrice(499.0);

        Calculator cal3 = new Calculator();
        cal3.setModel("Citizen");
        cal3.setScientific(false);
        cal3.setWarranty(1);
        cal3.setPrice(499.0);

        System.out.println("Calculator 1: " + cal1);
        System.out.println("Calculator 2: " + cal2);
        System.out.println("Calculator 3: " + cal3);

        boolean calMatch = cal2.equals(cal3);
        boolean calNotMatch = cal1.equals(cal2);
        System.out.println("Calculator match: " + calMatch);
        System.out.println("Calculator not match: " + calNotMatch);


        Blade bl1 = new Blade();
        bl1.setLength(10);
        bl1.setSharpnessLevel(10);
        bl1.setBrand("Gillette");
        bl1.setDisposable(true);

        Blade bl2 = new Blade();
        bl2.setLength(5);
        bl2.setSharpnessLevel(5);
        bl2.setBrand("Topaz");
        bl2.setDisposable(false);

        Blade bl3 = new Blade();
        bl3.setLength(5);
        bl3.setSharpnessLevel(5);
        bl3.setBrand("Topaz");
        bl3.setDisposable(false);

        System.out.println("Blade 1: " + bl1);
        System.out.println("Blade 2: " + bl2);
        System.out.println("Blade 3: " + bl3);

        boolean blMatch = bl2.equals(bl3);
        boolean blNotMatch = bl1.equals(bl2);
        System.out.println("Blade match: " + blMatch);
        System.out.println("Blade not match: " + blNotMatch);

        Gum gu1 = new Gum();
        gu1.setFlavor("Vanilla");
        gu1.setSugarFree(true);
        gu1.setWeight(10.0);
        gu1.setCount(5);

        Gum gu2 = new Gum();
        gu2.setFlavor("Orange");
        gu2.setSugarFree(false);
        gu2.setWeight(5.0);
        gu2.setCount(3);

        Gum gu3 = new Gum();
        gu3.setFlavor("Orange");
        gu3.setSugarFree(false);
        gu3.setWeight(5.0);
        gu3.setCount(3);

        System.out.println("Gum 1: " + gu1);
        System.out.println("Gum 2: " + gu2);
        System.out.println("Gum 3: " + gu3);

        boolean guMatch = gu2.equals(gu3);
        boolean guNotMatch = gu1.equals(gu2);
        System.out.println("Gum match: " + guMatch);
        System.out.println("Gum not match: " + guNotMatch);

        Ghee g1 = new Ghee();
        g1.setPure(true);
        g1.setWeight(650.0);
        g1.setSource("Patanjali");
        g1.setPrice(1000);

        Ghee g2 = new Ghee();
        g2.setPure(false);
        g2.setWeight(600.0);
        g2.setSource("Aavin");
        g2.setPrice(850);

        Ghee g3 = new Ghee();
        g3.setPure(false);
        g3.setWeight(600.0);
        g3.setSource("Aavin");
        g3.setPrice(850);

        System.out.println("Ghee 1: " + g1);
        System.out.println("Ghee 2: " + g2);
        System.out.println("Ghee 3: " + g3);

        boolean gMatch = g2.equals(g3);
        boolean gNotMatch = g1.equals(g2);
        System.out.println("Ghee match: " + gMatch);
        System.out.println("Ghee not match: " + gNotMatch);

        Curd c1 = new Curd();
        c1.setFlavor("Plain");
        c1.setProbiotic(false);
        c1.setQuantity(90);
        c1.setPrice(40.0);

        Curd c2 = new Curd();
        c2.setFlavor("Mango");
        c2.setProbiotic(true);
        c2.setQuantity(50);
        c2.setPrice(45.0);

        Curd c3 = new Curd();
        c3.setFlavor("Mango");
        c3.setProbiotic(true);
        c3.setQuantity(50);
        c3.setPrice(45.0);

        System.out.println("Curd 1: " + c1);
        System.out.println("Curd 2: " + c2);
        System.out.println("Curd 3: " + c3);

        boolean cMatch = c2.equals(c3);
        boolean cNotMatch = c1.equals(c2);
        System.out.println("Curd match: " + cMatch);
        System.out.println("Curd not match: " + cNotMatch);

        Milk milk = new Milk();
        milk.setBrand("Nandini");
        milk.setFatContent(3.5);
        milk.setQuantity(7);
        milk.setOrganic(true);

        Milk milk1 = new Milk();
        milk1.setBrand("Amul");
        milk1.setFatContent(4.0);
        milk1.setQuantity(10);
        milk1.setOrganic(false);

        Milk milk2 = new Milk();
        milk2.setBrand("Amul");
        milk2.setFatContent(4.0);
        milk2.setQuantity(10);
        milk2.setOrganic(false);

        System.out.println("Milk 1: " + milk);
        System.out.println("Milk 2: " + milk1);
        System.out.println("Milk 3: " + milk2);

        boolean mMatch = milk1.equals(milk2);
        boolean mNotMatch = milk.equals(milk1);
        System.out.println("Milk match: " + mMatch);
        System.out.println("Milk not match: " + mNotMatch);

        Board board = new Board();
        board.setMaterial("Wood");
        board.setWidth(3.5);
        board.setIsWritable(true);
        board.setLength(6);

        Board board1 = new Board();
        board1.setMaterial("Plastic");
        board1.setWidth(4.0);
        board1.setIsWritable(false);
        board1.setLength(8);

        Board board2 = new Board();
        board2.setMaterial("Plastic");
        board2.setWidth(4.0);
        board2.setIsWritable(false);
        board2.setLength(8);

        System.out.println("Board 1: " + board);
        System.out.println("Board 2: " + board1);
        System.out.println("Board 3: " + board2);

        boolean bMatch = board1.equals(board2);
        boolean bNotMatch = board.equals(board1);
        System.out.println("Board match: " + bMatch);
        System.out.println("Board not match: " + bNotMatch);

        Tag t1 = new Tag();
        t1.setLabel("Price");
        t1.setCount(50);
        t1.setIsReusable(true);
        t1.setPrice(5.0);

        Tag t2 = new Tag();
        t2.setLabel("Discount");
        t2.setCount(30);
        t2.setIsReusable(false);
        t2.setPrice(3.5);

        Tag t3 = new Tag();
        t3.setLabel("Discount");
        t3.setCount(30);
        t3.setIsReusable(false);
        t3.setPrice(3.5);

        System.out.println("Tag 1: " + t1);
        System.out.println("Tag 2: " + t2);
        System.out.println("Tag 3: " + t3);

        boolean tMatch = t2.equals(t3);
        boolean tNotMatch = t1.equals(t2);
        System.out.println("Tag match: " + tMatch);
        System.out.println("Tag not match: " + tNotMatch);

        File file = new File();
        file.setType("Folder");
        file.setPages(100);
        file.setPrice(120.0);
        file.setIsA4Size(true);

        File file1 = new File();
        file1.setType("Binder");
        file1.setPages(150);
        file1.setPrice(150.0);
        file1.setIsA4Size(false);

        File file2 = new File();
        file2.setType("Binder");
        file2.setPages(150);
        file2.setPrice(150.0);
        file2.setIsA4Size(false);

        System.out.println("File 1: " + file);
        System.out.println("File 2: " + file1);
        System.out.println("File 3: " + file2);

        boolean fMatch = file1.equals(file2);
        boolean fNotMatch = file.equals(file1);
        System.out.println("File match: " + fMatch);
        System.out.println("File not match: " + fNotMatch);

        Spoon spoon = new Spoon();
        spoon.setMaterial("Steel");
        spoon.setLength(10.5);
        spoon.setIsSpoonType(true);
        spoon.setWeight(30);

        Spoon spoon1 = new Spoon();
        spoon1.setMaterial("Plastic");
        spoon1.setLength(8.0);
        spoon1.setIsSpoonType(false);
        spoon1.setWeight(10);

        Spoon spoon2 = new Spoon();
        spoon2.setMaterial("Plastic");
        spoon2.setLength(8.0);
        spoon2.setIsSpoonType(false);
        spoon2.setWeight(10);

        System.out.println("Spoon 1: " + spoon);
        System.out.println("Spoon 2: " + spoon1);
        System.out.println("Spoon 3: " + spoon2);

        boolean spMatch = spoon1.equals(spoon2);
        boolean spNotMatch = spoon.equals(spoon1);
        System.out.println("Spoon match: " + spMatch);
        System.out.println("Spoon not match: " + spNotMatch);

        Color color = new Color();
        color.setName("Red");
        color.setShade("Dark");
        color.setQuantity(10);
        color.setIsOpaque(true);

        Color c12 = new Color();
        c12.setName("Blue");
        c12.setShade("Light");
        c12.setQuantity(5);
        c12.setIsOpaque(false);

        Color c13 = new Color();
        c13.setName("Blue");
        c13.setShade("Light");
        c13.setQuantity(5);
        c13.setIsOpaque(false);

        System.out.println("Color 1: " + color);
        System.out.println("Color 2: " + c12);
        System.out.println("Color 3: " + c13);

        boolean coMatch = c12.equals(c13);
        boolean coNotMatch = color.equals(c12);
        System.out.println("Color match: " + coMatch);
        System.out.println("Color not match: " + coNotMatch);

        Billbook billbook = new Billbook();
        billbook.setBrand("BigBiller");
        billbook.setPages(100);
        billbook.setPrice(150.0);
        billbook.setIsCarbonless(true);

        Billbook billbook2 = new Billbook();
        billbook2.setBrand("PaperMax");
        billbook2.setPages(200);
        billbook2.setPrice(200.0);
        billbook2.setIsCarbonless(false);

        Billbook billbook3 = new Billbook();
        billbook3.setBrand("PaperMax");
        billbook3.setPages(200);
        billbook3.setPrice(200.0);
        billbook3.setIsCarbonless(false);

        System.out.println("Billbook 1: " + billbook);
        System.out.println("Billbook 2: " + billbook2);
        System.out.println("Billbook 3: " + billbook3);

        boolean bbMatch = billbook2.equals(billbook3);
        boolean bbNotMatch = billbook.equals(billbook2);
        System.out.println("Billbook match: " + bbMatch);
        System.out.println("Billbook not match: " + bbNotMatch);

        Draw d1 = new Draw();
        d1.setType("Sketch");
        d1.setSize(18);
        d1.setPrice(50.0);
        d1.setIsColoringAvailable(false);

        Draw d2 = new Draw();
        d2.setType("Portrait");
        d2.setSize(24);
        d2.setPrice(80.0);
        d2.setIsColoringAvailable(true);

        Draw d3 = new Draw();
        d3.setType("Portrait");
        d3.setSize(24);
        d3.setPrice(80.0);
        d3.setIsColoringAvailable(true);

        System.out.println("Draw 1: " + d1);
        System.out.println("Draw 2: " + d2);
        System.out.println("Draw 3: " + d3);

        boolean dMatch = d2.equals(d3);
        boolean dNotMatch = d1.equals(d2);
        System.out.println("Draw match: " + dMatch);
        System.out.println("Draw not match: " + dNotMatch);

        Zebra z1 = new Zebra();
        z1.setName("Zebu");
        z1.setAge(5);
        z1.setWeight(230.5);
        z1.setIsWild(true);

        Zebra z2 = new Zebra();
        z2.setName("Zara");
        z2.setAge(4);
        z2.setWeight(210.3);
        z2.setIsWild(false);

        Zebra z3 = new Zebra();
        z3.setName("Zara");
        z3.setAge(4);
        z3.setWeight(210.3);
        z3.setIsWild(false);

        System.out.println("Zebra 1: " + z1);
        System.out.println("Zebra 2: " + z2);
        System.out.println("Zebra 3: " + z3);

        boolean zMatch = z2.equals(z3);
        boolean zNotMatch = z1.equals(z2);
        System.out.println("Zebra match: " + zMatch);
        System.out.println("Zebra not match: " + zNotMatch);

        Laptop l1 = new Laptop();
        l1.setPrice(65000.0);
        l1.setHasTouchScreen(true);
        l1.setBrand("HP");
        l1.setRamSize(16);

        Laptop l2 = new Laptop();
        l2.setPrice(82000.0);
        l2.setHasTouchScreen(false);
        l2.setBrand("Dell");
        l2.setRamSize(8);

        Laptop l3 = new Laptop();
        l3.setPrice(82000.0);
        l3.setHasTouchScreen(false);
        l3.setBrand("Dell");
        l3.setRamSize(8);

        System.out.println("Laptop 1: " + l1);
        System.out.println("Laptop 2: " + l2);
        System.out.println("Laptop 3: " + l3);

        boolean lMatch = l2.equals(l3);
        boolean lNotMatch = l1.equals(l2);
        System.out.println("Laptop match: " + lMatch);
        System.out.println("Laptop not match: " + lNotMatch);

        Egg e1 = new Egg();
        e1.setCount(12);
        e1.setType("Organic");
        e1.setIsOrganic(true);
        e1.setWeight(650.0);

        Egg e2 = new Egg();
        e2.setCount(6);
        e2.setType("Brown");
        e2.setIsOrganic(false);
        e2.setWeight(300.0);

        Egg e3 = new Egg();
        e3.setCount(6);
        e3.setType("Brown");
        e3.setIsOrganic(false);
        e3.setWeight(300.0);

        System.out.println("Egg 1: " + e1);
        System.out.println("Egg 2: " + e2);
        System.out.println("Egg 3: " + e3);

        boolean eMatch = e2.equals(e3);
        boolean eNotMatch = e1.equals(e2);
        System.out.println("Egg match: " + eMatch);
        System.out.println("Egg not match: " + eNotMatch);

        Umbrella u1 = new Umbrella();
        u1.setColor("Red");
        u1.setIsAutomatic(true);
        u1.setPrice(499.99);
        u1.setLength(90);

        Umbrella u2 = new Umbrella();
        u2.setColor("Black");
        u2.setIsAutomatic(false);
        u2.setPrice(299.99);
        u2.setLength(85);

        Umbrella u3 = new Umbrella();
        u3.setColor("Black");
        u3.setIsAutomatic(false);
        u3.setPrice(299.99);
        u3.setLength(85);

        System.out.println("Umbrella 1: " + u1);
        System.out.println("Umbrella 2: " + u2);
        System.out.println("Umbrella 3: " + u3);

        boolean uMatch = u2.equals(u3);
        boolean uNotMatch = u1.equals(u2);
        System.out.println("Umbrella match: " + uMatch);
        System.out.println("Umbrella not match: " + uNotMatch);

        Hat h1 = new Hat();
        h1.setSize(56.7);
        h1.setBrand("Puma");
        h1.setIsAdjustable(true);
        h1.setPrice(899);

        Hat h2 = new Hat();
        h2.setSize(58.0);
        h2.setBrand("Adidas");
        h2.setIsAdjustable(false);
        h2.setPrice(799);

        Hat h3 = new Hat();
        h3.setSize(58.0);
        h3.setBrand("Adidas");
        h3.setIsAdjustable(false);
        h3.setPrice(799);

        System.out.println("Hat 1: " + h1);
        System.out.println("Hat 2: " + h2);
        System.out.println("Hat 3: " + h3);

        boolean hMatch = h2.equals(h3);
        boolean hNotMatch = h1.equals(h2);
        System.out.println("Hat match: " + hMatch);
        System.out.println("Hat not match: " + hNotMatch);

        Fog fog1 = new Fog();
        fog1.setTemperature(0.8);
        fog1.setIsThick(true);
        fog1.setLocation("Mountain");
        fog1.setVisibility(60);

        Fog fog2 = new Fog();
        fog2.setTemperature(0.5);
        fog2.setIsThick(false);
        fog2.setLocation("Plains");
        fog2.setVisibility(30);

        Fog fog3 = new Fog();
        fog3.setTemperature(0.5);
        fog3.setIsThick(false);
        fog3.setLocation("Plains");
        fog3.setVisibility(30);

        System.out.println("Fog 1: " + fog1);
        System.out.println("Fog 2: " + fog2);
        System.out.println("Fog 3: " + fog3);

        boolean foMatch = fog2.equals(fog3);
        boolean foNotMatch = fog1.equals(fog2);
        System.out.println("Fog match: " + fMatch);
        System.out.println("Fog not match: " + fNotMatch);

        Flower flower1 = new Flower("Rose", 5, true, 100);
        Flower flower2 = new Flower("Lily", 7, false, 1000);
        Flower flower3 = new Flower("Lily", 7, false, 1000);

        System.out.println("Flower 1: " + flower1);
        System.out.println("Flower 2: " + flower2);
        System.out.println("Flower 3: " + flower3);

        boolean flowerMatch = flower2.equals(flower3);
        boolean flowerNotMatch = flower1.equals(flower2);
        System.out.println("Flower match: " + flowerMatch);
        System.out.println("Flower not match: " + flowerNotMatch);

        Fruit fruit1 = new Fruit(150, "Apple", true, 5);
        Fruit fruit2 = new Fruit(200, "Mango", false, 6);
        Fruit fruit3 = new Fruit(200, "Mango", false, 6);

        System.out.println("Fruit 1: " + fruit1);
        System.out.println("Fruit 2: " + fruit2);
        System.out.println("Fruit 3: " + fruit3);

        boolean fruitMatch = fruit2.equals(fruit3);
        boolean fruitNotMatch = fruit1.equals(fruit2);
        System.out.println("Fruit match: " + fruitMatch);
        System.out.println("Fruit not match: " + fruitNotMatch);

        Nature n1 = new Nature(true, 1, "Good", 100.0);
        Nature n2 = new Nature(false, 2, "Excellent", 50.50);
        Nature n3 = new Nature(false, 2, "Excellent", 50.50);

        System.out.println("Nature 1: " + n1);
        System.out.println("Nature 2: " + n2);
        System.out.println("Nature 3: " + n3);

        boolean natureMatch = n2.equals(n3);
        boolean natureNotMatch = n1.equals(n2);
        System.out.println("Nature match: " + natureMatch);
        System.out.println("Nature not match: " + natureNotMatch);

        Animal animal1 = new Animal(4, true, "Tiger", 310);
        Animal animal2 = new Animal(4, false, "Buffalo", 500);
        Animal animal3 = new Animal(4, false, "Buffalo", 500);

        System.out.println("Animal 1: " + animal1);
        System.out.println("Animal 2: " + animal2);
        System.out.println("Animal 3: " + animal3);

        boolean animalMatch = animal2.equals(animal3);
        boolean animalNotMatch = animal1.equals(animal2);
        System.out.println("Animal match: " + animalMatch);
        System.out.println("Animal not match: " + animalNotMatch);

        Bird bird1 = new Bird("Parrot", 2, true, 80);
        Bird bird2 = new Bird("Sparrow", 1, true, 5);
        Bird bird3 = new Bird("Sparrow", 1, true, 5);

        System.out.println("Bird 1: " + bird1);
        System.out.println("Bird 2: " + bird2);
        System.out.println("Bird 3: " + bird3);

        boolean birdMatch = bird2.equals(bird3);
        boolean birdNotMatch = bird1.equals(bird2);
        System.out.println("Bird match: " + birdMatch);
        System.out.println("Bird not match: " + birdNotMatch);

        Bike bike1 = new Bike(5, "RE", 300000, false);
        Bike bike2 = new Bike(4, "Honda", 150000, false);
        Bike bike3 = new Bike(4, "Honda", 150000, false);

        System.out.println("Bike 1: " + bike1);
        System.out.println("Bike 2: " + bike2);
        System.out.println("Bike 3: " + bike3);

        boolean bikeMatch = bike2.equals(bike3);
        boolean bikeNotMatch = bike1.equals(bike2);
        System.out.println("Bike match: " + bikeMatch);
        System.out.println("Bike not match: " + bikeNotMatch);

        Car car1 = new Car("sedan", 1000000, true, 5);
        Car car2 = new Car("HatchBack", 1000000, false, 5);
        Car car3 = new Car("HatchBack", 1000000, false, 5);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);

        boolean carMatch = car2.equals(car3);
        boolean carNotMatch = car1.equals(car2);
        System.out.println("Car match: " + carMatch);
        System.out.println("Car not match: " + carNotMatch);

        Cab cab1 = new Cab(true, "Joe", 400, 2);
        Cab cab2 = new Cab(false, "John", 600, 3);
        Cab cab3 = new Cab(false, "John", 600, 3);

        System.out.println("Cab 1: " + cab1);
        System.out.println("Cab 2: " + cab2);
        System.out.println("Cab 3: " + cab3);

        boolean cabMatch = cab2.equals(cab3);
        boolean cabNotMatch = cab1.equals(cab2);
        System.out.println("Cab match: " + cabMatch);
        System.out.println("Cab not match: " + cabNotMatch);

        Bus bus1 = new Bus(45, 200, "Benz", false);
        Bus bus2 = new Bus(60, 200, "Volvo", true);
        Bus bus3 = new Bus(60,200 , "Volvo", true);

        System.out.println("Bus 1: " + bus1);
        System.out.println("Bus 2: " + bus2);
        System.out.println("Bus 3: " + bus3);

        boolean busMatch = bus2.equals(bus3);
        boolean busNotMatch = bus1.equals(bus2);
        System.out.println("Bus match: " + busMatch);
        System.out.println("Bus not match: " + busNotMatch);

        Cover cover1 = new Cover("Plastic", true, 5.0, 150);
        Cover cover2 = new Cover("Leather", false, 7.5, 250);
        Cover cover3 = new Cover("Leather", false, 7.5, 250);

        System.out.println("Cover 1: " + cover1);
        System.out.println("Cover 2: " + cover2);
        System.out.println("Cover 3: " + cover3);

        boolean coverMatch = cover2.equals(cover3);
        boolean coverNotMatch = cover1.equals(cover2);
        System.out.println("Cover match: " + coverMatch);
        System.out.println("Cover not match: " + coverNotMatch);

        Screen screen1 = new Screen(24.0, false, "1920x1080", "LED");
        Screen screen2 = new Screen(27.0, true, "2560x1440", "LCD");
        Screen screen3 = new Screen(27.0, true, "2560x1440", "LCD");

        System.out.println("Screen 1: " + screen1);
        System.out.println("Screen 2: " + screen2);
        System.out.println("Screen 3: " + screen3);

        boolean match = screen2.equals(screen3);
        boolean notMatch = screen1.equals(screen2);
        System.out.println("Screen match: " + match);
        System.out.println("Screen not match: " + notMatch);

        Joystick j1 = new Joystick(10, "Redgear", true, 1.2);
        Joystick j2 = new Joystick(12, "Logitech", true, 1.4);
        Joystick j3 = new Joystick(12, "Logitech", true, 1.4);

        System.out.println("Joystick 1: " + j1);
        System.out.println("Joystick 2: " + j2);
        System.out.println("Joystick 3: " + j3);

        boolean jmatch = j2.equals(j3);
        boolean jnotMatch = j1.equals(j2);
        System.out.println("Joystick match: " + jmatch);
        System.out.println("Joystick not match: " + jnotMatch);

        Keyboard k1 = new Keyboard("QWERTY", true, 104, 2999.0);
        Keyboard k2 = new Keyboard("AZERTY", false, 105, 1999.0);
        Keyboard k3 = new Keyboard("AZERTY", false, 105, 1999.0);

        System.out.println("Keyboard 1: " + k1);
        System.out.println("Keyboard 2: " + k2);
        System.out.println("Keyboard 3: " + k3);

        boolean kmatch = k2.equals(k3);
        boolean knotMatch = k1.equals(k2);
        System.out.println("Keyboard match: " + kmatch);
        System.out.println("Keyboard not match: " + knotMatch);

        Mouse mouse1 = new Mouse("Logitech", true, 699.0, "Black");
        Mouse mouse2 = new Mouse("HP", false, 499.0, "White");
        Mouse mouse3 = new Mouse("HP", false, 499.0, "White");

        System.out.println("Mouse 1: " + mouse1);
        System.out.println("Mouse 2: " + mouse2);
        System.out.println("Mouse 3: " + mouse3);

        boolean mmatch = mouse2.equals(mouse3);
        boolean mnotMatch = mouse1.equals(mouse2);
        System.out.println("Mouse match: " + mmatch);
        System.out.println("Mouse not match: " + mnotMatch);

        Paper p1 = new Paper("A4", 80, 1.5, true);
        Paper p2 = new Paper("Legal", 90, 2.0, false);
        Paper p3 = new Paper("Legal", 90, 2.0, false);

        System.out.println("Paper 1: " + p1);
        System.out.println("Paper 2: " + p2);
        System.out.println("Paper 3: " + p3);

        boolean pmatch = p2.equals(p3);
        boolean pnotMatch = p1.equals(p2);
        System.out.println("Paper match: " + pmatch);
        System.out.println("Paper not match: " + pnotMatch);

        Computer computer1 = new Computer("Intel i7", 16.0, true, 4);
        Computer computer2 = new Computer("AMD Ryzen 5", 8.0, true, 3);
        Computer computer3 = new Computer("AMD Ryzen 5", 8.0, true, 3);

        System.out.println("Computer 1: " + computer1);
        System.out.println("Computer 2: " + computer2);
        System.out.println("Computer 3: " + computer3);

        boolean computerMatch = computer2.equals(computer3);
        boolean computerNotMatch = computer1.equals(computer2);
        System.out.println("Computer match: " + computerMatch);
        System.out.println("Computer not match: " + computerNotMatch);

        Radio r1 = new Radio(true, "Sony", 10, 108.0);
        Radio r2 = new Radio(false, "Philips", 8, 102.5);
        Radio r3 = new Radio(false, "Philips", 8, 102.5);

        System.out.println("Radio 1: " + r1);
        System.out.println("Radio 2: " + r2);
        System.out.println("Radio 3: " + r3);

        boolean rMatch = r2.equals(r3);
        boolean rNotMatch = r1.equals(r2);
        System.out.println("Radio match: " + rMatch);
        System.out.println("Radio not match: " + rNotMatch);

        TV tv1 = new TV("LED", 55.0, true, 3);
        TV tv2 = new TV("OLED", 65.0, true, 4);
        TV tv3 = new TV("OLED", 65.0, true, 4);

        System.out.println("TV 1: " + tv1);
        System.out.println("TV 2: " + tv2);
        System.out.println("TV 3: " + tv3);

        boolean tvMatch = tv2.equals(tv3);
        boolean tvNotMatch = tv1.equals(tv2);
        System.out.println("TV match: " + tvMatch);
        System.out.println("TV not match: " + tvNotMatch);

        Tissue tissue1 = new Tissue(10.5, true, 3, "Kleenex");
        Tissue tissue2 = new Tissue(8.0, false, 2, "Scott");
        Tissue tissue3 = new Tissue(8.0, false, 2, "Scott");

        System.out.println("Tissue 1: " + tissue1);
        System.out.println("Tissue 2: " + tissue2);
        System.out.println("Tissue 3: " + tissue3);

        boolean tissueMatch = tissue2.equals(tissue3);
        boolean tissueNotMatch = tissue1.equals(tissue2);
        System.out.println("Tissue match: " + tissueMatch);
        System.out.println("Tissue not match: " + tissueNotMatch);

        Vehicle v1 = new Vehicle("Tesla", 2021, true, 55000);
        Vehicle v2 = new Vehicle("Ford", 2019, false, 32000);
        Vehicle v3 = new Vehicle("Ford", 2019, false, 32000);

        System.out.println("Vehicle 1: " + v1);
        System.out.println("Vehicle 2: " + v2);
        System.out.println("Vehicle 3: " + v3);

        boolean vMatch = v2.equals(v3);
        boolean vNotMatch = v1.equals(v2);
        System.out.println("Vehicle match: " + vMatch);
        System.out.println("Vehicle not match: " + vNotMatch);

        Boat boat1 = new Boat(25.0, "Fishing", false, 6);
        Boat boat2 = new Boat(35.0, "Yacht", true, 10);
        Boat boat3 = new Boat(35.0, "Yacht", true, 10);

        System.out.println("Boat 1: " + boat1);
        System.out.println("Boat 2: " + boat2);
        System.out.println("Boat 3: " + boat3);

        boolean boatmatch = boat2.equals(boat3);
        boolean boatnotMatch = boat1.equals(boat2);
        System.out.println("Boat match: " + boatmatch);
        System.out.println("Boat not match: " + boatnotMatch);

        Window w1 = new Window(4, 120.0, true, "White");
        Window w2 = new Window(6, 150.5, false, "Brown");
        Window w3 = new Window(6, 150.5, false, "Brown");

        System.out.println("Window 1: " + w1);
        System.out.println("Window 2: " + w2);
        System.out.println("Window 3: " + w3);

        boolean wmatch = w2.equals(w3);
        boolean wnotMatch = w1.equals(w2);
        System.out.println("Window match: " + wmatch);
        System.out.println("Window not match: " + wnotMatch);

        Door door1 = new Door("Wood", 210, true, 90.5);
        Door door2 = new Door("Steel", 200, false, 85.0);
        Door door3 = new Door("Steel", 200, false, 85.0);

        System.out.println("Door 1: " + door1);
        System.out.println("Door 2: " + door2);
        System.out.println("Door 3: " + door3);

        boolean doormatch = door2.equals(door3);
        boolean doornotMatch = door1.equals(door2);
        System.out.println("Door match: " + doormatch);
        System.out.println("Door not match: " + doornotMatch);

        Lock lock1 = new Lock(5, false, 1.2, "Godrej");
        Lock lock2 = new Lock(7, true, 1.5, "Yale");
        Lock lock3 = new Lock(7, true, 1.5, "Yale");

        System.out.println("Lock 1: " + lock1);
        System.out.println("Lock 2: " + lock2);
        System.out.println("Lock 3: " + lock3);

        boolean lockmatch = lock2.equals(lock3);
        boolean locknotMatch = lock1.equals(lock2);
        System.out.println("Lock match: " + lockmatch);
        System.out.println("Lock not match: " + locknotMatch);

        Key key1 = new Key("Steel", 2.5, false, 6);
        Key key2 = new Key("Brass", 3.0, true, 8);
        Key key3 = new Key("Brass", 3.0, true, 8);

        System.out.println("Key 1: " + key1);
        System.out.println("Key 2: " + key2);
        System.out.println("Key 3: " + key3);

        boolean keymatch = key2.equals(key3);
        boolean keynotMatch = key1.equals(key2);
        System.out.println("Key match: " + keymatch);
        System.out.println("Key not match: " + keynotMatch);















    }
            }








