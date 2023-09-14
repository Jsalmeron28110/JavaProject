package class21;

public abstract class File {

    String name;
    int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public abstract void open();
     public void edit(){
        System.out.println("Editing the file "+name);

    }
    public void close(){
        System.out.println("Close the file. "+name);

    }

}

class JavaFile extends File{

    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Open .java file using Intellij.");
    }

    @Override
    public void edit() {
        super.edit();
    }

    @Override
    public void close() {
        super.close();
    }
}
class WordFile extends File{
    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void open() {
        System.out.println("Open .doc file using Microsoft Word.");
    }

    @Override
    public void edit() {
        super.edit();
    }

    @Override
    public void close() {
        super.close();
    }
}
class PdfFile extends File{
    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    public void edit() {
        super.edit();
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public void open() {
        System.out.println("Open .java file using Adobe PDF Reader.");


    }
}