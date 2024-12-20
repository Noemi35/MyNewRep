package Tests;

import Pages.CreateAccountPage;
import Pages.LandingPage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccountTest {

    ChromeDriver driver;


    @BeforeClass
    void setUp() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.porcporc.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {
        LoginPage login = new LoginPage(driver);
        LandingPage landing = new LandingPage(driver);
        CreateAccountPage account=new CreateAccountPage(driver);
        login.clickLoginIcon();
        account.clickCreareCont();
        account.fillFirstName("Noemi");
        account.fillLastName("Test");
        account.selectBirthday();
        account.fillCodFiscal("123456");
        account.fillCompanie("SC IPSUM SRL");
        account.fillPhone("0744567867");
        account.fillStreet("Bistritei 56");
        account.fillTVA("12345");
        account.selectTara();
        account.fillLocalitate("Constanta");
        account.fillZipCode("400430");
        account.fillEmail("noemi.pohrib@gmail.com");
        account.fillPassword("test1234@");
        account.confirmPassword("test1234@");
        account.checkRecapcha();
        account.clickCreareCont();


    }

    @AfterClass
    void tearDown() {
        driver.close();
    }
}
