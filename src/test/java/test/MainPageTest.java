package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.MainPage;
import utils.Driver;

public class MainPageTest extends BaseTest{
    @Test
    public void loginScreenTest() {
        this.mainPage.clickLoginButton();
    }
}