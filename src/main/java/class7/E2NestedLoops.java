package class7;

public class E2NestedLoops {
    /*
  1 2 4 5 6
  1 2 4 5 6
  1 2 4 5 6
  1 2 4 5 6
   */
    public static void main(String[] args) {



        for (int j = 0; j < 2; j++) {

            for (int i = 0; i <10 ; i++) {
                System.out.print("+");
            }
            System.out.println();
        }



    }
}