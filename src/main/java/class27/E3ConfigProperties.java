package class27;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E3ConfigProperties {
    public static void main(String[] args) throws IOException, InterruptedException {

        String url= getProperty("URL");
        String userName=getProperty("userName");
        String password=getProperty("password");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);



        WebElement userNameField=driver.findElement(By.id("txtUsername"));
        userNameField.sendKeys(userName);


        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        loginBtn.click();

        driver.quit();
    }

    public static String getProperty(String propertyKey) throws IOException {

        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";

        FileInputStream fis = new FileInputStream(path);

        Properties properties= new Properties();
        properties.load(fis);

        // returns the value of the property that we provide in the parameter
        String value = properties.getProperty(propertyKey);

        return value;
    }
}
