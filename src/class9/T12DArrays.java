package class9;

public class T12DArrays {
    public static void main(String[] args) {

// print only even numbers from this array
        int[][] numbers = {
                {10, 20, 30, 40},
                {100, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) { // numbers[row] => gives us the complete 1D array
                if (numbers[row][column] % 2 != 0) {
                    System.out.print(numbers[row][column] + " ");

                }

            }
            System.out.println();
        }
    }
}
