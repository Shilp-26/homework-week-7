/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */

package week7;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        char letter;
        Scanner city = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F");
        letter = city.next().charAt(0);//read the first character

        cities(letter);
    }

    public static void cities(char letter) {
        if (letter == 'A') {
            System.out.println("Ahmedabad");
        } else if (letter == 'B') {
            System.out.println("Baroda");
        } else if (letter == 'C') {
            System.out.println("Chennai");
        } else if (letter == 'D') {
            System.out.println("Delhi");
        } else if (letter == 'E') {
            System.out.println("Edmonton");
        } else if (letter == 'F') {
            System.out.println("Finchley");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}
