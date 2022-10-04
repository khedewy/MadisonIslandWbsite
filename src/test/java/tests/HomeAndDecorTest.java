package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomeAndDecorPage;

public class HomeAndDecorTest extends TestBase{
    HomeAndDecorPage home;

    @Test(priority = 0)
    public void UserCanSeeElectronicsItems() throws InterruptedException {
        home = new HomeAndDecorPage(driver);
        home.ShowElectronicsItems();
        Thread.sleep(4000);
        Assert.assertTrue(home.AssertionMessage.getText().contains("ELECTRONICS"));
    }
    @Test(priority = 1)
    public void  UserCanSeeBooksItems() throws InterruptedException {
        home = new HomeAndDecorPage(driver);
        home.ShowBooksItems();
        Thread.sleep(4000);
        Assert.assertTrue(home.AssertionMessage.getText().contains("BOOK"));
    }

    @Test(priority = 2)
    public void UserCanSeeCanBedItems() throws InterruptedException {
        home = new HomeAndDecorPage(driver);
        home.ShowBedItems();
        Thread.sleep(4000);
        Assert.assertTrue(home.AssertionMessage.getText().contains("BED"));
    }
}
