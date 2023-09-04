package class5;

import java.util.Scanner;

public class test {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Do you need a loan?");
            boolean answer = scanner.nextBoolean();


            if (answer) {
                System.out.println("what is your credit score");
                int score = scanner.nextInt();
                if (score <= 600) {
                    System.out.println("Your eligibility is Not eligible");
                } else if (score >= 600 && score <= 700) {
                    System.out.println("Your eligibility is Maybe eligible");
                } else if (score >= 701 && score <= 800) {
                    System.out.println("Your eligibility is Eligible");
                } else if (score > 800)
                    System.out.println("Your eligibility is Definitely eligible");

            } else {
                System.out.println("Unknown");
            }
        }
    }
