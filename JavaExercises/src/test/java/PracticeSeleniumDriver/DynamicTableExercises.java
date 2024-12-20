package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicTableExercises {

    public static void main(String args[]) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();

        WebElement user=driver.findElement(By.xpath("//input[@id='input-username']"));
        user.clear();
        user.sendKeys("demo");

        WebElement pass=driver.findElement(By.xpath("//input[@id='input-password']"));
        pass.clear();
        pass.sendKeys("demo");

        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();



        driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();

        //capture the number of pages

        String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();

       int total_pages=Integer.parseInt(text.substring(text.indexOf(("(")+1,text.indexOf("Pages")-1)));


       //repeating pages

        for(int p=1; p<=5; p++) {

            if(p>1) {
                WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()=\"+p+\"]"));
                active_page.click();
            }


        }

        //reading data from the page

        int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();

        for(int r=1; r<=rows; r++) {

            String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
            String EmailAddress=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
            System.out.println(customerName+EmailAddress);
        }


    }
}
