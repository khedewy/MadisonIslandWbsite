package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UpdateCartPage extends PageBase {
    public UpdateCartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Edit")
    WebElement editBtn;

    public void GotoUpdateCartPage(){
        clickElements(editBtn);
    }

    @FindBy(id = "attribute180")
    WebElement sizeList;

    @FindBy(id = "qty")
    WebElement quantityBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[1]/form/div[3]/div[6]/div[2]/div[2]/button/span/span")
    WebElement updateCartBtn;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div/div[2]/form/table/tbody/tr[1]/td[6]/a")
    WebElement deleteBtn;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li/span")
    public WebElement AssertionMessage;

    public void UpdateCart(String quantity) throws InterruptedException {
        select = new Select(sizeList);
        select.selectByIndex(1);
        clearElements(quantityBox);
        Thread.sleep(2000);
        setText(quantityBox,quantity);
        Thread.sleep(2000);
        clickElements(updateCartBtn);
    }

    public void setDeleteBtn(){
        clickElements(deleteBtn);
    }
}
