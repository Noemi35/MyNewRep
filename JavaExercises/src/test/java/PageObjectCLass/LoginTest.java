package PageObjectCLass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    ChromeDriver driver;
    @BeforeClass
    void setUp() {
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    }

   @Test
    void Login() {
        LoginPage2 lp=new LoginPage2(driver); //the constructor will be invocked automatically
//       lp.setUpUsername("Admin");
//       lp.setUpPassword("admin123");
//       lp.clickButton();
       Assert.assertEquals(driver.getTitle(), "Orange HRM");

    }


    @AfterClass
    void tearDown() {
     driver.close();
    }
}
