/*
Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
*/

package week7;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        char x;
        int num1;
        int num2;

        Scanner op = new Scanner(System.in);
        System.out.println("Enter first number");
        num1 = op.nextInt();
        System.out.println("Enter second number");
        num2 = op.nextInt();
        System.out.println("Enter the operator");
        x = op.next().charAt(0);

        operators(x, num1, num2);
    }

    public static void operators(char x, int num1, int num2) {

        if (x == '+') {
            System.out.println("Sum is: " + (num1 + num2));
        } else if (x == '-') {
            System.out.println("Difference is: " + (num1 - num2));
        } else if (x == '*') {
            System.out.println("Multiplication is: " + (num1 * num2));
        } else if (x == '/') {
            System.out.println("Division is: " + (num1 / num2));
        } else {
            System.out.println("Invalid Operator entered");
        }
    }
}
