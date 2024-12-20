package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DifferentTabs {

    public static void main (String args[]) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        WebElement register=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        act.keyDown(Keys.CONTROL).sendKeys(register).keyUp(Keys.CONTROL).perform();

        List<String> registerLink=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(registerLink.get(1)); //registration


        driver.switchTo().window(registerLink.get(0)); //homepage




    }

}
