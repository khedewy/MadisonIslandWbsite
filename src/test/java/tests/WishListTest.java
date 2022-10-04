package tests;

import data.RegisterJsonReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.awt.*;
import java.io.IOException;

public class WishListTest extends TestBase{
    WishListPage wishListPage;
    SearchPage search;
    MainPage main;
    RegisterPage register;
    ProductDetailsPage productDetailsPage;
    WishListDetailsPage details;

    @Test
    public void UserCanGoToRegisterPage() throws InterruptedException {
        main = new MainPage(driver);
        Thread.sleep(3000);
        main.ShowRegisterPage();
    }

    @Test()
    public void UserCanRegister() throws InterruptedException, IOException, ParseException {
        RegisterJsonReader jsonReader = new RegisterJsonReader();
        jsonReader.jsonReader();
        register = new RegisterPage(driver);
        Thread.sleep(2000);
        register.UserCanRegister(jsonReader.firstName,jsonReader.lastName,jsonReader.email,jsonReader.password);
        Thread.sleep(6000);
        Assert.assertTrue(register.AssertionMessage.getText().contains("Thank you for registering with Madison Island."));
    }
    @Test
    public void UserCanSearch() throws AWTException, InterruptedException {
        search = new SearchPage(driver);
        search.UserSearch("dress red");
        Thread.sleep(4000);
        Assert.assertTrue(search.AssertionMessage.getText().contains("SEARCH RESULTS FOR 'DRESS RED'"));
        wishListPage = new WishListPage(driver);
        Thread.sleep(2000);
        productDetailsPage =  new ProductDetailsPage(driver);
        productDetailsPage.UserCanAddToWishList();
        details = new WishListDetailsPage(driver);
        Thread.sleep(3000);
        details.goToSharWishList();
        Thread.sleep(5000);
    }

}
