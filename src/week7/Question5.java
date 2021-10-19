/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip                  |
|______________________________|
| Employee Id : 2564           |
| Employee Name : Jay          |
|______________________________|
| Basic Salary : 25000.0       |
| HRA 10% : 2500.0             |
| TA 8% : 2250.0               |
| DA 9% : 2000.0               |
| PF - 20& : 5000.0            |
|______________________________|
| Gross Salary : 26750.0       |
|==============================|

 */

package week7;


import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        int empId;
        double salary;
        String empName;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        empId = scan.nextInt();
        System.out.println("Enter Employee name: ");
        empName = scan.next();
        System.out.println("Enter your basic salary: ");
        salary = scan.nextDouble();

        double hra = 0.1 * salary;
        double da = 0.08 * salary;
        double ta = 0.09 * salary;
        double pf = 0.2 * salary;
        double gross = salary + hra + da + ta - pf;

        System.out.println("_______________________________");
        System.out.println("|        Salary Slip           |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id : "+ empId + "           |");
        System.out.println("| Employee Name : "+ empName + "          |");
        System.out.println("|______________________________|");
        System.out.println("|| Basic Salary : "+ salary+"      |");
        System.out.println("| HRA 10% : "+ hra +"             |");
        System.out.println("| TA 8% :  "+ ta +"              |");
        System.out.println("| DA 9% :  "+ da +"              |");
        System.out.println("| PF -20& :  "+ pf +"            |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary : "+gross+"       |");
        System.out.println("|==============================|");

    }

//    public void salarySlip(){
//
//        int empId;
//        double salary;
//        String empName;
//
//        double hra = 0.1 * salary;
//        double da = 0.08 * salary;
//        double ta = 0.09 * salary;
//        double pf = 0.2 * salary;
//        double gross = salary + hra + da + ta - pf;
//
//        System.out.println("_______________________________");
//        System.out.println("|        Salary Slip           |");
//        System.out.println("|______________________________|");
//        System.out.println("| Employee Id : "+ empId + "           |");
//        System.out.println("| Employee Name : "+ empName + "          |");
//        System.out.println("|______________________________|");
//        System.out.println("|| Basic Salary : "+ salary+"      |");
//        System.out.println("| HRA 10% : "+ hra +"             |");
//        System.out.println("| TA 8% :  "+ ta +"              |");
//        System.out.println("| DA 9% :  "+ da +"              |");
//        System.out.println("| PF -20& :  "+ pf +"            |");
//        System.out.println("|______________________________|");
//        System.out.println("| Gross Salary : "+gross+"       |");
//        System.out.println("|==============================|");
//    }
}
