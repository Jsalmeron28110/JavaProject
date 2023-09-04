package class4;

public class T1 {
    public static void main(String[] args) {
        double gpa=3.5;
       boolean degree=true;
        if (degree==true) {
            System.out.println("congratulations");
            if (gpa>=3.5){
                System.out.println("you are eligible for scholarship");

            }else{
                System.out.println("You should study harder");
            }
        }else {
            System.out.println("You should get a degree");
        }
    }
}
