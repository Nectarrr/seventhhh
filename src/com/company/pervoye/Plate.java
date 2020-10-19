package com.company.pervoye;

public class Plate extends Dish {
    int diameter;

    public Plate(String colour, int number, int diameter) {
        super(colour, number);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "diameter=" + diameter +
                ", colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}