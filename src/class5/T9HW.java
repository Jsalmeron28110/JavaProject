package class5;

import java.util.Scanner;

public class T9HW {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your current time");
        int time= scanner.nextInt();

        if (time>=1  && time<=11){
            System.out.println("It is morning");
        } else if (time>=12 && time<=15) {
            System.out.println("It is the afternoon");
        }else if (time>=16 && time<=20){
            System.out.println("it is evening");
        } else if (time>=21 && time<=24) {
            System.out.println("It is night");
        }else {
            System.out.println("Invalid time");
        }
    }
}
