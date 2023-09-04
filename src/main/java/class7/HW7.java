package class7;

public class HW7 {
    public static void main(String[] args) {

        int[] numbers = {20,30,50, 60,100,15};
        int largestNum= numbers[0];

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] > largestNum){
                largestNum=numbers[i];
        }
        }
        System.out.println(largestNum);
    }

    }
