package class11;

import java.util.Scanner;

public class T3StringMethods {
    /*
    Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mom's first name?");
        String mom = scanner.nextLine();
        System.out.println("Dad's first name?");
        String dad = scanner.nextLine();
        System.out.println("Boy or Girl?");
        String gender = scanner.nextLine();


        int halfDad = dad.length() / 2;
        int halfMom = mom.length() / 2;

        if (gender.equalsIgnoreCase("Boy")) {
            String generatedName = dad.substring(0, halfDad) + mom.substring(halfMom);
            System.out.println(generatedName+" is you baby's name");
        } else if (gender.equalsIgnoreCase("Girl")) {
            String generatedName = mom.substring(0, halfMom) + dad.substring(halfDad);
            System.out.println(generatedName+" is you baby's name");
        } else {
            System.out.println("Invalid gender input. Please enter 'Boy' or 'Girl'.");
        }
    }
}