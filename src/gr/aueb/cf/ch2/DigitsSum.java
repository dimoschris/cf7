package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει ως input από το χρήστη ένα
 * διψήφιο ακέραιο και να εκτυπώνει
 * το άθροισμα των ψηφίων του.
 * Για παράδειγμα, αν ο χρήστης δώσει τον
 * ακέραιο 15, θα πρέπει το αποτέλεσμα να
 * είναι 1 + 5 = 6.
 */
public class DigitsSum {

    public static void main(String[] args) {

        int num;
        int digit1 = 0;
        int digit2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a two-digit integer: ");
        num = in.nextInt();
        digit1 = num / 10;
        digit2 = num % 10;
        sum = digit1 + digit2;

        System.out.printf("Το αποτέλεσμα είναι: %d", sum);

    }
}
