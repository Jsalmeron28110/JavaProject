package groupProject2;

public class T3 {
    public static void main(String[] args) {
        String w="racecar";
        String rev="";

        for (int i =w.length()-1 ; i >=0 ; i--) {

            rev+=w.charAt(i);
        }

        if (w.equals(rev)){
            System.out.println("This is a Palindrome");
        }else{
            System.out.println("This is not a Palindrome");
        }
    }
}
