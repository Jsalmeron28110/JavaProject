package class24;

import java.util.ArrayList;

public class T5 {
    /*
    create an arrayList of fruit then remove all the fruit which contains
        the letter a or ends with the letter e
     */
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("pear");
        fruit.add("mango");
        fruit.add("banana");
        //fruit.remove(0);
        System.out.println(fruit);

        fruit.removeIf(x->x.contains("a")||x.endsWith("e"));
        System.out.println(fruit);


    }
}
