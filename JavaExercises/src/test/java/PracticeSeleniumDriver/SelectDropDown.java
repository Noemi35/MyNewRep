package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main (String args[]) {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

       WebElement drpCountry=driver.findElement(By.xpath("//select[@id='country']"));
       Select dropdown=new Select(drpCountry);

       dropdown.selectByIndex(5);
       dropdown.selectByValue("uk");
       dropdown.selectByVisibleText("Australia");


       //capture all elements
        List <WebElement> options=dropdown.getOptions();
        System.out.println(options.size());

        //print all elements -for loop
        for(int i=0; i<options.size(); i++) {
            System.out.println(options.get(i).getText());
        }

        for(WebElement op:options) {
            System.out.println(op.getText());
        }

    }
}
