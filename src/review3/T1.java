package review3;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is your tesla fast?");
        boolean isFast=scanner.nextBoolean();
        System.out.println("Is your tesla quiet?");
        boolean isQuiet=scanner.nextBoolean();
        System.out.println(isFast&&isQuiet);


    }
}
