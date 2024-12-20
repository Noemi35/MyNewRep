package JavaScriptExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UploadFIlesDemo {

    public static void main (String args[]) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //single file upload

//       driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("/home/noemi/Desktop/UPS_checkout_fixed/Mobile/Ipad Pro.png");
//
//       if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Ipad Pro.png")) {
//           System.out.println("Successful upload");
//        } else {
//
//           System.out.println("Unsuccessful upload");
//
//       }

       //multiple files

        String file1="/home/noemi/Desktop/UPS_checkout_fixed/Mobile/Ipad Pro.png";
        String file2="/home/noemi/Desktop/UPS_checkout_fixed/Mobile/Ipad Mini.png";

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2); //new line \n

        int TotalUploads=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size(); //capture all files
            System.out.println(TotalUploads);


        //validation by number

        if(TotalUploads==2) {
            System.out.println("All files were successfully uploaded");
        } else {
            System.out.println("Files were not uploaded");
        }

        //validation by name

        if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Ipad Pro.png") && (driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Ipad Mini.png"))) {
             System.out.println("Files names are mathing");
        } else {
            System.out.println("Files names are not mathing");
        }








    }
}
