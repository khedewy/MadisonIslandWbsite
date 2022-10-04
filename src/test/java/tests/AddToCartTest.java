package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.SearchPage;

import java.awt.*;

public class AddToCartTest extends TestBase{
    ProductDetailsPage productDetailsPage;
    SearchPage search;

    @Test(priority = 0)
    public void UserCanSearch() throws AWTException, InterruptedException {
        search = new SearchPage(driver);
        search.UserSearch("dress red");
        Thread.sleep(4000);
        Assert.assertTrue(search.AssertionMessage.getText().contains("SEARCH RESULTS FOR 'DRESS RED'"));
    }
    @Test(priority = 1)
    public void UserCanAddToCart() throws InterruptedException {
        productDetailsPage = new ProductDetailsPage(driver);
        productDetailsPage.UserCanAddToCat();
        Thread.sleep(4000);
        Assert.assertTrue(productDetailsPage.CartAssertionMessage.getText().contains("Merino V-neck Pullover Sweater was added to your shopping cart."));
    }

    @Test(priority = 2)
    public void UserCanAddAgainToCart() throws AWTException, InterruptedException {
        search = new SearchPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        search.UserSearch("pants");
        Thread.sleep(4000);
        Assert.assertTrue(search.AssertionMessage.getText().contains("SEARCH RESULTS FOR 'PANTS'"));
        productDetailsPage.AddToCart2();
        Thread.sleep(2000);
        Assert.assertEquals("Flat Front Trouser was added to your shopping cart.", productDetailsPage.CartAssertionMessage.getText());
    }

}
