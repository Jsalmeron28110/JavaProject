package class7;

public class HW5 {
    public static void main(String[] args) {


        String[] animals = {"Fish", "Bird", "Lion", "Cat", "Dog",};
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);

        }
        System.out.println();
        String[] animals2 = {"Fish", "Bird", "Lion", "Cat", "Dog"};
        int i = 0;
        while (i < animals2.length) {
            System.out.print(animals[i]+" ");


            i++;
        }
    }
}