package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WishListPage extends PageBase{
    public WishListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Add to Wishlist")
    WebElement addToWishListBtn;

    @FindBy(id = "product-collection-image-411")
    WebElement productBtn;

    @FindBy(css = "select.required-entry.super-attribute-select")
    WebElement colorList;

    @FindBy(id = "attribute180")
    WebElement sizeList;


    public void UserCanAddToWishList() throws InterruptedException {
        Thread.sleep(5000);
        clickElements(productBtn);
        Thread.sleep(5000);
        select = new Select(colorList);
        select.selectByVisibleText("Red");
        select = new Select(sizeList);
        select.selectByIndex(2);
        Thread.sleep(2000);
        clickElements(addToWishListBtn);
    }

}
