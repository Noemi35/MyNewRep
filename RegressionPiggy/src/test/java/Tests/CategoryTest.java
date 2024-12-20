package Tests;

import Pages.CategoryPage;
import Pages.LandingPage;
import Pages.SearchPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class CategoryTest {

    ChromeDriver driver;


    @BeforeClass
    void setUp() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.porcporc.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void sortProducts() {
       CategoryPage categoryPage=new CategoryPage(driver);
       LandingPage landingPage=new LandingPage(driver);
       landingPage.acceptCookies();
       categoryPage.clickMenuIcon();
       categoryPage.clickCamasiCategory();
       categoryPage.clickSortCategory();
       categoryPage.clickSize();
       categoryPage.clickS();
       categoryPage.clickCuloare();
       categoryPage.clickSpecificColor();
       categoryPage.removeEdenColor();
       categoryPage.clickPrice();
       categoryPage.setPrice();
       categoryPage.removeSsize();
       categoryPage.removeCategory();
       categoryPage.hoverOverProduct();
       categoryPage.clickProduct();

        }


    }

