package com.company;

public class UnderClass extends SuperClass {
    public int k;

    final void showk() {
        System.out.println("k : " + k);
    }

    void showClass(){System.out.println("This is UnderClass.");}

    final void sum() {
        System.out.println("Sum of i+j+j = " + (i + j + k));
    }
}
