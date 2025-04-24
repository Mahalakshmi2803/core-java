package com.xworkz.btm.abstraction.external;

import com.xworkz.btm.abstraction.internal.Computer;

public class InOut {

    private Computer computer;

    public InOut(Computer computer){
        this.computer=computer;
    }
    public void performs(){
        System.out.println("performs running in InOut");
        if(computer!=null){
            this.computer.interconnects();
        }
        else
        {
            System.out.println("computer is null");
        }
    }
}
