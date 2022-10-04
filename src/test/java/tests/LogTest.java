package tests;

import data.LogINJsonReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogPage;
import pages.MainPage;
import pages.RegisterPage;

import java.io.IOException;

public class LogTest extends TestBase{
    MainPage main;
    LogPage log;
    RegisterPage register;


    @Test()
    public void UserCanLogIN() throws InterruptedException, IOException, ParseException {
        LogINJsonReader logINJsonReader = new LogINJsonReader();
        logINJsonReader.jsonReader();
        main = new MainPage(driver);
        log = new LogPage(driver);
        register = new RegisterPage(driver);
        Thread.sleep(3000);
        main.ShowRegisterPage();
        register.UserCanRegister(logINJsonReader.firstName,logINJsonReader.lastName,logINJsonReader.email,logINJsonReader.password);
        Thread.sleep(6000);
        Assert.assertTrue(register.AssertionMessage.getText().contains("Thank you for registering with Madison Island."));
        Thread.sleep(2000);
        main.LogOut();
        Thread.sleep(2000);
        main.Login();
        Thread.sleep(2000);
        log.UserLogIN(logINJsonReader.email,logINJsonReader.password);
        Thread.sleep(6000);
        main.LogOut();
        Thread.sleep(6000);
    }
}
