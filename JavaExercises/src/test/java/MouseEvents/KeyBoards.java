package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v123.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyBoards {

    public static void main (String args[]) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://text-compare.com/#google_vignette");
        driver.manage().window().maximize();


        WebElement box1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement box2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        box1.sendKeys("welcome");
        Actions act=new Actions(driver);
        //select text
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //copy text
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Tab-switch to other box
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();



    }

}
