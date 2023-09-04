package class4;

public class T2 {
    public static void main(String[] args) {
        double mortgageRate = 3.2;
        double mortgagePrice = 450000;

        if (mortgageRate > 4.5) {
            System.out.println("You will not buy a house");
        } else {
            System.out.println("You will consider buying");

            if (mortgagePrice > 300000) {
                System.out.println("You will take a loan");
            } else {
                System.out.println("You will pay cash");
            }

        }
    }
}

