package week7;

import java.util.Scanner;

public class Question6 {

    int a;

    public static void main(String[] args) {
        int a;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number: ");
        a= scan.nextInt();
        oddEven(a);

    }

    public static void oddEven(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}


