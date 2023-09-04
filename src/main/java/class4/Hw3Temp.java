package class4;

import java.util.Scanner;

public class Hw3Temp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your city");
        String city= scanner.nextLine();
        System.out.println("Please enter your temperature in Fahrenheit and we will convert it to Celsius!");
        double temp= scanner.nextDouble();
        double celsius=(temp-32)*5/9;
        System.out.println("The temperature in the city " +city+" is " +celsius+"°C");


    }
}
