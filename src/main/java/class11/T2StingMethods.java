package class11;

public class T2StingMethods {
    public static void main(String[] args) {
        String str="Sunday";
        String revered="";
        for (int i = str.length()-1; i >=0 ; i--) {
            revered=revered+str.charAt(i);

        } System.out.print(revered);
    }
}
