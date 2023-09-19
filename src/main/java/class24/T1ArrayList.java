package class24;

import java.util.ArrayList;

public class T1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Joe");
        names.add("Mike");
        names.add("John");
        names.add("Jack");
        names.add("Tim");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Joe"));
        System.out.println(names.size());

        // System.out.println(names); instead of for loop to print names

        for (String n:names){
            System.out.println(n);
        }

    }
}
