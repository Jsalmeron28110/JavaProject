package class9;

public class T52DArrays {
    public static void main(String[] args) {

        String[][] cars = {
                {"American", "German", "Korean", "Italian"},
                {"Mustang", "Corvette", "Chevy", "Ford"},
                {"BMW", "Mercedes", "Audi", "Volkswagen"},
                {"Kia", "Hyundai", "Toyota", "Genesis"},
                {"Ferrari", "Alfa Romero", "Fiat", "Pagani"}
        };
        for (int i = 0; i < cars.length ; i++) {
            for (int j = 0; j < cars[i].length ; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }

        }
    }







