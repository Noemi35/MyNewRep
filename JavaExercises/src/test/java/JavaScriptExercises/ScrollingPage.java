package JavaScriptExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollingPage {

    public static void main (String args[]) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://history.state.gov/countries/all");
        driver.manage().window().maximize();

        JavascriptExecutor js=driver;

        //scrolling by pixels
        js.executeScript("window.scrollBy(0,1500)"," ");

        System.out.println(js.executeScript("return window.pageYOffset;")); //capture location-1500

        //one element visible

        WebElement text=driver.findElement(By.xpath("//h3[normalize-space()='S']"));
        js.executeScript("arguments[0].scrollIntoView()", text);
        System.out.println(js.executeScript("return window.pageYOffset")); //2601


        //scroll until bottom of the page

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;")); //4912

        //scroll to the initial point
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));





    }
}
