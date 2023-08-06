package class5;

import java.util.Scanner;

public class T1OROperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month you were born");
        String monthBorn = scanner.nextLine();


        if (monthBorn.equalsIgnoreCase("Jan") || monthBorn.equalsIgnoreCase("Feb") || monthBorn.equalsIgnoreCase("Dec")) {
            System.out.println("You were born in season winter");

        } else if (monthBorn.equalsIgnoreCase("Mar") || monthBorn.equalsIgnoreCase("Apr") || monthBorn.equalsIgnoreCase("May")) {
            System.out.println("You were born in season spring");
        } else if (monthBorn.equalsIgnoreCase("Jun") || monthBorn.equalsIgnoreCase("Jul") || monthBorn.equalsIgnoreCase("Aug")) {
            System.out.println("You were born in season summer");
        } else if (monthBorn.equalsIgnoreCase("Sept") || monthBorn.equalsIgnoreCase("Oct") || monthBorn.equalsIgnoreCase("Nov")){
            System.out.println("You were born in season fall");
    }else {
            System.out.println("invalid input");
        }
    }
}




