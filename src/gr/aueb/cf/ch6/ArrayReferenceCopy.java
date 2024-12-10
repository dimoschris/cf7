package gr.aueb.cf.ch6;

/**
 * Copies the reference of the array.
 * It is a SHALLOW COPY. There are
 * side effects.
 */
public class ArrayReferenceCopy {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr;  // SHALLOW COPY

        for (int el : arrRefCopy) {
            System.out.print(el + " ");
        }

        arrRefCopy[4] = 100;
        System.out.println();

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
