package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class MultipleOptionsDropDown {

    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

     List <WebElement> optionsColors= driver.findElements(By.xpath("//select[@id='colors']/option"));
     System.out.println(optionsColors.size()); //5

        //select multiple options
        for ( WebElement opID:optionsColors) {
            String res=opID.getText();

            if (res.equals("Blue") || res.equals("Green") || res.equals("Red") )  {
                opID.click();
            }
        }




    }
}
