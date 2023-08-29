package class12;

public class E2MethodsTester {
    public static void main(String[] args) {
        E2Methods e2=new E2Methods();
       int sum= e2.add(10,10);
        System.out.println(sum);

       int results= e2.multiply(20);
        System.out.println(results);

        int result= e2.largest(35,85);



        String res= e2.createEmail("Juan","Salmeron","gmail");
        System.out.println(res);
    }

    }

