package test;

import org.testng.annotations.BeforeTest;
import page.MainPage;
import utils.Driver;

public class BaseTest {
    protected MainPage mainPage;
    @BeforeTest
    public void preTest() {
        this.mainPage = new MainPage(new Driver().getDriver());
    }
}