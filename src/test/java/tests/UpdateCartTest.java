package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.SearchPage;
import pages.UpdateCartPage;

import java.awt.*;

public class UpdateCartTest extends TestBase{

    ProductDetailsPage details;
    SearchPage search;
    UpdateCartPage update;

    @Test(priority = 0)
    public void UserCanSearch() throws AWTException, InterruptedException {
        search = new SearchPage(driver);
        search.UserSearch("dress red");
        Thread.sleep(4000);
        Assert.assertTrue(search.AssertionMessage.getText().contains("SEARCH RESULTS FOR 'DRESS RED'"));
    }
    @Test(priority = 1)
    public void UserCanAddToCart() throws InterruptedException {
        details = new ProductDetailsPage(driver);
        details.UserCanAddToCat();
        Thread.sleep(4000);
        Assert.assertTrue(details.CartAssertionMessage.getText().contains("Merino V-neck Pullover Sweater was added to your shopping cart."));
    }
    @Test(priority = 2)
    public void UserCanAddAgainToCart() throws AWTException, InterruptedException {
        search = new SearchPage(driver);
        details = new ProductDetailsPage(driver);
        search.UserSearch("pants");
        Thread.sleep(4000);
        Assert.assertTrue(search.AssertionMessage.getText().contains("SEARCH RESULTS FOR 'PANTS'"));
        details.AddToCart2();
        Thread.sleep(2000);
        Assert.assertEquals("Flat Front Trouser was added to your shopping cart.",details.CartAssertionMessage.getText());
    }

    @Test(priority = 3)
    public void UserCanUpdateCart() throws InterruptedException {
        update = new UpdateCartPage(driver);
        update.GotoUpdateCartPage();
        Thread.sleep(3000);
        update.UpdateCart("3");
        Thread.sleep(5000);
        Assert.assertTrue(update.AssertionMessage.getText().contains("Merino V-neck Pullover Sweater was updated in your shopping cart."));
        update.setDeleteBtn();
        Thread.sleep(5000);
    }
}
