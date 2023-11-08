package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

    public LoginPageObjects(WebDriver driver) {PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//*[@data-meta=\"Field\" and @type=\"text\"]") public WebElement UserName;
    @FindBy(xpath = "//*[@data-meta=\"Field\" and @type=\"password\"]") public WebElement Password;
    @FindBy(xpath = "//*[@data-spm=\"dlogin\" and @class=\"mod-button\"]") public WebElement LoginButton;
    @FindBy(xpath = "//h1[@id=\"page-title\"]") public  WebElement AccountPage;
}
