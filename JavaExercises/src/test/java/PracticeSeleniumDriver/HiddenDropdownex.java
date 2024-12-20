package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HiddenDropdownex {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();//pim

        //press select-employee status

        driver.findElement((By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]"))).click();

        //click one option
        driver.findElement(By.xpath("//span[normalize-space()='Full-Time Contract']")).click();

        //capture all values
        List< WebElement> optionsem=driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println(optionsem.size());

        //print all
        for( WebElement opID:optionsem) {
            System.out.println(opID.getText());
        }



    }


    }
