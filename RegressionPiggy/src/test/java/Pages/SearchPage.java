package Pages;

import net.bytebuddy.asm.Advice;
import org.checkerframework.checker.units.qual.C;
import org.openqa.jetty.html.Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class SearchPage {
    ChromeDriver driver;

    public SearchPage(ChromeDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //locators
    @FindBy(xpath ="//img[@alt='Search entire store']")
    WebElement searchIcon_loc ;
    @FindBy(xpath ="//input[@name='q']")
    WebElement fillSearch_loc ;
    @FindBy(xpath ="//main[@id='maincontent']//strong[1]")
    WebElement searchResults_loc;


    //action methods

    public void clickSeachIcon() {
        searchIcon_loc.click();
    }

    public void fillSearch(String search) {
      fillSearch_loc.sendKeys(search);
    }

    public  void clickEnter() {
        Actions act=new Actions(driver);
        act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

    }

   public boolean searchResultsDisplayed() {
        searchResults_loc.isDisplayed();
        return true;
    }
}
