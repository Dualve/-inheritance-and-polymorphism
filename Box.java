package com.company;

abstract public class Box {
    private double width, height, depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    Box(double len) {
        width = height = depth = len;
    }

    final double volume() {
        return width * height * depth;
    }

    void show() {
        System.out.print("Box's characteristics:\n Width: " + width
                + " ;\n Height: " + height + " ;\n Depth: " + depth + " ;\n");
    }
}
