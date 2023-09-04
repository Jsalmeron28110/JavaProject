package groupExercise1;

public class T1 {
    public static void main(String[] args) {
    /* Create a program that uses an array to store a list of temperatures for
        a week, and then uses a loop to find the highest and lowest
        temperature for the week. */

        int [] temperature={75,77,82,80,92,87,91};

        int highestNum=temperature[0];
        int lowestNum=temperature[0];

        for (int i = 0; i < temperature.length ; i++) {
            if (temperature[i]>highestNum){
                highestNum=temperature[i];
            }
            if (temperature[i]<lowestNum){
                lowestNum=temperature[i];
            }

        }
        System.out.println("The highest temperature in the week is going to be "+highestNum);
        System.out.println("The Lowest temperature in the week is going to be "+lowestNum);



    }
}
