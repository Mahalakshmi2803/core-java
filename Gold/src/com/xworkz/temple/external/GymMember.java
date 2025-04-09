package com.xworkz.temple.external;

import com.xworkz.temple.internal.Gym;

public class GymMember {
    public GymMember() {
        System.out.println("no-args constructor of GymMember");
    }

    public void checkGym() {
        System.out.println("Running checkGym in GymMember");
        Gym gym = new Gym();

        System.out.println("Gym Name: " + gym.getGymName());
        System.out.println("Number of Machines: " + gym.getNumberOfMachines());
        System.out.println("Has Trainer: " + gym.getHasTrainer());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
        System.out.println("Opening Hour: " + gym.getOpeningHour());
    }
}

