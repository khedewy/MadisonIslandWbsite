package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button.button.btn-proceed-checkout.btn-checkout")
    WebElement CheckoutBtn;

    public void GoToCheckOutPage(){
        clickElements(CheckoutBtn);
    }

    @FindBy(id = "billing:company")
    WebElement companyBox;

    @FindBy(id = "billing:street1")
    WebElement addressBox;

    @FindBy(id = "billing:street2")
    WebElement address2Box;

    @FindBy(id = "billing:city")
    WebElement cityBox;

    @FindBy(id = "billing:country_id")
    WebElement countryList;

    @FindBy(id = "billing:region")
    WebElement regionBox;

    @FindBy(id = "billing:postcode")
    WebElement postcodeBox;

    @FindBy(id = "billing:telephone")
    WebElement phoneBox;

    @FindBy(id = "billing:fax")
    WebElement faxBox;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/div/button")
    WebElement continueBtn;

    public void FillCheckout(String companyName, String adress1, String address2, String city, String region,String postcode
    ,String phone, String fax) throws InterruptedException {
        setText(companyBox,companyName);
        setText(addressBox,adress1);
        setText(address2Box,address2);
        setText(cityBox,city);
        setText(postcodeBox,postcode);
        setText(phoneBox,phone);
        setText(faxBox,fax);
        select = new Select(countryList);
        select.selectByVisibleText("Egypt");
        Thread.sleep(2000);
        setText(regionBox,region);
        Thread.sleep(2000);
        clickElements(continueBtn);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button")
    WebElement ContinueBtn2;

    public void goToPaymentInformation(){
        clickElements(ContinueBtn2);
    }

    @FindBy(id = "p_method_cashondelivery")
    WebElement cashOption;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/ol/li[4]/div[2]/div[2]/button")
    WebElement continueBtn3;

    public void goToOrderReview(){
        clickElements(cashOption);
        clickElements(continueBtn3);
    }

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/ol/li[5]/div[2]/div/div[2]/div/button")
    WebElement placeOrderBtn;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div/div[2]/h1")
    public WebElement AssertionMessage;

    public void setPlaceOrderBtn(){
        clickElements(placeOrderBtn);
    }
}
