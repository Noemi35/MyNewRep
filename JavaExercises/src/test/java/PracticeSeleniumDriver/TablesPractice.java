package PracticeSeleniumDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Arrays;

public class TablesPractice {

    public static void main (String args[]) {

        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();

       WebElement drp= driver.findElement(By.xpath("//select[@name='fromPort']"));
       drp.click();
       Select options=new Select(drp);

       options.selectByVisibleText("Mexico City");


        WebElement destionation= driver.findElement(By.xpath("//select[@name='toPort']"));
        drp.click();
        Select destinations=new Select(destionation);

        destinations.selectByVisibleText("Buenos Aires");

        WebElement findFlights=driver.findElement(By.xpath("//input[@value='Find Flights']"));
        findFlights.click();

     //rows number
        int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
        System.out.println(rows); //6

        // col num
        int col=driver.findElements(By.xpath("//table[@class='table']//td")).size();
        System.out.println(col); //30

        //capture price column and store into array

        String pricesArr[]=new String[rows];   //0-4

        for(int r=1;r<=rows;r++)
        {
            String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
            pricesArr[r-1]=price; //adding price into array
        }


      //find lowest price

        for(String lowest:pricesArr) {
            System.out.println(lowest);
        }
        Arrays.sort(pricesArr);
        String lowestPrice=pricesArr[0];
        System.out.println(lowestPrice);
//
//
        //click choose a flight
        for(int r=1; r<=rows; r++) {
            String price=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]")).getText();
            if(price.equals(lowestPrice)) {
                driver.findElement(By.xpath("//table[@class='table']//tbody//tr[\"+r+\"]/td[1]//input")).click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Noemi");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Harghita 67");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Buenos Aires");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("USA");
        driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("12345");



        WebElement cards=driver.findElement(By.xpath(" //select[@id='cardType']"));
        cards.click();
        Select cardsDrp=new Select(cards);
        cardsDrp.selectByIndex(2);

        //input[@id='creditCardNumber']
        //input[@id='creditCardMonth']
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("134256127482886");
        driver.findElement(By.xpath(" //input[@id='creditCardMonth']")).sendKeys("10");

        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2020");

        driver.findElement(By.xpath(" //input[@id='nameOnCard']")).sendKeys("John");

        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();

        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();


       String msg=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();

       if(msg.equals("Thank you for your purchase today!")) {
           System.out.println("Test passed");
       } else {
           System.out.println("Test failed");
       }




















    }
}
