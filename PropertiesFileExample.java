import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class PropertiesFileExample {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();

        // Set properties
        props.setProperty("db.user","ABC");
        props.setProperty("db.password","Secret");

        // Save to a file
        FileOutputStream fos=new FileOutputStream("config.properties");
        props.store(fos,"Database Configuration");
        System.out.println("Info has been stored in a file");
        fos.close();

        // Now load file
        Properties loadpros=new Properties();
        FileInputStream fis=new FileInputStream("Config.properties");
        loadpros.load(fis);
        System.out.println("File has been loaded");
        fis.close();

        //Print loaded data
        System.out.println("User: "+ loadpros.getProperty("db.user"));
        System.out.println("Password: "+loadpros.getProperty("db.password"));
    }

}