package class24;

import java.util.ArrayList;

public class T3ArrayList {
    public static void main(String[] args) {

        ArrayList<String>words=new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");
        System.out.println(words);

/*        for (int i = words.size()-1; i >0 ; i--) {

            if (words.get(i).contains("e")){
                words.remove(i);

            }

        }*/

        /*words.removeIf((String x) -> {
                    if (x.endsWith("e")) {
                        return true;

                    } else {
                        return false;
                    }
                });*/


        words.removeIf(x->x.endsWith("e"));



        System.out.println(words);

    }
}
