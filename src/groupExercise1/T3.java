package groupExercise1;

public class T3 {
    public static void main(String[] args) {
       /*
       Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even
numbers only.
        */

        int [][] numbers={
                {1,5,8,4},
                {2,10,6,7},
                {17,12,18,21},
                {32,30,31,35}
        };
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }
            System.out.println();

        }





        }}
