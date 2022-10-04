package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class WomenPage extends PageBase{
    public WomenPage(WebDriver driver) {
        super(driver);
        actions = new Actions(driver);
    }
    @FindBy(css = "a.level0.has-children")
    WebElement WomenList;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[1]/ul/li[2]/a")
    WebElement NewArrivals;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[1]/ul/li[4]/a")
    WebElement pantsAndDenim;

    @FindBy(xpath = "/html/body/div/div[2]/header/div/div[3]/nav/ol/li[1]/ul/li[5]/a")
    WebElement Dresses;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/ul/li[3]/strong")
    public  WebElement AssertionMessage;


    public void setNewArrivals() throws InterruptedException {
        actions.moveToElement(WomenList);
        Thread.sleep(2000);
        actions.moveToElement(NewArrivals).click().build().perform();
    }

    public void setPantsAndDenim() throws InterruptedException {
        actions.moveToElement(WomenList);
        Thread.sleep(2000);
        actions.moveToElement(pantsAndDenim).click().build().perform();
    }

    public void setDresses() throws InterruptedException {
        actions.moveToElement(WomenList);
        Thread.sleep(2000);
        actions.moveToElement(Dresses).click().build().perform();
    }

}
