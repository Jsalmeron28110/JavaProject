package class10;

public class T1StringDemo {
    public static void main(String[] args) {
        String userName="Syntax123!";
        String password="Test1214";
        String confirmedPassword="Test15";

        if (userName.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password cannot be empty.");
           }else if (password.length()<8){
            System.out.println("Password is too short.");
        } else if (password.equals(userName)){
            System.out.println("Password cannot contain username");
    }else if (!password.equals(confirmedPassword)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");


        }
}
}
