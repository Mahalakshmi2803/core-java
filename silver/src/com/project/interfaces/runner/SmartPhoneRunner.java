package com.project.interfaces.runner;

import com.project.interfaces.external.SmartPhoneDetails;
import com.project.interfaces.internal.SmartPhone;

public class SmartPhoneRunner {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhoneDetails();
        smartPhone.brand();
        smartPhone.cost();
        smartPhone.os();
        smartPhone.memory();
        smartPhone.screen();
        smartPhone.sim();
        smartPhone.sound();
        SmartPhoneDetails smartPhoneDetails=new SmartPhoneDetails();
        smartPhoneDetails.brand();
        smartPhoneDetails.cost();
        smartPhoneDetails.os();
        smartPhoneDetails.memory();
        smartPhoneDetails.screen();
        smartPhoneDetails.sim();
        smartPhoneDetails.sound();
    }
}
