package class5;

import java.util.Scanner;

public class T6Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your grade");
        String grade=scanner.nextLine();
        System.out.println("Based of your entry your garde is "+grade);

        switch(grade){
            case"A":
                System.out.println("Excellent");
                break;
            case"B":
                System.out.println("Good");
                break;
            case"C":
                System.out.println("Average");
                break;
                case"D":
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not acceptable");
        }

        }

    }

