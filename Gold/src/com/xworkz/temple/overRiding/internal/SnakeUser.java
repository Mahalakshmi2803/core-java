package com.xworkz.temple.overRiding.internal;

public class SnakeUser {
    public SnakeUser() {
        System.out.println("SnakeUser constructor");
    }

    public void show(Snake snake) {
        if (snake != null) {
            snake.slither();
            if (snake instanceof Cobra) {
                Cobra cobra = (Cobra) snake;
                cobra.bite();
            } else {
                System.out.println("Snake is not Cobra");
            }
        } else {
            System.out.println("Snake is null");
        }
    }
}
