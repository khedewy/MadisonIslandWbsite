package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccessoriesPage;

public class AccessoriesTest extends TestBase{
    AccessoriesPage accessories;

    @Test(priority = 0)
    public void UserCanSeeEyeWearItems() throws InterruptedException {
        accessories = new AccessoriesPage(driver);
        accessories.ShowEyeWearItems();
        Thread.sleep(4000);
        Assert.assertTrue(accessories.AssertionMessage.getText().contains("EYEWEAR"));
    }
    @Test(priority = 1)
    public void UserCanSeeShoesItems() throws InterruptedException {
        accessories = new AccessoriesPage(driver);
        accessories.showShoesItems();
        Thread.sleep(4000);
        Assert.assertTrue(accessories.AssertionMessage.getText().contains("SHOES"));
    }

    @Test(priority = 2)
    public void UserCanSeeJeweleryItems() throws InterruptedException {
        accessories = new AccessoriesPage(driver);
        accessories.ShowJeweleryItems();
        Thread.sleep(4000);
        Assert.assertTrue(accessories.AssertionMessage.getText().contains("JEWELRY"));
    }
}
