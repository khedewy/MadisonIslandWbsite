package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.EstimatePage;
import pages.SearchPage;

import java.awt.*;

public class EstimateTest extends TestBase{

    ProductDetailsPage details;
    SearchPage search;
    EstimatePage estimate;

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
    @Test
    public void UserCanEstimateShipping() throws InterruptedException {
        estimate = new EstimatePage(driver);
        Thread.sleep(3000);
        estimate.Estimate("Shoag","Maragha","1234");
        Thread.sleep(5000);
        Assert.assertTrue(estimate.AssertionMessage.getText().contains("Free Shipping"));

    }
}
