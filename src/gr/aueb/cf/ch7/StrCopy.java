package gr.aueb.cf.ch7;

/**
 * Ta Strings είναι immutable και δεν
 * επηρρεάζει το αντίγραφο της αναφοράς.
 * Οπότε έχουμε έγκυρο copy με αντίγραφή
 * της αναφοράς.
 */
public class StrCopy {

    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = s1;
    }
}
