package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
 public static void main(String args[]) {
     ChromeDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();

     WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
     WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
     Actions act=new Actions(driver);
     act.dragAndDrop(source,target).build().perform();

 }
}
