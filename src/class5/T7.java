package class5;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please provide two numbers");
        double num1= scanner.nextDouble();
        double num2= scanner.nextDouble();
        System.out.println("Please enter Operators");
        char operator=scanner.next().charAt(0);

        if (operator=='+'){
            System.out.println(num1+num2);
        } else if (operator=='-') {
            System.out.println(num1-num2);
        } else if (operator=='*') {
            System.out.println(num1*num2);
        } else if (operator=='/') {
            System.out.println(num1/num2);
        }else {
            System.out.println("Invalid");
        }
    }
}
