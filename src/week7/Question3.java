/*
Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________
 */

package week7;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        int roll, math, science, english, total;
        int marks;
        double avg;
        String name, result = null, grade = null;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        name = scan.next();
        System.out.println("Enter Student roll no:");
        roll = scan.nextInt();
        System.out.println("Math marks: ");
        math = scan.nextInt();
        while (math < 0 && math > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100\"");
        }

        System.out.println("Science marks: ");
        science = scan.nextInt();
        while (science < 0 && science > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100\"");
        }

        System.out.println("English marks: ");
        english = scan.nextInt();
        while (english < 0 && english > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100\"");
        }

        total = math + science + english;
        avg = total / 3;


        if (avg >= 35) {
            result = "Pass";
        } else if (avg >= 80) {
            grade = "A+";
        } else if (avg >= 60) {
            grade = "A";
        } else if (avg >= 50) {
            grade = "B";
        } else if (avg >= 35) {
            grade = "C";
        } else {
            result = "Fail";
        }

        System.out.println("-------------------------------");
        System.out.println("|                              |");
        System.out.println("|        Mark Sheet            |");
        System.out.println("|______________________________|");
        System.out.println("|    Name        :     "+name +"     |");
        System.out.println("|    Roll no     :      "+roll+"      |");
        System.out.println("|______________________________|");
        System.out.println("|    Subjects    :      Marks  |");
        System.out.println("|______________________________|");
        System.out.println("|    Math        :     "+math +"      |");
        System.out.println("|    Science        :     "+science +"   |");
        System.out.println("|    English        :     "+english +"   |");
        System.out.println("|______________________________|");
        System.out.println("|    Total        :     "+total +"     |");
        System.out.println("|                              |");
        System.out.println("|    Percentage        :     "+avg +" |");
        System.out.println("|    Result        :     "+result +"  |");
        System.out.println("|    Grade        :     "+grade +"  |");


    }


}
