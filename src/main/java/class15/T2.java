package class15;

public class T2 {

    private String name;
    private double subGrade1;
    private double subGrade2;
    private double subGrade3;

    T2(String sName, double sSubGrade1, double sSubGrade2, double sSubGrade3){
        name=sName;
        subGrade1=sSubGrade1;
        subGrade2=sSubGrade2;
        subGrade3=sSubGrade3;


    }
    void average(double subGrade1, double subGrade2, double subGrade3){
        double total=subGrade1+subGrade2+subGrade3;
        double averageNum=total/=3;
        System.out.println(name + " received an average of " +averageNum );

    }
}
