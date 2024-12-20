package TakeScreenhotsDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

public class TakeScreenshotsDemo {


    public static void main (String argsp[]) throws IOException {

        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
//full screenshot
        TakesScreenshot ts=driver; //interface
        File source=ts.getScreenshotAs(OutputType.FILE);
       File targetFile=new File("/home/noemi/Desktop/Project IntelliJ/JavaExercises/src/test/Screenshots/fullscreen.png");
//        File targetFile=new File(System.getProperty("user+dir")+"/Screenshots/fullscreens.png"); //it does not work
       source.renameTo(targetFile); //copy source file to target file

       //partial screenshot

        WebElement screen=driver.findElement(By.xpath("//div[@class='fauxborder-left header-fauxborder-left']"));
        File partialSource=screen.getScreenshotAs(OutputType.FILE);
        File target=new File("/home/noemi/Desktop/Project IntelliJ/JavaExercises/src/test/Screenshots/partialscreenshot.png");
        partialSource.renameTo(target);

        driver.quit();


    }
}
