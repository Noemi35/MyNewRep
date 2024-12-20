import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLinksDemo {

    public static void main (String args[]) throws IOException {


        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        //capture all links

        List< WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println(allLinks.size()); //48
        int noOfBrokenLinks=0;
        //get the value attribute of the link
        for( WebElement links:allLinks) {
            String hrefValue=links.getAttribute("href");
            if(hrefValue==null || hrefValue.isEmpty()) {
                System.out.println("Cannot check the link");
                continue;
            }
     try {
         URL linksURL = new URL(hrefValue);
         HttpURLConnection conlinkUrl = (HttpURLConnection) linksURL.openConnection(); //type casting; open the connection to the server
         conlinkUrl.connect(); //send request to the server

         if (conlinkUrl.getResponseCode() >= 400) {
             System.out.println(hrefValue+"  broken link");
             noOfBrokenLinks++;
         } else {
             System.out.println(hrefValue+" not broken link");
         }
     }
     catch (Exception e){

            }

        }

        //convert string link to url format



        System.out.println(noOfBrokenLinks); //42
    }
}
