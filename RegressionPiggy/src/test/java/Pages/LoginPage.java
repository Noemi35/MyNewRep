package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    ChromeDriver driver;

    public LoginPage(ChromeDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //locators

//    By username_loc= By.xpath("//input[@id='email']");
//    By password_loc= By.xpath("//input[@id='pass']");
//    By conectare_button= By.xpath("//span[normalize-space()='Conectare']");
//    By resetare_button=By.xpath("//span[normalize-space()='RESETEAZA PAROLA']");
//    By memorareParola_checkbox=By.xpath("//input[@id='remember_meuDSRgpSqVz']");
//    By loginIncon_loc = By.xpath("//img[@src='https://porc.netcdn.ro/static/frontend/Mageing/porc/ro_RO/images/contul_meu.svg']");
//    By recapcha_checkbox=By.cssSelector("div.recaptcha-checkbox-border");
//    By informatiiCont_loc=By.xpath("//strong[normalize-space()='Informatii cont']");
//    By frameCapcha_loc=By.xpath("//iframe[@title='reCAPTCHA']");
//    By resetareParola_loc=By.xpath("//span[normalize-space()='RESETEAZA PAROLA']");

    @FindBy(xpath ="//input[@id='email']")
    WebElement username_loc;
    @FindBy(xpath ="//input[@id='pass']")
    WebElement password_loc ;
    @FindBy(xpath ="//span[normalize-space()='Conectare']")
    WebElement conectare_button ;
    @FindBy(xpath ="//span[normalize-space()='RESETEAZA PAROLA']")
    WebElement resetare_button ;
//    @FindBy(xpath ="//input[@id='remember_meuDSRgpSqVz']")
//    WebElement memorareParola_checkbox ;
    @FindBy(css ="div.recaptcha-checkbox-border")
    WebElement recapcha_checkbox ;
    @FindBy(xpath ="//strong[normalize-space()='Informatii cont']")
    WebElement informatiiCont_loc;
    @FindBy(xpath ="//iframe[@title='reCAPTCHA']")
    WebElement frameCapcha_loc ;
    @FindBy(xpath ="//span[normalize-space()='RESETEAZA PAROLA']")
    WebElement resetareParola_loc ;
    @FindBy(xpath ="//img[@src='https://porc.netcdn.ro/static/frontend/Mageing/porc/ro_RO/images/contul_meu.svg']")
    WebElement loginIncon_loc ;



    public void setUsername(String user) {
       username_loc.sendKeys(user);
    }
    public void clickLoginIcon() {
      loginIncon_loc.click();
    }

    public void setPassword (String pwd) {

      password_loc.sendKeys(pwd);
    }

    public void clickConectareButton () {
       conectare_button.click();
    }

    public void clickResetareButton () {

      resetare_button.click();
    }

//    public void checkMemorareParola () {
//       memorareParola_checkbox.click();
//    }

    public void checkRecapcha () {
        driver.switchTo().frame(frameCapcha_loc);
       recapcha_checkbox.click();
    }

    public boolean myAccount_check() {
        informatiiCont_loc.isDisplayed();
        return true;
    }

    public void click_resetareButton() {
       resetareParola_loc.click();

    }







}
