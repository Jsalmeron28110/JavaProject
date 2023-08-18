package class8;

public class T3Arrays {
    public static void main(String[] args) {
// count how many numbers are greater than 10 in the below array
        // expected answer 3
        int [] numbers={10,20,4,3,8,45,96};
        int result=0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>10){
                result++;
            }

        }
        System.out.println(result);
    }
}
