package class12;

public class HW3 {

    void check(String word){
        String revered="";
        for (int i = word.length()-1; i >=0 ; i--) {
            revered=revered+word.charAt(i);

        } if (word.equals(revered)){
            System.out.println(word+" is a palindrome");
        }else{
            System.out.println( word+" is not a palindrome");
        }
    }

    public static void main(String[] args) {


        HW3 obj = new HW3();
        obj.check("noon");
    }
}
