/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%

 */

package week7;

import java.util.Scanner;

public class Question7 {

    double a;
    int salesId;
    String name;
    double salary;

    public static void main(String[] args) {
        double a;
        int salesId;
        String name;
        double salary;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sales ID: ");
        salesId = scan.nextInt();
        System.out.println("Enter sellers name");
        name = scan.next();
        System.out.println("Enter Sales Amount: " );
        a = scan.nextDouble();
        System.out.println("Enter basic Salary: ");
        salary = scan.nextDouble();

        commission(a);
    }

    public static void commission(double a){
        if(a>=50000){
            System.out.println("Comissions is: "+ a*0.35);
        }else if(a>=30000){
            System.out.println("Commission is: "+ a*0.2);
        }else if(a>=20000){
            System.out.println("Commision is: " + a*0.1);
        }else if(a>=10000){
            System.out.println("Commision is: " + a*0.05);
        }else {
            System.out.println("Commision is: " + a*0.02);
        }
    }
}
