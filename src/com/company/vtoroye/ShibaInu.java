package com.company.vtoroye;

public class ShibaInu extends Dog{
    public ShibaInu(int size, String colour, int age) {
        super(size, colour, age);
    }
    public void print() {
        System.out.println("ShibaInu: size: " + size + " colour: " + colour + " age: " + age);
    }
}
