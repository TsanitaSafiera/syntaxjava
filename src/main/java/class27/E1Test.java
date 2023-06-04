package class27;

public class E1Test {
    // get the location of the file
    // Either navigate to that file or bring that file into memory

    public static void main(String[] args) {
        String path = "C:\\Users\\wieke\\IdeaProjects\\syntax\\Files\\Config.properties";
        String path1 = System.getProperty("user.dir")+"\\Files\\Config.properties";

        //System.out.println(System.getProperty("user.dir"));
        System.out.println(path1);

    }
}
