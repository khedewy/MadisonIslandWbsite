package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WomenPage;

public class WomenTest extends TestBase{
    WomenPage women;

    @Test(priority = 0)
    public void UserCanSeeNew() throws InterruptedException {
        women = new WomenPage(driver);
        Thread.sleep(2000);
        women.setNewArrivals();
        Thread.sleep(3000);
        Assert.assertTrue(women.AssertionMessage.getText().contains("NEW"));
    }

    @Test(priority = 1)
    public void UserCanSeePants() throws InterruptedException {
        women = new WomenPage(driver);
        Thread.sleep(2000);
        women.setPantsAndDenim();
        Thread.sleep(3000);
        Assert.assertTrue(women.AssertionMessage.getText().contains("PANTS"));
    }
    @Test(priority = 2)
    public void UserCanSeeDresses() throws InterruptedException {
        women = new WomenPage(driver);
        women.setDresses();
        Thread.sleep(4000);
        Assert.assertTrue(women.AssertionMessage.getText().contains("DRESSES"));
    }
}
