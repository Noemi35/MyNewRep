package Base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class SharedData {

    ChromeDriver driver;

//    SharedData(ChromeDriver driver) {
//        this.driver=driver;
//    }

    @BeforeClass
    void setUp() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.porcporc.com/");
        driver.manage().window().maximize();
    }


    @AfterClass
    void tearDown() {
        driver.close();
    }
}
