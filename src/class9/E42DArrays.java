package class9;

public class E42DArrays {
    public static void main(String[] args) {


        int[][] numbers = {
                {10, 20, 30, 40},
                {100, 30, 35,45},
                {16,20, 32, 22}};

        for (int row = 0; row < numbers.length ; row++) {
            for (int column = 0; column < numbers[row].length ; column++) { // numbers[row] => gives us the complete 1D array
                System.out.print(numbers[row][column]+" ");

            }
            System.out.println();
        }

    }
    }
