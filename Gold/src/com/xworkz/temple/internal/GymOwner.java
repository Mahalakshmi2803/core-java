package com.xworkz.temple.internal;

public class GymOwner {
    public GymOwner() {
        System.out.println("no-args constructor of GymOwner");
    }

    public void showGymDetails() {
        System.out.println("Running showGymDetails in GymOwner");
        Gym gym = new Gym();

        System.out.println("Gym Name: " + gym.getGymName());
        System.out.println("Number of Machines: " + gym.getNumberOfMachines());
        System.out.println("Has Trainer: " + gym.getHasTrainer());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
        System.out.println("Opening Hour: " + gym.getOpeningHour());

        gym.setGymName("BodyPower");
        gym.setNumberOfMachines(35);
        gym.setHasTrainer(false);
        gym.setMonthlyFee(1200.75);
        gym.setOpeningHour( 5);

        System.out.println("Updated Gym Name: " + gym.getGymName());
        System.out.println("Updated Number of Machines: " + gym.getNumberOfMachines());
        System.out.println("Updated Has Trainer: " + gym.getHasTrainer());
        System.out.println("Updated Monthly Fee: " + gym.getMonthlyFee());
        System.out.println("Updated Opening Hour: " + gym.getOpeningHour());
    }
}

