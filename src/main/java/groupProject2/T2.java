package groupProject2;

public class T2 {
    public static void main(String[] args) {

        String w="Hello";
        String rev="";

        for (int i =w.length()-1 ; i >=0 ; i--) {

            rev+=w.charAt(i);

        }
        System.out.println(rev);


    }

}
