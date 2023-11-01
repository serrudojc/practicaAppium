package test;

import org.testng.annotations.Test;
import page.LoginPage;

public class LoginPageTest extends BaseTest{

    LoginPage loginPage;

    @Test
    public void LoginTest() {
        this.loginPage = this.mainPage.clickLoginButton();
        this.loginPage.sendKeysInputEmail("abc@abc.com");
        this.loginPage.sendKeysInputPassword("12345678");
        this.loginPage.clickLoginButton();
    }
}