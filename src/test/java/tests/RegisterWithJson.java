package tests;

import data.RegisterJsonReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;

import java.io.IOException;

public class RegisterWithJson extends TestBase{
    MainPage main;
    RegisterPage register;

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
}
