/*
Write a Java program to test if an array contains a specific value
 */

package week7;

public class Qurestion20 {

    public static void main(String[] args) {

        int [] num = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(contains(num,11));
        System.out.println(contains(num,1));

    }

    public static boolean contains(int[] arr, int value){

        for(int n : arr){
            if(value == n){
                return true;
            }
        }
        return false;
    }




}
