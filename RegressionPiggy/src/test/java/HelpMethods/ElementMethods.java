package HelpMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ElementMethods {

    public WebDriver driver;
    public JavascriptExecutor executor;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
        executor = (JavascriptExecutor) driver;
    }


}
