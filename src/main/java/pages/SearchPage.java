package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search")
    WebElement searchBox;


    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/h1")
    public  WebElement AssertionMessage;

    public void UserSearch(String productName) throws AWTException {
        searchBox.sendKeys(productName);
        robot = new Robot();
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
}
