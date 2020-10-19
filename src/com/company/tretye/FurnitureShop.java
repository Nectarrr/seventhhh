package com.company.tretye;

public class FurnitureShop {
    Bookcase b;
    Sofa s;
    Table t;

    public FurnitureShop(Bookcase b, Sofa s, Table t) {
        this.b = b;
        this.s = s;
        this.t = t;
    }
    public void have() {
        System.out.println("ассортимент:");
        System.out.println(b.toString());
        System.out.println(s.toString());
        System.out.println(t.toString());
        System.out.println("вы кто такие, я вас не звал");
    }
    public void want(String want1) {
        switch (want1) {
            case "bookcase":
                System.out.println("у нас имется:");
                System.out.println(b.toString());
            case "sofa":
                System.out.println("у нас имется:");
                System.out.println(s.toString());
            case "table":
                System.out.println("у нас имется:");
                System.out.println(t.toString());
        }
    }
}