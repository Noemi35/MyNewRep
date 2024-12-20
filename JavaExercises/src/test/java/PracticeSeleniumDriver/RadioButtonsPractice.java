package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonsPractice {

    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.expandtesting.com/radio-buttons");
        driver.manage().window().maximize();

        WebElement black=driver.findElement(By.cssSelector("input#black"));
        WebElement yellow=driver.findElement(By.cssSelector("input#yellow"));
        WebElement red=driver.findElement(By.xpath("//input[@id='red']"));
        System.out.println(black.isSelected()); //false
        System.out.println(yellow.isSelected()); //false
        System.out.println(red.isSelected()); //false

        black.click();
        System.out.println(black.isSelected()); //true
        System.out.println(yellow.isSelected()); //false
        System.out.println(red.isSelected()); //false


        //example 2
       //deselect tennis
        WebElement tennis=driver.findElement(By.xpath(" //input[@id='tennis']"));
        System.out.println(tennis.isSelected()); //true
        tennis.click();
        System.out.println("my fav sport:"+tennis.isSelected()); //false




    }
}
