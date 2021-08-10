package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {


    private final WebDriver webdriver;



    public final By INPUT_FIELD = By.xpath("//input[@type='text']");
    public final By INPUT_BUTTON = By.xpath("//input[@type='submit']");
    public final String URL = "http://demo.guru99.com/test/delete_customer.php";

    public MainPage(WebDriver webdriver) {
        this.webdriver = webdriver;
    }


    public void getUrl(){
        webdriver.get(URL);
    }

    public void sendId(){

        webdriver.findElement(INPUT_FIELD).sendKeys("25874");
    }
    public void clickOnButton(){
        webdriver.findElement(INPUT_BUTTON).click();
    }
    public void alertBox(){
        Alert alert = webdriver.switchTo().alert();
        alert.accept();
    }


}
