package com.company.tretye;

public class Table extends Furniture {
    int heigth;
    String material;

    public Table(String colour, int heigth, String material) {
        super(colour);
        this.heigth = heigth;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Table{" +
                "heigth=" + heigth +
                ", material='" + material + '\'' +
                ", colour=" + colour +
                '}';
    }
}