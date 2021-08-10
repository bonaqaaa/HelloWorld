package com.example.helloworld;

import java.util.Scanner;

public class book {
    public static void main(String[] arg) {

        double a = 5.0;
        double b = 7.0;

        double x1 = a + b;
        double x2 = a - b;
        double x3 = a * b;
        double x4 = a / b;

        if (x1 > x2 && x1 > x3 && x1 > x4) {
            System.out.println("your number" + x1);
        } else if (x2 > x1 && x2 > x3 && x2 > x4) {
            System.out.println("your number" + x2);
        } else if (x3 > x1 && x3 > x2 && x3 > x4) {
            System.out.println("your number" + x3);
        } else if (x4 > x1 && x4 > x2 && x4 > x3) {
            System.out.println("your number" + x4);
        }




    }
}
