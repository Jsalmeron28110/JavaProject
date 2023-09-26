package groupProject2;

import java.util.ArrayList;

public class T7 {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Apricot");
        fruit.add("Mango");
        fruit.add("Avocado");


        fruit.removeIf(x -> !x.startsWith("A"));
        System.out.println(fruit.toString().toLowerCase());

    }
}
