package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditWishListPage extends PageBase{
    public EditWishListPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css = "select.required-entry.super-attribute-select")
    WebElement colorList;

    @FindBy(id = "attribute180")
    WebElement sizeList;

    @FindBy(id = "qty")
    WebElement quantityBox;

    @FindBy(linkText = "Update Wishlist")
    WebElement updateListBtn;


    public void UpdateWishList(String quantity) throws InterruptedException {
        select = new Select(colorList);
        select.selectByVisibleText("Red");
        Thread.sleep(1000);
        select = new Select(sizeList);
        select.selectByIndex(1);
        Thread.sleep(2000);
        clearElements(quantityBox);
        Thread.sleep(1000);
        setText(quantityBox,quantity);
        Thread.sleep(2000);
        clickElements(updateListBtn);
    }
}
