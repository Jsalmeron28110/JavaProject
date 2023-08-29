package class12;

public class E3StringVsStringBuilder {
    public static void main(String[] args) {
        String name="Barber";
        name="Azam";// think of these as boxes the first original name is box 01 and this reassign is 02
        System.out.println(name);
        StringBuilder sb=new StringBuilder("Sunday");
        sb.reverse();
        System.out.println(sb);

        StringBuffer sf=new StringBuffer("Sunday");// 1 key difference compared to StringBuilder
        sf.reverse();
        System.out.println(sf);

    }
}
