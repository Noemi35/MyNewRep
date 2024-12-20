package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SeleniumLinks {
    public static void main (String args[]) {

        ChromeDriver driver=new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input#Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");

        driver.findElement(By.cssSelector("input.wikipedia-search-button")).click();

        //count number of links
        List<WebElement> allResults=driver.findElements(By.cssSelector("div#wikipedia-search-result-link"));
        System.out.println(allResults.size()); //5



//click on all links
        for(WebElement allResultsId:allResults) {

            System.out.println(allResultsId.getText());
            allResultsId.click();
        }

        //get title and quit browser


        Set<String> windowIds=driver.getWindowHandles();

        System.out.println("Switching to each browser window and getting the titles........");
        for(String winid:windowIds)
        {
            String title=driver.switchTo().window(winid).getTitle();
            System.out.println(title);
        }

        driver.quit();





    }
}
