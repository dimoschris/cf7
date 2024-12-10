package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες < 18.
 * Ελέγχει αν μία ηλικία έχει δικαίωμα
 * να ψηφήσει.
 */
public class VoteEligible {

    public static void main(String[] args) {
        final int VOTING_AGE = 18;
        boolean isEligible = false;
        Scanner scanner = new Scanner(System.in);
        int age = 0;

        System.out.println("Please insert age");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible: " +isEligible);
    }
}
