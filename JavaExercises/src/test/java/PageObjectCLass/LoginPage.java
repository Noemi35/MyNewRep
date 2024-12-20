package PageObjectCLass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    ChromeDriver driver; //initiative the driver
    //constructor-initiate the driver
    LoginPage(ChromeDriver driver) {
        this.driver=driver;
    }


    //Locators-xpath, css

    By username_loc=By.xpath("//input[@placeholder='Username']");

    By password_loc=By.xpath("//input[@placeholder='Password']");
    By login_loc=By.xpath("//button[normalize-space()='Login']");


    //action methods

    public void setUpUsername(String user){
        driver.findElement(username_loc).sendKeys(user);
    }

    public void setUpPassword(String pass){
        driver.findElement(password_loc).sendKeys(pass);
    }

    public void clickButton (){
        driver.findElement(login_loc).click();
    }



}
