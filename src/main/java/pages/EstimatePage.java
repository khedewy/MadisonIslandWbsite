package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EstimatePage extends PageBase{
    public EstimatePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "country_id")
    WebElement countryList;

    @FindBy(id = "region")
    WebElement regionBox;

    @FindBy(id = "city")
    WebElement cityBox;

    @FindBy(id = "postcode")
    WebElement postcodeBox;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/form[2]/dl/dt")
    public WebElement AssertionMessage;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/form/div/button")
    WebElement estimateBtn;

    public void Estimate(String region, String city, String postcode) throws InterruptedException {
        select = new Select(countryList);
        select.selectByVisibleText("Egypt");
        Thread.sleep(1000);
        setText(regionBox,region);
        setText(cityBox,city);
        setText(postcodeBox,postcode);
        Thread.sleep(2000);
        clickElements(estimateBtn);
    }
}
