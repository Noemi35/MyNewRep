import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class EnableExtentionsChrome {

    public static void main (String args[]) {
        //we can do multiple tasks in the same time
        //faster execution
        //user cannot see the functionality (maybe the user cannot understand)
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        ChromeDriver driver=new ChromeDriver(options); //we have to add options to parameter for headless mode

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();



    }

}
