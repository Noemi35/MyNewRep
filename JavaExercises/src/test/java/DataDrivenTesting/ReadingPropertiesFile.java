package DataDrivenTesting;

import com.google.common.util.concurrent.ClosingFuture;

import javax.print.DocFlavor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {
    public static void main(String args[]) throws IOException {

        Properties obj=new Properties();
        FileInputStream fileRead=new FileInputStream("/home/noemi/Desktop/Project IntelliJ/JavaExercises/src/test/testData/config.properties");
        obj.load(fileRead);
       String url= obj.getProperty("appurl");
       String email= obj.getProperty("email");
       String password= obj.getProperty("password");
       System.out.println(url+" "+email+" "+password);

       //reading all the keys from properties files
       Set<String> keys= obj.stringPropertyNames(); //collect all the keys and return on string format
        System.out.println(keys); //[password, orderID, customerID, appurl, email]
        Set<Object> keys1=obj.keySet(); //type is object
        System.out.println(keys1);

        //reading all the values
       Collection<Object> values= obj.values();
       System.out.println(values);



    }
}
