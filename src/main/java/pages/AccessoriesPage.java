package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccessoriesPage extends PageBase{
    public AccessoriesPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[3]/a")
    WebElement AccessoriesBtn;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[3]/ul/li[2]/a")
    WebElement eyeWear;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[3]/ul/li[4]/a")
    WebElement Shoes;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[3]/ul/li[3]/a")
    WebElement jewelery;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/ul/li[3]/strong")
    public WebElement AssertionMessage;

    public void ShowEyeWearItems() throws InterruptedException {
        actions.moveToElement(AccessoriesBtn);
        Thread.sleep(2000);
        actions.moveToElement(eyeWear).click().build().perform();
    }

    public void showShoesItems() throws InterruptedException {
        actions.moveToElement(AccessoriesBtn);
        Thread.sleep(2000);
        actions.moveToElement(Shoes).click().build().perform();
    }

    public void ShowJeweleryItems() throws InterruptedException {
        actions.moveToElement(AccessoriesBtn);
        Thread.sleep(2000);
        actions.moveToElement(jewelery).click().build().perform();
    }
}
