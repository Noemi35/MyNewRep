package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class FDCalculator {

    public static void main (String args[]) throws IOException, InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().window().maximize();

        String FilePath="/home/noemi/Desktop/Project IntelliJ/JavaExercises/src/test/java/DataDrivenTesting/caldata.xlsx";
        int rows=  UtilityData.getRowCount(FilePath, "Sheet1");

      for(int r=1; r<=rows;r++) {
        //read data from excel
        String pric= UtilityData.getCellData(FilePath, "Sheet1", r,0);
        String rateOfInterest= UtilityData.getCellData(FilePath, "Sheet1", r,1);
        String per1= UtilityData.getCellData(FilePath, "Sheet1", r,2);
        String per2= UtilityData.getCellData(FilePath, "Sheet1", r,3);
        String fre= UtilityData.getCellData(FilePath, "Sheet1", r,4);
        String exp_mvalue=UtilityData.getCellData(FilePath, "Sheet1", r,5);

        //pass the data into application
          driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
          driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
          driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
          WebElement DrpS=driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
          Select drp=new Select(DrpS);
          drp.selectByVisibleText(per2);

          WebElement FreDRP=driver.findElement(By.xpath("//select[@id='frequency']"));
         Select drp2=new Select(FreDRP);
         drp2.selectByVisibleText(fre);
         driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click(); //press calculate

          //validation

        String act_mvalue=  driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

        if(Double.parseDouble(act_mvalue)==Double.parseDouble(exp_mvalue)) {
            System.out.println("Test passed");
            UtilityData.setCellData(FilePath, "Sheet1", r, 7, "Passed");
            UtilityData.fillGreenColor(FilePath, "Sheet1", r, 7);
        }
             else {
                System.out.println("Test failed");
                UtilityData.setCellData(FilePath, "Sheet1",r,7, "Failed");
                UtilityData.fillRedColor(FilePath, "Sheet1",r,7);
            }
             Thread.sleep(3000);
             driver.findElement(By.xpath("//div[@class='PT25']//a[2]")).click();
        }
      //ending of for loop
        driver.quit();
      }

    }

