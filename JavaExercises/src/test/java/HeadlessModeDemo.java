import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HeadlessModeDemo {

    public static void main (String args[]) {
        //we can do multiple tasks in the same time
        //faster execution
        //user cannot see the functionality (maybe the user cannot understand)
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--headless=new");
        ChromeDriver driver=new ChromeDriver(options); //we have to add options to parameter for headless mode

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        String act_title= driver.getTitle();

        if(act_title.equals("Automation Testing Practice")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
