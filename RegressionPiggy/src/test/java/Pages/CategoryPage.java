package Pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryPage {
    ChromeDriver driver;

   public CategoryPage(ChromeDriver driver) {
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }


   //locators
    @FindBy(xpath ="//div[@class='menu-show']")
    WebElement  menuIcon_loc ;
    @FindBy(xpath ="//span[normalize-space()='Camasi']")
    WebElement  camasi_loc ;
//    @FindBy(xpath = "//a[@class='level-top active']//i[@class='fa fa-chevron-right']")
//    WebElement rightArrow_loc;
//    @FindBy(xpath = "//span[normalize-space()='Hanorace cu fermoar']")
//    WebElement subcategoryHanorace_Loc;


    @FindBy(xpath = "//a[@aria-label='maneca scurta']") WebElement category_loc;
    @FindBy(xpath = "//label[normalize-space()='Masura']") WebElement size_loc;
    @FindBy(xpath = "//span[normalize-space()='S']") WebElement sSize_loc;
    @FindBy(xpath = "//label[normalize-space()='Culoare']") WebElement culoare_loc;
    @FindBy(xpath = "//a[@aria-label='eden']//span[@class='image ']") WebElement edenColor_loc;
    @FindBy(xpath = "//a[normalize-space()='eden']") WebElement edenColorSelected_loc;
    @FindBy(xpath = "//label[normalize-space()='Pret']") WebElement price_loc;
    @FindBy(xpath = "//div[@id='price-range']//span[1]") WebElement sliderMinPrice_loc;
    @FindBy(xpath = "//div[@id='price-range']//span[2]") WebElement sliderMaxPrice_loc;

    @FindBy(xpath = "//a[normalize-space()='s']") WebElement sSizeSelected_loc;
    @FindBy(xpath = "//a[normalize-space()='maneca scurta']") WebElement categorySelected_loc;
    @FindBy(xpath = "//img[@alt='\"Proper\" Brown Corduroy Shirt']") WebElement Categoryproduct_loc;





    //action methods

    public void clickMenuIcon() {
        menuIcon_loc.click();
    }

    public void clickCamasiCategory() {
        camasi_loc.click();
    }

    public void clickSortCategory() {
       category_loc.click();
    }

    public void clickSize() {
       size_loc.click();
    }

    public void clickS() {
       sSize_loc.click();
    }

    public void clickCuloare() {
        culoare_loc.click();
    }
    public void clickSpecificColor() {
        edenColor_loc.click();
    }

    public void removeEdenColor() {
        edenColorSelected_loc.click();
    }
    public void clickPrice() {
       price_loc.click();
    }

    public void setPrice() {
        Actions act=new Actions(driver);
        System.out.println(sliderMinPrice_loc.getLocation());//(226, 94)
        act.dragAndDropBy(sliderMinPrice_loc,100,94).perform();
        System.out.println(sliderMinPrice_loc.getLocation());

        System.out.println(sliderMaxPrice_loc.getLocation());//(521, 92)
        act.dragAndDropBy(sliderMaxPrice_loc,-100,100).perform();
        System.out.println(sliderMaxPrice_loc.getLocation());

    }

    public void removeSsize() {

        sSizeSelected_loc.click();
    }

    public void removeCategory() {

      categorySelected_loc.click();
    }

    public void hoverOverProduct() {
        Actions act=new Actions(driver);
        act.moveToElement(Categoryproduct_loc).build().perform();
    }

    public void clickProduct() {
        Categoryproduct_loc.click();
    }




//    public void clickrightArrow() {
//        rightArrow_loc.click();
//    }

//    public void clickSubcategoryHanorace() {
//      subcategoryHanorace_Loc.click();
//    }


}
