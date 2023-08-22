package class10;

public class E8StringDemo {
    public static void main(String[] args) {
        String str = "Today is a java Class";
        System.out.println(str.startsWith("T"));// case sensitive
        System.out.println(str.startsWith(" Today"));// has to be exact match
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("Class"));
    }



    }

