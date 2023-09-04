package class12;

public class HW2 {
    int grade(int score){
        int result;
        if (score>90){
            result=score;
            System.out.println("Your grade is an A");

        }
        else if (score>80) {
            result=score;
            System.out.println("Your grade is a B");
        }
        else if (score>70) {
            result=score;
            System.out.println("Your grade is aa C");

        }
        else if (score>50) {
            result=score;
            System.out.println("Your grade is a D");

        }
        else{
            result=score;
            System.out.println("Your grade is a F");

        }
        return result;

    }


    public static void main(String[] args) {
        HW2 score=new HW2();
        score.grade(92);

    }
}
