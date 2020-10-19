package com.company.vtoroye;

public class PembrokeCorgi extends Dog {
    public PembrokeCorgi(int size, String colour, int age) {
        super(size, colour, age);
    }
    public void print() {
        System.out.println("PembrokeCorgi: size: " + size + " colour: " + colour + " age: " + age);
    }
}