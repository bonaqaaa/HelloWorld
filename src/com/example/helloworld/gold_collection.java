import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/* Exercise:

Write a Java program to add all the digits of a given positive integer until
the result has a single digit. */

public class gold_collection {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the integer: ");
        int num = in.nextInt();
        String s = String.valueOf(num);
        int first;
        int last;
        int digs;
        int fin;
        ArrayList<Integer> middle = new ArrayList<>(s.length() - 1);

        if (s.length() == 1) {
            System.out.println("Cannot execute.");
        }

        if (s.length() == 2) {

            last = num % 10;
            first = (num - last) / 10;

            digs = last + first;

            if (digs <= 9) {
                System.out.println(String.valueOf(true));
            } else {
                System.out.println(String.valueOf(false));
            }
        }

        if (s.length() > 2) {
            last = num % 10;
            for (int i = 1, mult = 10, temp; i <= s.length() - 1; i++, mult *= 10) {
                temp = (num / mult) % 10;
                middle.add(temp);
            }

            int sum_list = 0;
            for(int i = 0; i < middle.size(); i++) {
                sum_list += middle.get(i);
            }

            fin = sum_list + last;

            if (fin <= 9) {
                System.out.println(String.valueOf(true));
            } else {
                System.out.println(String.valueOf(false));
            }
        }
    }
}
