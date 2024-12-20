package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class MorePracticeCheckboxes {

    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.expandtesting.com/checkboxes");
        driver.manage().window().maximize();

        //select one checkbox

        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();


        //count checkboxes -2
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input']"));
        System.out.println(checkboxes.size());

        //select all checkboxes
//        for( int i=0; i<checkboxes.size(); i++) {
//            checkboxes.get(i).click();
//        }
//    }

        //for each loop-select all
        for (WebElement chx : checkboxes) {
             chx.click();
        }

        //unselect all checkboxes
        for (WebElement chx : checkboxes) {
            chx.click();
        }
    }
    }
