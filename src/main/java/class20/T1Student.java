package class20;

public class T1Student {

       public void study(){
            System.out.println("Students study hw");
        }
        public void review(){
            System.out.println("Students review materials in books");
        }
        public void attendance(){
            System.out.println("Students attend a physical school");
        }
    }
    class SyntaxStudent extends T1Student{
        @Override
        public void study() {
            System.out.println("Syntax students do repl hw");
        }

        @Override
        public void review() {
            System.out.println("Syntax students review slides");
        }

        @Override
        public void attendance() {
            System.out.println("Syntax students attend online classes");
        }
    }
    class CollegeStudent extends T1Student{
        @Override
        public void attendance() {
            System.out.println("College students can either take online or physical classes");
        }
    }
    class SchoolStudent extends T1Student{
        @Override
        public void study() {
            System.out.println("School student study using written notes");
        }
    }
