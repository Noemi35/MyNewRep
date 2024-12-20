package Tests;

import Pages.ProductPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductTest {
    ChromeDriver driver;


    @BeforeClass
    void setUp() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.porcporc.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void addOnBasketTest() {
        ProductPage productPage=new ProductPage(driver);
        productPage.checkTitleProductPage();

    }
}
