import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.lang.*;
import java.util.*;
import java.lang.Character;


public class HelloWorld {
    public static int cheburek(int[] arr) {
        Arrays.sort(arr);
        int second_el = arr[arr.length-2];
        return second_el;
    }

    public static void main(String[] arg) {
        System.out.println(cheburek(new int[] { 30, 10, 0, 131, 11 }));
    }

    public static void kek() {
        System.out.println("cheburek");
    }
}



// System.out.println("New Array: "+Arrays.toString(array1));






        // System.out.println(String.valueOf(after));

        // System.out.println("New Array: "+Arrays.toString(new_str));

