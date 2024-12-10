package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is dark.
 */
public class LightsOn {

    public static void main(String[] args) {
        boolean areLightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        speed = in.nextInt();

        areLightsOn = (isRaining && (speed > 100) || isDark);

        System.out.println("Lights on: " + areLightsOn);
    }
}
