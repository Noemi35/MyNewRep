package DatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

public class DatePicker2 {


    //predefined user method

    static Month convertMonth(String month) { //convert to object format to compare the months (in string format is not possible)
        HashMap<String, Month> monthMap = new HashMap<String, Month>();

        monthMap.put("January", Month.JANUARY);  //key, value
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        Month vmonth = monthMap.get(month);

        if (vmonth == null) {
            System.out.println("Invalid Month...");
        }

        return vmonth;
    }

    public static void main (String args[]) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        driver.switchTo().frame("frame-one796456169");

        String year="2034";
        String Requiredmonth="May";
        String date="21";

        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

        //select year

      WebElement dropdown= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
      Select drp=new Select(dropdown);
      drp.selectByVisibleText(year);


      //select month



        while(true)
        {
            String displayMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            //convert requiredMonth & displayMonth in to Month Objects
            Month expectedMonth=convertMonth(Requiredmonth);
            Month currentMonth=convertMonth(displayMonth);

            //compare
            int result=expectedMonth.compareTo(currentMonth);

            // 0   months are equls
            //>0   future month
            //<0   past

            if(result<0) // past
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //past
            }
            else if(result>0)  //future
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next

            }
            else
            {
                break;
            }
        }


        //select date

        List<WebElement> dates=driver.findElements(By.xpath("//span[@cllass='icon_calendar']//tbody//tr//td//a"));

        for(WebElement dt:dates) {

            if(dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }


    }
}
