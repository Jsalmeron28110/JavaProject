package class11;

public class E1StringMethods {
    public static void main(String[] args) {
        String str="Batch 17 is great.";

        System.out.println(str.charAt(0));  // works as if you were picking a letter from an array ( index 0 ) you get B.
        System.out.println(str.charAt(4));
        int lastIndex=str.length();
        System.out.println(lastIndex);
        System.out.println(str.charAt(str.length()-1));


    }
}
