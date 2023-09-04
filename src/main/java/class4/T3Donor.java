package class4;

public class T3Donor {
    public static void main(String[] args) {
        int age=18;
        double weight=100;

        if (age>=18){
            System.out.println("He/She is eligible");
        }else {
            System.out.println("He/She is not eligible");
        }
        if (weight>110){
            System.out.println("He/She are eligible");
        }else {
            System.out.println("We cannot accept such a patient");
        }
    }
}
