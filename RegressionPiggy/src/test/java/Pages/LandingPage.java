package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//test case= action methods+locators
public class LandingPage {

    ChromeDriver driver;


//    JavascriptExecutor js = driver;

    //constructor
    public LandingPage(ChromeDriver driver) {
        this.driver = driver;//automatically invoked
        PageFactory.initElements(driver,this);

    }

    //locators

//    By logo_loc = By.xpath("//img[@alt='Porc A Porter - Homepage']");
//    By acceptCookies_loc = By.xpath("//a[normalize-space()='ok']");
//    By loginIncon_loc = By.xpath("//img[@src='https://porc.netcdn.ro/static/frontend/Mageing/porc/ro_RO/images/contul_meu.svg']");
//    By shoppingCartIcon_loc=By.xpath("//a[@class='action showcart']");
//    By searchIcon_loc=By.xpath("//img[@alt='Search entire store']");
//    By menuIcon_loc=By.xpath("//div[@class='menu-show']");

    @FindBy(xpath ="//img[@alt='Porc A Porter - Homepage']")
    WebElement logo_loc;
    @FindBy(xpath ="//a[normalize-space()='ok']")
    WebElement acceptCookies_loc ;
    @FindBy(xpath ="//img[@src='https://porc.netcdn.ro/static/frontend/Mageing/porc/ro_RO/images/contul_meu.svg']")
    WebElement loginIncon_loc ;
    @FindBy(xpath ="//a[@class='action showcart']")
    WebElement shoppingCartIcon_loc ;
    @FindBy(xpath ="//img[@alt='Search entire store']")
    WebElement searchIcon_loc ;
    @FindBy(xpath ="//div[@class='menu-show']")
    WebElement  menuIcon_loc ;



    //action methods
    public boolean checkLogo() {
       logo_loc.isDisplayed();
        return true;
    }

    public void scrollPageDown() {
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
    }

    public void  scrollPageUp() {
        JavascriptExecutor js = driver;
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
    }

    public void acceptCookies() {
       acceptCookies_loc.click();
    }

    public void clickLoginIcon() {
       loginIncon_loc.click();

    }

    public boolean shoppingCartIconIsDisplayed() {
       shoppingCartIcon_loc.isDisplayed();
        return true;
    }

    public boolean searchIconIsDisplayed() {
      searchIcon_loc.isDisplayed();
        return true;
    }

    public boolean menuIconIsDisplayed() {
       menuIcon_loc.isDisplayed();
        return true;
    }

    public void checkTitleLandingPage() {
        Assert.assertEquals(driver.getTitle(), "Summer drop 2024");
    }



}

