package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FramesExercises {
    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();


        WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        WebElement linkFrame5=driver.findElement(By.tagName("a"));
        linkFrame5.click();

    //inner frame
        driver.switchTo().frame(0);

        WebElement logo=driver.findElement(By.xpath("img.responsive-img"));
        System.out.println(logo.isDisplayed());



    }
}
