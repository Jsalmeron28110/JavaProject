package class7;

public class T10Arrays {
    public static void main(String[] args) {

        int[] quantity = {20, 10, 50, 30, 40}; // add all numbers
        int sum=0;
        for (int i = 0; i < quantity.length ; i++) {
            sum=sum+quantity[i];//pick the previous value of sum and add it to the current value of array

        }
        System.out.println(sum);
        }
    }
