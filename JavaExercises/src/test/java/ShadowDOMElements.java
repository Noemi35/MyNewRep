import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class ShadowDOMElements {
    public static void main (String args[]) throws IOException, InterruptedException {

//xpath cannot handle shadow dom elements only css selector
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        //This Element is inside single shadow DOM.
//        String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
//        Thread.sleep(1000);

        SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("#input")).sendKeys("welcome");
    }

}
