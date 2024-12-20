package DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Asignment2 {

    public static void main (String args[]) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();



        String year = "2025";
        String month = "Aug";
        String date = "25";

        driver.findElement(By.xpath("//input[@id='departon']")).click();

        selectMonthAndYear(driver,month, year); //invoke methods
//        selectDate(driver, date);
    }

    static void selectMonthAndYear(WebDriver driver, String month, String year) {
        while (true) {
            String current_month = driver.findElement(By.xpath("//select[@aria-label='Select month']")).getText();
            String current_year = driver.findElement(By.xpath("//select[@aria-label='Select year']")).getText();

            if (current_year.equals(year) && current_month.equals(month)) {
                break;
            }
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next button-future date
//            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //back button=past date


        }


    }

    }
