import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/* Write a Java program to form a staircase shape of n coins where every k-th row must have
exactly k coins. */



public class gold_collection_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the integer: ");
        int num = in.nextInt();
        String dollar = "$";

        if (num > 0) {
            System.out.print(dollar);
            num -= 1;
            for (int i = 1, count_local = 0, count_previous = 1; i <= num; ) {
                System.out.println();
                while (count_local <= count_previous && i <= num) {
                    System.out.print(dollar);
                    count_local++;
                    i++;
                }

                count_previous = count_local;
                count_local = 0;
            }
        }


    }

}