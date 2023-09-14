package class20;

public class T1StudentTester {

        public static void main(String[] args) {

            T1Student[] students = {new T1Student(),new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

           for(T1Student student:students ){
               student.attendance();
               student.review();
               student.study();
            }
        }
    }

