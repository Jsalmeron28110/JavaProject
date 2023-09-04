package class3;

public class T2TemperatureCheck {
    public static void main(String[] args) {
        int temp=15;
        if (temp<32){ //15<32 = true
            System.out.println("Water will freeze with temperature "+temp);
        }else {
            System.out.println("Water will not freeze with temperature " + temp);


        }
    }
}
/*
Create a Java Program and name it Temperature Check
create variable to store temperature. your program should check if temperature is below 32 than it should print
" Water will freeze with temperature__", otherwise " Water will not freeze with temperature __".
*/