package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckboxesPractice {
    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //select one checkbox
        driver.findElement(By.xpath("//input[@id='monday']")).click();

        //capture all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        System.out.println(checkboxes.size());

        //for loop click on all checkboxes
        for (int i = 0; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }

        //for each loop
        for (WebElement checkx : checkboxes) {
            checkx.click();

        }

        //select the last 4 checkboxes
        //7-3=4

        for (int i = 4; i < checkboxes.size(); i++) {
            checkboxes.get(i).click();
        }

        //select first 3 checkboxes
        for (int i = 0; i < 4; i++) {
            checkboxes.get(i).click();
        }
//selec/unselect checkboxes
        for (WebElement chx : checkboxes) {
            if(chx.isSelected()) {
                chx.click();
            } else {
                chx.click();
            }
        }

        //select checkboxes randomly
        for (int i = 0; i < checkboxes.size(); i++) {
            if(i==3 || i==6 || i==2) {
                checkboxes.get(i).click();
            }
        }

        //select checkbox based on value
        String weekname = "Monday";
        switch (weekname) {
            case "Sunday":
                driver.findElement(By.xpath("//input[@id='sunday']")).click();
                break;
            case "Monday":
                driver.findElement(By.xpath("//input[@id='monday']")).click();
                 break;

            default:
                System.out.println("Invalid name");
        }
    }



}
