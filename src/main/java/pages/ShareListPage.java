package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShareListPage extends PageBase{
    public ShareListPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "email_address")
    WebElement emailBox;

    @FindBy(id = "message")
    WebElement messageBox;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/form/div[2]/button")
    WebElement shareBtn;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li/ul/li/span")
    public WebElement AssertionMessage;

    public void shareWishList(String email,String message) throws InterruptedException {
        setText(emailBox,email);
        setText(messageBox,message);
        Thread.sleep(2000);
        clickElements(shareBtn);
    }
}
