package class4;

import java.util.Scanner;

public class Hw4CreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String card = scanner.next();
        if (card.equals("yes")) {
            System.out.println("What is your card balance?");
            double balance = scanner.nextDouble();
            if (balance > 1000) {
                System.out.println("You must pay off this balance immediately!");
            } else {
                System.out.println("You can spend more!");
            }
        } else {
            System.out.println("Would you like to apply for a credit card?");
        }
        String apply= scanner.next();
    }
}