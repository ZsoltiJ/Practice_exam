package mainpage;

import base.BaseTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;


public class MainPageTest extends BaseTest{



    MainPage mainPage;

    public final String URL = "http://demo.guru99.com/test/delete_customer.php";




    @Test
    public void alertTest(){
        mainPage = new MainPage(webdriver);
        mainPage.getUrl();
        mainPage.sendId();
        mainPage.clickOnButton();
        mainPage.alertBox();

    }

}
