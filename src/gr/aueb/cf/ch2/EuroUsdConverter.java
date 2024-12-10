package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *Converts euro to usd.
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        // Εντολές
        System.out.println("Please insert amount (euro)");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("Έχουμε %d δολάρια και %d cents", usaDollars, usaCents);
    }
}
