package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

        // Located the file
        //String path = "C:\\Users\\Juan Salmeron\\IdeaProjects\\Java Project\\Files\\Config.properties";

        String path = System.getProperty("user.dir")+"\\Files\\Config.properties";

        // Moves the file from the permanent storage into the RAM
        FileInputStream fis = new FileInputStream(path);

        // That one class/software that will assist us to read Write data from the file.
        Properties properties = new Properties();

        // Helps
        properties.load(fis);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));

        System.out.println(System.getProperty("user.dir"));

    }
}
