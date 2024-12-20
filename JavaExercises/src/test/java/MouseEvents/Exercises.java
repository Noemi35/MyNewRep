package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Exercises {

    public static void main (String args[]) {

        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

         WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
         field1.clear();
         field1.sendKeys("Hey");
         WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));

        WebElement buttonCopy=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        Actions act=new Actions(driver); //actions is a class; creqam obiectul clasei
        Action Dclick= act.doubleClick(buttonCopy).build(); //action is an interface, where we can store the variable
        Dclick.perform();

       act.contextClick(buttonCopy).build().perform(); //right click
        act.moveToElement(field2).build().perform();//hover over something


        String attributeField=field1.getAttribute("value"); //only for attributes
        //getText-only for inner text

        if(attributeField.equals("Hey")) {
            System.out.println("Successful");
        }
        else {
            System.out.println(" Not Successful");
        }

    }
}
