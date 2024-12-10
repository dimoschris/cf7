package gr.aueb.cf.ch6;

import javax.swing.*;

/**
 * Δήλωση και αρχικοποίηση ενός πίνακα.
 * Populate έναν πίνακα.
 * -new
 * -unsized init
 * -array initializer
 * -print τα στοιχεία ενός πίνακα
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3]; // declare and initialize
        int[] arr2 = {1, 2, 3, 4, 5}; // unsized initialization
        int[] arr3;
        arr3 = new int[]{1, 2, 3, 4, 5}; // array initializer

        //Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // traverse, διασχιση και εκτυπωση της καθε θεσης
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // enhanced for
        for (int el : arr3) {
            System.out.println(el + " ");
        }
    }
}
