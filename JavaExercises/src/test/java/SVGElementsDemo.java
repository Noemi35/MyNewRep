import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SVGElementsDemo {

    public static void main (String args[]) {

        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //login
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        //abs path
//        driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")).click();
//        //rel path
//          driver.findElement(By.xpath("//span[normalize-space()='Time']")).click();
//        //identify element
        driver.findElement(By.xpath("//a[normalize-space()='']//*[name()='svg']")).click();
    }
}
