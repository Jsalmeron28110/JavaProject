package groupExercise1;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {

        /*
        Write a java program to check whether a given number is prime or
        not?
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input a number");
        int number=scanner.nextInt();

        if (number %2==0){
            System.out.println("This number is not a prime number.4");
        }else{
            System.out.println("This number is a prime number.");
        }
    }
}
