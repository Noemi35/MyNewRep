package Tests;

import Pages.LandingPage;
import Pages.SearchPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchPageTest {
    ChromeDriver driver;


    @BeforeClass
    void setUp() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.porcporc.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void searchFunctionality() {
        LandingPage landingPage=new LandingPage(driver);
        SearchPage searchPage=new SearchPage(driver);
        searchPage.clickSeachIcon();
        searchPage.fillSearch("t-shirt");
        searchPage.clickEnter();
        boolean searchResults_loc= searchPage.searchResultsDisplayed();
        Assert.assertTrue(searchResults_loc);
    }

    @AfterClass
    void tearDown() {
        driver.close();
    }
}
