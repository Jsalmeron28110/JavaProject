package class12;

public class HW1 {
    int prime(int num) {
        int result=0;
        if (num > 1) {
            result = num;
            if (num == 2 || num == 3) {
                result = num;
                System.out.println(result + " is a prime number");
            } else if (num % 2 == 1 && num % 3 != 0) {
                result = num;
                System.out.println(result + " is a prime number");
            } else {
                result = num;
                System.out.println(result + " is not prime");
            }

        }
        else{
            result = num;
            System.out.println(result + " is not prime");
        }
        return result;
    }
    public static void main (String[]args){
        HW1 prime = new HW1();
        prime.prime(19);
    }
}
