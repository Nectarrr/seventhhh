package com.company.vtoroye;

abstract public class Dog {
    int size;
    String colour;
    int age;

    public Dog(int size, String colour, int age) {
        this.size = size;
        this.colour = colour;
        this.age = age;
    }

    abstract public void print();
}