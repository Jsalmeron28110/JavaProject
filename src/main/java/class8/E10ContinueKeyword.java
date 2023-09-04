package class8;

public class E10ContinueKeyword {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {

            System.out.println("Batch 17 is the greatest of all time");
            if (i%2==0){
                continue; // skip
            }
            System.out.println(" I was kidding");
        }
    }
}