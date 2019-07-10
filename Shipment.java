package com.company;

final public class Shipment extends UnderBox {
    private float cost = 0;

    Shipment(double width, double height, double depth, double weight,
             float cost, String color) {
        super(width, height, depth, weight, color);
        this.cost = cost;
    }

    Shipment(double len, double weight, String color, float cost) {
        super(len, weight, color);
        this.cost = cost;
    }


    Shipment(Shipment ob) {
        super(ob);
        this.cost = ob.cost;
    }

    final void show(){
        super.show();
        System.out.println(" Cost: " + cost + " ;");
    }
}
