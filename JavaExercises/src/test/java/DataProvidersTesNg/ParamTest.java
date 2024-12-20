package DataProvidersTesNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParamTest {
//    ChromeDriver driver;
    EdgeDriver driver;
//    FirefoxDriver driver;
    @BeforeClass @Parameters({"browser"})
    void setUp(String br, String url) throws InterruptedException { //the value from xml file "chrome" will be captured into the string

        switch (br.toLowerCase()) {

//            case "chrome": driver=new ChromeDriver(); break;
//            case "firefox": driver=new FirefoxDriver(); break;
            case "edge": driver=new EdgeDriver(); break;
            default: System.out.println("Invalid browser"); return; //exit from the entire code

        }


        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    void testLogo() {

        boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(status, true);

    }
@Test(priority = 2)
    void testTitle() {
    Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @Test(priority = 3)
    void testURL() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Test(priority = 4)
    void tearDown() {
       driver.close();

    }


}
