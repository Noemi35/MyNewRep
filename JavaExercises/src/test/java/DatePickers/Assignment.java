package DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment {

    public static void main (String args[]) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();



        driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Sara");
        driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("Norman");


        driver.findElement(By.xpath("//textarea[@id='order_comments']")).sendKeys("vegetarian meal");

        //birthdate

        driver.findElement(By.xpath("//input[@id='dob']")).click();

       //select year
        WebElement drp=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select drpBirth=new Select(drp);
        drpBirth.selectByVisibleText("2023");


        //select month

        WebElement drpMonth=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select drpMonthS=new Select(drpMonth);
        drpMonthS.selectByVisibleText("May");


        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));

        for(WebElement dt:allDates) {
            if(dt.getText().equals("5")) {
                dt.click();
                break;
            }
        }







    }
}
