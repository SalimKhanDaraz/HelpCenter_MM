package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelfServicePageObjects {

    public SelfServicePageObjects(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//*[@class=\"PfnCfr8E2C6EpBkx53mk\"]")
    public WebElement SelfServiceSection;

    @FindBy(xpath = "//*[@class=\"f3bufdfZt8m80TRswkWT\"]")
    public List<WebElement> SelfServiceTools;
    //*[@class="f3bufdfZt8m80TRswkWT"]

    @FindBy(xpath = "//*[@class=\"svg-icon\"]")
    public WebElement Back_to_HC;

}
