package class8;

public class T4EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};

        int largest=0; // if negative you can initilize with 0 in arrray ex: int largest = nums[1]

        for (int n:nums){
            if (n>largest){
                largest=n;
            }
        }
        System.out.println(largest);


    }
}
