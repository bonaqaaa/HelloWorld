package com.example.helloworld;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;


public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = in.nextInt();
        int i = 1;
        int a = 0;

        while (i <= number) {
            if (number % i == 0) {
                a++;
            }
            i++;
        }
        System.out.println(a);
        }
    }
