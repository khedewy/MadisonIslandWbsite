package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MenPage;

public class MenTest extends TestBase{
    MenPage men;

    @Test(priority = 0)
    public void UserCanSeeShirts() throws InterruptedException {
        men = new MenPage(driver);
        Thread.sleep(2000);
        men.setShirts();
        Thread.sleep(4000);
        Assert.assertTrue(men.AssertionMessage.getText().contains("SHIRTS"));

    }

    @Test(priority = 1)
    public void UserCanSeeBlazers() throws InterruptedException {
        men = new MenPage(driver);
        men.setBlazers();
        Thread.sleep(4000);
        Assert.assertTrue(men.AssertionMessage.getText().contains("BLAZERS"));
    }
    @Test(priority = 2)
    public void UserCanSeePants() throws InterruptedException {
        men = new MenPage(driver);
        men.setPants();
        Thread.sleep(4000);
        Assert.assertTrue(men.AssertionMessage.getText().contains("PANTS"));
    }
}
