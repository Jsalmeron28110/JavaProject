package groupExercise1;

public class T4 {
    public static void main(String[] args) {

    /*
    Create a 2D array of integers. Develop a program which will calculate
    the sum of even and odd numbers for that array.
    */
        int [][] numbers={
                {10,11,12,13},
                {20,21,24,27},
                {33,35,36,38}
        };
        int countEven=0;
        int countOdd=0;

        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if (numbers[i][j] %2==0){
                    countEven++;

                    }  if (numbers[i][j] %2!=0){
                    countOdd++;
                }

            }

        }
        System.out.print("The sum of even numbers in the 2D array is "+countEven);
        System.out.println();
        System.out.println("The sum of odd numbers in the 2D array is "+countOdd);

    }
}
