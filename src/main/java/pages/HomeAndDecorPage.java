package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomeAndDecorPage extends PageBase{
    public HomeAndDecorPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }
    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[4]/a")
    WebElement HomeAndDecor;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[4]/ul/li[4]/a")
    WebElement electronics;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[4]/ul/li[2]/a")
    WebElement Books;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[4]/ul/li[3]/a")
    WebElement Bed;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/ul/li[3]/strong")
    public WebElement AssertionMessage;

    public void ShowElectronicsItems() throws InterruptedException {
        actions.moveToElement(HomeAndDecor);
        Thread.sleep(2000);
        actions.moveToElement(electronics).click().build().perform();
    }

    public void ShowBooksItems() throws InterruptedException {
        actions.moveToElement(HomeAndDecor);
        Thread.sleep(2000);
        actions.moveToElement(Books).click().build().perform();
    }

    public void ShowBedItems() throws InterruptedException {
        actions.moveToElement(HomeAndDecor);
        Thread.sleep(2000);
        actions.moveToElement(Bed).click().build().perform();
    }
}
