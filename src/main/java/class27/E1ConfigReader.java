package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    // get the location of the file
    // Either navigate to that file or bring that file into memory

    public static void main(String[] args) throws IOException {
        // String path1 = System.getProperty("user.dir") => it gives you the path to your project
        String path = System.getProperty("user.dir")+"\\Files\\Config.properties";
        // Brings the data from the file in the form of bytes
        FileInputStream fis= new FileInputStream(path);
        // properties converts the data in the form of key value pairs
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("userName"));

    }
}
