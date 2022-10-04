package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenPage extends PageBase{
    public MenPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }
    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[2]/a")
    WebElement MenList;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[2]/ul/li[3]/a")
    WebElement shirts;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[2]/ul/li[6]/a")
    WebElement Blazers;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[2]/ul/li[5]/a")
    WebElement pants;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/ul/li[3]/strong")
    public WebElement AssertionMessage;


    public void setShirts() throws InterruptedException {
        actions.moveToElement(MenList);
        Thread.sleep(2000);
        actions.moveToElement(shirts).click().build().perform();
    }

    public void setBlazers() throws InterruptedException {
        actions.moveToElement(MenList);
        Thread.sleep(2000);
        actions.moveToElement(Blazers).click().build().perform();

    }

    public void setPants() throws InterruptedException {
        actions.moveToElement(MenList);
        Thread.sleep(2000);
        actions.moveToElement(pants).click().build().perform();
    }
}
