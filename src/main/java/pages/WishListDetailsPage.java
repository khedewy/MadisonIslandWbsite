package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListDetailsPage extends PageBase{
    public WishListDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input.input-text.qty.validate-not-negative-number")
    WebElement quantityBox;

    @FindBy(name = "description[2528]")
    WebElement commentBox;

    @FindBy(css = "button.btn-update.button-secondary")
    WebElement updateWishList;

    public void UpdateQuantityAndComment(String quantity, String comment) throws InterruptedException {
        clearElements(quantityBox);
        Thread.sleep(1500);
        setText(quantityBox,quantity);
        setText(commentBox,comment);
        Thread.sleep(2000);
        clickElements(updateWishList);
    }

    @FindBy(css = "a.link-edit.button.button-secondary")
    WebElement editWishList;

    public void GoToEditWishList(){
        clickElements(editWishList);
    }

    @FindBy(css = "button.button.btn-share")
    WebElement shareWishListBtn;

    public void goToSharWishList(){
        clickElements(shareWishListBtn);
    }

    @FindBy(css = "a.btn-remove.btn-remove2")
    WebElement removeItemsBtn;

    public void deleteItems() throws InterruptedException {
        clickElements(removeItemsBtn);
        Thread.sleep(2000);

    }
}
