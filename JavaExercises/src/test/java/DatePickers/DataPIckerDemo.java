package DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DataPIckerDemo {

    public static void main (String args[]) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

//        //Method 1
        driver.switchTo().frame(0);
//        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/05/2024");
//
//
//
//        //Method 2

        String year = "2027";
        String month = "December";
        String date = "25";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        selectMonthAndYear(driver, month,year); //invoke methods
        selectDate(driver, date);
    }

static void selectMonthAndYear(WebDriver driver, String month,String year) {
            while (true) {
                String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
                String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

                if (current_year.equals(year) && current_month.equals(month)) {
                    break;
                }
                    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next button-future date
//            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //back button=past date


            }
        }

        //select date
        //capture all elements
        static void selectDate(WebDriver driver, String date) {//user defined method
            List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

            for (WebElement dt : allDates) {
                if (dt.getText().equals(date)) {
                    dt.click();
                    break;
                }
            }
        }

    }






