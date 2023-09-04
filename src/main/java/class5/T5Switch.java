package class5;

import java.util.Scanner;

public class T5Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your country");
        String country=scanner.nextLine();
        country=country.toLowerCase();



        switch (country){
            case "brazil":
                System.out.println("portuguese");
                break;
            case "mexico":
                System.out.println("Spanish");
                break;
            case "india":
                System.out.println("hindi");
                break;
            case "bolivia":
                System.out.println("spanish");
                break;
            case "afghanistan":
                System.out.println("farsi");
                    break;
            default:
                System.out.println("country not supported");
            }
        }


    }

