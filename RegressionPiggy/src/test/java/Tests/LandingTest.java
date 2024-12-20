package Tests;

import Base.SharedData;
import Pages.LandingPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class LandingTest extends SharedData {
    ChromeDriver driver;
    @BeforeClass
    void setUp() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.porcporc.com/");
        driver.manage().window().maximize();
    }

    @Test
    void checkElementsTest() throws InterruptedException {
        LandingPage landing=new LandingPage(driver); //the constructor will be invocked automatically
        landing.checkTitleLandingPage();
        boolean logo_loc=landing.checkLogo();
        Assert.assertTrue(logo_loc);

        boolean shoppingCartIcon_loc =landing.shoppingCartIconIsDisplayed();
        Assert.assertTrue(shoppingCartIcon_loc);

        boolean searchIcon_loc =landing.searchIconIsDisplayed();
        Assert.assertTrue(searchIcon_loc);

        boolean menuIcon_Loc=landing.menuIconIsDisplayed();
        Assert.assertTrue(menuIcon_Loc);

        landing.scrollPageDown();
        landing.scrollPageUp();
        landing.acceptCookies();
        landing.clickLoginIcon();
         Thread.sleep(5000);

    }


    @AfterClass
    void tearDown() {
        driver.close();
    }
}

