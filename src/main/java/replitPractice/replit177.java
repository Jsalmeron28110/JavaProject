package replitPractice;

public class replit177 {
}
interface Outputs{
    void display(double result);

}

interface Functions extends Outputs{

    double adding(double num1, double num2);
    double subtracting(double num1, double num2);
    double multiply(double num1, double num2);
    double dividing(double num1, double num2);

}
class Main implements Functions{


    @Override
    public void display(double result){
        System.out.println(" is ::: "+result);
    }

    @Override
    public double adding(double num1, double num2){
        return num1+num2;
    }
    @Override
    public double subtracting(double num1, double num2){
        return num1-num2;
    }
    @Override
    public double multiply(double num1, double num2){
        return num1*num2;
    }
    @Override
    public double dividing(double num1, double num2){
        return num1/num2;
    }

    public static void main(String[] args){

        Main obj=new Main();
        obj.display(obj.adding(100.0, 20.0));
        obj.display(obj.subtracting(100.0, 20.0));
        obj.display(obj.multiply(100.0, 20.0));
        obj.display(obj.dividing(100.0, 20.0));


    }


}