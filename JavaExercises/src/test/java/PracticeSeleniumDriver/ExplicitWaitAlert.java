package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitAlert {

    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //declaration
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //ok alert

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert myalert=mywait.until(ExpectedConditions.alertIsPresent()); //validate alert
        myalert.accept();

    }

}