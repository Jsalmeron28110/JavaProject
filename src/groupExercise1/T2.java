package groupExercise1;

public class T2 {
    public static void main(String[] args) {
        /*
        Create an array of integer values. After the array is created, calculate
the sum of all stored elements in that array
           */
        int [] numbers={15,25,32,75,95};
        int sum=0;

        for (int i = 0; i < numbers.length ; i++) {
            sum+=numbers[i];
        }
        System.out.println(sum);





    }
}
