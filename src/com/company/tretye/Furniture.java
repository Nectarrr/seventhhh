package com.company.tretye;


abstract public class Furniture {
    String colour;

    public Furniture(String colour) {
        this.colour = colour;
    }
    @Override
    abstract public String toString();
}