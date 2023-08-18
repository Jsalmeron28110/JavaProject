package class7;

public class T9Arrays {
    public static void main(String[] args) {

        int[] quantity = {20, 29, 48, 69, 60}; // print only even numbers
        for (int i = 0; i < quantity.length; i++) {
        if(quantity[i]%2==0)
                System.out.println(quantity[i]);


        }
    }
}