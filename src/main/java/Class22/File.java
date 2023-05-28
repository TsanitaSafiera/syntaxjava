package Class22;

public abstract class File {
    // Create a class File that will have the following behaviors: open,
    // edit, close. and fields like name and size Edit and close are
    // implemented method while open is an
    // abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will
    // provide specific implementation of open behaviour: Example: to open
    // java file we need notepad++ or sublime text, to open .doc file we need
    // Microsoft word to be installed etc.

    private String name;
    private double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    abstract void open();

    void edit() {
        System.out.println("Can edit file");
    }

    void close() {
        System.out.println("Can close file");
    }

    void printInfo() {
        System.out.println(name + " " + size);
    }
}
class JavaFile extends File{

    public JavaFile(String name, double size) {
        super(name,size);
    }
    @Override
    void open(){
        System.out.println("to open java file we need IntelliJ");
    }
    @Override
    void edit (){
        System.out.println("Java file can edit");
    }
    @Override
    void close (){
        System.out.println("Java file can close");
    }
}
class WordFile extends File{
    public WordFile(String name, double size) {
        super(name,size);
    }
    @Override
    void open(){
        System.out.println("to open java file we need sublime text");
    }
    @Override
    void edit (){
        System.out.println("Word file can edit");
    }
    @Override
    void close (){
        System.out.println("Word file can close");
    }

}
class PDF extends File{
    public PDF(String name, double size) {
        super(name,size);
    }
    @Override
    void open(){
        System.out.println("to open java file we need microsoft word");
    }
    @Override
    void edit (){
        System.out.println("PDF can edit");
    }
    @Override
    void close (){
        System.out.println("PDF can close");
    }

}

class FileTester{
    public static void main(String[] args) {
        File [] files={new JavaFile("Java",124.2),
        new WordFile("Word", 670.3),
        new PDF("PDF", 160.4)};

        for (File f:files){
            f.open();
            f.edit();
            f.close();
            f.printInfo();
        }
    }
}
