package class24;

import java.util.ArrayList;

public class T2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();

        drinks.add("water");
        drinks.add("juice");
        drinks.add("soda");
        drinks.add("beer");

        // System.out.println(drinks); instead of for loop to print drinks

        for (int i = 0; i <drinks.size() ; i++) {

            if (drinks.get(i).contains("a")|| drinks.get(i).contains("e")){ // reason we use .get(i) it will go through. if using .contains need the entire word to find.
                drinks.set(i,"water");

            }

        }
        System.out.println(drinks);

    }
}
