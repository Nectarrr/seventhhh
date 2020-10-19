package com.company.tretye;

public class Bookcase extends Furniture {
    int length;
    int width;
    int heigth;

    public Bookcase(String colour, int length, int width, int heigth) {
        super(colour);
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Bookcase{" +
                "length=" + length +
                ", width=" + width +
                ", heigth=" + heigth +
                ", colour=" + colour +
                '}';
    }
}