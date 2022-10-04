package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

import java.awt.*;

public class CheckOutTest extends TestBase{
    MainPage main;
    RegisterPage register;
    SearchPage search;
    ProductDetailsPage details;
    CheckOutPage check;


    @Test(priority = 0)
    public void UserCanGoToRegisterPage() throws InterruptedException {
        main = new MainPage(driver);
        Thread.sleep(3000);
        main.ShowRegisterPage();
    }
    @DataProvider(name = "UserData")
    public Object[][] userData(){
        return  new Object[][]{
                {"mahmoud","khedewy","mmahoipoud0999@gmail.com","m01234567"}
        };
    }


    @Test(dataProvider = "UserData",priority = 1)
    public void UserCanRegister(String firstName,String lastName, String email, String password) throws InterruptedException {
        register = new RegisterPage(driver);
        Thread.sleep(2000);
        register.UserCanRegister(firstName,lastName,email,password);
        Thread.sleep(6000);
        Assert.assertTrue(register.AssertionMessage.getText().contains("Thank you for registering with Madison Island."));
    }

    @Test(priority = 2)
    public void UserCanSearch() throws AWTException, InterruptedException {
        search = new SearchPage(driver);
        search.UserSearch("dress red");
        Thread.sleep(4000);
        Assert.assertTrue(search.AssertionMessage.getText().contains("SEARCH RESULTS FOR 'DRESS RED'"));
    }
    @Test(priority = 3)
    public void UserCanAddToCart() throws InterruptedException {
        details = new ProductDetailsPage(driver);
        details.UserCanAddToCat();
        Thread.sleep(4000);
        Assert.assertTrue(details.CartAssertionMessage.getText().contains("Merino V-neck Pullover Sweater was added to your shopping cart."));
    }

    @DataProvider(name = "CheckOutData")
    public Object[][] checkOutData(){
        return  new Object[][]{
                {"Microsoft","adss12","asdaa1","Sohag","Maragha","1232","012345678","1211"}
        };
    }

    @Test(priority = 3,dataProvider = "CheckOutData")
    public void UserCanCompleteCheckOUT(String companyName,String address1,String address2,String city,String region,String postcode,String phone,String fax) throws InterruptedException {
        check = new CheckOutPage(driver);
        check.GoToCheckOutPage();
        Thread.sleep(3000);
        check.FillCheckout(companyName,address1,address2,city,region,postcode,phone,fax);
        Thread.sleep(10000);
        check.goToPaymentInformation();
        Thread.sleep(5000);
        check.goToOrderReview();
        Thread.sleep(5000);
        check.setPlaceOrderBtn();
        Thread.sleep(5000);
        Assert.assertTrue(check.AssertionMessage.getText().contains("YOUR ORDER HAS BEEN RECEIVED."));
    }
}
