package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutomationDynamicTablePractice {

    public static void main(String args[]) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        //click on every page

        for(int p=1; p<=4; p++) {

            WebElement active_page=driver.findElement(By.xpath("//ul[@id='pagination']//li"));
            active_page.click();
        }

        //reading data; sum; finding elements

        int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
//        double total=0;
        for(int r=1; r<=rows; r++) {
            String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]")).getText();
            String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[\"+r+\"]//td[3]")).getText();

//            total=total+Double.parseDouble(price);

            System.out.println(name + price);
//            System.out.println(total);

        }


//            //capture all checkboxes
            List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='productTable']//tr//td//input"));
            System.out.println(checkboxes.size());

            for(int c=0; c<checkboxes.size(); c++) {
                checkboxes.get(c).click();
            }










    }
}
