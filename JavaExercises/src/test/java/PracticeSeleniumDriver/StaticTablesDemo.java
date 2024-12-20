package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTablesDemo {

    public static void main(String args[]) {
        ChromeDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        //capture all rows

        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        //7

        //capture all columns
        int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        // 4

        //capture specific column
        String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[2]")).getText();

        //capture all rows and columns

//        for(int r=2; r<rows; r++ ) {
//            for(int c=1; c<col; c++) {
//                String rc=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
//                System.out.print(rc+"/t"); ///t-for tab
//            }
//            System.out.println();
//        }
        //capture specific author with his books
//        for (int r = 2; r < rows; r++) {
//            String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]")).getText();
////              System.out.println(author);
//            if (author.equals("Mukesh")) {
//                String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr[\"+r+\"]//td[1]")).getText();
//                System.out.println(book);
//
//            }


            //sum of price column
            int total=0;
            for (int r = 2; r < rows; r++) {
                String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();

                total=total+Integer.parseInt(price);

            }
            System.out.println(total);

        }

    }


