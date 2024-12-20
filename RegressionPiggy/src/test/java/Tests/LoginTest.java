package Tests;

import Pages.CreateAccountPage;
import Pages.LandingPage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest  {

    ChromeDriver driver;


    @BeforeClass
    void setUp() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.porcporc.com/");
        driver.manage().window().maximize();
    }

    @Test(dataProvider="dp")
   public void loginTest(String email, String password) {
        LoginPage login = new LoginPage(driver);
        LandingPage landing = new LandingPage(driver);
        CreateAccountPage accountPage=new CreateAccountPage(driver);
        login.clickLoginIcon();
        login.setUsername(email);
        login.setPassword(password);
//        lp.checkMemorareParola();
        accountPage.checkRecapcha();
        login.clickConectareButton();

//        login.clickResetareButton();


//        boolean informatiiCont_loc=login.myAccount_check();
//        Assert.assertTrue(informatiiCont_loc);
    }









    @DataProvider(name="dp", indices= {0,1, 2, 3,4})  //indices are for choosing which data to use
    Object[][] loginData() {

        Object data[][] = {
                {"noemi.pohrib@freshbyteinc.com", "test123"},
                {"xyz@gmail.com", "test012"},
                {"john@gmail.com", "test@123"},
                {"johndoe@gmail.com", "test@123"},
                {"noemi.pohrib@freshbyteinc.com", "test1234@"},

        };

        return data;

    }

    @AfterClass
    void tearDown() {
        driver.close();
    }

    }



