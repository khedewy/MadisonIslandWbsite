package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SalePage extends PageBase{
    public SalePage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[5]/a")
    WebElement SaleList;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[5]/ul/li[2]/a")
    WebElement women;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[5]/ul/li[3]/a")
    WebElement men;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[5]/ul/li[4]/a")
    WebElement accessories;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/ul/li[3]/strong")
    public WebElement AssertionMessage;

    public void ShowMenItems() throws InterruptedException {
        actions.moveToElement(SaleList);
        Thread.sleep(2000);
        actions.moveToElement(men).click().build().perform();
    }

    public void ShowWomenItems() throws InterruptedException {
        actions.moveToElement(SaleList);
        Thread.sleep(2000);
        actions.moveToElement(women).click().build().perform();
    }

    public void ShowAccessoriesItems() throws InterruptedException {
        actions.moveToElement(SaleList);
        Thread.sleep(2000);
        actions.moveToElement(accessories).click().build().perform();
    }
}
