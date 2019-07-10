package com.company;

public class Main {

    public static void main(String[] args) {
        SuperClass sc = new SuperClass();
        UnderClass uc = new UnderClass();

        sc.i = 10;
        sc.j = 20;
        sc.showij();

        System.out.println("=========================");

        uc.k = 25;
        uc.showk();

        System.out.println("=========================");

        uc.i = 23;
        sc.showij();
        uc.showij();
        uc.sum();

        System.out.println("=========================");

        sc = uc;
        sc.showij();

        System.out.println("=========================");

        UnderBox box = new UnderBox(12.7d, 13.76d, 5.009d, 31d, "green");
        double vol = box.volume();
        System.out.println("Vol of box :" + vol);
        box.show();

        System.out.println("=========================");

        Shipment shipment = new Shipment(100.1d, 100.2d, 100.130d, 980.23d, 7199.99f,
                "blue");
        double volOfShipment = shipment.volume();
        System.out.println("Vol of shipment: " + volOfShipment);
        shipment.show();

        System.out.println("=========================");

        SuperClass s = new SuperClass();

        SuperClass link;
        link = s;
        link.showClass();

        System.out.println("=========================");

        link = uc;
        link.showClass();
    }
}

