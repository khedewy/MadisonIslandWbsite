package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegisterPage;

public class RegisterTest extends TestBase{
    MainPage main;
    RegisterPage register;

    @Test
    public void UserCanGoToRegisterPage() throws InterruptedException {
        main = new MainPage(driver);
        Thread.sleep(3000);
        main.ShowRegisterPage();
    }
    @DataProvider(name = "UserData")
    public Object[][] userData(){
        return  new Object[][]{
                {"mahmoud","khedewy","madasd@gmail.com","m01234567"}
        };
    }


    @Test(dataProvider = "UserData")
    public void UserCanRegister(String firstName,String lastName, String email, String password) throws InterruptedException {
        register = new RegisterPage(driver);
        Thread.sleep(2000);
        register.UserCanRegister(firstName,lastName,email,password);
        Thread.sleep(6000);
        Assert.assertTrue(register.AssertionMessage.getText().contains("Thank you for registering with Madison Island."));
    }
}
