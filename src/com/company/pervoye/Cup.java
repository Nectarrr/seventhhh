package com.company.pervoye;

public class Cup extends Dish {
    int diameter;

    public Cup(String colour, int number, int diameter) {
        super(colour, number);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "diameter=" + diameter +
                ", colour='" + colour + '\'' +
                ", number=" + number +
                '}';
    }
}