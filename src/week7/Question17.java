/*
Write a Java program to sort a numeric array and a string array
 */

package week7;

import java.util.Arrays;

public class Question17 {

    public static void main(String[] args) {

        int[] num = {12, 55, 35, 756, 436, 457, 456, 2};

        String[] word = {"Hi", "Bye", "Welcome", "Prime", "Testing"};

        System.out.println("Original numeric array: " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Sorted numeric array: " + Arrays.toString(num));

        System.out.println("Original string array: " + Arrays.toString(word));
        Arrays.sort(word);
        System.out.println("Sorted string array: " + Arrays.toString(word));

    }
}
