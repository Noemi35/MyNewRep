package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaAlerts {

    public static void main (String args[]) {
        ChromeDriver driver=new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //ok alert
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//        driver.switchTo().alert().accept();


        //cancel alert
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        driver.switchTo().alert().dismiss();


        //confirm alert
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alertPrompt=driver.switchTo().alert();
        System.out.println(alertPrompt.getText());

       alertPrompt.sendKeys("Welcome");
       alertPrompt.accept();

       String res=driver.findElement(By.xpath("//p[@id='result']")).getText(); //I am a JS prompt
       if(res.contains("Welcome")) {
           System.out.println("test passed");
       } else {
           System.out.println("test failed");
       }



    }
}
