package class9;

public class T42DArrays {
    public static void main(String[] args) {

        String[][] cars = {
                {"American", "German", "Korean", "Italian"},
                {"Mustang", "Corvette", "Chevy", "Ford"},
                {"BMW", "Mercedes", "Audi", "Volkswagen"},
                {"Kia", "Hyundai", "Toyota", "Genesis"},
                {"Ferrari", "Alfa Romero", "Fiat", "Pagani"}
        };
        for (String[] r : cars) {
            for (String c : r) {
                System.out.print(c+" ");

            }
            System.out.println();
        }
    }
}






