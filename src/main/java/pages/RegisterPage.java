package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="firstname")
    WebElement firstNameTxt;

    @FindBy(id = "lastname")
    WebElement lastNameTxt;

    @FindBy(id = "email_address")
    WebElement emailAddressTxt;

    @FindBy(id = "password")
    WebElement passwordTxt;

    @FindBy(id = "confirmation")
    WebElement confirmPasswordTxt;

    @FindBy(id = "is_subscribed")
    WebElement subscribedBtn;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div/div/form/div[2]/button")
    WebElement registerBtn;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div/div/ul/li/ul/li/span")
    public WebElement AssertionMessage;

    public void UserCanRegister(String firstName,String lastName, String email, String password) throws InterruptedException {
        setText(firstNameTxt,firstName);
        setText(lastNameTxt,lastName);
        setText(emailAddressTxt,email);
        setText(passwordTxt,password);
        setText(confirmPasswordTxt,password);
        clickElements(subscribedBtn);
        Thread.sleep(2000);
        clickElements(registerBtn);
    }
}
