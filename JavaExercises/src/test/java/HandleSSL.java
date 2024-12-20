import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HandleSSL {
    public  static  void main (String args[]) {

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://expired.badssl.com/");

        System.out.println(driver.getTitle()); //expired badssl

    }
}
