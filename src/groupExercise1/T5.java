package groupExercise1;

public class T5 {
    public static void main(String[] args) {
    /*
    Write a program to swap 2 numbers without a temporary variable?
     */
        int x=10;
        int y=20;

      x= x + y ;
      y= x - y;
      x= x - y;

        System.out.println("The swapped value of x is "+x);
        System.out.println("The swapped value of y is "+y);
    }
}
