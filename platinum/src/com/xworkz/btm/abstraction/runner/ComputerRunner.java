package com.xworkz.btm.abstraction.runner;

import com.xworkz.btm.abstraction.external.InOut;
import com.xworkz.btm.abstraction.external.InputDevice;
import com.xworkz.btm.abstraction.external.OutputDevice;
import com.xworkz.btm.abstraction.internal.Computer;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer=new InputDevice();
        Computer computer1=new OutputDevice();

        InOut inOut=new InOut(computer1);
        inOut.performs();
    }
}
