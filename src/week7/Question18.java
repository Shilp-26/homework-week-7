/*
Write a Java program to sum values of an array.
 */

package week7;

public class Question18 {


    public static void main(String[] args) {
        int[] num = {1, 34, 32, 324, 556};
        int sum =0;

        for(int i : num){
            sum += i;

        }
        System.out.println("Sum is " + sum);

    }
}
