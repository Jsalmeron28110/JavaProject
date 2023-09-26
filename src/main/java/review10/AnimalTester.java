package review10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AnimalTester {


    public static void main(String[] args) {

      /*  Animal animal=new Animal();
        animal.speak();
        animal.eat();

        Dog lucy=new Dog();
        lucy.speak();
        lucy.eat();
*/

        Animal [] arr={new Cat(),new Dog()};
        for(Animal a:arr){
            a.eat();
            a.speak();
        }

       /* ChromeDriver c=new ChromeDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();

        EdgeDriver e=new EdgeDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();*/

        WebDriver[] browsers={new ChromeDriver(),new EdgeDriver() };
        for(WebDriver b:browsers){
            b.manage().window().maximize();
            b.get("https://www.amazon.com");
            System.out.println(b.getTitle());
        }
    }

}
