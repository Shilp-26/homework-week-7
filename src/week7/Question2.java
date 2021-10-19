/*Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
*/

package week7;

import java.util.Scanner;

public class Question2 {


    public static void main(String[] args) {

        int year;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any year");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;


//        Question2 check =new Question2();
//        check.checkIfLeap();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }
        if (isLeap == true) {
            System.out.println(year + " is a leap year");
        } else
            System.out.println(year + " is not a leap year");

    }
//    public void checkIfLeap(){
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0)
//                    isLeap = true;
//                else
//                    isLeap = false;
//            } else
//                isLeap = true;
//        } else {
//            isLeap = false;
//        }
//        if(isLeap==true){
//            System.out.println(year + " is a leap year");
//        }else
//            System.out.println(year + " is not a leap year");
//
//    }

}


