package class13;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {


    SyntaxEmployee e1=new SyntaxEmployee();
         e1.empID=115;
        e1.salary=100000;
        System.out.println(e1.empID);
        System.out.println(e1.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee e2=new SyntaxEmployee();
        e2.empID=150;
        e2.salary=90000;
        System.out.println(e2.empID);
        System.out.println(e2.salary);
        System.out.println(SyntaxEmployee.CEO);





    }
}
