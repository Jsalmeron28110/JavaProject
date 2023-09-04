package class6;

import java.util.Scanner;

public class T7WhileLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int input;
        System.out.println("please enter a number or -1 to terminate");
        input=scanner.nextInt();
        System.out.println("Your number is "+input);

        while (input !=-1){
            System.out.println("please enter a number or -1 to terminate");
            input=scanner.nextInt();
            System.out.println("Your number is "+input);
        }


        }
    }


