package class12;

public class E2Methods {
    int add(int num1, int num2) {
        int result = num1 + num2;
        return result;

    }

    int multiply(int num) {
        int result = num * 10;
        return result;

    }

    int largest(int num1, int num2) {
            int result;

        if (num1 > num2) {
            result = num1;
            System.out.println(result + " is the largest number.");


        } else {
             result = num2;
            System.out.println(result + " is the largest number.");

        }
        return result;
    }
    String createEmail(String firstName,String lastName,String emailType){
        String res=firstName+lastName+"@"+emailType+".com";
        return res;
    }
}
