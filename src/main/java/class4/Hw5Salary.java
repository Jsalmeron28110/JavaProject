package class4;

import java.util.Scanner;

public class Hw5Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of years you have worked.");
        double yearsWorked = scanner.nextDouble();
        System.out.println("Please enter your yearly salary.");
        double yearlySalary = scanner.nextDouble();
        if (yearsWorked >= 5) {
            System.out.println("You are eligible for a bonus!");
            if (yearlySalary > 50000) {
                System.out.println("your bonus is $5,000!");
            } else {
                System.out.println("your bonus is $3,000!");}
            }else{
            System.out.println("You are not eligible for a bonus.");


        }
    }
}
