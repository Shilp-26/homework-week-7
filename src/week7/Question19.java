/*
Write a Java program to calculate the average value of array elements.
 */

package week7;

public class Question19 {

    public static void main(String[] args) {

        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //calculate sum
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        //calculate average
        double avg = sum / num.length;
        System.out.println("The average of the array elements is: " + avg);

    }


}


