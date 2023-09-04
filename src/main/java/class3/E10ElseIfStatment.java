package class3;

public class E10ElseIfStatment {
    public static void main(String[] args) {

      String fruit="Banana";

      if (fruit.equals("Mango")){ // fruit==mango but we cannot use == since this is primitive data type need to use .equals to calculate
          System.out.println("Price is $5");
      } else if (fruit.equals("Orange")) {
          System.out.println("Price is $4");
      } else if (fruit.equals("Apple")) {
          System.out.println("Apple is $3");
      }else if (fruit.equals("Kiwi")){
          System.out.println("Price is $6");
      }else{
          System.out.println("This fruit is not available right now");
      }


    }
}
