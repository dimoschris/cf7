package gr.aueb.cf.ch3;

/**
 * Calculates the sum amd mul of
 * first ten integers.
 */
public class SumMul {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        int mul = 1;

        while (i <= 10) {
            sum += i; // sum = sum + i;
            i++;
        }

        while (i <= 10) {
            mul = mul * j;
            j++;
        }
    }
}
