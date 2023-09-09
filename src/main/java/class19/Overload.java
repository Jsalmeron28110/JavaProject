package class19;

public class Overload {

    public static void number( int num1){
        System.out.println(num1);
    }
    public static void number(double num1){
        System.out.println(num1);

    }
    public static void number(int num1, int num2){
        System.out.println(num1);
        System.out.println(num2);

    }

    public static void main(String[] args) {
        number(10);
        number(75.2);
        number(14,15);

    }
}
