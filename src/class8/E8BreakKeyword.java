package class8;

public class E8BreakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Outer Loop");

            for (int j = 0; j < 5; j++) {
                System.out.println("Inner Loop");
                if (j == 2) {
                    break;
                }

            }

        }

        }
}
