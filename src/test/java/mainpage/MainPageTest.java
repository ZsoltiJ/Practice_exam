package mainpage;

import base.BaseTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;


public class MainPageTest extends BaseTest{

    public final WebDriver webDriver;

    private MainPage mainPage;

    public final String URL = "http://demo.guru99.com/test/delete_customer.php";

    public MainPageTest(WebDriver webdriver) {
        super(webdriver);
        this.webDriver = webdriver;
    }


    @Test
    public void alertTest(){
        mainPage = new MainPage(getDriver());
        mainPage.getUrl();
        mainPage.sendId();
        mainPage.clickOnButton();
        mainPage.alertBox();

    }

}
