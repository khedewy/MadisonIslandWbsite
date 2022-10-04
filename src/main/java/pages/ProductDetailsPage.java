package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailsPage extends PageBase{
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.button.btn-cart")
    WebElement addToCartBtn;

    @FindBy(id = "product-collection-image-411")
    WebElement dressBtn;

    @FindBy(css = "select.required-entry.super-attribute-select")
    WebElement colorList;

    @FindBy(id = "attribute180")
    WebElement sizeList;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li/span")
    public WebElement CartAssertionMessage;


    public void UserCanAddToCat() throws InterruptedException {
        clickElements(dressBtn);
        Thread.sleep(5000);
        select = new Select(colorList);
        select.selectByVisibleText("Red");
        select = new Select(sizeList);
        select.selectByIndex(2);
        Thread.sleep(2000);
        clickElements(addToCartBtn);
    }

    @FindBy(linkText = "Add to Wishlist")
    WebElement addToWishListBtn;


    public void UserCanAddToWishList() throws InterruptedException {
        clickElements(dressBtn);
        Thread.sleep(5000);
        select = new Select(colorList);
        select.selectByVisibleText("Red");
        select = new Select(sizeList);
        select.selectByIndex(2);
        Thread.sleep(2000);
        clickElements(addToWishListBtn);
    }

    @FindBy(id = "product-collection-image-416")
    WebElement pantsBtn;

    //@FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li/span")
    //public WebElement pantAssertMessage;

    public void AddToCart2() throws InterruptedException {
        clickElements(pantsBtn);
        Thread.sleep(4000);
        select = new Select(colorList);
        select.selectByIndex(1);
        select = new Select(sizeList);
        select.selectByIndex(2);
        Thread.sleep(2000);
        clickElements(addToCartBtn);
    }


}
