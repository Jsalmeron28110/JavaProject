package class19;

public class OverloadPrivate {
    private int min(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    private double min(double num1, double num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        MinNumber m = new MinNumber();
        System.out.println(m.min(15, 10));
        System.out.println(m.min(50.2, 75.1));

    }
}

