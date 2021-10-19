/*
Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */

package week7;

import java.util.Scanner;

public class Question16 {


    public static void main(String[] args) {
        int a;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter any number");
        a = num.nextInt();

        checkNum(a);
    }

    public static void checkNum(int a) {
        if (a == 0) {
            System.out.println("ZERO");
        } else if (a > 0) {
            System.out.println("POSITIVE");
        } else {
            System.out.println("NEGATIVE");
        }
    }

}
