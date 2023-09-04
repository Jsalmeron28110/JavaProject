package class10;

public class CarTest {
    public static void main(String[] args) {
        Car carObj=new Car();
        carObj.make="BMW";
        carObj.model="M3";
        carObj.price=55000;
        carObj.selfPark();
        carObj.brakeHold();
        carObj.assistInDrive();
    }
}
