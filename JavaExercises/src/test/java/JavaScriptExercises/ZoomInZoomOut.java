package JavaScriptExercises;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ZoomInZoomOut {

    public static void main (String args[]) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://history.state.gov/countries/all");

        JavascriptExecutor js=driver;

        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(5000);
        js.executeScript("document.body.style.zoom='80%'");

    }
}
