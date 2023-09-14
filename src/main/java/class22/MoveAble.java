package class22;

public interface  MoveAble {
    public abstract void move();

}
interface  Washable{
    void wash();
}
class Dog implements MoveAble,Washable {

        @Override
        public void move() {
            System.out.println("Dogs can jump run and can move");

        }

    @Override
    public void wash() {
        System.out.println("You can safely wash a dop");
    }
}

    class Car implements MoveAble,Washable{
        @Override
        public void move() {
            System.out.println("Car can move forward backwards");
        }

        @Override
        public void wash() {
            System.out.println("We can wash a car");
        }
    }





