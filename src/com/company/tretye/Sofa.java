package com.company.tretye;

public class Sofa extends Furniture {
    int numberOfSeats;

    public Sofa(String colour, int numberOfSeats) {
        super(colour);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "numberOfSeats=" + numberOfSeats +
                ", colour=" + colour +
                '}';
    }
}