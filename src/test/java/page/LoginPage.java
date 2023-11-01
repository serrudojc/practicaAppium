package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.base.BasePage;

public class LoginPage extends BasePage {
    @AndroidFindBy(accessibility = "input-email")
    private WebElement inputEmail;

    @AndroidFindBy(accessibility = "input-password")
    private WebElement inputPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"LOGIN\")")
    private WebElement loginButton;

    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    public void sendKeysInputEmail(String keys) {
        this.sendKeysOnElement(this.inputEmail, keys);
    }

    public void sendKeysInputPassword(String keys) {
        this.sendKeysOnElement(this.inputPassword, keys);
    }

    public void clickLoginButton() {
        this.clickOnElement(this.loginButton);
    }
}