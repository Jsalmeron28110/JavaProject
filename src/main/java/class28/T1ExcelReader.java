package class28;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class T1ExcelReader {
    public static void main(String[] args) throws IOException {
        /*
        Create an excel file store some data inside it and read that
        data using the methods that we have just created.
         */
            List<Map<String, String>> data = ExcelReader.readExcelData("C:\\Users\\Juan Salmeron\\IdeaProjects\\Java Project\\Files\\Sales.xlsx");
            System.out.println(data);
        }
}
