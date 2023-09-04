package class12;

public class tets {
    public static void main(String[] args) {
        String str="noon";
        String revered="";
        for (int i = str.length()-1; i >=0 ; i--) {
            revered=revered+str.charAt(i);

        } System.out.print(revered);
    }
}
