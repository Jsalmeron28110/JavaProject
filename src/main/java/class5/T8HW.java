package class5;

import java.util.Scanner;

public class T8HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grade for your quiz");
        double quizGrade = scanner.nextDouble();
        System.out.println("Please enter your mid term grade");
        double midtermGrade = scanner.nextDouble();
        System.out.println("please enter your final scores");
        double finalScores = scanner.nextDouble();
        double results = (quizGrade + midtermGrade + finalScores) / 3;

        if (results >= 90) {
            System.out.println("Your grade is an A");

        } else if (results >= 70 && results < 90) {
            System.out.println("Your grade is a B");
        } else if (results >= 50 && results < 70) {
            System.out.println("Your grade is a C");

        } else if (results < 50) {
            System.out.println("Your grade is a F");
        } else {
            System.out.println("You Failed");
        }
    }
}
