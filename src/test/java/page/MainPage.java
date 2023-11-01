package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import page.LoginPage;
import page.base.BasePage;

public class MainPage extends BasePage {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\")")
    private WebElement loginButton;

    public MainPage(AndroidDriver driver) {
        super(driver);
    }

    public LoginPage clickLoginButton() {
        this.clickOnElement(this.loginButton);
        return new LoginPage(this.driver);
    }
}