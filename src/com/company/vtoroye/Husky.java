package com.company.vtoroye;

public class Husky extends Dog{
    public Husky(int size, String colour, int age) {
        super(size, colour, age);
    }
    public void print() {
        System.out.println("Husky: size: " + size + " colour: " + colour + " age: " + age);
    }
}
