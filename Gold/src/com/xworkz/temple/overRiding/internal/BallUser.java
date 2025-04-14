package com.xworkz.temple.overRiding.internal;

public class BallUser {
    public BallUser() {
        System.out.println("BallUser constructor");
    }
    public void show(Ball ball) {
        if (ball != null) {
            ball.bounce();
            if (ball instanceof Football) {
                Football football = (Football) ball;
                football.kick();
            } else {
                System.out.println("Ball is not Football");
            }
        } else {
            System.out.println("Ball is null");
        }
    }
}

