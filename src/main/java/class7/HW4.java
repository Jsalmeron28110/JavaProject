package class7;

public class HW4 {
    public static void main(String[] args) {


        String[] cars = {"Mercedes", "BMW", "Honda", "Toyota", "Nissan","Dodge"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
        System.out.println();
        String[] cars2 = {"Mercedes", "BMW", "Honda", "Toyota", "Nissan","Dodge"};
        int i = 0;
        while (i < cars2.length) {
            System.out.print(cars[i]+" ");


            i++;
        }
    }
}