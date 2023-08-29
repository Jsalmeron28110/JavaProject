package class11;

public class T5 {
    public static void main(String[] args) {
        String str="Saturday is the day to learn Java";
        String [] arr=str.split("[\\s]");
        for (String s:arr){
            System.out.print(s);
        }

    }
}
