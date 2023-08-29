package groupExercise1;

public class T8 {
    public static void main(String[] args) {

        int[] numbers = {15, 25, 4, 8, 11, 20, 10};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }
            if (numbers[i] < min) {
                min = numbers[i];

            }

        }
        System.out.println("The minimum number in this array is "+min);
        System.out.println("The maximum number in this array is "+max);
    }
}