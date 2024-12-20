package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownExercises {

    public static void main (String args[]) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();

        WebElement drpcountry=driver.findElement(By.xpath("//select[@id='country-list']"));
        drpcountry.click();
        Select drpoptions=new Select(drpcountry);

        //select one value
        drpoptions.selectByVisibleText("Brazil");
        drpoptions.selectByIndex(4);
        drpoptions.selectByValue("2");


        //count all options

        List<WebElement> optionsCount=drpoptions.getOptions();
        System.out.println(optionsCount.size()); //6

        //print all options

        for(int i=1; i< optionsCount.size(); i++) {
            System.out.println(optionsCount.get(i).getText());
        }

        for(WebElement opID:optionsCount) {
            System.out.println(opID.getText());
        }

    }
}
