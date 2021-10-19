/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
package week7;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {
        char letter;
        Scanner city = new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F");
        letter = city.next().charAt(0);//read the first character

        cities(letter);

    }

    public static void cities(char letter){

        switch(letter){

            case 'A':
                System.out.println("Ahmedebad");
                break;
            case 'B':
                System.out.println("Baroda");
                break;
            case 'C':
                System.out.println("Chennai");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Edmonton");
                break;
            case 'F':
                System.out.println("Finchley");
                break;
            default:
                    System.out.println("Invalid Entry");
        }
    }

}
