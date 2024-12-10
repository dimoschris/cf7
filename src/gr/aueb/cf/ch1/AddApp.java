package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 * and the result is printed at console
 * (standard output)
 */

public class AddApp {

    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Εντολες
        result = num1 + num2;

        // Εκτυπωση αποτελεσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το αποτέσμα των " + num1 + ", " + num2 + " είναι ίσο με: " + result);
        System.out.printf("Το άθροισμα των %d, %d είναι ίσο με: %d\n", num1, num2, result);
        System.out.printf("Το αποτέλεσμα του αθροίσματος είναι: %d", result);
    }
}
