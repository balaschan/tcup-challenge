package com.tcup.challenge;

public class CeilingFan {

    public static final int OFF = 0;

    private int speed = 0;

    private Direction direction = Direction.forward;

    public int getSpeed() {
        return speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void speedUp() {
        if (speed == 3) {
            speed = OFF;
        } else {
            speed++;
        }
    }

    public void reverseDirection() {
        direction = (direction == Direction.forward) ? Direction.backward : Direction.forward;
    }
}
