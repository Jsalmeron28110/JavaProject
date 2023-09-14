package class21;

public class FlieTester {
    public static void main(String[] args) {
        File[] arr={new JavaFile("Javafile.java",5),new WordFile("WordFile.doc",1),new PdfFile("Manual.pdf",2)};
        for(File t:arr){
            t.open();
            t.edit();
            t.close();
        }
    }
}
