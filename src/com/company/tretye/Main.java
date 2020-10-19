package com.company.tretye;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String want1;
        Bookcase b1 = new Bookcase("brown", 200, 50, 200);
        Sofa s1 = new Sofa("blue", 3);
        Table t1 = new Table("black", 100, "wood");
        FurnitureShop f1 = new FurnitureShop(b1, s1, t1);
        f1.have();
        want1 = scan.next();
        f1.want(want1);
    }
}