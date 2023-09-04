package groupExercise1;

public class T7 {
    public static void main(String[] args) {
        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series.
         */

        int[] fibonacci = new int[10];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        }
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] +" ");

        }
    }
}
