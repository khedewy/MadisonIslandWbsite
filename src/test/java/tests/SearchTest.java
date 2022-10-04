package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

import java.awt.*;

public class SearchTest extends TestBase{
    SearchPage search;

    @Test
    public void UserCanSearch() throws AWTException, InterruptedException {
        search = new SearchPage(driver);
        search.UserSearch("dress red");
        Thread.sleep(4000);
        Assert.assertTrue(search.AssertionMessage.getText().contains("SEARCH RESULTS FOR 'DRESS RED'"));
    }
}
