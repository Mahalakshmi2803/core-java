package com.project.interfaces.runner;

import com.project.interfaces.external.Mobile;
import com.project.interfaces.internal.Charger;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger=new Mobile();
        charger.charges();
        charger.volt();
        charger.wireless();
        Mobile mobile=new Mobile();
        mobile.charges();
        mobile.volt();
        mobile.wireless();
    }
}
