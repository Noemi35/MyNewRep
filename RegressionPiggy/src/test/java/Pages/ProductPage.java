package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {
    ChromeDriver driver;

    public ProductPage(ChromeDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //locators
//    @FindBy(xpath = "")
//    WebElement

    //methods
    public void checkTitleProductPage() {
        Assert.assertEquals(driver.getTitle(),"\"Proper\" Shirt");
    }
}
