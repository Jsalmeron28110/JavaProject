package class11;

public class E9StringMethods {
    public static void main(String[] args) {
        String str="Hi There how are you.I am Good. I am Driving";
        String [] strs=str.split("[.\\s]" );// splits everything after the space and period everything will be printed separate, stores in an array
        System.out.println(strs.length);
        System.out.println(strs[9]); // indexes are always one less than the length
        for (String s:strs){
            System.out.println(s);
        }



        }
    }

