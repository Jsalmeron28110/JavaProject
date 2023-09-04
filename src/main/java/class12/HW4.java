package class12;

public class HW4 {
    void language(String country) {

        if (country.equalsIgnoreCase("America")) {
            System.out.println("Hello");

        } else if (country.equalsIgnoreCase("El Salvador")) {
            System.out.println("Hola");

        } else if (country.equalsIgnoreCase("France")) {
            System.out.println("Bonjour");

        } else if (country.equalsIgnoreCase("China")) {
            System.out.println("Nǐ hǎo");

        } else {
            System.out.println("Sorry I do not have that country in my system");
        }
    }

    public static void main(String[] args) {
        HW4 sayHello=new HW4();
        sayHello.language("china");
    }
}


