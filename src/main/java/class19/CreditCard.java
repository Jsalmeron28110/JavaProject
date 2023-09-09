package class19;

public class CreditCard {
    public void callInterest(double balance){
        System.out.println(balance*0.05);
    }
}

class Visa extends CreditCard {

}
    class AX extends CreditCard {
        @Override

        public void callInterest(double balance) {
            System.out.println(balance * 0.07);
        }
    }

