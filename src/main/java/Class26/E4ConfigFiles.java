package Class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E4ConfigFiles {
    public static void main(String[] args) throws IOException {

        // shortcut to get the location path
        // System.getProperty("user.dir") gives the path of the project
        System.out.println(System.getProperty("user.dir"));
        // right click on Configproperties choose copy path reference-> path from content root
        String path = System.getProperty("user.dir")+"\\"+"Files\\Config.properties"; // change the forward slash with double backward slash
        System.out.println(path);
        FileInputStream fileInputStream=new FileInputStream(path);
        // that special class which knows how this file works
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName"));


    }
}
