/*
4. Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Example of input/Output:
● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
● isLeapYear(1600); should return true since 1600 is a leap year
● isLeapYear(2017); should return false since 2017 is not a leap year
● isLeapYear(2000);should return true because 2000 is a leap year
Write another method getDaysInMonth with two parameter month and year. Both of type
int.
If parameter month is < 1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years
they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.
 */

package week7;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        int year;
        int month;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year and month");
        year = scan.nextInt();
        month = scan.nextInt();

        isLeapYear(year);
        getDaysInMonth(year, month);

    }

    public static boolean isLeapYear(int year) {
        boolean result;
        if (year >= 1 && year <= 9999) {
            System.out.println("This is a leap year");
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        } else {
            System.out.println("This is not a leap year");
            return false;
        }
    }

    public static int getDaysInMonth(int year, int month) {
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("This month has 31 days");
                    return 31;
                case 2: {
                    if (isLeapYear(year)) {
                        System.out.println("This month has 29 days");
                        return 29;
                    } else {
                        System.out.println("This month has 28 days");
                        return 28;
                    }
                }
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("This month has 30 days");
                    return 30;

                default:
                    return -1;

            }
        }
    }

}
