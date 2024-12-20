package PracticeSeleniumDriver;

import ObjectsClasses.ThisKeyword;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HiddenDropdown {

    //we use debugger from selector hub to freeze the screen and get the options
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();


        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(5000);

        //select single option
        driver.findElement(By.xpath("//span[normalize-space()='Engineering']")).click();


        //capture and count options
         List< WebElement> options=driver.findElements(By.xpath("//div[@role=\"listbox\"]//span"));
         System.out.println(options.size());
        //print options

        for(WebElement op:options) {
            System.out.println(op.getText());
        }



    }
}
