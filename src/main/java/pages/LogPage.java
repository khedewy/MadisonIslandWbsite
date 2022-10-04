package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogPage extends PageBase{
    public LogPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailTxt;

    @FindBy(id = "pass")
    WebElement passwordTxt;

    @FindBy(id = "send2")
    WebElement logBtn;

    public void UserLogIN(String email, String password) throws InterruptedException {
        setText(emailTxt,email);
        setText(passwordTxt,password);
        Thread.sleep(2000);
        clickElements(logBtn);
    }
}
