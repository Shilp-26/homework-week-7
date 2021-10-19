package week7;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter any character");
        char x = check.next().charAt(0);
        checkIfSymbol(x);

    }

    public static void checkIfSymbol(char x) {
        if (x >= 'a' && x <= 'z') {
            System.out.println("Alphabet");
        } else if (x >= '0' && x <= '9') {
            System.out.println("Number");
        } else {
            System.out.println("Symbol");
        }
    }
}
