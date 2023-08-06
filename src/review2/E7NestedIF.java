package review2;

public class E7NestedIF {
    public static void main(String[] args) {

        String day="Sunday";
        double accountBalance = 5000;
        // == equals() !== !equals()
        if (day.equals("Sunday")) {

            if (accountBalance > 2000) {
                System.out.println("We can buy this");

            } else {
                System.out.println("Its to expensive");
            }

        }else {
            System.out.println("Lets wait for Sunday");

        }


    }
        }

