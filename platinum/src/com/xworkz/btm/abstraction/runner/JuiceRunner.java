package com.xworkz.btm.abstraction.runner;

import com.xworkz.btm.abstraction.external.AddSugar;
import com.xworkz.btm.abstraction.external.FruitJuice;
import com.xworkz.btm.abstraction.external.Mix;
import com.xworkz.btm.abstraction.internal.Juice;

public class JuiceRunner {
    public static void main(String[] args) {

        Juice juice=new FruitJuice();
        Juice juice1=new AddSugar();

        Mix mix=new Mix(juice1);
        mix.drink();
    }
}
