package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger demo.
 */
public class BigIntApp {

    public static void main(String[] args) {
        // Declarations and initializations
        BigInteger bigNum1 = new BigInteger("12345678998765432199990");
        BigInteger bigNum2 = new BigInteger("23456789987654321");
        BigInteger result;

        // Commands
        result = bigNum1.add(bigNum2);

        // Printing the results
        System.out.printf("%, d", result);
    }
}