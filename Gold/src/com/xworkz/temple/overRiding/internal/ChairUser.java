package com.xworkz.temple.overRiding.internal;

public  class ChairUser extends Seat {
    public ChairUser() {
        System.out.println("Running ChairUser constructor");
    }

    public void show(Seat seat) {
        if (seat != null) {
            seat.use();
            if (seat instanceof Chair) {
                Chair ref = (Chair) seat;
                ref.maintain();
            } else {
                System.out.println("Seat is not Chair, cannot call maintain");
            }
        } else {
            System.out.println("Seat is null");
        }
    }
}

