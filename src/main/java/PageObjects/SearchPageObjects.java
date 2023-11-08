package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageObjects {

    public SearchPageObjects(WebDriver driver) {PageFactory.initElements(driver, this);}

    @FindBy(xpath="//*[@class=\"fZqLfjS1uHwYdkxLUb9m\"]")
    public WebElement SearchBar;

    @FindBy(xpath="//*[@class=\"mT74XE17a_Y30cZelZWi\"]")
    public WebElement SearchIcon;

    @FindBy(xpath="//*[@class=\"fZqLfjS1uHwYdkxLUb9m\"]")
    public WebElement SearchPlaceHolder;

    @FindBy(xpath="//*[@class=\"TWriiEPQIk1BNOfRAor_\"]")
    public WebElement NoResultFound;

    @FindBy(xpath="//*[@class=\"CahO15U7jfe0V_OJGYdV\"]")
    public WebElement CloseIcon;

    @FindBy(xpath="(//a[@class=\"mGwH_2x3KeTXn05ZXFMc\"])[3]")
    public WebElement SearchSuggestion;

    @FindBy(xpath="//*[@class=\"zOAodfFFSXYQxHntYUeh\"]")
    public WebElement SearchSuggestion_Article;

}

