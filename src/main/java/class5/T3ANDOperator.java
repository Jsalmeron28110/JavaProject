package class5;

public class T3ANDOperator {
    public static void main(String[] args) {


     int days=5;

        if (days>=1 && days<=5){
            System.out.println("It is a weekday");
        } else if (days==6 || days==7) {
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}




