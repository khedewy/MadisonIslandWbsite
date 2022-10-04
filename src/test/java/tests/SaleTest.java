package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SalePage;

public class SaleTest extends TestBase{
    SalePage sale;

    @Test(priority = 0)
    public void UserCanSeeMenItems() throws InterruptedException {
        sale = new SalePage(driver);
        sale.ShowMenItems();
        Thread.sleep(4000);
        Assert.assertTrue(sale.AssertionMessage.getText().contains("MEN"));
    }

    @Test(priority = 1)
    public void UserCanSeeWomen() throws InterruptedException {
        sale = new SalePage(driver);
        sale.ShowWomenItems();
        Thread.sleep(4000);
        Assert.assertTrue(sale.AssertionMessage.getText().contains("WOMEN"));
    }
    @Test(priority = 2)
    public void UserCanSeeAccessories() throws InterruptedException {
        sale = new SalePage(driver);
        sale.ShowAccessoriesItems();
        Thread.sleep(4000);
        Assert.assertTrue(sale.AssertionMessage.getText().contains("ACCESSORIES"));
    }
}
