package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPageObjects {

    public ContactUsPageObjects(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@class=\"YRmVKFISBkI5nWVXbpNQ\"]")
    public WebElement StillNeedHelp_Section;

    @FindBy(xpath = "//*[@class=\"sa_vcQOm9lgfJvdVQnOp\"]")
    public WebElement StillNeedHelp_Options;

    @FindBy(xpath = "//*[@class=\"tITMzDBm9656dono8C6j\"]")
    public WebElement TopQuestion_Section;

}

