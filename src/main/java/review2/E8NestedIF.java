package review2;

import java.util.Scanner;

public class E8NestedIF {

        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            boolean isSunny;
            int temperature;
            System.out.println("Is it sunny outside?");
            isSunny=scanner.nextBoolean();

            if(isSunny){
                System.out.println("It is a sunny day, I should go somewhere!");
                System.out.println("What is the temperature outside?");
                temperature=scanner.nextInt();
                if (temperature>85){
                    System.out.println("I am going to the beach");
                }else{
                    System.out.println("I am going to the park");
                }
            }else{
                System.out.println("I stay home and practice Java");
            }

        }
    }

