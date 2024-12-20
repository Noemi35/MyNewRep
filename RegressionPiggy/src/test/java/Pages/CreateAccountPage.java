package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CreateAccountPage {
    ChromeDriver driver;



    //constructor
    public CreateAccountPage(ChromeDriver driver) {
        this.driver = driver; //automatically invoked
        PageFactory.initElements(driver,this); //driver applied automatically on elements with findby

    }

    //locators

//    By creareCont_loc = By.xpath("//span[normalize-space()='Cont nou']");
//    By firstname_loc = By.xpath("//input[@id='firstname']");
//    By lastname_loc = By.xpath("//input[@id='lastname']");
//    By birthday_loc = By.xpath("");
//    By codFiscal_loc = By.xpath("//input[@id='taxvat']");
//    By companie_loc = By.xpath("//input[@id='company']");
//    By phone_loc = By.xpath("//input[@id='telephone']");
//    By street_loc = By.xpath("//input[@id='street_1']");
//    By TVA_loc = By.xpath("//input[@id='vat_id']");
//   WebElement selectTara_loc = driver.findElement(By.xpath("//select[@id='country']");


//    By localitate_loc = By.xpath("//input[@id='city']");
//    By zipcode_loc = By.xpath("//input[@id='zip']");
//    By email_loc = By.xpath("//input[@id='email_address']");
//    By password_loc = By.xpath("//input[@id='password']");
//    By confirmPassword_loc = By.xpath("//input[@id='password-confirmation']");


    @FindBy(xpath="//span[normalize-space()='Cont nou']") WebElement creareCont_loc;
    @FindBy(xpath="//input[@id='firstname']") WebElement firstname_loc;
    @FindBy(xpath="//input[@id='lastname']") WebElement lastname_loc  ;
    @FindBy(xpath="//input[@id='dob']") WebElement birthday_loc;
    @FindBy(xpath = "//select[@aria-label='Select year']") WebElement birthday_year;
    @FindBy(xpath = "//select[@aria-label='Select month']") WebElement birthday_month;
    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tbody/tr/td") List<WebElement> allDates;
    @FindBy(xpath="//input[@id='taxvat']") WebElement codFiscal_loc;
    @FindBy(xpath="//input[@id='company']") WebElement companie_loc;
    @FindBy(xpath="//input[@id='telephone']") WebElement phone_loc;
    @FindBy(xpath="//input[@id='street_1']") WebElement street_loc;
    @FindBy(xpath="//input[@id='vat_id']") WebElement TVA_loc;
    @FindBy(xpath="//select[@id='country']") WebElement selectTara_loc ;
    @FindBy(xpath="//input[@id='city']") WebElement  localitate_loc;
    @FindBy(xpath="//input[@id='zip']") WebElement  zipcode_loc;
    @FindBy(xpath="//input[@id='email_address']") WebElement email_loc ;
    @FindBy(xpath="//input[@id='password']") WebElement  password_loc;
    @FindBy(xpath="//input[@id='password-confirmation']") WebElement  confirmPassword_loc;

    @FindBy(xpath="//div[@class='recaptcha-checkbox-border']") WebElement  recapchaCheck_loc;




    //methods

    public void clickCreareCont() {

      creareCont_loc.click();
    }

    public void fillFirstName(String firstname) {

      firstname_loc.sendKeys(firstname);
    }
    public void fillLastName(String lastname)
    {
        lastname_loc.sendKeys(lastname);
    }

    public void selectBirthday() {

      birthday_loc.click();
      //select year
        Select drpYear=new Select(birthday_year);
        drpYear.selectByVisibleText("1990");

        //select month
        Select drpMonth=new Select(birthday_month);
        drpMonth.selectByVisibleText("mai");

        //select date
        String date="21";
        for(WebElement dt:allDates) {
           if(dt.getText().equals(date)) {
               dt.click();
               break;
           }
           ;
        }
    }

    public void fillCodFiscal(String codfiscal) {

       codFiscal_loc.sendKeys(codfiscal);
    }

    public void fillCompanie(String company) {
       companie_loc.sendKeys(company);
    }

    public void fillPhone(String phone) {

      phone_loc.sendKeys(phone);
    }

    public void fillStreet(String street) {
       street_loc.sendKeys(street);
    }

    public void fillTVA(String TVA) {
        TVA_loc.sendKeys(TVA);
    }

    public void selectTara() {
        selectTara_loc.click();
        Select dropdownTara=new Select(selectTara_loc);
        dropdownTara.selectByVisibleText("România");

    }

    public void fillLocalitate(String localitate) {

       localitate_loc.sendKeys(localitate);
    }

    public void fillZipCode(String zip) {

     zipcode_loc.sendKeys(zip);
    }

    public void fillEmail(String email) {

       email_loc.sendKeys(email);
    }

    public void fillPassword(String pwd) {
        password_loc.sendKeys(pwd);
    }

    public void confirmPassword(String confpwd) {

       confirmPassword_loc.sendKeys(confpwd);
    }

    public void checkRecapcha() {
        driver.switchTo().frame(0);
        recapchaCheck_loc.click();
    }



}
