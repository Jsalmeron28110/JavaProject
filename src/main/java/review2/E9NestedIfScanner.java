package review2;

import java.util.Scanner;

public class E9NestedIfScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender=scanner.next().charAt(0);
        System.out.println("Please enter your age");
        int age=scanner.nextInt();

        if(age>25){
            if(gender=='F'){
                System.out.println("Woman");
            }else{
                System.out.println("Man");
            }
        }else{
            if (gender=='F'){
                System.out.println("Girl");
            }else{
                System.out.println("Boy");
            }
        }
    }
}




