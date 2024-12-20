package JavaScriptExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo {

    public static void main (String args[]) {

        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
//use javascript executor when we get javascript intercepted exception;
        WebElement inputBox= driver.findElement(By.xpath("//input[@id='name']"));
        JavascriptExecutor js=driver;//cannot create object of interface so we use the object of chromedriver
        js.executeScript("arguments[0].setAttribute('value','John')",inputBox );


        WebElement checkbox= driver.findElement(By.xpath("//input[@id='male']"));
        js.executeScript("arguments[0].click()", checkbox);
    }
}
