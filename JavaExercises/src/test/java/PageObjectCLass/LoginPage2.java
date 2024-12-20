package PageObjectCLass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage2 {
    ChromeDriver driver; //initiative the driver
    //constructor-initiate the driver
    LoginPage2(ChromeDriver driver) {

        this.driver=driver;
        PageFactory.initElements(driver,this); //initiate de driver for every element; mandatory required
    }


    //Locators-xpath, css

//    By username_loc=By.xpath("//input[@placeholder='Username']");
//    By password_loc=By.xpath("//input[@placeholder='Password']");
//    By login_loc=By.xpath("//button[normalize-space()='Login']");
    @FindBy(tagName = "a")
    List<WebElement> links;
//      @FindBy(xpath = "//input[@placeholder='Username']") WebElement username_loc;
        @FindBy(how= How.XPATH, using = "//input[@placeholder='Username']") WebElement username_loc; //same as above, another approach

      @FindBy(xpath = "//input[@placeholder='Password']") WebElement password_loc;
      @FindBy(xpath = "//button[normalize-space()='Login']") WebElement login_loc;

    //action methods

    public void setUpUsername(String user){

       username_loc.sendKeys(user);
    }

    public void setUpPassword(String pass){
       password_loc.sendKeys(pass);
    }

    public void clickButton (){

        login_loc.click();
    }



}
