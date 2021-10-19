/*
Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
 */
package week7;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOrOdd = (num % 2 == 0) ? "Even number" : "Odd number";

        System.out.println(num + " is " + evenOrOdd);


    }
}

