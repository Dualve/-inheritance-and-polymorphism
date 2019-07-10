package com.company;

public class UnderBox extends Box {
    private String color;
    private double weight;

    UnderBox(double width, double height, double depth, double weight,
             String color) {
        super(width, height, depth);
        this.weight = weight;
        this.color = color;
    }

    UnderBox(double len, double weight, String color) {
        super(len);
        this.weight = weight;
        this.color = color;
    }


    UnderBox(UnderBox ob) {
        super(ob);
        this.color = ob.color;
        this.weight = ob.weight;
    }

    void show() {
        super.show();
        System.out.println(" Weight: " + weight + " ;\n Color: "
                + color + " ;");
    }
}
