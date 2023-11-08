package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

    public HomePageObjects(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(className = "hElK6altp0R33MmrCKqr")
    public WebElement HC_Header;

    @FindBy(className = "rTI0UWYujDp2FCyUeeqQ")
    public WebElement TopQuestions;

    @FindBy(className = "RgASU5GFMMsuMAbMKWcQ")
    public WebElement HC_Categories;

    @FindBy(className = "Xzzs_LEkHRmQMQ6vwRaQ")
    public WebElement StillNeedHelp;

    //===================================================================

}

