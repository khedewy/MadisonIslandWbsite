package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageBase{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[2]/a[3]/span[2]")
    WebElement ShowOptionsBtn;

    @FindBy(linkText = "Register")
    WebElement RegisterBtn;

    public void ShowOptionList(){
        clickElements(ShowOptionsBtn);
    }

    public void ShowRegisterPage() throws InterruptedException {
        clickElements(ShowOptionsBtn);
        Thread.sleep(2000);
        clickElements(RegisterBtn);
    }

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[5]/div/ul/li[5]/a")
    WebElement logOutBtn;

    public void LogOut() throws InterruptedException {
        clickElements(ShowOptionsBtn);
        Thread.sleep(2000);
        clickElements(logOutBtn);
    }

    @FindBy(linkText = "Log In")
    WebElement logINBtn;

    public void Login() throws InterruptedException {
        clickElements(ShowOptionsBtn);
        Thread.sleep(2000);
        clickElements(logINBtn);
    }
}
