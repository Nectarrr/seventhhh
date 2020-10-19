package com.company.pervoye;

public class Fork extends Dish {
    int length;

    public Fork(String colour, int number, int length) {
        super(colour, number);
        this.length = length;
    }

    @Override
    public String toString() {
        return "Fork{" +
                "length=" + length +
                ", colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}